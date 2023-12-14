package com.douzone.comet.service.eh.abc;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.douzone.comet.components.DzCometService;
import com.douzone.comet.components.fts.manager.DzFileTrasnferManager;
import com.douzone.comet.components.fts.model.DzFtsModel;
import com.douzone.comet.service.eh.abc.dao.AbcCommonDAO;
import com.douzone.comet.service.eh.abc.models.AbcDropModel;
import com.douzone.comet.service.eh.abc.models.AbcFileModel;
import com.douzone.comet.service.util.api.models.scm.SCMApiProvider_Ps_ResultData;
import com.douzone.gpd.components.exception.DzApplicationRuntimeException;
import com.douzone.gpd.core.DzGlobalVariable;
import com.douzone.gpd.jdbc.transaction.DbTransaction;
import com.douzone.gpd.restful.annotation.DzApi;
import com.douzone.gpd.restful.annotation.DzApiService;
import com.douzone.gpd.restful.annotation.DzParam;
import com.douzone.gpd.restful.enums.CometModule;
import com.douzone.gpd.restful.enums.DzParamType;
import com.douzone.gpd.restful.enums.DzRequestMethod;

/**
 * @description :
 * @Since :
 * @Author :
 * @History :
 */
@DzApiService(value = "AbcCommonService", module = CometModule.EH, desc = "시정조치요구공통")
public class AbcCommonService extends DzCometService {

	@Autowired
	AbcCommonDAO abcCommonDAO;

	@Autowired
	DzFileTrasnferManager<DzFtsModel> dzFileTrasnferManager;

	@DzApi(url = "/abcDrop_list", desc = "시정조치요구공통-드롭다운", httpMethod = DzRequestMethod.GET)
	public List<AbcDropModel> abcDrop_list(
			@DzParam(key = "companyCode", desc = "회사코드", paramType = DzParamType.QueryString) String companyCode,
			@DzParam(key = "MCLS_CD", desc = "관리항목코드", paramType = DzParamType.QueryString) String MCLS_CD)
			throws Exception {
		List<AbcDropModel> abcDropModelList = new ArrayList<AbcDropModel>();
		try {
			HashMap<String, Object> param = new HashMap<String, Object>();

			param.put("P_COMPANY_CD", companyCode);
			param.put("P_MCLS_CD", MCLS_CD);

			abcDropModelList = abcCommonDAO.selectAbcDropModelList(param);
		} catch (Exception e) {
			throw new DzApplicationRuntimeException(e);
		}

		return abcDropModelList;
	}

	@DzApi(url = "/abc00100MultiFile_list", desc = "시정조치요구등록-멀티파일조회", httpMethod = DzRequestMethod.GET)
	public List<AbcFileModel> abc00100MultiFile_list(
			@DzParam(key = "ATCHFILE_ID", desc = "첨부파일ID", paramType = DzParamType.QueryString) String ATCHFILE_ID)
			throws Exception {
		List<AbcFileModel> abc00100MultiFileModelList = new ArrayList<AbcFileModel>();
		try {
			HashMap<String, Object> param = new HashMap<String, Object>();

			param.put("P_ATCHFILE_ID", ATCHFILE_ID);

			abc00100MultiFileModelList = abcCommonDAO.selectAbc00100MultiFileModelList(param);
		} catch (Exception e) {
			throw new DzApplicationRuntimeException(e);
		}

		return abc00100MultiFileModelList;
	}

	@DzApi(url = "/abc00200MultiFile_list", desc = "시정조치요구등록-멀티파일조회", httpMethod = DzRequestMethod.GET)
	public List<AbcFileModel> abc00200MultiFile_list(
			@DzParam(key = "ATCHFILE_ID", desc = "첨부파일ID", paramType = DzParamType.QueryString) String ATCHFILE_ID)
			throws Exception {
		List<AbcFileModel> abc00100MultiFileModelList = new ArrayList<AbcFileModel>();
		try {
			HashMap<String, Object> param = new HashMap<String, Object>();

			param.put("P_ATCHFILE_ID", ATCHFILE_ID);

			abc00100MultiFileModelList = abcCommonDAO.selectAbc00200MultiFileModelList(param);
		} catch (Exception e) {
			throw new DzApplicationRuntimeException(e);
		}

		return abc00100MultiFileModelList;
	}

	@DzApi(url = "/abcMultiFile_save", desc = "시정조치요구등록-멀티파일업로드", httpMethod = DzRequestMethod.POST)
	public SCMApiProvider_Ps_ResultData abcMultiFile_save(
			@DzParam(key = "abcMultiFile_ds", desc = "멀티파일컴포넌트", paramType = DzParamType.Body) List<AbcFileModel> abcMultiFile_ds,
			@DzParam(key = "moduleCode", desc = "모듈번호", paramType = DzParamType.Body) String moduleCode)
			throws Exception {
		DbTransaction<?> transaction = null;
		SCMApiProvider_Ps_ResultData mResult = new SCMApiProvider_Ps_ResultData();
		try {
			transaction = this.beginTransaction();
			if (abcMultiFile_ds != null && abcMultiFile_ds.size() > 0) {
				String atchId = "";

				for (AbcFileModel file : abcMultiFile_ds) {
					int maxFileSq = 0;
					HashMap<String, Object> param = new HashMap<String, Object>();

					if (atchId.equals("")) {
						// 파일 ID 검출 && 없을 시 UUID 생성 및 추가
						if (file.getIdentifier() == null) {
							atchId = UUID.randomUUID().toString();

							param.put("P_ATCHFILE_ID", atchId);
							param.put("P_COMPANY_CD", file.getCompany_cd());
							param.put("P_CRCT_TRMT_NO", file.getCrct_trmt_no());
							param.put("P_SQ_NO", file.getSq_no());

							if (moduleCode.equals("100")) {
								abcCommonDAO.updateAbc00100AtchfileId(param);
							} else if (moduleCode.equals("200")) {
								abcCommonDAO.updateAbc00200AtchfileId(param);
							}
//                            mResult.setMsg(atchId);

						} else {
							atchId = file.getIdentifier();
						}
					}
					param.put("P_FILE_DC", atchId);

					mResult.setMsg(atchId);

					maxFileSq = abcCommonDAO.selectMaxFileSqForInsert(param);

					param.put("P_NEW_FILE_DC", file.getNew_file_dc());
					param.put("P_FILE_ATCH_TXT", file.getFile_atch_txt());
					param.put("P_FILE_SQ", ++maxFileSq);
					param.put("P_ORGL_FILE_DC", file.getOriginalFilename());
					param.put("P_ORGL_FEXTSN_DC", file.getOriginalExtension());
					param.put("P_FILE_VR", file.getFileSize());
					param.put("P_INSERT_ID", this.getUserId());
					param.put("P_UPDATE_ID", this.getUserId());

					String fileName = file.getNew_file_dc();

					String filePath = "/EH/UploadFile";
					dzFileTrasnferManager.moveFile(fileName, filePath);

					abcCommonDAO.insertAbcFile(param);
				}
			}
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			throw new DzApplicationRuntimeException(e);
		}
		return mResult;
	}

	@DzApi(url = "/abcMultiFile_delete", desc = "시정조치요구등록-멀티파일삭제", httpMethod = DzRequestMethod.POST)
	public void abcMultiFile_delete(
			@DzParam(key = "abcMultiFile_ds", desc = "멀티파일컴포넌트", paramType = DzParamType.Body) AbcFileModel abcMultiFile_ds)
			throws Exception {
		try {
			if (abcMultiFile_ds != null) {
				int maxFileSq = 0;
				HashMap<String, Object> param = new HashMap<String, Object>();
				param.put("P_FILE_DC", abcMultiFile_ds.getIdentifier());
				param.put("P_ORGL_FILE_DC", abcMultiFile_ds.getOriginalFilename());

				maxFileSq = abcCommonDAO.selectMaxFileSqForDelete(param);

				param.put("P_FILE_SQ", maxFileSq);

				abcCommonDAO.deleteAbcFile(param);

				String fileName = abcMultiFile_ds.getNew_file_dc();
				String filePath = "EH/UploadFile/";

				if (fileName != null)
					removeFile(filePath, fileName);

			}

		} catch (Exception e) {
			throw new DzApplicationRuntimeException(e);
		}
	}

	@DzApi(url = "/abcImageFile_save", desc = "시정조치요구등록-이미지파일업로드", httpMethod = DzRequestMethod.POST)
	public SCMApiProvider_Ps_ResultData abcImageFile_save(
			@DzParam(key = "abcImgFile_ds", desc = "이미지파일컴포넌트", paramType = DzParamType.Body) AbcFileModel abcImgFile_ds,
			@DzParam(key = "isDeleted", desc = "이미지파일삭제여부", paramType = DzParamType.Body) boolean isDeleted,
			@DzParam(key = "moduleCode", desc = "모듈번호", paramType = DzParamType.Body) String moduleCode)
			throws Exception {
		DbTransaction<?> transaction = null;
		SCMApiProvider_Ps_ResultData mResult = new SCMApiProvider_Ps_ResultData();
		try {
			transaction = this.beginTransaction();
			HashMap<String, Object> param = new HashMap<String, Object>();
			String imagePathDc = "";
			List<Object> paramObject = new ArrayList<Object>();
			if (abcImgFile_ds != null) {
				if (!isDeleted) {
					imagePathDc = abcImgFile_ds.getIdentifier();
					if (imagePathDc == null || imagePathDc.equals("")) {
						imagePathDc = UUID.randomUUID().toString();

						param.put("P_IMG_PATH_DC", imagePathDc);
						param.put("P_COMPANY_CD", abcImgFile_ds.getCompany_cd());
						param.put("P_CRCT_TRMT_NO", abcImgFile_ds.getCrct_trmt_no());
						param.put("P_SQ_NO", abcImgFile_ds.getSq_no());

						if (moduleCode.equals("100")) {
							abcCommonDAO.updateAbc00100ImgPathDcId(param);
						} else if (moduleCode.equals("200")) {
							abcCommonDAO.updateAbc00200ImgPathDcId(param);
						}

//						mResult.setMsg(imagePathDc);
					} else {
						param.put("P_FILE_DC", abcImgFile_ds.getIdentifier());
						param.put("P_FILE_SQ", 1);

						HashMap<String, Object> param2 = new HashMap<String, Object>();
						param2.put("P_IMAGE_PATH_DC", abcImgFile_ds.getIdentifier());

						String fileName = abcCommonDAO.selectNewFileDc(param2);
						String filePath = "EH/UploadFile/";

						if (fileName != null)
							removeFile(filePath, fileName);

						abcCommonDAO.deleteAbcFile(param);

						mResult.setMsg(imagePathDc);
					}

					param.put("P_FILE_DC", imagePathDc);
					param.put("P_NEW_FILE_DC", abcImgFile_ds.getNew_file_dc());
					param.put("P_FILE_ATCH_TXT", abcImgFile_ds.getFile_atch_txt());
					param.put("P_FILE_SQ", 1);
					param.put("P_ORGL_FILE_DC", abcImgFile_ds.getOriginalFilename());
					param.put("P_ORGL_FEXTSN_DC", abcImgFile_ds.getOriginalExtension());
					param.put("P_FILE_VR", abcImgFile_ds.getFileSize());
					param.put("P_INSERT_ID", this.getUserId());
					param.put("P_UPDATE_ID", this.getUserId());

					String fileName = abcImgFile_ds.getNew_file_dc();
					String filePath = "/EH/UploadFile";

					dzFileTrasnferManager.moveFile(fileName, filePath);

					abcCommonDAO.insertAbcFile(param);

					

					paramObject.add(abcCommonDAO.selectImageObject(param));

					mResult.setParams(paramObject);
					mResult.setMsg(imagePathDc);
				} else {
					param.put("P_FILE_DC", abcImgFile_ds.getIdentifier());
					param.put("P_FILE_SQ", 1);

					HashMap<String, Object> param2 = new HashMap<String, Object>();
					param2.put("P_IMAGE_PATH_DC", abcImgFile_ds.getIdentifier());

					String fileName = abcCommonDAO.selectNewFileDc(param2);
					String filePath = "EH/UploadFile/";

					removeFile(filePath, fileName);

					abcCommonDAO.deleteAbcFile(param);
					
					paramObject.add(new AbcFileModel());
					
					mResult.setParams(paramObject);
					mResult.setMsg(imagePathDc);
				}
			}

			transaction.commit();

		} catch (Exception e) {
			transaction.rollback();
			throw new DzApplicationRuntimeException(e);
		}
		return mResult;
	}

	private boolean existsFile(String path, String fileKey) {
		String fullPath = Paths.get(DzGlobalVariable.get("fts.works.dir"), path, fileKey).toString();
		return new File(fullPath).exists();
	}

	private void removeFile(String path, String fileKey) throws Exception {
		if (existsFile(path, fileKey)) {
			dzFileTrasnferManager.removeFile(path, fileKey);
		}
	}
}
