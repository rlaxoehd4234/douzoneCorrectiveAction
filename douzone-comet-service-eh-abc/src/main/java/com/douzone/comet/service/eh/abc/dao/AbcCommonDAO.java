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
	 * 복수 데이터 목록 조회
	 * @param abcDropModel
	 * @return List<AbcDropModel>
	 */
	public List<AbcDropModel> selectAbcDropModelList(HashMap<String, Object> param) throws Exception {
		return this.mybatisSupport.selectList(this.getClass().getName() + ".selectAbcDropModelList", param);
	}
	
	/**
	 * 복수 데이터 목록 조회
	 * @param abcFileModel
	 * @return List<AbcFileModel>
	 */
	public List<AbcFileModel> selectAbc00100MultiFileModelList(HashMap<String, Object> param) throws Exception {
		return this.mybatisSupport.selectList(this.getClass().getName() + ".selectAbc00100MultiFileModelList", param);
	}

    public void updateAbc00100AtchfileId(HashMap<String, Object> param) throws Exception {
        this.mybatisSupport.selectOne(this.getClass().getName() + ".updateAbc00100AtchfileId", param);
     }
     
     
	public void updateAbc00100ImgPathDcId(HashMap<String, Object> param) throws Exception {
		this.mybatisSupport.selectOne(this.getClass().getName() + ".updateAbc00100ImgPathDcId", param);
	}
	
	/**
	 * insert 최대 FILE_SQ 추출
	 * @param 
	 * @return 
	 */
	public int selectMaxFileSqForInsert(HashMap<String, Object> param) throws Exception {
		return this.mybatisSupport.selectOne(this.getClass().getName() + ".selectMaxFileSqForInsert", param);
	}
	
	/**
	 * delete 최대 FILE_SQ 추출
	 * @param 
	 * @return 
	 */
	public int selectMaxFileSqForDelete(HashMap<String, Object> param) throws Exception {
		return this.mybatisSupport.selectOne(this.getClass().getName() + ".selectMaxFileSqForDelete", param);
	}
	
	/**
	 * 단일 데이터 입력 처리
	 * @param 
	 */
	public void insertAbc00100File(HashMap<String, Object> param) throws Exception {
		this.mybatisSupport.insert(this.getClass().getName() + ".insertAbc00100File", param);
	}
	
	/**
	 * 단일 데이터 삭제 처리
	 * @param aBC00100File
	 */
	public void deleteAbc00100File(HashMap<String, Object> param) throws Exception {
		this.mybatisSupport.delete(this.getClass().getName() + ".deleteAbc00100File", param);
	}
	
	public String selectNewFileDc(HashMap<String, Object> param2) throws Exception {
		return this.mybatisSupport.selectOne(this.getClass().getName() + ".selectNewFileDc", param2);
	}
	
	public void deleteAllFileModel(HashMap<String, Object> param) throws Exception {
		this.mybatisSupport.delete(this.getClass().getName() + ".deleteAllFileModel", param);
	}
	
   
}
