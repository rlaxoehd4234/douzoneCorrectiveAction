package com.douzone.comet.service.eh.abc;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.douzone.comet.components.DzCometService;
import com.douzone.comet.service.eh.abc.dao.Abc00400DAO;
import com.douzone.comet.service.eh.abc.models.Abc00400DtlModel;
import com.douzone.comet.service.eh.abc.models.Abc00400MstModel;
import com.douzone.gpd.components.exception.DzApplicationRuntimeException;
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
@DzApiService(value="Abc00400Service", module=CometModule.EH, desc="시정조치요구관리")
public class Abc00400Service extends DzCometService {

	@Autowired
	Abc00400DAO abc00400DAO; 

	@DzApi(url="/abc00400Mst_list", desc="시정조치요구관리마스터-조회", httpMethod=DzRequestMethod.GET)
	public List<Abc00400MstModel> abc00400Mst_list(
		@DzParam(key="companyCode", desc="회사코드", paramType = DzParamType.QueryString) String companyCode,
		@DzParam(key="CRCT_TRMT_NM", desc="시정조치제목", paramType = DzParamType.QueryString) String CRCT_TRMT_NM,
		@DzParam(key="CRCT_TRMT_REQN_DT_START", desc="발행일자(시작일)", paramType = DzParamType.QueryString) String CRCT_TRMT_REQN_DT_START,
		@DzParam(key="CRCT_TRMT_REQN_DT_END", desc="발행일자(종료일)", paramType = DzParamType.QueryString) String CRCT_TRMT_REQN_DT_END,
		@DzParam(key="REVIEW_RST_FG", desc="상태", paramType = DzParamType.QueryString) String REVIEW_RST_FG
	) throws Exception {
		List<Abc00400MstModel> abc00400MstModelList =  new ArrayList<Abc00400MstModel>();
		try {
	 		HashMap<String, Object> param = new HashMap<String, Object>();
			
			param.put("P_COMPANY_CD", companyCode);
			param.put("P_CRCT_TRMT_NM", CRCT_TRMT_NM);
			param.put("P_CRCT_TRMT_REQN_DT_START", CRCT_TRMT_REQN_DT_START);
			param.put("P_CRCT_TRMT_REQN_DT_END", CRCT_TRMT_REQN_DT_END);
			param.put("P_REVIEW_RST_FG", REVIEW_RST_FG);
	 		
	 		abc00400MstModelList = abc00400DAO.selectAbc00400MstModelList(param);
	 		
	 		for (Abc00400MstModel item : abc00400MstModelList) {
				item.set_uid(UUID.randomUUID().toString());
			}
	 	} catch(Exception e) {
	        throw new DzApplicationRuntimeException(e);
	    }
	    
	    return abc00400MstModelList;
 	}
 	
 	@DzApi(url="/abc00400Dtl_list", desc="시정조치요구관리디테일-조회", httpMethod=DzRequestMethod.GET)
	public List<Abc00400DtlModel> abc00400Dtl_list(
		@DzParam(key="companyCode", desc="회사코드", paramType = DzParamType.QueryString) String companyCode,
		@DzParam(key="CRCT_TRMT_NO", desc="시정조치제목", paramType = DzParamType.QueryString) String CRCT_TRMT_NO
	) throws Exception {
		List<Abc00400DtlModel> abc00400DtlModelList =  new ArrayList<Abc00400DtlModel>();
		try {
	 		HashMap<String, Object> param = new HashMap<String, Object>();
			
			param.put("P_COMPANY_CD", companyCode);
			param.put("P_CRCT_TRMT_NO", CRCT_TRMT_NO);
	 		
	 		abc00400DtlModelList = abc00400DAO.selectAbc00400DtlModelList(param);
	 		
	 		for (Abc00400DtlModel item : abc00400DtlModelList) {
				item.set_uid(UUID.randomUUID().toString());
			}
	 	} catch(Exception e) {
	        throw new DzApplicationRuntimeException(e);
	    }
	    
	    return abc00400DtlModelList;
 	}
}
