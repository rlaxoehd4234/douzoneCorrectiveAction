package com.douzone.comet.service.eh.abc.models;
 
import java.util.Date;

import com.douzone.gpd.jdbc.mybatis.model.DzAbstractModel;
import com.douzone.gpd.restful.annotation.DzModel;
import com.douzone.gpd.restful.annotation.DzModelField;
import com.google.gson.annotations.SerializedName;
 
@DzModel(name = "AbcFileModel", desc = "시정조치요구파일", tableName = "")
public class AbcFileModel extends DzAbstractModel {
	
	@SerializedName("COMPANY_CD")
	@DzModelField(name="company_cd", desc="회사코드", colName="COMPANY_CD", colSize="7", isKey=false)
	private String company_cd;
	
	@SerializedName("CRCT_TRMT_NO")
	@DzModelField(name="crct_trmt_no", desc="시정조치번호", colName="CRCT_TRMT_NO", colSize="20", isKey=false)
	private String crct_trmt_no;
	
	@SerializedName("SQ_NO")
	@DzModelField(name="sq_no", desc="순번번호", colName="SQ_NO", colSize="20", isKey=false)
	private String sq_no;
	
	@SerializedName("ATCHFILE_ID")
	@DzModelField(name="atchfile_id", desc="첨부파일ID", colName="ATCHFILE_ID", colSize="320", isKey=false)
	private String atchfile_id;

	@SerializedName("identifier")
	@DzModelField(name="identifier", desc="파일내역", colName="identifier", colSize="200", isKey=true)
	private String identifier;
	  
	@SerializedName("sequence")
	@DzModelField(name="sequence", desc="파일순번", colName="sequence", colSize="5", isKey=true)
	private int sequence;
	  
	@SerializedName("originalFilename")
	@DzModelField(name="originalFilename", desc="원본파일내역", colName="originalFilename", colSize="200", isKey=false)
	private String originalFilename;
	  
	@SerializedName("originalExtension")
	@DzModelField(name="originalExtension", desc="원본파일확장자내역", colName="originalExtension", colSize="200", isKey=false)
	private String originalExtension;
	  
	@SerializedName("newFilename")
	@DzModelField(name="newFilename", desc="신규파일내역", colName="newFilename", colSize="200", isKey=false)
	private String newFilename;
	  
	@SerializedName("FILE_ATCH_TXT")
	@DzModelField(name="file_atch_txt", desc="파일첨부텍스트", colName="FILE_ATCH_TXT", colSize="1000", isKey=false)
	private String file_atch_txt;
	  
	@SerializedName("fileSize")
	@DzModelField(name="fileSize", desc="파일문자값", colName="fileSize", colSize="20", isKey=false)
	private String fileSize;
	  
	@SerializedName("FILE_DTS")
	@DzModelField(name="file_dts", desc="파일일시", colName="FILE_DTS", colSize="0", isKey=false)
	private Date file_dts;
	  
	@SerializedName("PJT_NO")
	@DzModelField(name="pjt_no", desc="프로젝트번호", colName="PJT_NO", colSize="50", isKey=false)
	private String pjt_no;
	  
	@SerializedName("STD_DOC_CD")
	@DzModelField(name="std_doc_cd", desc="표준문서코드", colName="STD_DOC_CD", colSize="10", isKey=false)
	private String std_doc_cd;
	  
	@SerializedName("MENU_CD")
	@DzModelField(name="menu_cd", desc="메뉴코드", colName="MENU_CD", colSize="20", isKey=false)
	private String menu_cd;
	  
	@SerializedName("EMP_NO")
	@DzModelField(name="emp_no", desc="사원번호", colName="EMP_NO", colSize="20", isKey=false)
	private String emp_no;
	  
	@SerializedName("RMK_TXT")
	@DzModelField(name="rmk_txt", desc="비고텍스트", colName="RMK_TXT", colSize="1000", isKey=false)
	private String rmk_txt;

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

	public String getAtchfile_id() {
		return atchfile_id;
	}

	public void setAtchfile_id(String atchfile_id) {
		this.atchfile_id = atchfile_id;
	}

	
 
	public String getNew_file_dc() {
		return newFilename;
	}

	public void setNew_file_dc(String new_file_dc) {
		this.newFilename = new_file_dc;
	}
 
	public String getFile_atch_txt() {
		return file_atch_txt;
	}

	public void setFile_atch_txt(String file_atch_txt) {
		this.file_atch_txt = file_atch_txt;
	}
 
	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getOriginalFilename() {
		return originalFilename;
	}

	public void setOriginalFilename(String originalFilename) {
		this.originalFilename = originalFilename;
	}

	public String getOriginalExtension() {
		return originalExtension;
	}

	public void setOriginalExtension(String originalExtension) {
		this.originalExtension = originalExtension;
	}

	public String getFileSize() {
		return fileSize;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	public Date getFile_dts() {
		return file_dts;
	}

	public void setFile_dts(Date file_dts) {
		this.file_dts = file_dts;
	}
 
	public String getPjt_no() {
		return pjt_no;
	}

	public void setPjt_no(String pjt_no) {
		this.pjt_no = pjt_no;
	}
 
	public String getStd_doc_cd() {
		return std_doc_cd;
	}

	public void setStd_doc_cd(String std_doc_cd) {
		this.std_doc_cd = std_doc_cd;
	}
 
	public String getMenu_cd() {
		return menu_cd;
	}

	public void setMenu_cd(String menu_cd) {
		this.menu_cd = menu_cd;
	}
 
	public String getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(String emp_no) {
		this.emp_no = emp_no;
	}
 
	public String getRmk_txt() {
		return rmk_txt;
	}

	public void setRmk_txt(String rmk_txt) {
		this.rmk_txt = rmk_txt;
	}
}
