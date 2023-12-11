package com.douzone.comet.service.eh.abc.models;
 
import java.math.BigDecimal;

import com.douzone.gpd.jdbc.mybatis.model.DzAbstractModel;
import com.douzone.gpd.restful.annotation.DzModel;
import com.douzone.gpd.restful.annotation.DzModelField;
import com.google.gson.annotations.SerializedName;
 
@DzModel(name = "Abc00200Model", desc = "시정조치요구결과", tableName = "")
public class Abc00200Model extends DzAbstractModel {

	@SerializedName("COMPANY_CD")
	@DzModelField(name="company_cd", desc="회사코드", colName="COMPANY_CD", colSize="7", isKey=false)
	private String company_cd;
	  
	@SerializedName("CRCT_TRMT_NO")
	@DzModelField(name="crct_trmt_no", desc="시정조치번호", colName="CRCT_TRMT_NO", colSize="20", isKey=false)
	private String crct_trmt_no;
	  
	@SerializedName("SQ_NO")
	@DzModelField(name="sq_no", desc="순번번호", colName="SQ_NO", colSize="20", isKey=false)
	private String sq_no;
	  
	@SerializedName("TRMT_TM_CNT")
	@DzModelField(name="trmt_tm_cnt", desc="조치시간수", colName="TRMT_TM_CNT", colSize="7", isKey=false)
	private BigDecimal trmt_tm_cnt;
	  
	@SerializedName("WRT_TM_CNT")
	@DzModelField(name="wrt_tm_cnt", desc="작성시간수", colName="WRT_TM_CNT", colSize="7", isKey=false)
	private BigDecimal wrt_tm_cnt;
	  
	@SerializedName("ISSUE_EMP_NO")
	@DzModelField(name="issue_emp_no", desc="발행사원번호", colName="ISSUE_EMP_NO", colSize="20", isKey=false)
	private String issue_emp_no;
	  
	@SerializedName("ISSUE_DT")
	@DzModelField(name="issue_dt", desc="발행일", colName="ISSUE_DT", colSize="8", isKey=false)
	private String issue_dt;
	  
	@SerializedName("SURCHRG_AMT")
	@DzModelField(name="surchrg_amt", desc="추가비용금액", colName="SURCHRG_AMT", colSize="19", isKey=false)
	private BigDecimal surchrg_amt;
	  
	@SerializedName("CUS_ANAL_TXT")
	@DzModelField(name="cus_anal_txt", desc="원인분석텍스트", colName="CUS_ANAL_TXT", colSize="", isKey=false)
	private String cus_anal_txt;
	  
	@SerializedName("TRMT_CNTN_TXT")
	@DzModelField(name="trmt_cntn_txt", desc="조치내용텍스트", colName="TRMT_CNTN_TXT", colSize="", isKey=false)
	private String trmt_cntn_txt;
	  
	@SerializedName("PRVN_TRMT_N_CTMSR_TXT")
	@DzModelField(name="prvn_trmt_n_ctmsr_txt", desc="방지조치및대책텍스트", colName="PRVN_TRMT_N_CTMSR_TXT", colSize="", isKey=false)
	private String prvn_trmt_n_ctmsr_txt;
	  
	@SerializedName("FG_CD")
	@DzModelField(name="fg_cd", desc="구분코드", colName="FG_CD", colSize="5", isKey=false)
	private String fg_cd;
	  
	@SerializedName("ATCHFILE_ID")
	@DzModelField(name="atchfile_id", desc="첨부파일ID", colName="ATCHFILE_ID", colSize="320", isKey=false)
	private String atchfile_id;
	  
	@SerializedName("IMG_PATH_DC")
	@DzModelField(name="img_path_dc", desc="이미지경로내역", colName="IMG_PATH_DC", colSize="200", isKey=false)
	private String img_path_dc;
	  
	@SerializedName("INSERT_ID")
	@DzModelField(name="insert_id", desc="등록ID", colName="INSERT_ID", colSize="30", isKey=false)
	private String insert_id;
	  
	@SerializedName("INSERT_DTS")
	@DzModelField(name="insert_dts", desc="등록일시", colName="INSERT_DTS", colSize="0", isKey=false)
	private String insert_dts;
	  
	@SerializedName("UPDATE_ID")
	@DzModelField(name="update_id", desc="수정ID", colName="UPDATE_ID", colSize="30", isKey=false)
	private String update_id;
	  
	@SerializedName("UPDATE_DTS")
	@DzModelField(name="update_dts", desc="수정일시", colName="UPDATE_DTS", colSize="0", isKey=false)
	private String update_dts;
	  
	@SerializedName("RST_GOAL_DT")
	@DzModelField(name="rst_goal_dt", desc="결과목표일", colName="RST_GOAL_DT", colSize="8", isKey=false)
	private String rst_goal_dt;
	  
	@SerializedName("FILE_DC")
	@DzModelField(name="file_dc", desc="파일내역", colName="FILE_DC", colSize="200", isKey=false)
	private String file_dc;
	  
	@SerializedName("IMG_FILE_DC")
	@DzModelField(name="img_file_dc", desc="이미지파일내역", colName="IMG_FILE_DC", colSize="200", isKey=false)
	private String img_file_dc;
	  
	@SerializedName("ISSUE_DEPT_CD")
	@DzModelField(name="issue_dept_cd", desc="발행부서코드", colName="ISSUE_DEPT_CD", colSize="20", isKey=false)
	private String issue_dept_cd;
	  
	@SerializedName("ISSUE_DEPT_NM")
	@DzModelField(name="issue_dept_nm", desc="발행부서명", colName="ISSUE_DEPT_NM", colSize="50", isKey=false)
	private String issue_dept_nm;
	  
	@SerializedName("ISSUE_EMP_NM")
	@DzModelField(name="issue_emp_nm", desc="발행사원명", colName="ISSUE_EMP_NM", colSize="50", isKey=false)
	private String issue_emp_nm;
	  
	@SerializedName("REQN_CRCT_TRMT_NO")
	@DzModelField(name="reqn_crct_trmt_no", desc="시정조치번호", colName="REQN_CRCT_TRMT_NO", colSize="20", isKey=false)
	private String reqn_crct_trmt_no;
	  
	@SerializedName("REQN_SQ_NO")
	@DzModelField(name="reqn_sq_no", desc="시정조치등록순번", colName="REQN_SQ_NO", colSize="20", isKey=false)
	private String reqn_sq_no;
	  
	@SerializedName("REQN_CRCT_TRMT_NM")
	@DzModelField(name="reqn_crct_trmt_nm", desc="시정조치등록제목", colName="REQN_CRCT_TRMT_NM", colSize="100", isKey=false)
	private String reqn_crct_trmt_nm;
	  
	@SerializedName("REQN_CRCT_TRMT_REQN_DT")
	@DzModelField(name="reqn_crct_trmt_reqn_dt", desc="시정조치등록발행일", colName="REQN_CRCT_TRMT_REQN_DT", colSize="50", isKey=false)
	private String reqn_crct_trmt_reqn_dt;
	  
	@SerializedName("REQN_TRMT_TRGT_CD")
	@DzModelField(name="reqn_trmt_trgt_cd", desc="시정조치등록조치부서코드", colName="REQN_TRMT_TRGT_CD", colSize="10", isKey=false)
	private String reqn_trmt_trgt_cd;
	  
	@SerializedName("REQN_TRMT_TRGT_NM")
	@DzModelField(name="reqn_trmt_trgt_nm", desc="시정조치등록조치부서명", colName="REQN_TRMT_TRGT_NM", colSize="50", isKey=false)
	private String reqn_trmt_trgt_nm;
	  
	@SerializedName("REQN_ISSUE_EMP_NO")
	@DzModelField(name="reqn_issue_emp_no", desc="시정조치등록발행자사번", colName="REQN_ISSUE_EMP_NO", colSize="20", isKey=false)
	private String reqn_issue_emp_no;
	  
	@SerializedName("REQN_TRMT_GOAL_DT")
	@DzModelField(name="reqn_trmt_goal_dt", desc="시정조치등록조치기한", colName="REQN_TRMT_GOAL_DT", colSize="50", isKey=false)
	private String reqn_trmt_goal_dt;
	  
	@SerializedName("REQN_REL_BSS_TXT")
	@DzModelField(name="reqn_rel_bss_txt", desc="시정조치등록관련근거", colName="REQN_REL_BSS_TXT", colSize="", isKey=false)
	private String reqn_rel_bss_txt;
	  
	@SerializedName("REQN_PTG_MATTER_TXT")
	@DzModelField(name="reqn_ptg_matter_txt", desc="시정조치등록지적사항", colName="REQN_PTG_MATTER_TXT", colSize="", isKey=false)
	private String reqn_ptg_matter_txt;
	  
	@SerializedName("REQN_CRCT_TRMT_TXT")
	@DzModelField(name="reqn_crct_trmt_txt", desc="시정조치등록시정조치", colName="REQN_CRCT_TRMT_TXT", colSize="", isKey=false)
	private String reqn_crct_trmt_txt;
	  
	@SerializedName("REQN_ATCHFILE_ID")
	@DzModelField(name="reqn_atchfile_id", desc="시정조치등록첨부파일ID", colName="REQN_ATCHFILE_ID", colSize="320", isKey=false)
	private String reqn_atchfile_id;
	  
	@SerializedName("REQN_IMG_PATH_DC")
	@DzModelField(name="reqn_img_path_dc", desc="시정조치등록이미지경로내역", colName="REQN_IMG_PATH_DC", colSize="200", isKey=false)
	private String reqn_img_path_dc;
	
	@SerializedName("REQN_ISSUE_TP")
	@DzModelField(name="reqn_issue_tp", desc="시정조치등록발행유형코드", colName="REQN_ISSUE_TP", colSize="5", isKey=false)
	private String reqn_issue_tp;
	
	@SerializedName("REQN_FG_CD")
	@DzModelField(name="reqn_fg_cd", desc="시정조치등록구분코드", colName="REQN_FG_CD", colSize="5", isKey=false)
	private String reqn_fg_cd;
	
	@SerializedName("REQN_PLANT_CD")
	@DzModelField(name="reqn_plant_cd", desc="시정조치등록사업장코드", colName="REQN_PLANT_CD", colSize="7", isKey=false)
	private String reqn_plant_cd;
	  
	@SerializedName("REQN_ISSUE_NM")
	@DzModelField(name="reqn_issue_nm", desc="시정조치등록발행유형명", colName="REQN_ISSUE_NM", colSize="100", isKey=false)
	private String reqn_issue_nm;
	  
	@SerializedName("REQN_FG_NM")
	@DzModelField(name="reqn_fg_nm", desc="시정조치등록구분명", colName="REQN_FG_NM", colSize="100", isKey=false)
	private String reqn_fg_nm;
	  
	@SerializedName("REQN_PLANT_NM")
	@DzModelField(name="reqn_plant_nm", desc="시정조치등록사업장명", colName="REQN_PLANT_NM", colSize="50", isKey=false)
	private String reqn_plant_nm;
	  
	@SerializedName("REQN_ISSUE_EMP_NM")
	@DzModelField(name="reqn_issue_emp_nm", desc="시정조치등록발행자명", colName="REQN_ISSUE_EMP_NM", colSize="50", isKey=false)
	private String reqn_issue_emp_nm;
	  
	@SerializedName("REQN_ISSUE_DEPT_CD")
	@DzModelField(name="reqn_issue_dept_cd", desc="시정조치등록발행자부서코드", colName="REQN_ISSUE_DEPT_CD", colSize="20", isKey=false)
	private String reqn_issue_dept_cd;
	  
	@SerializedName("REQN_ISSUE_DEPT_NM")
	@DzModelField(name="reqn_issue_dept_nm", desc="시정조치등록발행자부서명", colName="REQN_ISSUE_DEPT_NM", colSize="50", isKey=false)
	private String reqn_issue_dept_nm;
	  
	@SerializedName("REQN_ISSUE_EMP_PSTN_CD")
	@DzModelField(name="reqn_issue_emp_pstn_cd", desc="시정조치등록발행자직급코드", colName="REQN_ISSUE_EMP_PSTN_CD", colSize="5", isKey=false)
	private String reqn_issue_emp_pstn_cd;
	  
	@SerializedName("REQN_FILE_DC")
	@DzModelField(name="reqn_file_dc", desc="시정조치등록파일내역", colName="REQN_FILE_DC", colSize="200", isKey=false)
	private String reqn_file_dc;
	  
	@SerializedName("REQN_IMG_FILE_DC")
	@DzModelField(name="reqn_img_file_dc", desc="시정조치등록이미지파일내역", colName="REQN_IMG_FILE_DC", colSize="200", isKey=false)
	private String reqn_img_file_dc;
	
	@SerializedName("REVIEW_RST_FG")
	@DzModelField(name="review_rst_fg", desc="검토결과구분", colName="REVIEW_RST_FG", colSize="3", isKey=false)
	private String review_rst_fg;
	
	@SerializedName("REVIEW_RST_FG_NM")
	@DzModelField(name="review_rst_fg_nm", desc="검토결과구분명", colName="REVIEW_RST_FG_NM", colSize="100", isKey=false)
	private String review_rst_fg_nm;
	
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
 
	public BigDecimal getTrmt_tm_cnt() {
		return trmt_tm_cnt;
	}

	public void setTrmt_tm_cnt(BigDecimal trmt_tm_cnt) {
		this.trmt_tm_cnt = trmt_tm_cnt;
	}
 
	public BigDecimal getWrt_tm_cnt() {
		return wrt_tm_cnt;
	}

	public void setWrt_tm_cnt(BigDecimal wrt_tm_cnt) {
		this.wrt_tm_cnt = wrt_tm_cnt;
	}
 
	public String getIssue_emp_no() {
		return issue_emp_no;
	}

	public void setIssue_emp_no(String issue_emp_no) {
		this.issue_emp_no = issue_emp_no;
	}
 
	public String getIssue_dt() {
		return issue_dt;
	}

	public void setIssue_dt(String issue_dt) {
		this.issue_dt = issue_dt;
	}
 
	public BigDecimal getSurchrg_amt() {
		return surchrg_amt;
	}

	public void setSurchrg_amt(BigDecimal surchrg_amt) {
		this.surchrg_amt = surchrg_amt;
	}
 
	public String getCus_anal_txt() {
		return cus_anal_txt;
	}

	public void setCus_anal_txt(String cus_anal_txt) {
		this.cus_anal_txt = cus_anal_txt;
	}
 
	public String getTrmt_cntn_txt() {
		return trmt_cntn_txt;
	}

	public void setTrmt_cntn_txt(String trmt_cntn_txt) {
		this.trmt_cntn_txt = trmt_cntn_txt;
	}
 
	public String getPrvn_trmt_n_ctmsr_txt() {
		return prvn_trmt_n_ctmsr_txt;
	}

	public void setPrvn_trmt_n_ctmsr_txt(String prvn_trmt_n_ctmsr_txt) {
		this.prvn_trmt_n_ctmsr_txt = prvn_trmt_n_ctmsr_txt;
	}
 
	public String getFg_cd() {
		return fg_cd;
	}

	public void setFg_cd(String fg_cd) {
		this.fg_cd = fg_cd;
	}
 
	public String getAtchfile_id() {
		return atchfile_id;
	}

	public void setAtchfile_id(String atchfile_id) {
		this.atchfile_id = atchfile_id;
	}
 
	public String getImg_path_dc() {
		return img_path_dc;
	}

	public void setImg_path_dc(String img_path_dc) {
		this.img_path_dc = img_path_dc;
	}
 
	public String getInsert_id() {
		return insert_id;
	}

	public void setInsert_id(String insert_id) {
		this.insert_id = insert_id;
	}
 
	public String getInsert_dts() {
		return insert_dts;
	}

	public void setInsert_dts(String insert_dts) {
		this.insert_dts = insert_dts;
	}
 
	public String getUpdate_id() {
		return update_id;
	}

	public void setUpdate_id(String update_id) {
		this.update_id = update_id;
	}
 
	public String getUpdate_dts() {
		return update_dts;
	}

	public void setUpdate_dts(String update_dts) {
		this.update_dts = update_dts;
	}
 
	public String getRst_goal_dt() {
		return rst_goal_dt;
	}

	public void setRst_goal_dt(String rst_goal_dt) {
		this.rst_goal_dt = rst_goal_dt;
	}
 
	public String getFile_dc() {
		return file_dc;
	}

	public void setFile_dc(String file_dc) {
		this.file_dc = file_dc;
	}
 
	public String getImg_file_dc() {
		return img_file_dc;
	}

	public void setImg_file_dc(String img_file_dc) {
		this.img_file_dc = img_file_dc;
	}
 
	public String getIssue_dept_cd() {
		return issue_dept_cd;
	}

	public void setIssue_dept_cd(String issue_dept_cd) {
		this.issue_dept_cd = issue_dept_cd;
	}
 
	public String getIssue_dept_nm() {
		return issue_dept_nm;
	}

	public void setIssue_dept_nm(String issue_dept_nm) {
		this.issue_dept_nm = issue_dept_nm;
	}
 
	public String getIssue_emp_nm() {
		return issue_emp_nm;
	}

	public void setIssue_emp_nm(String issue_emp_nm) {
		this.issue_emp_nm = issue_emp_nm;
	}
 
	public String getReqn_crct_trmt_no() {
		return reqn_crct_trmt_no;
	}

	public void setReqn_crct_trmt_no(String reqn_crct_trmt_no) {
		this.reqn_crct_trmt_no = reqn_crct_trmt_no;
	}
 
	public String getReqn_sq_no() {
		return reqn_sq_no;
	}

	public void setReqn_sq_no(String reqn_sq_no) {
		this.reqn_sq_no = reqn_sq_no;
	}
 
	public String getReqn_crct_trmt_nm() {
		return reqn_crct_trmt_nm;
	}

	public void setReqn_crct_trmt_nm(String reqn_crct_trmt_nm) {
		this.reqn_crct_trmt_nm = reqn_crct_trmt_nm;
	}
 
	public String getReqn_crct_trmt_reqn_dt() {
		return reqn_crct_trmt_reqn_dt;
	}

	public void setReqn_crct_trmt_reqn_dt(String reqn_crct_trmt_reqn_dt) {
		this.reqn_crct_trmt_reqn_dt = reqn_crct_trmt_reqn_dt;
	}
 
	public String getReqn_trmt_trgt_cd() {
		return reqn_trmt_trgt_cd;
	}

	public void setReqn_trmt_trgt_cd(String reqn_trmt_trgt_cd) {
		this.reqn_trmt_trgt_cd = reqn_trmt_trgt_cd;
	}
 
	public String getReqn_trmt_trgt_nm() {
		return reqn_trmt_trgt_nm;
	}

	public void setReqn_trmt_trgt_nm(String reqn_trmt_trgt_nm) {
		this.reqn_trmt_trgt_nm = reqn_trmt_trgt_nm;
	}
 
	public String getReqn_issue_emp_no() {
		return reqn_issue_emp_no;
	}

	public void setReqn_issue_emp_no(String reqn_issue_emp_no) {
		this.reqn_issue_emp_no = reqn_issue_emp_no;
	}
 
	public String getReqn_trmt_goal_dt() {
		return reqn_trmt_goal_dt;
	}

	public void setReqn_trmt_goal_dt(String reqn_trmt_goal_dt) {
		this.reqn_trmt_goal_dt = reqn_trmt_goal_dt;
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
 
	public String getReqn_issue_nm() {
		return reqn_issue_nm;
	}

	public void setReqn_issue_nm(String reqn_issue_nm) {
		this.reqn_issue_nm = reqn_issue_nm;
	}
 
	public String getReqn_fg_nm() {
		return reqn_fg_nm;
	}

	public void setReqn_fg_nm(String reqn_fg_nm) {
		this.reqn_fg_nm = reqn_fg_nm;
	}
 
	public String getReqn_plant_nm() {
		return reqn_plant_nm;
	}

	public void setReqn_plant_nm(String reqn_plant_nm) {
		this.reqn_plant_nm = reqn_plant_nm;
	}
 
	public String getReqn_issue_emp_nm() {
		return reqn_issue_emp_nm;
	}

	public void setReqn_issue_emp_nm(String reqn_issue_emp_nm) {
		this.reqn_issue_emp_nm = reqn_issue_emp_nm;
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

	public String getReqn_issue_tp() {
		return reqn_issue_tp;
	}

	public void setReqn_issue_tp(String reqn_issue_tp) {
		this.reqn_issue_tp = reqn_issue_tp;
	}

	public String getReqn_fg_cd() {
		return reqn_fg_cd;
	}

	public void setReqn_fg_cd(String reqn_fg_cd) {
		this.reqn_fg_cd = reqn_fg_cd;
	}

	public String getReqn_plant_cd() {
		return reqn_plant_cd;
	}

	public void setReqn_plant_cd(String reqn_plant_cd) {
		this.reqn_plant_cd = reqn_plant_cd;
	}

	public String getReview_rst_fg() {
		return review_rst_fg;
	}

	public void setReview_rst_fg(String review_rst_fg) {
		this.review_rst_fg = review_rst_fg;
	}

	public String getReview_rst_fg_nm() {
		return review_rst_fg_nm;
	}

	public void setReview_rst_fg_nm(String review_rst_fg_nm) {
		this.review_rst_fg_nm = review_rst_fg_nm;
	}

	public String get_uid() {
		return _uid;
	}

	public void set_uid(String _uid) {
		this._uid = _uid;
	}
}
