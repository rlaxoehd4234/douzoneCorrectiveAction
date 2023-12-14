package com.douzone.comet.service.eh.abc.models;
 
import java.math.BigDecimal;

import com.douzone.gpd.jdbc.mybatis.model.DzAbstractModel;
import com.douzone.gpd.restful.annotation.DzModel;
import com.douzone.gpd.restful.annotation.DzModelField;
import com.google.gson.annotations.SerializedName;
 
@DzModel(name = "Abc00400DtlModel", desc = "시정조치요구관리디테일", tableName = "")
public class Abc00400DtlModel extends DzAbstractModel {

	@SerializedName("COMPANY_CD")
	@DzModelField(name="company_cd", desc="회사코드", colName="COMPANY_CD", colSize="7", isKey=false)
	private String company_cd;
	  
	@SerializedName("CRCT_TRMT_NO")
	@DzModelField(name="crct_trmt_no", desc="시정조치번호", colName="CRCT_TRMT_NO", colSize="20", isKey=false)
	private String crct_trmt_no;
	  
	@SerializedName("SQ_NO")
	@DzModelField(name="sq_no", desc="순번번호", colName="SQ_NO", colSize="20", isKey=false)
	private String sq_no;
	  
	@SerializedName("PLANT_CD")
	@DzModelField(name="plant_cd", desc="공장코드", colName="PLANT_CD", colSize="7", isKey=false)
	private String plant_cd;
	  
	@SerializedName("REQN_CRCT_TRMT_REQN_DT")
	@DzModelField(name="reqn_crct_trmt_reqn_dt", desc="시정조치발행일자", colName="REQN_CRCT_TRMT_REQN_DT", colSize="50", isKey=false)
	private String reqn_crct_trmt_reqn_dt;
	  
	@SerializedName("REQN_ISSUE_TP")
	@DzModelField(name="reqn_issue_tp", desc="시정조치유형코드", colName="REQN_ISSUE_TP", colSize="5", isKey=false)
	private String reqn_issue_tp;
	  
	@SerializedName("REQN_CRCT_TRMT_NM")
	@DzModelField(name="reqn_crct_trmt_nm", desc="시정조치제목", colName="REQN_CRCT_TRMT_NM", colSize="100", isKey=false)
	private String reqn_crct_trmt_nm;
	  
	@SerializedName("REQN_TRMT_GOAL_DT")
	@DzModelField(name="reqn_trmt_goal_dt", desc="시정조치기한", colName="REQN_TRMT_GOAL_DT", colSize="50", isKey=false)
	private String reqn_trmt_goal_dt;
	  
	@SerializedName("REQN_TRMT_TRGT_CD")
	@DzModelField(name="reqn_trmt_trgt_cd", desc="시정조치부서코드", colName="REQN_TRMT_TRGT_CD", colSize="10", isKey=false)
	private String reqn_trmt_trgt_cd;
	  
	@SerializedName("REQN_ISSUE_EMP_NO")
	@DzModelField(name="reqn_issue_emp_no", desc="시정조치발행자사번", colName="REQN_ISSUE_EMP_NO", colSize="20", isKey=false)
	private String reqn_issue_emp_no;
	  
	@SerializedName("REQN_REL_BSS_TXT")
	@DzModelField(name="reqn_rel_bss_txt", desc="관련근거", colName="REQN_REL_BSS_TXT", colSize="", isKey=false)
	private String reqn_rel_bss_txt;
	  
	@SerializedName("REQN_PTG_MATTER_TXT")
	@DzModelField(name="reqn_ptg_matter_txt", desc="지적사항", colName="REQN_PTG_MATTER_TXT", colSize="", isKey=false)
	private String reqn_ptg_matter_txt;
	  
	@SerializedName("REQN_CRCT_TRMT_TXT")
	@DzModelField(name="reqn_crct_trmt_txt", desc="시정조치요구사항", colName="REQN_CRCT_TRMT_TXT", colSize="", isKey=false)
	private String reqn_crct_trmt_txt;
	  
	@SerializedName("REQN_FG_CD")
	@DzModelField(name="reqn_fg_cd", desc="시정조치구분코드", colName="REQN_FG_CD", colSize="5", isKey=false)
	private String reqn_fg_cd;
	  
	@SerializedName("REQN_ATCHFILE_ID")
	@DzModelField(name="reqn_atchfile_id", desc="등록첨부파일", colName="REQN_ATCHFILE_ID", colSize="320", isKey=false)
	private String reqn_atchfile_id;
	  
	@SerializedName("REQN_IMG_PATH_DC")
	@DzModelField(name="reqn_img_path_dc", desc="등록이미지파일", colName="REQN_IMG_PATH_DC", colSize="200", isKey=false)
	private String reqn_img_path_dc;
	  
	@SerializedName("REQN_PLANT_NM")
	@DzModelField(name="reqn_plant_nm", desc="공장명", colName="REQN_PLANT_NM", colSize="50", isKey=false)
	private String reqn_plant_nm;
	  
	@SerializedName("REQN_ISSUE_NM")
	@DzModelField(name="reqn_issue_nm", desc="시정조치유형명", colName="REQN_ISSUE_NM", colSize="100", isKey=false)
	private String reqn_issue_nm;
	  
	@SerializedName("REQN_TRMT_TRGT_NM")
	@DzModelField(name="reqn_trmt_trgt_nm", desc="시정조치부서명", colName="REQN_TRMT_TRGT_NM", colSize="50", isKey=false)
	private String reqn_trmt_trgt_nm;
	  
	@SerializedName("REQN_ISSUE_EMP_NM")
	@DzModelField(name="reqn_issue_emp_nm", desc="시정조치발행자명", colName="REQN_ISSUE_EMP_NM", colSize="50", isKey=false)
	private String reqn_issue_emp_nm;
	  
	@SerializedName("REQN_FG_NM")
	@DzModelField(name="reqn_fg_nm", desc="시정조치구분명", colName="REQN_FG_NM", colSize="100", isKey=false)
	private String reqn_fg_nm;
	  
	@SerializedName("REQN_ISSUE_DEPT_CD")
	@DzModelField(name="reqn_issue_dept_cd", desc="시정조치발행자부서코드", colName="REQN_ISSUE_DEPT_CD", colSize="20", isKey=false)
	private String reqn_issue_dept_cd;
	  
	@SerializedName("REQN_ISSUE_DEPT_NM")
	@DzModelField(name="reqn_issue_dept_nm", desc="시정조치발행자부서명", colName="REQN_ISSUE_DEPT_NM", colSize="50", isKey=false)
	private String reqn_issue_dept_nm;
	  
	@SerializedName("REQN_ISSUE_EMP_PSTN_CD")
	@DzModelField(name="reqn_issue_emp_pstn_cd", desc="시정조치발행자직급코드", colName="REQN_ISSUE_EMP_PSTN_CD", colSize="5", isKey=false)
	private String reqn_issue_emp_pstn_cd;
	  
	@SerializedName("REQN_FILE_DC")
	@DzModelField(name="reqn_file_dc", desc="등록첨부파일내역", colName="REQN_FILE_DC", colSize="200", isKey=false)
	private String reqn_file_dc;
	  
	@SerializedName("REQN_IMG_FILE_DC")
	@DzModelField(name="reqn_img_file_dc", desc="등록이미지파일내역", colName="REQN_IMG_FILE_DC", colSize="200", isKey=false)
	private String reqn_img_file_dc;
	
	@SerializedName("REQN_FILE_IMG_SQ")
	@DzModelField(name="reqn_file_img_sq", desc="등록이미지순번", colName="REQN_FILE_IMG_SQ", colSize="5", isKey=false)
	private String reqn_file_img_sq;
	
	@SerializedName("REQN_FILE_IMG_ORGL_FILE_DC")
	@DzModelField(name="reqn_file_img_orgl_file_dc", desc="등록이미지원본파일내역", colName="REQN_FILE_IMG_ORGL_FILE_DC", colSize="200", isKey=false)
	private String reqn_file_img_orgl_file_dc;
	
	@SerializedName("REQN_FILE_IMG_ORGL_FEXTSN_DC")
	@DzModelField(name="reqn_file_img_orgl_fextsn_dc", desc="등록이미지원본파일확장자내역", colName="REQN_FILE_IMG_ORGL_FEXTSN_DC", colSize="200", isKey=false)
	private String reqn_file_img_orgl_fextsn_dc;
	
	@SerializedName("REQN_FILE_IMG_NEW_FILE_DC")
	@DzModelField(name="reqn_file_img_new_file_dc", desc="등록이미지신규파일내역", colName="REQN_FILE_IMG_NEW_FILE_DC", colSize="200", isKey=false)
	private String reqn_file_img_new_file_dc;
	
	@SerializedName("REQN_FILE_IMG_FILE_VR")
	@DzModelField(name="reqn_file_img_file_vr", desc="등록이미지파일문자값", colName="REQN_FILE_IMG_FILE_VR", colSize="20", isKey=false)
	private String reqn_file_img_file_vr;
	  
	@SerializedName("RST_COMPANY_CD")
	@DzModelField(name="rst_company_cd", desc="결과회사코드", colName="RST_COMPANY_CD", colSize="7", isKey=false)
	private String rst_company_cd;
	  
	@SerializedName("RST_CRCT_TRMT_NO")
	@DzModelField(name="rst_crct_trmt_no", desc="결과시정조치번호", colName="RST_CRCT_TRMT_NO", colSize="20", isKey=false)
	private String rst_crct_trmt_no;
	  
	@SerializedName("RST_SQ_NO")
	@DzModelField(name="rst_sq_no", desc="결과순번번호", colName="RST_SQ_NO", colSize="20", isKey=false)
	private String rst_sq_no;
	  
	@SerializedName("RST_ISSUE_EMP_NO")
	@DzModelField(name="rst_issue_emp_no", desc="시정조치시행자사번", colName="RST_ISSUE_EMP_NO", colSize="20", isKey=false)
	private String rst_issue_emp_no;
	  
	@SerializedName("RST_ISSUE_DT")
	@DzModelField(name="rst_issue_dt", desc="조치완료일", colName="RST_ISSUE_DT", colSize="8", isKey=false)
	private String rst_issue_dt;
	  
	@SerializedName("RST_SURCHRG_AMT")
	@DzModelField(name="rst_surchrg_amt", desc="조치비용", colName="RST_SURCHRG_AMT", colSize="19", isKey=false)
	private BigDecimal rst_surchrg_amt;
	  
	@SerializedName("RST_CUS_ANAL_TXT")
	@DzModelField(name="rst_cus_anal_txt", desc="원인분석", colName="RST_CUS_ANAL_TXT", colSize="", isKey=false)
	private String rst_cus_anal_txt;
	  
	@SerializedName("RST_TRMT_CNTN_TXT")
	@DzModelField(name="rst_trmt_cntn_txt", desc="조치내용", colName="RST_TRMT_CNTN_TXT", colSize="", isKey=false)
	private String rst_trmt_cntn_txt;
	  
	@SerializedName("RST_PRVN_TRMT_N_CTMSR_TXT")
	@DzModelField(name="rst_prvn_trmt_n_ctmsr_txt", desc="예방및방지대책", colName="RST_PRVN_TRMT_N_CTMSR_TXT", colSize="", isKey=false)
	private String rst_prvn_trmt_n_ctmsr_txt;
	  
	@SerializedName("RST_ATCHFILE_ID")
	@DzModelField(name="rst_atchfile_id", desc="결과첨부파일", colName="RST_ATCHFILE_ID", colSize="320", isKey=false)
	private String rst_atchfile_id;
	  
	@SerializedName("RST_IMG_PATH_DC")
	@DzModelField(name="rst_img_path_dc", desc="결과이미지파일", colName="RST_IMG_PATH_DC", colSize="200", isKey=false)
	private String rst_img_path_dc;
	  
	@SerializedName("RST_ISSUE_EMP_NM")
	@DzModelField(name="rst_issue_emp_nm", desc="시정조치시행자명", colName="RST_ISSUE_EMP_NM", colSize="50", isKey=false)
	private String rst_issue_emp_nm;
	  
	@SerializedName("RST_ISSUE_DEPT_CD")
	@DzModelField(name="rst_issue_dept_cd", desc="시정조치시행자부서코드", colName="RST_ISSUE_DEPT_CD", colSize="20", isKey=false)
	private String rst_issue_dept_cd;
	  
	@SerializedName("RST_ISSUE_DEPT_NM")
	@DzModelField(name="rst_issue_dept_nm", desc="시정조치시행자부서명", colName="RST_ISSUE_DEPT_NM", colSize="50", isKey=false)
	private String rst_issue_dept_nm;
	  
	@SerializedName("RST_FILE_DC")
	@DzModelField(name="rst_file_dc", desc="결과첨부파일내역", colName="RST_FILE_DC", colSize="200", isKey=false)
	private String rst_file_dc;
	  
	@SerializedName("RST_IMG_FILE_DC")
	@DzModelField(name="rst_img_file_dc", desc="결과이미지파일내역", colName="RST_IMG_FILE_DC", colSize="200", isKey=false)
	private String rst_img_file_dc;
	  
	@SerializedName("REVIEW_COMPANY_CD")
	@DzModelField(name="review_company_cd", desc="검토회사코드", colName="REVIEW_COMPANY_CD", colSize="7", isKey=false)
	private String review_company_cd;
	  
	@SerializedName("REVIEW_CRCT_TRMT_NO")
	@DzModelField(name="review_crct_trmt_no", desc="검토시정조치번호", colName="REVIEW_CRCT_TRMT_NO", colSize="20", isKey=false)
	private String review_crct_trmt_no;
	  
	@SerializedName("REVIEW_SQ_NO")
	@DzModelField(name="review_sq_no", desc="검토순번번호", colName="REVIEW_SQ_NO", colSize="20", isKey=false)
	private String review_sq_no;
	  
	@SerializedName("REVIEW_ISSUE_EMP_NO")
	@DzModelField(name="review_issue_emp_no", desc="시정조치검토자사번", colName="REVIEW_ISSUE_EMP_NO", colSize="20", isKey=false)
	private String review_issue_emp_no;
	  
	@SerializedName("REVIEW_ISSUE_DT")
	@DzModelField(name="review_issue_dt", desc="검토일", colName="REVIEW_ISSUE_DT", colSize="8", isKey=false)
	private String review_issue_dt;
	  
	@SerializedName("REVIEW_RE_CRCT_TRMT_TXT")
	@DzModelField(name="review_re_crct_trmt_txt", desc="요청사항", colName="REVIEW_RE_CRCT_TRMT_TXT", colSize="500", isKey=false)
	private String review_re_crct_trmt_txt;
	  
	@SerializedName("REVIEW_RE_CRCT_TRMT_REQN_DT")
	@DzModelField(name="review_re_crct_trmt_reqn_dt", desc="요청기한", colName="REVIEW_RE_CRCT_TRMT_REQN_DT", colSize="8", isKey=false)
	private String review_re_crct_trmt_reqn_dt;
	  
	@SerializedName("REVIEW_OPN_TXT")
	@DzModelField(name="review_opn_txt", desc="검토의견텍스트", colName="REVIEW_OPN_TXT", colSize="", isKey=false)
	private String review_opn_txt;
	  
	@SerializedName("REVIEW_RST_FG")
	@DzModelField(name="review_rst_fg", desc="검토결과구분코드", colName="REVIEW_RST_FG", colSize="3", isKey=false)
	private String review_rst_fg;
	  
	@SerializedName("REVIEW_ISSUE_EMP_NM")
	@DzModelField(name="review_issue_emp_nm", desc="시정조치검토자명", colName="REVIEW_ISSUE_EMP_NM", colSize="50", isKey=false)
	private String review_issue_emp_nm;
	  
	@SerializedName("REVIEW_RST_NM")
	@DzModelField(name="review_rst_nm", desc="검토결과명", colName="REVIEW_RST_NM", colSize="100", isKey=false)
	private String review_rst_nm;
	  
	@SerializedName("REVIEW_ISSUE_DEPT_CD")
	@DzModelField(name="review_issue_dept_cd", desc="시정조치검토자부서코드", colName="REVIEW_ISSUE_DEPT_CD", colSize="20", isKey=false)
	private String review_issue_dept_cd;
	  
	@SerializedName("REVIEW_ISSUE_DEPT_NM")
	@DzModelField(name="review_issue_dept_nm", desc="시정조치검토자부서명", colName="REVIEW_ISSUE_DEPT_NM", colSize="50", isKey=false)
	private String review_issue_dept_nm;
	
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
 
	public String getPlant_cd() {
		return plant_cd;
	}

	public void setPlant_cd(String plant_cd) {
		this.plant_cd = plant_cd;
	}
 
	public String getReqn_crct_trmt_reqn_dt() {
		return reqn_crct_trmt_reqn_dt;
	}

	public void setReqn_crct_trmt_reqn_dt(String reqn_crct_trmt_reqn_dt) {
		this.reqn_crct_trmt_reqn_dt = reqn_crct_trmt_reqn_dt;
	}
 
	public String getReqn_issue_tp() {
		return reqn_issue_tp;
	}

	public void setReqn_issue_tp(String reqn_issue_tp) {
		this.reqn_issue_tp = reqn_issue_tp;
	}
 
	public String getReqn_crct_trmt_nm() {
		return reqn_crct_trmt_nm;
	}

	public void setReqn_crct_trmt_nm(String reqn_crct_trmt_nm) {
		this.reqn_crct_trmt_nm = reqn_crct_trmt_nm;
	}
 
	public String getReqn_trmt_goal_dt() {
		return reqn_trmt_goal_dt;
	}

	public void setReqn_trmt_goal_dt(String reqn_trmt_goal_dt) {
		this.reqn_trmt_goal_dt = reqn_trmt_goal_dt;
	}
 
	public String getReqn_trmt_trgt_cd() {
		return reqn_trmt_trgt_cd;
	}

	public void setReqn_trmt_trgt_cd(String reqn_trmt_trgt_cd) {
		this.reqn_trmt_trgt_cd = reqn_trmt_trgt_cd;
	}
 
	public String getReqn_issue_emp_no() {
		return reqn_issue_emp_no;
	}

	public void setReqn_issue_emp_no(String reqn_issue_emp_no) {
		this.reqn_issue_emp_no = reqn_issue_emp_no;
	}
 
	public String getReqn_rel_bss_txt() {
		return reqn_rel_bss_txt;
	}

	public void setReqn_rel_bss_txt(String reqn_rel_bss_txt) {
		this.reqn_rel_bss_txt = reqn_rel_bss_txt;
	}
 
	public String getReqn_ptg_matter_txt() {
		return reqn_ptg_matter_txt;
	}

	public void setReqn_ptg_matter_txt(String reqn_ptg_matter_txt) {
		this.reqn_ptg_matter_txt = reqn_ptg_matter_txt;
	}
 
	public String getReqn_crct_trmt_txt() {
		return reqn_crct_trmt_txt;
	}

	public void setReqn_crct_trmt_txt(String reqn_crct_trmt_txt) {
		this.reqn_crct_trmt_txt = reqn_crct_trmt_txt;
	}
 
	public String getReqn_fg_cd() {
		return reqn_fg_cd;
	}

	public void setReqn_fg_cd(String reqn_fg_cd) {
		this.reqn_fg_cd = reqn_fg_cd;
	}
 
	public String getReqn_atchfile_id() {
		return reqn_atchfile_id;
	}

	public void setReqn_atchfile_id(String reqn_atchfile_id) {
		this.reqn_atchfile_id = reqn_atchfile_id;
	}
 
	public String getReqn_img_path_dc() {
		return reqn_img_path_dc;
	}

	public void setReqn_img_path_dc(String reqn_img_path_dc) {
		this.reqn_img_path_dc = reqn_img_path_dc;
	}
 
	public String getReqn_plant_nm() {
		return reqn_plant_nm;
	}

	public void setReqn_plant_nm(String reqn_plant_nm) {
		this.reqn_plant_nm = reqn_plant_nm;
	}
 
	public String getReqn_issue_nm() {
		return reqn_issue_nm;
	}

	public void setReqn_issue_nm(String reqn_issue_nm) {
		this.reqn_issue_nm = reqn_issue_nm;
	}
 
	public String getReqn_trmt_trgt_nm() {
		return reqn_trmt_trgt_nm;
	}

	public void setReqn_trmt_trgt_nm(String reqn_trmt_trgt_nm) {
		this.reqn_trmt_trgt_nm = reqn_trmt_trgt_nm;
	}
 
	public String getReqn_issue_emp_nm() {
		return reqn_issue_emp_nm;
	}

	public void setReqn_issue_emp_nm(String reqn_issue_emp_nm) {
		this.reqn_issue_emp_nm = reqn_issue_emp_nm;
	}
 
	public String getReqn_fg_nm() {
		return reqn_fg_nm;
	}

	public void setReqn_fg_nm(String reqn_fg_nm) {
		this.reqn_fg_nm = reqn_fg_nm;
	}
 
	public String getReqn_issue_dept_cd() {
		return reqn_issue_dept_cd;
	}

	public void setReqn_issue_dept_cd(String reqn_issue_dept_cd) {
		this.reqn_issue_dept_cd = reqn_issue_dept_cd;
	}
 
	public String getReqn_issue_dept_nm() {
		return reqn_issue_dept_nm;
	}

	public void setReqn_issue_dept_nm(String reqn_issue_dept_nm) {
		this.reqn_issue_dept_nm = reqn_issue_dept_nm;
	}
 
	public String getReqn_issue_emp_pstn_cd() {
		return reqn_issue_emp_pstn_cd;
	}

	public void setReqn_issue_emp_pstn_cd(String reqn_issue_emp_pstn_cd) {
		this.reqn_issue_emp_pstn_cd = reqn_issue_emp_pstn_cd;
	}
 
	public String getReqn_file_dc() {
		return reqn_file_dc;
	}

	public void setReqn_file_dc(String reqn_file_dc) {
		this.reqn_file_dc = reqn_file_dc;
	}
 
	public String getReqn_img_file_dc() {
		return reqn_img_file_dc;
	}

	public void setReqn_img_file_dc(String reqn_img_file_dc) {
		this.reqn_img_file_dc = reqn_img_file_dc;
	}
 
	public String getRst_company_cd() {
		return rst_company_cd;
	}

	public void setRst_company_cd(String rst_company_cd) {
		this.rst_company_cd = rst_company_cd;
	}
 
	public String getRst_crct_trmt_no() {
		return rst_crct_trmt_no;
	}

	public void setRst_crct_trmt_no(String rst_crct_trmt_no) {
		this.rst_crct_trmt_no = rst_crct_trmt_no;
	}
 
	public String getRst_sq_no() {
		return rst_sq_no;
	}

	public void setRst_sq_no(String rst_sq_no) {
		this.rst_sq_no = rst_sq_no;
	}
 
	public String getRst_issue_emp_no() {
		return rst_issue_emp_no;
	}

	public void setRst_issue_emp_no(String rst_issue_emp_no) {
		this.rst_issue_emp_no = rst_issue_emp_no;
	}
 
	public String getRst_issue_dt() {
		return rst_issue_dt;
	}

	public void setRst_issue_dt(String rst_issue_dt) {
		this.rst_issue_dt = rst_issue_dt;
	}
 
	public BigDecimal getRst_surchrg_amt() {
		return rst_surchrg_amt;
	}

	public void setRst_surchrg_amt(BigDecimal rst_surchrg_amt) {
		this.rst_surchrg_amt = rst_surchrg_amt;
	}
 
	public String getRst_cus_anal_txt() {
		return rst_cus_anal_txt;
	}

	public void setRst_cus_anal_txt(String rst_cus_anal_txt) {
		this.rst_cus_anal_txt = rst_cus_anal_txt;
	}
 
	public String getRst_trmt_cntn_txt() {
		return rst_trmt_cntn_txt;
	}

	public void setRst_trmt_cntn_txt(String rst_trmt_cntn_txt) {
		this.rst_trmt_cntn_txt = rst_trmt_cntn_txt;
	}
 
	public String getRst_prvn_trmt_n_ctmsr_txt() {
		return rst_prvn_trmt_n_ctmsr_txt;
	}

	public void setRst_prvn_trmt_n_ctmsr_txt(String rst_prvn_trmt_n_ctmsr_txt) {
		this.rst_prvn_trmt_n_ctmsr_txt = rst_prvn_trmt_n_ctmsr_txt;
	}
 
	public String getRst_atchfile_id() {
		return rst_atchfile_id;
	}

	public void setRst_atchfile_id(String rst_atchfile_id) {
		this.rst_atchfile_id = rst_atchfile_id;
	}
 
	public String getRst_img_path_dc() {
		return rst_img_path_dc;
	}

	public void setRst_img_path_dc(String rst_img_path_dc) {
		this.rst_img_path_dc = rst_img_path_dc;
	}
 
	public String getRst_issue_emp_nm() {
		return rst_issue_emp_nm;
	}

	public void setRst_issue_emp_nm(String rst_issue_emp_nm) {
		this.rst_issue_emp_nm = rst_issue_emp_nm;
	}
 
	public String getRst_issue_dept_cd() {
		return rst_issue_dept_cd;
	}

	public void setRst_issue_dept_cd(String rst_issue_dept_cd) {
		this.rst_issue_dept_cd = rst_issue_dept_cd;
	}
 
	public String getRst_issue_dept_nm() {
		return rst_issue_dept_nm;
	}

	public void setRst_issue_dept_nm(String rst_issue_dept_nm) {
		this.rst_issue_dept_nm = rst_issue_dept_nm;
	}
 
	public String getRst_file_dc() {
		return rst_file_dc;
	}

	public void setRst_file_dc(String rst_file_dc) {
		this.rst_file_dc = rst_file_dc;
	}
 
	public String getRst_img_file_dc() {
		return rst_img_file_dc;
	}

	public void setRst_img_file_dc(String rst_img_file_dc) {
		this.rst_img_file_dc = rst_img_file_dc;
	}
 
	public String getReview_company_cd() {
		return review_company_cd;
	}

	public void setReview_company_cd(String review_company_cd) {
		this.review_company_cd = review_company_cd;
	}
 
	public String getReview_crct_trmt_no() {
		return review_crct_trmt_no;
	}

	public void setReview_crct_trmt_no(String review_crct_trmt_no) {
		this.review_crct_trmt_no = review_crct_trmt_no;
	}
 
	public String getReview_sq_no() {
		return review_sq_no;
	}

	public void setReview_sq_no(String review_sq_no) {
		this.review_sq_no = review_sq_no;
	}
 
	public String getReview_issue_emp_no() {
		return review_issue_emp_no;
	}

	public void setReview_issue_emp_no(String review_issue_emp_no) {
		this.review_issue_emp_no = review_issue_emp_no;
	}
 
	public String getReview_issue_dt() {
		return review_issue_dt;
	}

	public void setReview_issue_dt(String review_issue_dt) {
		this.review_issue_dt = review_issue_dt;
	}
 
	public String getReview_re_crct_trmt_txt() {
		return review_re_crct_trmt_txt;
	}

	public void setReview_re_crct_trmt_txt(String review_re_crct_trmt_txt) {
		this.review_re_crct_trmt_txt = review_re_crct_trmt_txt;
	}
 
	public String getReview_re_crct_trmt_reqn_dt() {
		return review_re_crct_trmt_reqn_dt;
	}

	public void setReview_re_crct_trmt_reqn_dt(String review_re_crct_trmt_reqn_dt) {
		this.review_re_crct_trmt_reqn_dt = review_re_crct_trmt_reqn_dt;
	}
 
	public String getReview_opn_txt() {
		return review_opn_txt;
	}

	public void setReview_opn_txt(String review_opn_txt) {
		this.review_opn_txt = review_opn_txt;
	}
 
	public String getReview_rst_fg() {
		return review_rst_fg;
	}

	public void setReview_rst_fg(String review_rst_fg) {
		this.review_rst_fg = review_rst_fg;
	}
 
	public String getReview_issue_emp_nm() {
		return review_issue_emp_nm;
	}

	public void setReview_issue_emp_nm(String review_issue_emp_nm) {
		this.review_issue_emp_nm = review_issue_emp_nm;
	}
 
	public String getReview_rst_nm() {
		return review_rst_nm;
	}

	public void setReview_rst_nm(String review_rst_nm) {
		this.review_rst_nm = review_rst_nm;
	}
 
	public String getReview_issue_dept_cd() {
		return review_issue_dept_cd;
	}

	public void setReview_issue_dept_cd(String review_issue_dept_cd) {
		this.review_issue_dept_cd = review_issue_dept_cd;
	}
 
	public String getReview_issue_dept_nm() {
		return review_issue_dept_nm;
	}

	public void setReview_issue_dept_nm(String review_issue_dept_nm) {
		this.review_issue_dept_nm = review_issue_dept_nm;
	}
	
	public String get_uid() {
		return _uid;
	}

	public void set_uid(String _uid) {
		this._uid = _uid;
	}
}
