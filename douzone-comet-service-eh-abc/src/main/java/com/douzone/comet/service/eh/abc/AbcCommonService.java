package com.douzone.comet.service.eh.abc;
 
import java.io.File;
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
import com.douzone.gpd.components.exception.DzApplicationRuntimeException;
import com.douzone.gpd.jdbc.transaction.DbTransaction;
import com.douzone.gpd.restful.annotation.DzApi;
import com.douzone.gpd.restful.annotation.DzApiService;
import com.douzone.gpd.restful.annotation.DzParam;
import com.douzone.gpd.restful.enums.CometModule;
import com.douzone.gpd.restful.enums.DzParamType;
import com.douzone.gpd.restful.enums.DzRequestMethod;

/** 
  * @description :
  * @Since   : 
  * @Author  :
  * @History :
  */
@DzApiService(value="AbcCommonService", module=CometModule.EH, desc="시정조치요구공통")
public class AbcCommonService extends DzCometService {

	@Autowired
	AbcCommonDAO abcCommonDAO; 
	
	@Autowired
	DzFileTrasnferManager<DzFtsModel> dzFileTrasnferManager;

	@DzApi(url="/abcDrop_list", desc="시정조치요구공통-드롭다운", httpMethod=DzRequestMethod.GET)
	public List<AbcDropModel> abcDrop_list(
		@DzParam(key="companyCode", desc="회사코드", paramType = DzParamType.QueryString) String companyCode,
		@DzParam(key="MCLS_CD", desc="관리항목코드", paramType = DzParamType.QueryString) String MCLS_CD
	) throws Exception {
		List<AbcDropModel> abcDropModelList =  new ArrayList<AbcDropModel>();
		try {
	 		HashMap<String, Object> param = new HashMap<String, Object>();
	 		
	 		param.put("P_COMPANY_CD", companyCode);
	 		param.put("P_MCLS_CD", MCLS_CD);
	 		
	 		abcDropModelList = abcCommonDAO.selectAbcDropModelList(param);
	 	} catch(Exception e) {
	        throw new DzApplicationRuntimeException(e);
	    }
	    
	    return abcDropModelList;
 	}
	
	@DzApi(url="/abc00100MultiFile_list", desc="시정조치요구등록-멀티파일조회", httpMethod=DzRequestMethod.GET)
	public List<AbcFileModel> abc00100MultiFile_list(
		@DzParam(key="ATCHFILE_ID", desc="첨부파일ID", paramType = DzParamType.QueryString) String ATCHFILE_ID
	) throws Exception {
		List<AbcFileModel> abc00100MultiFileModelList =  new ArrayList<AbcFileModel>();
		try {
	 		HashMap<String, Object> param = new HashMap<String, Object>();
	 		
	 		param.put("P_ATCHFILE_ID", ATCHFILE_ID);
	 		
	 		abc00100MultiFileModelList = abcCommonDAO.selectAbc00100MultiFileModelList(param);
	 	} catch(Exception e) {
	        throw new DzApplicationRuntimeException(e);
	    }
	    
	    return abc00100MultiFileModelList;
 	}
	
	@DzApi(url="/abc00100MultiFile_save", desc="시정조치요구등록-멀티파일업로드", httpMethod=DzRequestMethod.POST)
	public void abc00100MultiFile_save(
		@DzParam(key="abc00100MultiFile_ds", desc="멀티파일컴포넌트", paramType = DzParamType.Body) List<AbcFileModel> abc00100MultiFile_ds
	) throws Exception {
		DbTransaction<?> transaction = null;
		try {
			transaction = this.beginTransaction();
			
			if(abc00100MultiFile_ds != null && abc00100MultiFile_ds.size() > 0) {
				String atchId = "";
				
				for(AbcFileModel file:abc00100MultiFile_ds) {
					int maxFileSq = 0;
					HashMap<String, Object> param = new HashMap<String, Object>();
					
					if(atchId.equals("")) {
						// 파일 ID 검출 && 없을 시 UUID 생성 및 추가
						if(file.getIdentifier() == null) {
							atchId = UUID.randomUUID().toString();
							
							param.put("P_ATCHFILE_ID", atchId);
                            param.put("P_COMPANY_CD", file.getCompany_cd());
                            param.put("P_CRCT_TRMT_NO", file.getCrct_trmt_no());
                            param.put("P_SQ_NO", file.getSq_no());
                            
                            abcCommonDAO.updateAbc00100AtchfileId(param);

						}else {
							atchId = file.getIdentifier();
						}
					}
					
					param.put("P_FILE_DC", atchId);
                    
					maxFileSq = abcCommonDAO.selectMaxFileSqForInsert(param);
                    
                    param.put("P_NEW_FILE_DC", file.getNew_file_dc());
                    param.put("P_FILE_ATCH_TXT", file.getFile_atch_txt());
                    param.put("P_FILE_SQ",++maxFileSq);
                    param.put("P_ORGL_FILE_DC", file.getOriginalFilename());
                    param.put("P_ORGL_FEXTSN_DC", file.getOriginalExtension());
                    param.put("P_FILE_VR", file.getFileSize());
                    param.put("P_INSERT_ID", this.getUserId());
                    param.put("P_UPDATE_ID", this.getUserId());
                    
                    String fileName = file.getNew_file_dc();
        			
        			String filePath = "/EH/UploadFile";
        			dzFileTrasnferManager.moveFile(fileName, filePath);

        			abcCommonDAO.insertAbc00100File(param);
				}
			}
			transaction.commit();
		} catch(Exception e) {
			transaction.rollback();
			throw new DzApplicationRuntimeException(e);
		}
	}
	
	@DzApi(url="/abc00100MultiFile_delete", desc="시정조치요구등록-멀티파일삭제", httpMethod=DzRequestMethod.POST)
    public void abc00100MultiFile_delete(
    	@DzParam(key="abc00100MultiFile_ds", desc="멀티파일컴포넌트", paramType=DzParamType.Body) AbcFileModel abc00100MultiFile_ds
    )throws Exception {       
		try {                      
			if (abc00100MultiFile_ds != null) {
				int maxFileSq = 0;
				HashMap<String, Object> param = new HashMap<String, Object>();
				param.put("P_FILE_DC", abc00100MultiFile_ds.getIdentifier());
				param.put("P_ORGL_FILE_DC", abc00100MultiFile_ds.getOriginalFilename());
				
				maxFileSq = abcCommonDAO.selectMaxFileSqForDelete(param);
				
				param.put("P_FILE_SQ",maxFileSq);
				            
				abcCommonDAO.deleteAbc00100File(param);			            
			}
		      
		} catch (Exception e) {
		throw new DzApplicationRuntimeException(e);
		}
	}
	
	@DzApi(url="/abc00100ImageFile_save", desc="시정조치요구등록-이미지파일업로드", httpMethod=DzRequestMethod.POST)
	public void abc00100ImageFile_save(
		@DzParam(key="abc00100ImgFile_ds", desc="이미지파일컴포넌트", paramType = DzParamType.Body) AbcFileModel abc00100ImgFile_ds
	)throws Exception {    
		DbTransaction<?> transaction = null;
		try {                          	  
			transaction = this.beginTransaction();
			
			String atchid = "";
			
			HashMap<String, Object> param = new HashMap<String, Object>();
			if(atchid.equals("")) {
				if(abc00100ImgFile_ds.getIdentifier() == null){
				
					param.put("P_IMG_PATH_DC", abc00100ImgFile_ds.getNew_file_dc());
					param.put("P_COMPANY_CD", abc00100ImgFile_ds.getCompany_cd());
					param.put("P_CRCT_TRMT_NO", abc00100ImgFile_ds.getCrct_trmt_no());
					param.put("P_SQ_NO", abc00100ImgFile_ds.getSq_no());
					        
					abcCommonDAO.updateAbc00100ImgPathDcId(param);
				        
				}else {
					atchid = abc00100ImgFile_ds.getIdentifier();
				}
			}
			   
			param.put("P_FILE_DC", abc00100ImgFile_ds.getNew_file_dc());		                       
			param.put("P_NEW_FILE_DC", abc00100ImgFile_ds.getNew_file_dc());
			param.put("P_FILE_ATCH_TXT", abc00100ImgFile_ds.getFile_atch_txt());
			param.put("P_FILE_SQ", 1);
			param.put("P_ORGL_FILE_DC", abc00100ImgFile_ds.getOriginalFilename());
			param.put("P_ORGL_FEXTSN_DC", abc00100ImgFile_ds.getOriginalExtension());
			param.put("P_FILE_VR", abc00100ImgFile_ds.getFileSize());
			param.put("P_INSERT_ID", this.getUserId());
			param.put("P_UPDATE_ID", this.getUserId());
			
			String fileName = abc00100ImgFile_ds.getNew_file_dc();

			String filePath = "/EH/UploadFile";
			dzFileTrasnferManager.moveFile(fileName, filePath);

			abcCommonDAO.insertAbc00100File(param);
                           
			
			transaction.commit();
          
		}catch (Exception e) {
			transaction.rollback();
			throw new DzApplicationRuntimeException(e); 
		}
	}	
}
