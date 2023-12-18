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
import com.douzone.comet.service.eh.abc.dao.Abc00200DAO;
import com.douzone.comet.service.eh.abc.dao.AbcCommonDAO;
import com.douzone.comet.service.eh.abc.models.Abc00200Model;
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
 * @description : 시정조치결과 서비스
 * @Since : 2023/12/10
 * @Author : 제갈건
 * @History : 2023/12/15 코드최적화, 검토자: 제갈건
 */
@DzApiService(value = "Abc00200Service", module = CometModule.EH, desc = "시정조치요구결과")
public class Abc00200Service extends DzCometService {

   @Autowired
   Abc00200DAO abc00200DAO;

   @Autowired
   AbcCommonDAO abcCommonDAO;

   @Autowired
   DzFileTrasnferManager<DzFtsModel> dzFileTrasnferManager;

   @DzApi(url = "/abc00200_list", desc = "시정조치요구결과-조회", httpMethod = DzRequestMethod.GET)
   public List<Abc00200Model> abc00200_list(
         @DzParam(key = "companyCode", desc = "회사코드", paramType = DzParamType.QueryString) String companyCode,
         @DzParam(key = "PLANT_CD", desc = "사업장", paramType = DzParamType.QueryString) String PLANT_CD,
         @DzParam(key = "ISSUE_DEPT_CD", desc = "조치부서", paramType = DzParamType.QueryString) String ISSUE_DEPT_CD,
         @DzParam(key = "REQN_CRCT_TRMT_NO", desc = "시정조치번호", paramType = DzParamType.QueryString) String REQN_CRCT_TRMT_NO,
         @DzParam(key = "REQN_ISSUE_TP", desc = "시정조치유형", paramType = DzParamType.QueryString) String REQN_ISSUE_TP,
         @DzParam(key = "REQN_FG_CD", desc = "시정조치구분", paramType = DzParamType.QueryString) String REQN_FG_CD,
         @DzParam(key = "REQN_TRMT_GOAL_DT_START", desc = "조치기한(시작일)", paramType = DzParamType.QueryString) String REQN_TRMT_GOAL_DT_START,
         @DzParam(key = "REQN_TRMT_GOAL_DT_END", desc = "조치기한(종료일)", paramType = DzParamType.QueryString) String REQN_TRMT_GOAL_DT_END,
         @DzParam(key = "ISSUE_DT_START", desc = "조치일자(시작일)", paramType = DzParamType.QueryString) String ISSUE_DT_START,
         @DzParam(key = "ISSUE_DT_END", desc = "조치일자(종료일)", paramType = DzParamType.QueryString) String ISSUE_DT_END)
         throws Exception {
      List<Abc00200Model> abc00200ModelList = new ArrayList<Abc00200Model>();
      try {
         HashMap<String, Object> param = new HashMap<String, Object>();

         param.put("P_COMPANY_CD", companyCode);
         param.put("P_PLANT_CD", PLANT_CD);
         param.put("P_ISSUE_TP", REQN_ISSUE_TP);
         param.put("P_FG_CD", REQN_FG_CD);
         param.put("P_CRCT_TRMT_NO", REQN_CRCT_TRMT_NO);
         param.put("P_TRMT_GOAL_DT_START", REQN_TRMT_GOAL_DT_START);
         param.put("P_TRMT_GOAL_DT_END", REQN_TRMT_GOAL_DT_END);
         param.put("P_ISSUE_DT_START", ISSUE_DT_START);
         param.put("P_ISSUE_DT_END", ISSUE_DT_END);
         param.put("P_ISSUE_DEPT_CD", ISSUE_DEPT_CD);

//         200 검색 조회 리스트 출력
         abc00200ModelList = abc00200DAO.selectAbc00200ModelList(param);

//         셋디테일을 위한 UUID 지정
//         for (Abc00200Model item : abc00200ModelList) {
//            item.set_uid(UUID.randomUUID().toString());
//         }

      } catch (Exception e) {
         throw new DzApplicationRuntimeException(e);
      }

      return abc00200ModelList;
   }


   @DzApi(url = "/abc00200_save", desc = "시정조치요구결과-저장", httpMethod = DzRequestMethod.POST)
   public SCMApiProvider_Ps_ResultData abc00200_save(
         @DzParam(key = "mstGrid_ds", desc = "마스터그리드", paramType = DzParamType.Body) DzGridModel<Abc00200Model> mstGrid_ds)
         throws Exception {
      DbTransaction<?> transaction = null;
      SCMApiProvider_Ps_ResultData mResult = new SCMApiProvider_Ps_ResultData();
      try {
         transaction = this.beginTransaction();
         if (mstGrid_ds != null) {

//            ROW 삭제
            if (mstGrid_ds.getDeleted().size() > 0) {
//               for (Abc00200Model item : mstGrid_ds.getDeleted()) {
//                  HashMap<String, Object> param = new HashMap<String, Object>();
//
//                  param.put("P_COMPANY_CD", item.getCompany_cd());
//                  param.put("P_CRCT_TRMT_NO", item.getCrct_trmt_no());
//                  param.put("P_SQ_NO", item.getSq_no());
//
//                  abc00200DAO.deleteAbc00200Model(param);
//                  abc00200DAO.deleteAbc00300Model(param);
//               }
            }
            
//            ROW 수정
            if (mstGrid_ds.getUpdated().size() > 0) {
               for (Abc00200Model item : mstGrid_ds.getUpdated()) {
                  HashMap<String, Object> param = new HashMap<String, Object>();
                  HashMap<String, Object> fileParam = new HashMap<String, Object>();

                  // 날짜 포맷 변환
                  item.setIssue_dt(StringUtil.getLocaleTimeString(item.getIssue_dt(), "yyyyMMdd"));
                  item.setRst_goal_dt(StringUtil.getLocaleTimeString(item.getRst_goal_dt(), "yyyyMMdd"));

                  param.put("P_COMPANY_CD", item.getCompany_cd());
                  param.put("P_CRCT_TRMT_NO", item.getCrct_trmt_no());
                  param.put("P_SQ_NO", item.getSq_no());
                  param.put("P_TRMT_TM_CNT", item.getTrmt_tm_cnt());
                  param.put("P_WRT_TM_CNT", item.getWrt_tm_cnt());
                  param.put("P_ISSUE_EMP_NO", item.getIssue_emp_no());
                  param.put("P_ISSUE_DT", item.getIssue_dt());
                  param.put("P_SURCHRG_AMT", item.getSurchrg_amt());
                  param.put("P_CUS_ANAL_TXT", item.getCus_anal_txt());
                  param.put("P_TRMT_CNTN_TXT", item.getTrmt_cntn_txt());
                  param.put("P_SQ_NO", item.getSq_no());
                  param.put("P_PRVN_TRMT_N_CTMSR_TXT", item.getPrvn_trmt_n_ctmsr_txt());
                  param.put("P_FG_CD", item.getFg_cd());
                  param.put("P_ATCHFILE_ID", item.getAtchfile_id());
                  param.put("P_IMG_PATH_DC", item.getImg_path_dc());
                  param.put("P_INSERT_ID", item.getInsert_id());
                  param.put("P_INSERT_DTS", item.getInsert_dts());
                  param.put("P_UPDATE_ID", item.getUpdate_id());
                  param.put("P_UPDATE_DTS", item.getUpdate_dts());
                  param.put("P_RST_GOAL_DT", item.getRst_goal_dt());

//                  200 업데이트
                  abc00200DAO.updateAbc00200Model(param);

//                  조치부분 데이터 삭제시 검토부분 데이터 삭제를 위한 로직
                  // 시행자 없을 경우 RST, REVIEW 데이터 null 처리
                  if (item.getIssue_emp_no() == null || item.getIssue_emp_no().equals("")) {

                     // 파일 삭제
                     String filePath = "";
                     String fileName = "";
                     
//                     멀티파일 존재시 파일 삭제
                     if (item.getAtchfile_id() != null) {
                        fileParam.put("P_IDENTIFIER", item.getAtchfile_id());
                        fileParam.put("P_ATCHFILE_ID", item.getAtchfile_id());

                        List<String> fileNameList = abcCommonDAO.selectNewFileDcMultiFile(fileParam);

                        for (String fileNameListElement : fileNameList) {
                           fileParam.put("P_NEW_FILE_DC", fileNameListElement);

                           filePath = abcCommonDAO.chaseFilePath(fileParam);

                           if (fileNameListElement != null) {
                              removeFile(filePath, fileNameListElement);
                           }
                        }

                        abcCommonDAO.deleteAllFileModel(fileParam);

                     }
//                     이미지 파일 존재시 파일 삭제
                     if (item.getImg_path_dc() != null) {
                        fileParam.put("P_IDENTIFIER", item.getImg_path_dc());
                        fileParam.put("P_IMAGE_PATH_DC", item.getImg_path_dc());

                        fileName = abcCommonDAO.selectNewFileDc(fileParam);

                        fileParam.put("P_NEW_FILE_DC", fileName);
                        fileParam.put("P_FILE_SQ", 1);

                        filePath = abcCommonDAO.chaseFilePath(fileParam);

                        if (fileName != null) {
                           removeFile(filePath, fileName);
                        }
                        abcCommonDAO.deleteAllFileModel(fileParam);
                     }

//                     200과 300의 기본키를 제외한 데이터 NULL값으로 재조정
                     abc00200DAO.updateRstMst(param);
                     abc00200DAO.updateReviewMst(param);
                  }
               }
            }
            
//            ROW 추가
            if (mstGrid_ds.getAdded().size() > 0) {

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
}