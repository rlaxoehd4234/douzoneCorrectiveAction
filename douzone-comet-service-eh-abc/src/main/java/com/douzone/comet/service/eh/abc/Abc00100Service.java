package com.douzone.comet.service.eh.abc;
 
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.douzone.comet.components.DzCometService;
import com.douzone.comet.service.eh.abc.dao.Abc00100DAO;
import com.douzone.comet.service.eh.abc.dao.AbcCommonDAO;
import com.douzone.comet.service.eh.abc.models.Abc00100Model;
import com.douzone.comet.service.util.StringUtil;
import com.douzone.comet.service.util.api.models.scm.SCMApiProvider_Ps_ResultData;
import com.douzone.gpd.components.exception.DzApplicationRuntimeException;
import com.douzone.gpd.jdbc.transaction.DbTransaction;
import com.douzone.gpd.restful.annotation.DzApi;
import com.douzone.gpd.restful.annotation.DzApiService;
import com.douzone.gpd.restful.annotation.DzParam;
import com.douzone.gpd.restful.enums.CometModule;
import com.douzone.gpd.restful.enums.DzParamType;
import com.douzone.gpd.restful.enums.DzRequestMethod;
import com.douzone.gpd.restful.model.DzGridModel;

/** 
  * @description :
  * @Since   : 
  * @Author  :
  * @History :
  */
@DzApiService(value="Abc00100Service", module=CometModule.EH, desc="시정조치요구등록")
public class Abc00100Service extends DzCometService {

	@Autowired
	Abc00100DAO abc00100DAO; 
	@Autowired
	AbcCommonDAO abcCommonDAO;

	@DzApi(url="/abc00100_list", desc="시정조치요구등록-조회", httpMethod=DzRequestMethod.GET)
	public List<Abc00100Model> abc00100_list(
		@DzParam(key="companyCode", desc="회사코드", paramType = DzParamType.QueryString) String companyCode,
		@DzParam(key="PLANT_CD", desc="사업장", paramType = DzParamType.QueryString) String PLANT_CD,
		@DzParam(key="ISSUE_TP", desc="시정조치유형", paramType = DzParamType.QueryString) String ISSUE_TP,
		@DzParam(key="FG_CD", desc="시정조치구분", paramType = DzParamType.QueryString) String FG_CD,
		@DzParam(key="CRCT_TRMT_REQN_DT", desc="발행일", paramType = DzParamType.QueryString) String CRCT_TRMT_REQN_DT,
		@DzParam(key="CRCT_TRMT_NO", desc="시정조치번호", paramType = DzParamType.QueryString) String CRCT_TRMT_NO
	) throws Exception {
		List<Abc00100Model> abc00100ModelList =  new ArrayList<Abc00100Model>();
		try {
			HashMap<String, Object> param = new HashMap<String, Object>();
			
			param.put("P_COMPANY_CD", companyCode);
			param.put("P_PLANT_CD", PLANT_CD);
			param.put("P_ISSUE_TP", ISSUE_TP);
			param.put("P_FG_CD", FG_CD);
			param.put("P_CRCT_TRMT_REQN_DT", CRCT_TRMT_REQN_DT);
			param.put("P_CRCT_TRMT_NO", CRCT_TRMT_NO);
			
	 		abc00100ModelList = abc00100DAO.selectAbc00100ModelList(param);
	 		
	 		for (Abc00100Model item : abc00100ModelList) {
				item.set_uid(UUID.randomUUID().toString());
			}
	 		
	 	} catch(Exception e) {
	        throw new DzApplicationRuntimeException(e);
	    }
	    
	    return abc00100ModelList;
 	}

	@Transactional(rollbackFor = Exception.class)
	@DzApi(url="/abc00100_save", desc="시정조치요구등록-저장", httpMethod=DzRequestMethod.POST)
	public SCMApiProvider_Ps_ResultData abc00100_save(
		@DzParam(key="mstGrid_ds", desc="마스터그리드", paramType = DzParamType.Body) DzGridModel<Abc00100Model> mstGrid_ds
	) throws Exception {	    
		DbTransaction<?> transaction = null;
		SCMApiProvider_Ps_ResultData mResult = new SCMApiProvider_Ps_ResultData();
	    try {	        	       
	    	transaction = this.beginTransaction();
	    	if (mstGrid_ds != null) {
				if (mstGrid_ds.getDeleted().size() > 0) {
					for (Abc00100Model item : mstGrid_ds.getDeleted()) {
						HashMap<String, Object> param = new HashMap<String, Object>();
						HashMap<String, Object> fileParam = new HashMap<String, Object>();
						
						param.put("P_COMPANY_CD", item.getCompany_cd());
						param.put("P_CRCT_TRMT_NO", item.getCrct_trmt_no());
						param.put("P_SQ_NO", item.getSq_no());

						abc00100DAO.deleteAbc00100Model(param);
						abc00100DAO.deleteAbc00200Model(param);
						abc00100DAO.deleteAbc00300Model(param);
					}
				}
				if (mstGrid_ds.getUpdated().size() > 0) {
					for (Abc00100Model item : mstGrid_ds.getUpdated()) {
						HashMap<String, Object> param = new HashMap<String, Object>();
						
						// 날짜 포맷 변환
						item.setCrct_trmt_reqn_dt(StringUtil.getLocaleTimeString(item.getCrct_trmt_reqn_dt(), "yyyyMMdd"));
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
						
						int maxSq = 0;
						
						String companyCd = item.getCompany_cd();
						String plantCd = item.getPlant_cd();
						String nowDate = dateFormat.format(new Date()); 				
						
						sqParam.put("P_COMPANY_CD", companyCd);
						sqParam.put("P_PLANT_CD", plantCd);
						sqParam.put("P_NOWDATE", nowDate);
						
						maxSq = abc00100DAO.selectMaxSq(sqParam);
						
						String newSq = nowDate.concat(plantCd).concat(String.format("%03d", maxSq));
						
						item.setCrct_trmt_no(newSq);
						item.setSq_no("1");
						// 날짜 포맷 변환
						item.setCrct_trmt_reqn_dt(StringUtil.getLocaleTimeString(item.getCrct_trmt_reqn_dt(), "yyyyMMdd"));
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

						abc00100DAO.insertAbc00100Model(param);
						abc00100DAO.insertAbc00200Model(param200);
						abc00100DAO.insertAbc00300Model(param300);
					}
				}
			}
			transaction.commit();
	        
	    } catch (Exception e) {
	        if(transaction != null) {
				transaction.rollback();
			}
			throw new DzApplicationRuntimeException(e.getMessage().length() > 0 ? e.getMessage() :
				(e.getCause().getMessage() == null ? "Null Pointer Exception" : e.getCause().getMessage()));
	    }
	    mResult.setSuccess(true);
		return mResult;
	}
}
