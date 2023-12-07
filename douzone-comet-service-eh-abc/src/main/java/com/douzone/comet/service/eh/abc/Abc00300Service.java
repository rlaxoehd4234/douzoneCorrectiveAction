package com.douzone.comet.service.eh.abc;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.douzone.comet.components.DzCometService;
import com.douzone.comet.service.eh.abc.dao.Abc00300DAO;
import com.douzone.comet.service.eh.abc.models.Abc00300Model;
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
@DzApiService(value="Abc00300Service", module=CometModule.EH, desc="시정조치요구검토")
public class Abc00300Service extends DzCometService {

	@Autowired
	Abc00300DAO abc00300_serviceDAO; 

	@DzApi(url="/abc00300_service_list", desc="시정조치요구검토_조회", httpMethod=DzRequestMethod.GET)
	public List<Abc00300Model> abc00300_service_list(
		@DzParam(key="companyCode", desc="회사번호", paramType = DzParamType.QueryString) String companyCode,
		@DzParam(key="PLANT_CD", desc="사업장", paramType = DzParamType.QueryString) String PLANT_CD,
		@DzParam(key="MNG_DTL_CD", desc="시정조치유형", paramType = DzParamType.QueryString) String MNG_DTL_CD,
		@DzParam(key="MNG_DTL_CD2", desc="시정조치구분", paramType = DzParamType.QueryString) String MNG_DTL_CD2,
		@DzParam(key="MNG_DTL_CD3", desc="검토결과", paramType = DzParamType.QueryString) String MNG_DTL_CD3,
		@DzParam(key="TRMT_GOAL_DT_START", desc="조치기한_시작일", paramType = DzParamType.QueryString) String TRMT_GOAL_DT_START,
		@DzParam(key="TRMT_GOAL_DT_END", desc="조치기한_종료일", paramType = DzParamType.QueryString) String TRMT_GOAL_DT_END,
		@DzParam(key="ISSUE_DT2_START", desc="조치일자_시작일", paramType = DzParamType.QueryString) String ISSUE_DT2_START,
		@DzParam(key="ISSUE_DT2_END", desc="조치일자_종료일", paramType = DzParamType.QueryString) String ISSUE_DT2_END,
		@DzParam(key="DEPT_NM", desc="발행부서", paramType = DzParamType.QueryString) String DEPT_NM,
		@DzParam(key="DEPT_NM2", desc="조치부서", paramType = DzParamType.QueryString) String DEPT_NM2
	) throws Exception {
		List<Abc00300Model> abc00300ModelList =  new ArrayList<Abc00300Model>();
		try {

			HashMap<String, Object> param = new HashMap<String, Object>();
			param.put("P_COMPANY_CD", companyCode);
			param.put("P_PLANT_CD", PLANT_CD);
			param.put("P_MNG_DTL_CD", MNG_DTL_CD);
			param.put("P_MNG_DTL_CD2", MNG_DTL_CD2);
			param.put("P_MNG_DTL_CD3", MNG_DTL_CD3);
			param.put("P_TRMT_GOAL_DT_START", TRMT_GOAL_DT_START);
			param.put("P_TRMT_GOAL_DT_END", TRMT_GOAL_DT_END);
			param.put("P_ISSUE_DT2_START", ISSUE_DT2_START);
			param.put("P_ISSUE_DT2_END", ISSUE_DT2_END);
			param.put("P_DEPT_NM", DEPT_NM);
			param.put("P_DEPT_NM2", DEPT_NM2);

			//abc00300Model.setCompany_cd(this.getCompanyCode());
			//abc00300Model.setLang_cd(this.getLanguage().toUpperCase());
	 		abc00300ModelList = abc00300_serviceDAO.selectAbc00300ModelList(param);
	 	} catch(Exception e) {
	        throw new DzApplicationRuntimeException(e);
	    }
	    
	    return abc00300ModelList;
 	}

	@Transactional(rollbackFor = Exception.class)
	@DzApi(url="/abc00300_service_save", desc="시정조치요구검토_저장", httpMethod=DzRequestMethod.POST)
	public void abc00300_service_save(
		@DzParam(key="mstGrid_ds", desc="마스터그리드데이터", paramType = DzParamType.Body) DzGridModel<Abc00300Model> mstGrid_ds
	) throws Exception {	    
	
		List<Abc00300Model> added = mstGrid_ds.getAdded();
		List<Abc00300Model> updated = mstGrid_ds.getUpdated();
		List<Abc00300Model> deleted = mstGrid_ds.getDeleted();
		
		DbTransaction<?> transaction = null;
		
	    try {	        	        
	    	
	    	transaction = this.beginTransaction();
	    	
//	    	deleted
	    	if(deleted != null) {
	    		HashMap<String, Object> param = new HashMap<String, Object>();
	    		
	    		for(Abc00300Model item : deleted){
//	    		logic
	    		}
	    	}
	    	
//	    	updated
	        if(updated != null){
	        	HashMap<String, Object> param = new HashMap<String, Object>();
	        	
	        	for(Abc00300Model item : updated){
	        		param.put("P_COMPANY_CD",item.getCompany_cd());
	        		param.put("P_CRCT_TRMT_NO",item.getCrct_trmt_no());
	        		param.put("P_SQ_NO",item.getSq_no());
	        		param.put("P_ISSUE_EMP_NO",item.getIssue_emp_no3());
	        		param.put("P_ISSUE_DT",item.getIssue_dt3());
	        		param.put("P_REVIEW_OPN_TXT",item.getReview_opn_txt());
	        		param.put("P_REVIEW_RST_FG",item.getReview_rst_fg());
	        		param.put("P_RE_CRCT_TRMT_TXT",item.getRe_crct_trmt_txt());
	        		param.put("P_RE_CRCT_TRMT_REQN_DT",item.getRe_crct_trmt_reqn_dt());
	        		
	        		abc00300_serviceDAO.updateAbc00300Model(param);
	        		
	        	}
	        }
	        
	        
	        // added
	    	if(added != null) {
	    		HashMap<String, Object> param = new HashMap<String, Object>();
	    		
	    		for(Abc00300Model item : added){
//	    			logic
	    		}
	    	}

	    } catch (Exception e) {
	    	transaction.rollback();
	        throw new DzApplicationRuntimeException(e);
	    }
	    transaction.commit();
	}
}
