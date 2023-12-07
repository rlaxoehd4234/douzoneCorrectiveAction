package com.douzone.comet.service.eh.abc.models;
 
import com.douzone.gpd.jdbc.mybatis.model.DzAbstractModel;
import com.douzone.gpd.restful.annotation.DzModel;
import com.douzone.gpd.restful.annotation.DzModelField;
import com.google.gson.annotations.SerializedName;
 
@DzModel(name = "Abc00400MstModel", desc = "시정조치요구관리마스터", tableName = "")
public class Abc00400MstModel extends DzAbstractModel {

	@SerializedName("COMPANY_CD")
	@DzModelField(name="company_cd", desc="회사코드", colName="COMPANY_CD", colSize="7", isKey=false)
	private String company_cd;
	  
	@SerializedName("CRCT_TRMT_NO")
	@DzModelField(name="crct_trmt_no", desc="시정조치번호", colName="CRCT_TRMT_NO", colSize="20", isKey=false)
	private String crct_trmt_no;
	  
	@SerializedName("SQ_NO")
	@DzModelField(name="sq_no", desc="순번번호", colName="SQ_NO", colSize="20", isKey=false)
	private String sq_no;
	
	@SerializedName("CRCT_TRMT_NM")
	@DzModelField(name="crct_trmt_nm", desc="시정조치제목", colName="CRCT_TRMT_NM", colSize="100", isKey=false)
	private String crct_trmt_nm;
	
	@SerializedName("CRCT_TRMT_REQN_DT")
	@DzModelField(name="crct_trmt_reqn_dt", desc="시정조치요청일", colName="CRCT_TRMT_REQN_DT", colSize="20", isKey=false)
	private String crct_trmt_reqn_dt;
	  
	@SerializedName("REVIEW_RST_FG")
	@DzModelField(name="review_rst_fg", desc="검토결과구분", colName="REVIEW_RST_FG", colSize="3", isKey=false)
	private String review_rst_fg;
	  
	@SerializedName("REVIEW_RST_NM")
	@DzModelField(name="review_rst_nm", desc="검토결과구분명", colName="REVIEW_RST_NM", colSize="100", isKey=false)
	private String review_rst_nm;
	
	@SerializedName("_uid")
	@DzModelField(name="_uid", desc="uid필드", colName="_uid")
	private String _uid;

	public String getCompany_cd() {
		return company_cd;
	}

	public void setCompany_cd(String company_cd) {
		this.company_cd = company_cd;
	}
 
	public String getCrct_trmt_no() {
		return crct_trmt_no;
	}

	public void setCrct_trmt_no(String crct_trmt_no) {
		this.crct_trmt_no = crct_trmt_no;
	}
 
	public String getSq_no() {
		return sq_no;
	}

	public void setSq_no(String sq_no) {
		this.sq_no = sq_no;
	}
 
	public String getReview_rst_fg() {
		return review_rst_fg;
	}

	public void setReview_rst_fg(String review_rst_fg) {
		this.review_rst_fg = review_rst_fg;
	}
 
	public String getReview_rst_nm() {
		return review_rst_nm;
	}

	public void setReview_rst_nm(String review_rst_nm) {
		this.review_rst_nm = review_rst_nm;
	}
	
	public String get_uid() {
		return _uid;
	}

	public void set_uid(String _uid) {
		this._uid = _uid;
	}
}
