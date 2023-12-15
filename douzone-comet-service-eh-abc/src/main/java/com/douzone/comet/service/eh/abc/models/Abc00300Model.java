package com.douzone.comet.service.eh.abc.models;
 
import java.math.BigDecimal;

import com.douzone.gpd.jdbc.mybatis.model.DzAbstractModel;
import com.douzone.gpd.restful.annotation.DzModel;
import com.douzone.gpd.restful.annotation.DzModelField;
import com.google.gson.annotations.SerializedName;
 
@DzModel(name = "Abc00300Model", desc = "시정조치요구검토", tableName = "")
public class Abc00300Model extends DzAbstractModel {
	
	@SerializedName("COMPANY_CD")
	@DzModelField(name="company_cd", desc="회사코드", colName="COMPANY_CD", colSize="7", isKey=false)
	private String company_cd;
	
	@SerializedName("REL_BSS_TXT")
	@DzModelField(name="rel_bss_txt", desc="관련근거텍스트", colName="REL_BSS_TXT", colSize="", isKey=false)
	private String rel_bss_txt;
	
	@SerializedName("MNG_DTL_NM")
	@DzModelField(name="mng_dtl_nm", desc="시정조치유형", colName="MNG_DTL_NM", colSize="100", isKey=false)
	private String mng_dtl_nm;
	  
	@SerializedName("MNG_DTL_NM2")
	@DzModelField(name="mng_dtl_nm2", desc="시정조치구분", colName="MNG_DTL_NM2", colSize="100", isKey=false)
	private String mng_dtl_nm2;
	
	@SerializedName("ISSUE_EMP_NO")
	@DzModelField(name="issue_emp_no", desc="발행사원번호", colName="ISSUE_EMP_NO", colSize="20", isKey=false)
	private String issue_emp_no;
	  
	@SerializedName("ISSUE_EMP_NO3")
	@DzModelField(name="issue_emp_no3", desc="검토자코드", colName="ISSUE_EMP_NO3", colSize="20", isKey=false)
	private String issue_emp_no3;
	  
	@SerializedName("TRMT_GOAL_DT")
	@DzModelField(name="trmt_goal_dt", desc="조치목표일", colName="TRMT_GOAL_DT", colSize="50", isKey=false)
	private String trmt_goal_dt;
	  
	@SerializedName("ISSUE_DT2")
	@DzModelField(name="issue_dt2", desc="조치일자", colName="ISSUE_DT2", colSize="8", isKey=false)
	private String issue_dt2;
	  
	@SerializedName("ISSUE_DT3")
	@DzModelField(name="issue_dt3", desc="검토일", colName="ISSUE_DT3", colSize="8", isKey=false)
	private String issue_dt3;
	  
	@SerializedName("DEPT_NM")
	@DzModelField(name="dept_nm", desc="부서명", colName="DEPT_NM", colSize="50", isKey=false)
	private String dept_nm;
	  
	@SerializedName("CRCT_TRMT_NO")
	@DzModelField(name="crct_trmt_no", desc="시정조치번호", colName="CRCT_TRMT_NO", colSize="20", isKey=false)
	private String crct_trmt_no;
	  
	@SerializedName("CRCT_TRMT_NO2")
	@DzModelField(name="crct_trmt_no2", desc="시정조치번호2", colName="CRCT_TRMT_NO2", colSize="20", isKey=false)
	private String crct_trmt_no2;
	  
	@SerializedName("SQ_NO")
	@DzModelField(name="sq_no", desc="순번번호", colName="SQ_NO", colSize="20", isKey=false)
	private String sq_no;
	  
	@SerializedName("PLANT_CD")
	@DzModelField(name="plant_cd", desc="공장코드", colName="PLANT_CD", colSize="7", isKey=false)
	private String plant_cd;
	
	@SerializedName("PLANT_NM")
	@DzModelField(name="plant_nm", desc="공장코드", colName="PLANT_NM", colSize="50", isKey=false)
	private String plant_nm;
	  
	@SerializedName("CRCT_TRMT_NM")
	@DzModelField(name="crct_trmt_nm", desc="시정조치명", colName="CRCT_TRMT_NM", colSize="100", isKey=false)
	private String crct_trmt_nm;
	  
	@SerializedName("KOR_NM")
	@DzModelField(name="kor_nm", desc="발행자", colName="KOR_NM", colSize="50", isKey=false)
	private String kor_nm;
	  
	@SerializedName("KOR_NM2")
	@DzModelField(name="kor_nm2", desc="시행자", colName="KOR_NM2", colSize="50", isKey=false)
	private String kor_nm2;
	  
	@SerializedName("KOR_NM3")
	@DzModelField(name="kor_nm3", desc="검토자", colName="KOR_NM3", colSize="50", isKey=false)
	private String kor_nm3;
	  
	@SerializedName("CRCT_TRMT_REQN_DT")
	@DzModelField(name="crct_trmt_reqn_dt", desc="시정조치요청일", colName="CRCT_TRMT_REQN_DT", colSize="50", isKey=false)
	private String crct_trmt_reqn_dt;
	  
	@SerializedName("TRMT_TRGT_CD")
	@DzModelField(name="trmt_trgt_cd", desc="조치부서업체", colName="TRMT_TRGT_CD", colSize="10", isKey=false)
	private String trmt_trgt_cd;
	  
	@SerializedName("PTG_MATTER_TXT")
	@DzModelField(name="ptg_matter_txt", desc="지적사항텍스트", colName="PTG_MATTER_TXT", colSize="", isKey=false)
	private String ptg_matter_txt;
	  
	@SerializedName("CRCT_TRMT_TXT")
	@DzModelField(name="crct_trmt_txt", desc="시정조치요구사항", colName="CRCT_TRMT_TXT", colSize="", isKey=false)
	private String crct_trmt_txt;
	  
	@SerializedName("PSTN_CD")
	@DzModelField(name="pstn_cd", desc="부서직급코드", colName="PSTN_CD", colSize="5", isKey=false)
	private String pstn_cd;
	  
	@SerializedName("PSTN_CD3")
	@DzModelField(name="pstn_cd3", desc="검토자직급", colName="PSTN_CD3", colSize="5", isKey=false)
	private String pstn_cd3;
	  
	@SerializedName("ATCHFILE_ID")
	@DzModelField(name="atchfile_id", desc="첨부파일", colName="ATCHFILE_ID", colSize="320", isKey=false)
	private String atchfile_id;
	  
	@SerializedName("IMG_PATH_DC")
	@DzModelField(name="img_path_dc", desc="첨부이미지", colName="IMG_PATH_DC", colSize="200", isKey=false)
	private String img_path_dc;
	  
	@SerializedName("REVIEW_OPN_TXT")
	@DzModelField(name="review_opn_txt", desc="검토의견", colName="REVIEW_OPN_TXT", colSize="", isKey=false)
	private String review_opn_txt;
	  
	@SerializedName("REVIEW_RST_FG")
	@DzModelField(name="review_rst_fg", desc="검토결과", colName="REVIEW_RST_FG", colSize="3", isKey=false)
	private String review_rst_fg;
	
	@SerializedName("RE_CRCT_TRMT_TXT")
	@DzModelField(name="re_crct_trmt_txt", desc="재시정조치텍스트", colName="RE_CRCT_TRMT_TXT", colSize="500", isKey=false)
	private String re_crct_trmt_txt;
	
	@SerializedName("RE_CRCT_TRMT_REQN_DT")
	@DzModelField(name="re_crct_trmt_reqn_dt", desc="재시정조치요청일", colName="RE_CRCT_TRMT_REQN_DT", colSize="8", isKey=false)
	private String re_crct_trmt_reqn_dt;

   @SerializedName("DEPT_NM3")
   @DzModelField(name="dept_nm2", desc="검토부서", colName="DEPT_NM2", colSize="50", isKey=false)
   private String dept_nm3;

   @SerializedName("DEPT_NM2")
   @DzModelField(name="dept_nm2", desc="조치부서", colName="DEPT_NM2", colSize="50", isKey=false)
   private String dept_nm2;
   
   @SerializedName("CUS_ANAL_TXT")
   @DzModelField(name="cus_anal_txt", desc="원인분석텍스트", colName="CUS_ANAL_TXT", colSize="", isKey=false)
   private String cus_anal_txt;
   
   @SerializedName("TRMT_CNTN_TXT")
   @DzModelField(name="trmt_cntn_txt", desc="조치내용텍스트", colName="TRMT_CNTN_TXT", colSize="", isKey=false)
   private String trmt_cntn_txt;
   
   @SerializedName("PRVN_TRMT_N_CTMSR_TXT")
   @DzModelField(name="prvn_trmt_n_ctmsr_txt", desc="방지조치및대책텍스트", colName="PRVN_TRMT_N_CTMSR_TXT", colSize="", isKey=false)
   private String prvn_trmt_n_ctmsr_txt;
   
   @SerializedName("SURCHRG_AMT")
   @DzModelField(name="surchrg_amt", desc="추가비용금액", colName="SURCHRG_AMT", colSize="27", isKey=false)
   private BigDecimal surchrg_amt;
   
    @SerializedName("FILE_DC1")
	@DzModelField(name="file_dc1", desc="파일내역", colName="FILE_DC1", colSize="200", isKey=false)
	private String file_dc1;
	  
	@SerializedName("FILE_IMG_DC1")
	@DzModelField(name="file_img_dc1", desc="이미지내역", colName="FILE_IMG_DC1", colSize="200", isKey=false)
	private String file_img_dc1;
	  
	@SerializedName("FILE_IMG_SQ1")
	@DzModelField(name="file_img_sq1", desc="이미지순번", colName="FILE_IMG_SQ1", colSize="5", isKey=false)
	private BigDecimal file_img_sq1;
	  
	@SerializedName("FILE_IMG_ORGL_FILE_DC1")
	@DzModelField(name="file_img_orgl_file_dc1", desc="이미지원본파일내역", colName="FILE_IMG_ORGL_FILE_DC1", colSize="200", isKey=false)
	private String file_img_orgl_file_dc1;
	  
	@SerializedName("FILE_IMG_ORGL_FEXTSN_DC1")
	@DzModelField(name="file_img_orgl_fextsn_dc1", desc="이미지원본파일확장자내역", colName="FILE_IMG_ORGL_FEXTSN_DC1", colSize="200", isKey=false)
	private String file_img_orgl_fextsn_dc1;
	  
	@SerializedName("FILE_IMG_NEW_FILE_DC1")
	@DzModelField(name="file_img_new_file_dc1", desc="이미지신규파일내역", colName="FILE_IMG_NEW_FILE_DC1", colSize="200", isKey=false)
	private String file_img_new_file_dc1;
	  
	@SerializedName("FILE_IMG_FILE_VR1")
	@DzModelField(name="file_img_file_vr1", desc="이미지파일문자값", colName="FILE_IMG_FILE_VR1", colSize="20", isKey=false)
	private String file_img_file_vr1;
	
    @SerializedName("FILE_DC2")
	@DzModelField(name="file_dc2", desc="파일내역", colName="FILE_DC2", colSize="200", isKey=false)
	private String file_dc2;
	  
	@SerializedName("FILE_IMG_DC2")
	@DzModelField(name="file_img_dc2", desc="이미지내역", colName="FILE_IMG_DC2", colSize="200", isKey=false)
	private String file_img_dc2;
	  
	@SerializedName("FILE_IMG_SQ2")
	@DzModelField(name="file_img_sq2", desc="이미지순번", colName="FILE_IMG_SQ2", colSize="5", isKey=false)
	private BigDecimal file_img_sq2;
	  
	@SerializedName("FILE_IMG_ORGL_FILE_DC2")
	@DzModelField(name="file_img_orgl_file_dc2", desc="이미지원본파일내역", colName="FILE_IMG_ORGL_FILE_DC2", colSize="200", isKey=false)
	private String file_img_orgl_file_dc2;
	  
	@SerializedName("FILE_IMG_ORGL_FEXTSN_DC2")
	@DzModelField(name="file_img_orgl_fextsn_dc2", desc="이미지원본파일확장자내역", colName="FILE_IMG_ORGL_FEXTSN_DC2", colSize="200", isKey=false)
	private String file_img_orgl_fextsn_dc2;
	  
	@SerializedName("FILE_IMG_NEW_FILE_DC2")
	@DzModelField(name="file_img_new_file_dc2", desc="이미지신규파일내역", colName="FILE_IMG_NEW_FILE_DC2", colSize="200", isKey=false)
	private String file_img_new_file_dc2;
	  
	@SerializedName("FILE_IMG_FILE_VR2")
	@DzModelField(name="file_img_file_vr2", desc="이미지파일문자값", colName="FILE_IMG_FILE_VR2", colSize="20", isKey=false)
	private String file_img_file_vr2;

	public String getCompany_cd() {
		return company_cd;
	}
	
	public void setCompany_cd(String company_cd) {
		this.company_cd = company_cd;
	}
	
	public String getRel_bss_txt() {
		return rel_bss_txt;
	}
	
	public void setRel_bss_txt(String rel_bss_txt) {
		this.rel_bss_txt = rel_bss_txt;
	}
	
	public String getMng_dtl_nm() {
		return mng_dtl_nm;
	}
	
	public void setMng_dtl_nm(String mng_dtl_nm) {
		this.mng_dtl_nm = mng_dtl_nm;
	}
	
	public String getMng_dtl_nm2() {
		return mng_dtl_nm2;
	}
	
	public void setMng_dtl_nm2(String mng_dtl_nm2) {
		this.mng_dtl_nm2 = mng_dtl_nm2;
	}
	
	public String getIssue_emp_no() {
		return issue_emp_no;
	}
	
	public void setIssue_emp_no(String issue_emp_no) {
		this.issue_emp_no = issue_emp_no;
	}
	
	public String getIssue_emp_no3() {
		return issue_emp_no3;
	}
	
	public void setIssue_emp_no3(String issue_emp_no3) {
		this.issue_emp_no3 = issue_emp_no3;
	}
	
	public String getTrmt_goal_dt() {
		return trmt_goal_dt;
	}
	
	public void setTrmt_goal_dt(String trmt_goal_dt) {
		this.trmt_goal_dt = trmt_goal_dt;
	}
	
	public String getIssue_dt2() {
		return issue_dt2;
	}
	
	public void setIssue_dt2(String issue_dt2) {
		this.issue_dt2 = issue_dt2;
	}
	
	public String getIssue_dt3() {
		return issue_dt3;
	}
	
	public void setIssue_dt3(String issue_dt3) {
		this.issue_dt3 = issue_dt3;
	}
	
	public String getDept_nm() {
		return dept_nm;
	}
	
	public void setDept_nm(String dept_nm) {
		this.dept_nm = dept_nm;
	}
	
	public String getCrct_trmt_no() {
		return crct_trmt_no;
	}
	
	public void setCrct_trmt_no(String crct_trmt_no) {
		this.crct_trmt_no = crct_trmt_no;
	}
	
	public String getCrct_trmt_no2() {
		return crct_trmt_no2;
	}
	
	public void setCrct_trmt_no2(String crct_trmt_no2) {
		this.crct_trmt_no2 = crct_trmt_no2;
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
	
	public String getPlant_nm() {
		return plant_nm;
	}
	
	public void setPlant_nm(String plant_nm) {
		this.plant_nm = plant_nm;
	}
	
	public String getCrct_trmt_nm() {
		return crct_trmt_nm;
	}
	
	public void setCrct_trmt_nm(String crct_trmt_nm) {
		this.crct_trmt_nm = crct_trmt_nm;
	}
	
	public String getKor_nm() {
		return kor_nm;
	}
	
	public void setKor_nm(String kor_nm) {
		this.kor_nm = kor_nm;
	}
	
	public String getKor_nm2() {
		return kor_nm2;
	}
	
	public void setKor_nm2(String kor_nm2) {
		this.kor_nm2 = kor_nm2;
	}
	
	public String getKor_nm3() {
		return kor_nm3;
	}
	
	public void setKor_nm3(String kor_nm3) {
		this.kor_nm3 = kor_nm3;
	}
	
	public String getCrct_trmt_reqn_dt() {
		return crct_trmt_reqn_dt;
	}
	
	public void setCrct_trmt_reqn_dt(String crct_trmt_reqn_dt) {
		this.crct_trmt_reqn_dt = crct_trmt_reqn_dt;
	}
	
	public String getTrmt_trgt_cd() {
		return trmt_trgt_cd;
	}
	
	public void setTrmt_trgt_cd(String trmt_trgt_cd) {
		this.trmt_trgt_cd = trmt_trgt_cd;
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
	
	public String getPstn_cd() {
		return pstn_cd;
	}
	
	public void setPstn_cd(String pstn_cd) {
		this.pstn_cd = pstn_cd;
	}
	
	public String getPstn_cd3() {
		return pstn_cd3;
	}
	
	public void setPstn_cd3(String pstn_cd3) {
		this.pstn_cd3 = pstn_cd3;
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
	
	public String getRe_crct_trmt_txt() {
		return re_crct_trmt_txt;
	}
	
	public void setRe_crct_trmt_txt(String re_crct_trmt_txt) {
		this.re_crct_trmt_txt = re_crct_trmt_txt;
	}
	
	public String getRe_crct_trmt_reqn_dt() {
		return re_crct_trmt_reqn_dt;
	}
	
	public void setRe_crct_trmt_reqn_dt(String re_crct_trmt_reqn_dt) {
		this.re_crct_trmt_reqn_dt = re_crct_trmt_reqn_dt;
	}
	
	public String getDept_nm3() {
		return dept_nm3;
	}
	
	public void setDept_nm3(String dept_nm3) {
		this.dept_nm3 = dept_nm3;
	}
	
	public String getDept_nm2() {
		return dept_nm2;
	}
	
	public void setDept_nm2(String dept_nm2) {
		this.dept_nm2 = dept_nm2;
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

	public BigDecimal getSurchrg_amt() {
		return surchrg_amt;
	}

	public void setSurchrg_amt(BigDecimal surchrg_amt) {
		this.surchrg_amt = surchrg_amt;
	}

	public String getFile_dc1() {
		return file_dc1;
	}

	public void setFile_dc1(String file_dc1) {
		this.file_dc1 = file_dc1;
	}

	public String getFile_img_dc1() {
		return file_img_dc1;
	}

	public void setFile_img_dc1(String file_img_dc1) {
		this.file_img_dc1 = file_img_dc1;
	}

	public BigDecimal getFile_img_sq1() {
		return file_img_sq1;
	}

	public void setFile_img_sq1(BigDecimal file_img_sq1) {
		this.file_img_sq1 = file_img_sq1;
	}

	public String getFile_img_orgl_file_dc1() {
		return file_img_orgl_file_dc1;
	}

	public void setFile_img_orgl_file_dc1(String file_img_orgl_file_dc1) {
		this.file_img_orgl_file_dc1 = file_img_orgl_file_dc1;
	}

	public String getFile_img_orgl_fextsn_dc1() {
		return file_img_orgl_fextsn_dc1;
	}

	public void setFile_img_orgl_fextsn_dc1(String file_img_orgl_fextsn_dc1) {
		this.file_img_orgl_fextsn_dc1 = file_img_orgl_fextsn_dc1;
	}

	public String getFile_img_new_file_dc1() {
		return file_img_new_file_dc1;
	}

	public void setFile_img_new_file_dc1(String file_img_new_file_dc1) {
		this.file_img_new_file_dc1 = file_img_new_file_dc1;
	}

	public String getFile_img_file_vr1() {
		return file_img_file_vr1;
	}

	public void setFile_img_file_vr1(String file_img_file_vr1) {
		this.file_img_file_vr1 = file_img_file_vr1;
	}

	public String getFile_dc2() {
		return file_dc2;
	}

	public void setFile_dc2(String file_dc2) {
		this.file_dc2 = file_dc2;
	}

	public String getFile_img_dc2() {
		return file_img_dc2;
	}

	public void setFile_img_dc2(String file_img_dc2) {
		this.file_img_dc2 = file_img_dc2;
	}

	public BigDecimal getFile_img_sq2() {
		return file_img_sq2;
	}

	public void setFile_img_sq2(BigDecimal file_img_sq2) {
		this.file_img_sq2 = file_img_sq2;
	}

	public String getFile_img_orgl_file_dc2() {
		return file_img_orgl_file_dc2;
	}

	public void setFile_img_orgl_file_dc2(String file_img_orgl_file_dc2) {
		this.file_img_orgl_file_dc2 = file_img_orgl_file_dc2;
	}

	public String getFile_img_orgl_fextsn_dc2() {
		return file_img_orgl_fextsn_dc2;
	}

	public void setFile_img_orgl_fextsn_dc2(String file_img_orgl_fextsn_dc2) {
		this.file_img_orgl_fextsn_dc2 = file_img_orgl_fextsn_dc2;
	}

	public String getFile_img_new_file_dc2() {
		return file_img_new_file_dc2;
	}

	public void setFile_img_new_file_dc2(String file_img_new_file_dc2) {
		this.file_img_new_file_dc2 = file_img_new_file_dc2;
	}

	public String getFile_img_file_vr2() {
		return file_img_file_vr2;
	}

	public void setFile_img_file_vr2(String file_img_file_vr2) {
		this.file_img_file_vr2 = file_img_file_vr2;
	}
}
