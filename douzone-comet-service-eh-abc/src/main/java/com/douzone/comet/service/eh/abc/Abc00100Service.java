package com.douzone.comet.service.eh.abc;

import java.io.File;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.douzone.comet.components.DzCometService;
import com.douzone.comet.components.fts.manager.DzFileTrasnferManager;
import com.douzone.comet.components.fts.model.DzFtsModel;
import com.douzone.comet.service.eh.abc.dao.Abc00100DAO;
import com.douzone.comet.service.eh.abc.dao.AbcCommonDAO;
import com.douzone.comet.service.eh.abc.models.Abc00100Model;
import com.douzone.comet.service.util.StringUtil;
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
import com.douzone.gpd.restful.model.DzGridModel;

/**
 * @description : 시정조치요구 서비스
 * @Since : 2023/12/10
 * @Author : 박혜원
 * @History : 2023/12/15 코드 최적화,  수정자: 박혜원
 */
@DzApiService(value = "Abc00100Service", module = CometModule.EH, desc = "시정조치요구등록")
public class Abc00100Service extends DzCometService {

   @Autowired
   Abc00100DAO abc00100DAO;
   
   @Autowired
   AbcCommonDAO abcCommonDAO;

   @Autowired
   DzFileTrasnferManager<DzFtsModel> dzFileTrasnferManager;

   @DzApi(url = "/abc00100_list", desc = "시정조치요구등록-조회", httpMethod = DzRequestMethod.GET)
   public List<Abc00100Model> abc00100_list(
         @DzParam(key = "companyCode", desc = "회사코드", paramType = DzParamType.QueryString) String companyCode,
         @DzParam(key = "PLANT_CD", desc = "사업장", paramType = DzParamType.QueryString) String PLANT_CD,
         @DzParam(key = "ISSUE_TP", desc = "시정조치유형", paramType = DzParamType.QueryString) String ISSUE_TP,
         @DzParam(key = "FG_CD", desc = "시정조치구분", paramType = DzParamType.QueryString) String FG_CD,
         @DzParam(key = "CRCT_TRMT_REQN_DT", desc = "발행일", paramType = DzParamType.QueryString) String CRCT_TRMT_REQN_DT,
         @DzParam(key = "CRCT_TRMT_NO", desc = "시정조치번호", paramType = DzParamType.QueryString) String CRCT_TRMT_NO)
         throws Exception {
      List<Abc00100Model> abc00100ModelList = new ArrayList<Abc00100Model>();
      try {
         HashMap<String, Object> param = new HashMap<String, Object>();

         param.put("P_COMPANY_CD", companyCode);
         param.put("P_PLANT_CD", PLANT_CD);
         param.put("P_ISSUE_TP", ISSUE_TP);
         param.put("P_FG_CD", FG_CD);
         param.put("P_CRCT_TRMT_REQN_DT", CRCT_TRMT_REQN_DT);
         param.put("P_CRCT_TRMT_NO", CRCT_TRMT_NO);
         
         // 100 모델 리스트 검색 조회
         abc00100ModelList = abc00100DAO.selectAbc00100ModelList(param);

//         set detail 용 UUID 컬럼 설정
//         for (Abc00100Model item : abc00100ModelList) {
//            item.set_uid(UUID.randomUUID().toString());
//         }

      } catch (Exception e) {
         throw new DzApplicationRuntimeException(e);
      }

      return abc00100ModelList;
   }

   @DzApi(url = "/abc00100_save", desc = "시정조치요구등록-저장", httpMethod = DzRequestMethod.POST)
   public SCMApiProvider_Ps_ResultData abc00100_save(
         @DzParam(key = "mstGrid_ds", desc = "마스터그리드", paramType = DzParamType.Body) DzGridModel<Abc00100Model> mstGrid_ds)
         throws Exception {
//      트랜잭션을 위한 DbTransaction 및 프론트 파라미터 전송 SCMApiProvider_Ps_ResultData
      DbTransaction<?> transaction = null;
      SCMApiProvider_Ps_ResultData mResult = new SCMApiProvider_Ps_ResultData();
      try {
         transaction = this.beginTransaction();
         if (mstGrid_ds != null) {
            if (mstGrid_ds.getDeleted().size() > 0) {
               for (Abc00100Model item : mstGrid_ds.getDeleted()) {
                  HashMap<String, Object> param = new HashMap<String, Object>();
                  HashMap<String, Object> fileParam = new HashMap<String, Object>();

//                  String filePath = "";
//                  String fileName = "";
                  
//                  해당 REQN의 ROW에 파일이 존재할 경우
                  if (item.getAtchfile_id() != null) {
                     deleteMultiFileData(item.getAtchfile_id());
                  }
//                  해당 RST의 ROW에 파일이 존재할 경우
                  if (item.getRst_file_dc() != null) {
                     deleteMultiFileData(item.getRst_file_dc());
                  }
//                  해당 REQN의 ROW에 이미지가 존재할 경우
                  if (item.getImg_path_dc() != null) {
                     deleteImageFileData(item.getImg_path_dc());
                  }
//                  해당 RST의 ROW에 이미지가 존재할 경우
                  if (item.getRst_file_img_dc() != null) {
                     deleteImageFileData(item.getRst_file_img_dc());
                  }
                  
                  param.put("P_COMPANY_CD", item.getCompany_cd());
                  param.put("P_CRCT_TRMT_NO", item.getCrct_trmt_no());
                  param.put("P_SQ_NO", item.getSq_no());

//                  100, 200, 300 해당 ROW 데이터 삭제
                  abc00100DAO.deleteAbc00100Model(param);
                  abc00100DAO.deleteAbc00200Model(param);
                  abc00100DAO.deleteAbc00300Model(param);
               }
            }
            if (mstGrid_ds.getUpdated().size() > 0) {
               for (Abc00100Model item : mstGrid_ds.getUpdated()) {
                  HashMap<String, Object> param = new HashMap<String, Object>();

                  // 날짜 포맷 변환
                  item.setCrct_trmt_reqn_dt(
                        StringUtil.getLocaleTimeString(item.getCrct_trmt_reqn_dt(), "yyyyMMdd"));
                  item.setTrmt_goal_dt(StringUtil.getLocaleTimeString(item.getTrmt_goal_dt(), "yyyyMMdd"));

                  param.put("P_COMPANY_CD", item.getCompany_cd());
                  param.put("P_CRCT_TRMT_NO", item.getCrct_trmt_no());
                  param.put("P_SQ_NO", item.getSq_no());
                  param.put("P_CRCT_TRMT_TP", item.getCrct_trmt_tp());
                  param.put("P_ISSUE_FG", item.getIssue_fg());
                  param.put("P_PLANT_CD", item.getPlant_cd());
                  param.put("P_CRCT_TRMT_REQN_DT", item.getCrct_trmt_reqn_dt());
                  param.put("P_ACTION_PLAN_NO", item.getAction_plan_no());
                  param.put("P_ISSUE_CD", item.getIssue_cd());
                  param.put("P_ISSUE_TP", item.getIssue_tp());
                  param.put("P_REL_STD_CD", item.getRel_std_cd());
                  param.put("P_NOTI_NO", item.getNoti_no());
                  param.put("P_ACTV_FG", item.getActv_fg());
                  param.put("P_OCRN_CUS_CD", item.getOcrn_cus_cd());
                  param.put("P_CRCT_TRMT_NM", item.getCrct_trmt_nm());
                  param.put("P_TRMT_GOAL_DT", item.getTrmt_goal_dt());
                  param.put("P_USE_TM_CNT", item.getUse_tm_cnt());
                  param.put("P_TRMT_TRGT_CD", item.getTrmt_trgt_cd());
                  param.put("P_REL_DEPT_CD", item.getRel_dept_cd());
                  param.put("P_ISSUE_EMP_NO", item.getIssue_emp_no());
                  param.put("P_REL_BSS_TXT", item.getRel_bss_txt());
                  param.put("P_PTG_MATTER_TXT", item.getPtg_matter_txt());
                  param.put("P_CRCT_TRMT_TXT", item.getCrct_trmt_txt());
                  param.put("P_FG_CD", item.getFg_cd());
                  param.put("P_ATCHFILE_ID", item.getAtchfile_id());
                  param.put("P_IMG_PATH_DC", item.getImg_path_dc());
                  param.put("P_UPDATE_ID", item.getUpdate_id());
                  param.put("P_UPDATE_DTS", item.getUpdate_dts());

                  abc00100DAO.updateAbc00100Model(param);
               }
            }
            if (mstGrid_ds.getAdded().size() > 0) {

               for (Abc00100Model item : mstGrid_ds.getAdded()) {
                  HashMap<String, Object> sqParam = new HashMap<String, Object>();
                  HashMap<String, Object> param = new HashMap<String, Object>();
                  HashMap<String, Object> param200 = new HashMap<String, Object>();
                  HashMap<String, Object> param300 = new HashMap<String, Object>();
                  SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMdd");

//                  시정조치번호
                  int maxSq = 0;

                  String companyCd = item.getCompany_cd();
                  String plantCd = item.getPlant_cd();
                  String nowDate = dateFormat.format(new Date());

                  sqParam.put("P_COMPANY_CD", companyCd);
                  sqParam.put("P_PLANT_CD", plantCd);
                  sqParam.put("P_NOWDATE", nowDate);

//                  가장 마지막 시정조치번호 추출
                  maxSq = abc00100DAO.selectMaxSq(sqParam);

//                  해당 날짜에 포맷되어 시정조치 번호 
                  String newSq = nowDate.concat(plantCd).concat(String.format("%03d", maxSq));

                  item.setCrct_trmt_no(newSq);
                  item.setSq_no("1");
                  // 날짜 포맷 변환
                  item.setCrct_trmt_reqn_dt(
                        StringUtil.getLocaleTimeString(item.getCrct_trmt_reqn_dt(), "yyyyMMdd"));
                  item.setTrmt_goal_dt(StringUtil.getLocaleTimeString(item.getTrmt_goal_dt(), "yyyyMMdd"));

                  param.put("P_COMPANY_CD", item.getCompany_cd());
                  param.put("P_CRCT_TRMT_NO", item.getCrct_trmt_no());
                  param.put("P_SQ_NO", item.getSq_no());
                  param.put("P_CRCT_TRMT_TP", item.getCrct_trmt_tp());
                  param.put("P_ISSUE_FG", item.getIssue_fg());
                  param.put("P_PLANT_CD", item.getPlant_cd());
                  param.put("P_CRCT_TRMT_REQN_DT", item.getCrct_trmt_reqn_dt());
                  param.put("P_ACTION_PLAN_NO", item.getAction_plan_no());
                  param.put("P_ISSUE_CD", item.getIssue_cd());
                  param.put("P_ISSUE_TP", item.getIssue_tp());
                  param.put("P_REL_STD_CD", item.getRel_std_cd());
                  param.put("P_NOTI_NO", item.getNoti_no());
                  param.put("P_ACTV_FG", item.getActv_fg());
                  param.put("P_OCRN_CUS_CD", item.getOcrn_cus_cd());
                  param.put("P_CRCT_TRMT_NM", item.getCrct_trmt_nm());
                  param.put("P_TRMT_GOAL_DT", item.getTrmt_goal_dt());
                  param.put("P_USE_TM_CNT", item.getUse_tm_cnt());
                  param.put("P_TRMT_TRGT_CD", item.getTrmt_trgt_cd());
                  param.put("P_REL_DEPT_CD", item.getRel_dept_cd());
                  param.put("P_ISSUE_EMP_NO", item.getIssue_emp_no());
                  param.put("P_REL_BSS_TXT", item.getRel_bss_txt());
                  param.put("P_PTG_MATTER_TXT", item.getPtg_matter_txt());
                  param.put("P_CRCT_TRMT_TXT", item.getCrct_trmt_txt());
                  param.put("P_FG_CD", item.getFg_cd());
                  param.put("P_ATCHFILE_ID", item.getAtchfile_id());
                  param.put("P_IMG_PATH_DC", item.getImg_path_dc());
                  param.put("P_INSERT_ID", item.getInsert_id());
                  param.put("P_INSERT_DTS", item.getInsert_dts());
                  param.put("P_UPDATE_ID", item.getUpdate_id());
                  param.put("P_UPDATE_DTS", item.getUpdate_dts());

                  param200.put("P_COMPANY_CD", item.getCompany_cd());
                  param200.put("P_CRCT_TRMT_NO", item.getCrct_trmt_no());
                  param200.put("P_SQ_NO", item.getSq_no());
                  param200.put("P_TRMT_TM_CNT", 1);
                  param200.put("P_WRT_TM_CNT", 1);

                  param300.put("P_COMPANY_CD", item.getCompany_cd());
                  param300.put("P_CRCT_TRMT_NO", item.getCrct_trmt_no());
                  param300.put("P_SQ_NO", item.getSq_no());

//                  100 생성시 200, 300 기본키 입력하여 동시 생성
                  abc00100DAO.insertAbc00100Model(param);
                  abc00100DAO.insertAbc00200Model(param200);
                  abc00100DAO.insertAbc00300Model(param300);
               }
            }
         }
         transaction.commit();

      } catch (Exception e) {
         if (transaction != null) {
            transaction.rollback();
         }
         throw new DzApplicationRuntimeException(e.getMessage().length() > 0 ? e.getMessage()
               : (e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
      }
      
//      파라미터 전송
      mResult.setSuccess(true);
      return mResult;
   }

//   물리경로 NEW_FILE_DC 해당 파일 존재 유무 체크
   private boolean existsFile(String path, String fileKey) {
      String fullPath = Paths.get(DzGlobalVariable.get("fts.works.dir"), path, fileKey).toString();
      return new File(fullPath).exists();
   }

//   물리경로 파일 삭제
   private void removeFile(String path, String fileKey) throws Exception {
      if (existsFile(path, fileKey)) {
         dzFileTrasnferManager.removeFile(path, fileKey);
      }
   }
   
//   
   private void deleteMultiFileData(String getFileDc) {
      try {
         HashMap<String, Object> fileParam = new HashMap<String, Object>();
         fileParam.put("P_IDENTIFIER", getFileDc);
         fileParam.put("P_ATCHFILE_ID", getFileDc);
         
//      해당 로우에 저장된 파일들의 New File Name 추출 // 파라미터 전송용
         List<String> fileNameList = abcCommonDAO.selectNewFileDcMultiFile(fileParam);
         
         for (String fileNameListElement : fileNameList) {
            fileParam.put("P_NEW_FILE_DC", fileNameListElement);
            
//         DB에서 파일 경로 추출
            String filePath = abcCommonDAO.chaseFilePath(fileParam);
            
//         물리적 경로 파일 제거
            if (fileNameListElement != null) {
               removeFile(filePath, fileNameListElement);
            }
         }
         
//      CM_FILE_INFO 테이블에서 파일 데이터 제거
         abcCommonDAO.deleteAllFileModel(fileParam);
      }catch (Exception e) {
         // TODO: handle exception
         throw new DzApplicationRuntimeException(e);
      }

   }
   
   private void deleteImageFileData(String getImg_path_dc) {
      try {
         HashMap<String, Object> fileParam = new HashMap<String, Object>();
         String fileName = "";
         String filePath = "";
         
         fileParam.put("P_IDENTIFIER", getImg_path_dc);
         fileParam.put("P_IMAGE_PATH_DC", getImg_path_dc);
         
//      해당 NEW_FILE_DC 추출
         fileName = abcCommonDAO.selectNewFileDc(fileParam);
         
         fileParam.put("P_NEW_FILE_DC", fileName);
         fileParam.put("P_FILE_SQ", 1);
         
//      DB에 저장된 파일 경로 추출
         filePath = abcCommonDAO.chaseFilePath(fileParam);
         
//      물리경로에 파일 삭제
         if (fileName != null) {
            removeFile(filePath, fileName);
         }
         
//      CM_FILE_INFO 테이블에 이미지 데이터 삭제
         abcCommonDAO.deleteAllFileModel(fileParam);
      }catch (Exception e) {
         // TODO: handle exception
         throw new DzApplicationRuntimeException(e);
      }
   }
}