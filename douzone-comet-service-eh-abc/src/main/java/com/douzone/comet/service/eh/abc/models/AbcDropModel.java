package com.douzone.comet.service.eh.abc.models;
 
import com.douzone.gpd.jdbc.mybatis.model.DzAbstractModel;
import com.douzone.gpd.restful.annotation.DzModel;
import com.douzone.gpd.restful.annotation.DzModelField;
import com.google.gson.annotations.SerializedName;
 
@DzModel(name = "AbcDropModel", desc = "시정조치요구드롭다운", tableName = "")
public class AbcDropModel extends DzAbstractModel {

	@SerializedName("COMPANY_CD")
	@DzModelField(name="company_cd", desc="회사코드", colName="COMPANY_CD", colSize="7", isKey=false)
	private String company_cd;
	  
	@SerializedName("MCLS_CD")
	@DzModelField(name="mcls_cd", desc="관리항목코드", colName="MCLS_CD", colSize="10", isKey=false)
	private String mcls_cd;
	  
	@SerializedName("MNG_DTL_CD")
	@DzModelField(name="mng_dtl_cd", desc="관리상세코드", colName="MNG_DTL_CD", colSize="20", isKey=false)
	private String mng_dtl_cd;
	  
	@SerializedName("MNG_DTL_NM")
	@DzModelField(name="mng_dtl_nm", desc="관리상세명", colName="MNG_DTL_NM", colSize="100", isKey=false)
	private String mng_dtl_nm;

	public String getCompany_cd() {
		return company_cd;
	}

	public void setCompany_cd(String company_cd) {
		this.company_cd = company_cd;
	}
 
	public String getMcls_cd() {
		return mcls_cd;
	}

	public void setMcls_cd(String mcls_cd) {
		this.mcls_cd = mcls_cd;
	}
 
	public String getMng_dtl_cd() {
		return mng_dtl_cd;
	}

	public void setMng_dtl_cd(String mng_dtl_cd) {
		this.mng_dtl_cd = mng_dtl_cd;
	}
 
	public String getMng_dtl_nm() {
		return mng_dtl_nm;
	}

	public void setMng_dtl_nm(String mng_dtl_nm) {
		this.mng_dtl_nm = mng_dtl_nm;
	}
}
