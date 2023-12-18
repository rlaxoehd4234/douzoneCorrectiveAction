package com.douzone.comet.service.eh.abc.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.douzone.comet.jdbc.mybatis.DzMybatisSupport;
import com.douzone.comet.service.eh.abc.models.AbcDropModel;
import com.douzone.comet.service.eh.abc.models.AbcFileModel;
/** 
  * @description :
  * @Since   : 
  * @Author  :
  * @History :
  */
@Repository
public class AbcCommonDAO  {

	private DzMybatisSupport mybatisSupport;

	@Autowired
	public AbcCommonDAO(DzMybatisSupport mybatisSupport) {
		this.mybatisSupport = mybatisSupport;
	}

	/**
	 * 시정조치유형, 시정조치구분 데이터 목록 조회
	 * @param abcDropModel
	 * @return List<AbcDropModel>
	 */
	public List<AbcDropModel> selectAbcDropModelList(HashMap<String, Object> param) throws Exception {
		return this.mybatisSupport.selectList(this.getClass().getName() + ".selectAbcDropModelList", param);
	}
	
	/**
	 * 시정조치요구 mstGridRow 별 멀티파일 목록 조회
	 * @param abcFileModel
	 * @return List<AbcFileModel>
	 */
	public List<AbcFileModel> selectAbc00100MultiFileModelList(HashMap<String, Object> param) throws Exception {
		return this.mybatisSupport.selectList(this.getClass().getName() + ".selectAbc00100MultiFileModelList", param);
	}
	
	/**
	 * 시정조치결과 mstGridRow 별 멀티파일 목록 조회
	 * @param abcFileModel
	 * @return List<AbcFileModel>
	 */
	public List<AbcFileModel> selectAbc00200MultiFileModelList(HashMap<String, Object> param) throws Exception {
		return this.mybatisSupport.selectList(this.getClass().getName() + ".selectAbc00200MultiFileModelList", param);
	}
	
	/**
	 * 시정처지요구 등록 AtchfileId 추가 처리
	 * @param HashMap
	 */
    public void updateAbc00100AtchfileId(HashMap<String, Object> param) throws Exception {
        this.mybatisSupport.selectOne(this.getClass().getName() + ".updateAbc00100AtchfileId", param);
    }
    
	/**
	 * 시정조치결과 등록 AtchfileId 추가 처리
	 * @param HashMap
	 */
    public void updateAbc00200AtchfileId(HashMap<String, Object> param) throws Exception {
        this.mybatisSupport.selectOne(this.getClass().getName() + ".updateAbc00200AtchfileId", param);
    }
    
	/**
	 * 시정조치요구 등록 ImgPathDcId 추가 처리
	 * @param HashMap
	 */
	public void updateAbc00100ImgPathDcId(HashMap<String, Object> param) throws Exception {
		this.mybatisSupport.selectOne(this.getClass().getName() + ".updateAbc00100ImgPathDcId", param);
	}
	
	/**
	 * 시정조치결과 등록 ImgPathDcId 추가 처리
	 * @param HashMap
	 */
	public void updateAbc00200ImgPathDcId(HashMap<String, Object> param) throws Exception {
		this.mybatisSupport.selectOne(this.getClass().getName() + ".updateAbc00200ImgPathDcId", param);
	}
	
	/**
	 * Common insert 최대 FILE_SQ 추출
	 * @param HashMap
	 * @return Integer
	 */
	public int selectMaxFileSqForInsert(HashMap<String, Object> param) throws Exception {
		return this.mybatisSupport.selectOne(this.getClass().getName() + ".selectMaxFileSqForInsert", param);
	}
	
	/**
	 * Common delete 최대 FILE_SQ 추출
	 * @param HashMap
	 * @return Integer
	 */
	public int selectMaxFileSqForDelete(HashMap<String, Object> param) throws Exception {
		return this.mybatisSupport.selectOne(this.getClass().getName() + ".selectMaxFileSqForDelete", param);
	}
	
	/**
	 * Common 단일파일데이터 추가
	 * @param HashMap
	 */
	public void insertAbcFile(HashMap<String, Object> param) throws Exception {
		this.mybatisSupport.insert(this.getClass().getName() + ".insertAbcFile", param);
	}
	
	/**
	 * Common 단일파일데이터 삭제 
	 * @param aBC00100File
	 */
	public void deleteAbcFile(HashMap<String, Object> param) throws Exception {
		this.mybatisSupport.delete(this.getClass().getName() + ".deleteAbcFile", param);
	}
	
	/**
	 * Common 200 파일데이터이름 조회
	 * @param HashMap
	 * @return String
	 */
	public String selectNewFileDc(HashMap<String, Object> param) throws Exception {
		return this.mybatisSupport.selectOne(this.getClass().getName() + ".selectNewFileDc", param);
	}
	
	/**
	 * Common 다중파일데이터 삭제 
	 * @param HashMap
	 */
	public void deleteAllFileModel(HashMap<String, Object> param) throws Exception {
		this.mybatisSupport.delete(this.getClass().getName() + ".deleteAllFileModel", param);
	}

	/**
	 * Common 파일경로 조회
	 * @param aBC00100File
	 */
	public String chaseFilePath(HashMap<String, Object> param) throws Exception {
		return this.mybatisSupport.selectOne(this.getClass().getName() + ".chaseFilePath", param);
	}
	
	/**
	 * Common NEW_FILE_DC 추적 멀티파일
	 * @param aBC00100File
	 */
	public List<String> selectNewFileDcMultiFile(HashMap<String, Object> param) throws Exception {
		return this.mybatisSupport.selectList(this.getClass().getName() + ".selectNewFileDcMultiFile", param);
	}
	
	/**
	 * Common NEW_FILE_DC 이미지 모델 데이터 조회 
	 * @param aBC00100File
	 * @return AbcFileModel 
	 */
	public AbcFileModel selectImageObject(HashMap<String, Object> param) throws Exception {
		return this.mybatisSupport.selectOne(this.getClass().getName() + ".selectImageObject", param);
	}
}
