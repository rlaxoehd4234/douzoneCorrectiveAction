package com.douzone.comet.service.eh.abc.models;
 
import java.math.BigDecimal;

import com.douzone.gpd.jdbc.mybatis.model.DzAbstractModel;
import com.douzone.gpd.restful.annotation.DzModel;
import com.douzone.gpd.restful.annotation.DzModelField;
import com.google.gson.annotations.SerializedName;
 
@DzModel(name = "Abc00100Model", desc = "시정조치요구등록", tableName = "")
public class Abc00100Model extends DzAbstractModel {

	@SerializedName("COMPANY_CD")
	@DzModelField(name="company_cd", desc="회사코드", colName="COMPANY_CD", colSize="7", isKey=false)
	private String company_cd;
	  
	@SerializedName("CRCT_TRMT_NO")
	@DzModelField(name="crct_trmt_no", desc="시정조치번호", colName="CRCT_TRMT_NO", colSize="20", isKey=false)
	private String crct_trmt_no;
	  
	@SerializedName("SQ_NO")
	@DzModelField(name="sq_no", desc="순번번호", colName="SQ_NO", colSize="20", isKey=false)
	private String sq_no;
	  
	@SerializedName("CRCT_TRMT_TP")
	@DzModelField(name="crct_trmt_tp", desc="시정조치유형", colName="CRCT_TRMT_TP", colSize="3", isKey=false)
	private String crct_trmt_tp;
	  
	@SerializedName("ISSUE_FG")
	@DzModelField(name="issue_fg", desc="발행구분", colName="ISSUE_FG", colSize="3", isKey=false)
	private String issue_fg;
	  
	@SerializedName("PLANT_CD")
	@DzModelField(name="plant_cd", desc="공장코드", colName="PLANT_CD", colSize="7", isKey=false)
	private String plant_cd;
	  
	@SerializedName("CRCT_TRMT_REQN_DT")
	@DzModelField(name="crct_trmt_reqn_dt", desc="시정조치요청일", colName="CRCT_TRMT_REQN_DT", colSize="50", isKey=false)
	private String crct_trmt_reqn_dt;
	  
	@SerializedName("ACTION_PLAN_NO")
	@DzModelField(name="action_plan_no", desc="실행계획번호", colName="ACTION_PLAN_NO", colSize="10", isKey=false)
	private String action_plan_no;
	  
	@SerializedName("ISSUE_CD")
	@DzModelField(name="issue_cd", desc="발행코드", colName="ISSUE_CD", colSize="20", isKey=false)
	private String issue_cd;
	  
	@SerializedName("ISSUE_TP")
	@DzModelField(name="issue_tp", desc="발행유형", colName="ISSUE_TP", colSize="5", isKey=false)
	private String issue_tp;
	  
	@SerializedName("REL_STD_CD")
	@DzModelField(name="rel_std_cd", desc="관련기준코드", colName="REL_STD_CD", colSize="7", isKey=false)
	private String rel_std_cd;
	  
	@SerializedName("NOTI_NO")
	@DzModelField(name="noti_no", desc="통지번호", colName="NOTI_NO", colSize="40", isKey=false)
	private String noti_no;
	  
	@SerializedName("ACTV_FG")
	@DzModelField(name="actv_fg", desc="활동구분", colName="ACTV_FG", colSize="3", isKey=false)
	private String actv_fg;
	  
	@SerializedName("OCRN_CUS_CD")
	@DzModelField(name="ocrn_cus_cd", desc="발생원인코드", colName="OCRN_CUS_CD", colSize="5", isKey=false)
	private String ocrn_cus_cd;
	  
	@SerializedName("CRCT_TRMT_NM")
	@DzModelField(name="crct_trmt_nm", desc="시정조치명", colName="CRCT_TRMT_NM", colSize="100", isKey=false)
	private String crct_trmt_nm;
	  
	@SerializedName("TRMT_GOAL_DT")
	@DzModelField(name="trmt_goal_dt", desc="조치목표일", colName="TRMT_GOAL_DT", colSize="50", isKey=false)
	private String trmt_goal_dt;
	  
	@SerializedName("USE_TM_CNT")
	@DzModelField(name="use_tm_cnt", desc="사용시간수", colName="USE_TM_CNT", colSize="7", isKey=false)
	private BigDecimal use_tm_cnt;
	  
	@SerializedName("TRMT_TRGT_CD")
	@DzModelField(name="trmt_trgt_cd", desc="조치대상코드", colName="TRMT_TRGT_CD", colSize="10", isKey=false)
	private String trmt_trgt_cd;
	  
	@SerializedName("REL_DEPT_CD")
	@DzModelField(name="rel_dept_cd", desc="관련부서코드", colName="REL_DEPT_CD", colSize="32", isKey=false)
	private String rel_dept_cd;
	  
	@SerializedName("ISSUE_EMP_NO")
	@DzModelField(name="issue_emp_no", desc="발행사원번호", colName="ISSUE_EMP_NO", colSize="20", isKey=false)
	private String issue_emp_no;
	  
	@SerializedName("REL_BSS_TXT")
	@DzModelField(name="rel_bss_txt", desc="관련근거텍스트", colName="REL_BSS_TXT", colSize="", isKey=false)
	private String rel_bss_txt;
	  
	@SerializedName("PTG_MATTER_TXT")
	@DzModelField(name="ptg_matter_txt", desc="지적사항텍스트", colName="PTG_MATTER_TXT", colSize="", isKey=false)
	private String ptg_matter_txt;
	  
	@SerializedName("CRCT_TRMT_TXT")
	@DzModelField(name="crct_trmt_txt", desc="시정조치텍스트", colName="CRCT_TRMT_TXT", colSize="", isKey=false)
	private String crct_trmt_txt;
	  
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
	  
	@SerializedName("ISSUE_NM")
	@DzModelField(name="issue_nm", desc="시정조치유형명", colName="ISSUE_NM", colSize="100", isKey=false)
	private String issue_nm;
	  
	@SerializedName("FG_NM")
	@DzModelField(name="fg_nm", desc="구분명", colName="FG_NM", colSize="100", isKey=false)
	private String fg_nm;
	  
	@SerializedName("PLANT_NM")
	@DzModelField(name="plant_nm", desc="공장명", colName="PLANT_NM", colSize="50", isKey=false)
	private String plant_nm;
	  
	@SerializedName("TRMT_TRGT_NM")
	@DzModelField(name="trmt_trgt_nm", desc="조치부서명", colName="TRMT_TRGT_NM", colSize="50", isKey=false)
	private String trmt_trgt_nm;
	  
	@SerializedName("ISSUE_EMP_NM")
	@DzModelField(name="issue_emp_nm", desc="발행사원명", colName="ISSUE_EMP_NM", colSize="50", isKey=false)
	private String issue_emp_nm;
	  
	@SerializedName("ISSUE_DEPT_NM")
	@DzModelField(name="issue_dept_nm", desc="발행부서명", colName="ISSUE_DEPT_NM", colSize="20", isKey=false)
	private String issue_dept_nm;
	  
	@SerializedName("PSTN_CD")
	@DzModelField(name="pstn_cd", desc="발행자직급", colName="PSTN_CD", colSize="5", isKey=false)
	private String pstn_cd;
	
	@SerializedName("FILE_DC")
	@DzModelField(name="file_dc", desc="파일내역", colName="FILE_DC", colSize="200", isKey=false)
	private String file_dc;
	  
	@SerializedName("FILE_SQ")
	@DzModelField(name="file_sq", desc="파일순번", colName="FILE_SQ", colSize="5", isKey=false)
	private BigDecimal file_sq;
	  
	@SerializedName("ORGL_FILE_DC")
	@DzModelField(name="orgl_file_dc", desc="원본파일내역", colName="ORGL_FILE_DC", colSize="200", isKey=false)
	private String orgl_file_dc;
	  
	@SerializedName("ORGL_FEXTSN_DC")
	@DzModelField(name="orgl_fextsn_dc", desc="원본파일확장자내역", colName="ORGL_FEXTSN_DC", colSize="200", isKey=false)
	private String orgl_fextsn_dc;
	  
	@SerializedName("NEW_FILE_DC")
	@DzModelField(name="new_file_dc", desc="신규파일내역", colName="NEW_FILE_DC", colSize="200", isKey=false)
	private String new_file_dc;
	  
	@SerializedName("FILE_VR")
	@DzModelField(name="file_vr", desc="파일문자값", colName="FILE_VR", colSize="20", isKey=false)
	private String file_vr;
	  
	@SerializedName("FILE_IMG_DC")
	@DzModelField(name="file_img_dc", desc="이미지내역", colName="FILE_IMG_DC", colSize="200", isKey=false)
	private String file_img_dc;
	  
	@SerializedName("FILE_IMG_SQ")
	@DzModelField(name="file_img_sq", desc="이미지순번", colName="FILE_IMG_SQ", colSize="5", isKey=false)
	private BigDecimal file_img_sq;
	  
	@SerializedName("FILE_IMG_ORGL_FILE_DC")
	@DzModelField(name="file_img_orgl_file_dc", desc="이미지원본파일내역", colName="FILE_IMG_ORGL_FILE_DC", colSize="200", isKey=false)
	private String file_img_orgl_file_dc;
	  
	@SerializedName("FILE_IMG_ORGL_FEXTSN_DC")
	@DzModelField(name="file_img_orgl_fextsn_dc", desc="이미지원본파일확장자내역", colName="FILE_IMG_ORGL_FEXTSN_DC", colSize="200", isKey=false)
	private String file_img_orgl_fextsn_dc;
	  
	@SerializedName("FILE_IMG_NEW_FILE_DC")
	@DzModelField(name="file_img_new_file_dc", desc="이미지신규파일내역", colName="FILE_IMG_NEW_FILE_DC", colSize="200", isKey=false)
	private String file_img_new_file_dc;
	  
	@SerializedName("FILE_IMG_FILE_VR")
	@DzModelField(name="file_img_file_vr", desc="이미지파일문자값", colName="FILE_IMG_FILE_VR", colSize="20", isKey=false)
	private String file_img_file_vr;
	
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
 
	public String getCrct_trmt_tp() {
		return crct_trmt_tp;
	}

	public void setCrct_trmt_tp(String crct_trmt_tp) {
		this.crct_trmt_tp = crct_trmt_tp;
	}
 
	public String getIssue_fg() {
		return issue_fg;
	}

	public void setIssue_fg(String issue_fg) {
		this.issue_fg = issue_fg;
	}
 
	public String getPlant_cd() {
		return plant_cd;
	}

	public void setPlant_cd(String plant_cd) {
		this.plant_cd = plant_cd;
	}
 
	public String getCrct_trmt_reqn_dt() {
		return crct_trmt_reqn_dt;
	}

	public void setCrct_trmt_reqn_dt(String crct_trmt_reqn_dt) {
		this.crct_trmt_reqn_dt = crct_trmt_reqn_dt;
	}
 
	public String getAction_plan_no() {
		return action_plan_no;
	}

	public void setAction_plan_no(String action_plan_no) {
		this.action_plan_no = action_plan_no;
	}
 
	public String getIssue_cd() {
		return issue_cd;
	}

	public void setIssue_cd(String issue_cd) {
		this.issue_cd = issue_cd;
	}
 
	public String getIssue_tp() {
		return issue_tp;
	}

	public void setIssue_tp(String issue_tp) {
		this.issue_tp = issue_tp;
	}
 
	public String getRel_std_cd() {
		return rel_std_cd;
	}

	public void setRel_std_cd(String rel_std_cd) {
		this.rel_std_cd = rel_std_cd;
	}
 
	public String getNoti_no() {
		return noti_no;
	}

	public void setNoti_no(String noti_no) {
		this.noti_no = noti_no;
	}
 
	public String getActv_fg() {
		return actv_fg;
	}

	public void setActv_fg(String actv_fg) {
		this.actv_fg = actv_fg;
	}
 
	public String getOcrn_cus_cd() {
		return ocrn_cus_cd;
	}

	public void setOcrn_cus_cd(String ocrn_cus_cd) {
		this.ocrn_cus_cd = ocrn_cus_cd;
	}
 
	public String getCrct_trmt_nm() {
		return crct_trmt_nm;
	}

	public void setCrct_trmt_nm(String crct_trmt_nm) {
		this.crct_trmt_nm = crct_trmt_nm;
	}
 
	public String getTrmt_goal_dt() {
		return trmt_goal_dt;
	}

	public void setTrmt_goal_dt(String trmt_goal_dt) {
		this.trmt_goal_dt = trmt_goal_dt;
	}
 
	public BigDecimal getUse_tm_cnt() {
		return use_tm_cnt;
	}

	public void setUse_tm_cnt(BigDecimal use_tm_cnt) {
		this.use_tm_cnt = use_tm_cnt;
	}
 
	public String getTrmt_trgt_cd() {
		return trmt_trgt_cd;
	}

	public void setTrmt_trgt_cd(String trmt_trgt_cd) {
		this.trmt_trgt_cd = trmt_trgt_cd;
	}
 
	public String getRel_dept_cd() {
		return rel_dept_cd;
	}

	public void setRel_dept_cd(String rel_dept_cd) {
		this.rel_dept_cd = rel_dept_cd;
	}
 
	public String getIssue_emp_no() {
		return issue_emp_no;
	}

	public void setIssue_emp_no(String issue_emp_no) {
		this.issue_emp_no = issue_emp_no;
	}
 
	public String getRel_bss_txt() {
		return rel_bss_txt;
	}

	public void setRel_bss_txt(String rel_bss_txt) {
		this.rel_bss_txt = rel_bss_txt;
	}
 
	public String getPtg_matter_txt() {
		return ptg_matter_txt;
	}

	public void setPtg_matter_txt(String ptg_matter_txt) {
		this.ptg_matter_txt = ptg_matter_txt;
	}
 
	public String getCrct_trmt_txt() {
		return crct_trmt_txt;
	}

	public void setCrct_trmt_txt(String crct_trmt_txt) {
		this.crct_trmt_txt = crct_trmt_txt;
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
 
	public String getIssue_nm() {
		return issue_nm;
	}

	public void setIssue_nm(String issue_nm) {
		this.issue_nm = issue_nm;
	}
 
	public String getFg_nm() {
		return fg_nm;
	}

	public void setFg_nm(String fg_nm) {
		this.fg_nm = fg_nm;
	}
 
	public String getPlant_nm() {
		return plant_nm;
	}

	public void setPlant_nm(String plant_nm) {
		this.plant_nm = plant_nm;
	}
 
	public String getTrmt_trgt_nm() {
		return trmt_trgt_nm;
	}

	public void setTrmt_trgt_nm(String trmt_trgt_nm) {
		this.trmt_trgt_nm = trmt_trgt_nm;
	}
 
	public String getIssue_emp_nm() {
		return issue_emp_nm;
	}

	public void setIssue_emp_nm(String issue_emp_nm) {
		this.issue_emp_nm = issue_emp_nm;
	}
 
	public String getIssue_dept_nm() {
		return issue_dept_nm;
	}

	public void setIssue_dept_nm(String issue_dept_nm) {
		this.issue_dept_nm = issue_dept_nm;
	}
 
	public String getFile_dc() {
		return file_dc;
	}

	public void setFile_dc(String file_dc) {
		this.file_dc = file_dc;
	}
 
	public BigDecimal getFile_sq() {
		return file_sq;
	}

	public void setFile_sq(BigDecimal file_sq) {
		this.file_sq = file_sq;
	}
 
	public String getOrgl_file_dc() {
		return orgl_file_dc;
	}

	public void setOrgl_file_dc(String orgl_file_dc) {
		this.orgl_file_dc = orgl_file_dc;
	}
 
	public String getOrgl_fextsn_dc() {
		return orgl_fextsn_dc;
	}

	public void setOrgl_fextsn_dc(String orgl_fextsn_dc) {
		this.orgl_fextsn_dc = orgl_fextsn_dc;
	}
 
	public String getNew_file_dc() {
		return new_file_dc;
	}

	public void setNew_file_dc(String new_file_dc) {
		this.new_file_dc = new_file_dc;
	}
 
	public String getFile_vr() {
		return file_vr;
	}

	public void setFile_vr(String file_vr) {
		this.file_vr = file_vr;
	}
 
	public String getFile_img_dc() {
		return file_img_dc;
	}

	public void setFile_img_dc(String file_img_dc) {
		this.file_img_dc = file_img_dc;
	}
 
	public BigDecimal getFile_img_sq() {
		return file_img_sq;
	}

	public void setFile_img_sq(BigDecimal file_img_sq) {
		this.file_img_sq = file_img_sq;
	}
 
	public String getFile_img_orgl_file_dc() {
		return file_img_orgl_file_dc;
	}

	public void setFile_img_orgl_file_dc(String file_img_orgl_file_dc) {
		this.file_img_orgl_file_dc = file_img_orgl_file_dc;
	}
 
	public String getFile_img_orgl_fextsn_dc() {
		return file_img_orgl_fextsn_dc;
	}

	public void setFile_img_orgl_fextsn_dc(String file_img_orgl_fextsn_dc) {
		this.file_img_orgl_fextsn_dc = file_img_orgl_fextsn_dc;
	}
 
	public String getFile_img_new_file_dc() {
		return file_img_new_file_dc;
	}

	public void setFile_img_new_file_dc(String file_img_new_file_dc) {
		this.file_img_new_file_dc = file_img_new_file_dc;
	}
 
	public String getFile_img_file_vr() {
		return file_img_file_vr;
	}

	public void setFile_img_file_vr(String file_img_file_vr) {
		this.file_img_file_vr = file_img_file_vr;
	}
	
	public String get_uid() {
		return _uid;
	}

	public void set_uid(String _uid) {
		this._uid = _uid;
	}
}
