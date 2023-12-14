package com.douzone.comet.service.eh.abc.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.douzone.comet.jdbc.mybatis.DzMybatisSupport;
import com.douzone.comet.service.eh.abc.models.Abc00200Model;
/** 
  * @description :
  * @Since   : 
  * @Author  :
  * @History :
  */
@Repository
public class Abc00200DAO  {

	private DzMybatisSupport mybatisSupport;

	@Autowired
	public Abc00200DAO(DzMybatisSupport mybatisSupport) {
		this.mybatisSupport = mybatisSupport;
	}

	/**
	 * 복수 데이터 목록 조회
	 * @param abc00200Model
	 * @return List<Abc00200Model>
	 */
	public List<Abc00200Model> selectAbc00200ModelList(HashMap<String, Object> param) throws Exception {
		return this.mybatisSupport.selectList(this.getClass().getName() + ".selectAbc00200ModelList", param);
	}

	/**
	 * 단일 데이터 조회
	 * @param abc00200Model
	 * @return List<Abc00200Model>
	 */
	public Abc00200Model selectAbc00200Model(Abc00200Model abc00200Model) throws Exception {
		return this.mybatisSupport.selectOne(this.getClass().getName() + ".selectAbc00200Model", abc00200Model);
	}

	/**
	 * 단일 데이터 입력 처리
	 * @param abc00200Model
	 */
	public void insertAbc00200Model(Abc00200Model abc00200Model) throws Exception {
		this.mybatisSupport.insert(this.getClass().getName() + ".insertAbc00200Model", abc00200Model);
	}

	/**
	 * 단일 데이터 수정 처리
	 * @param abc00200Model
	 */
	public void updateAbc00200Model(HashMap<String, Object> param) throws Exception {
		this.mybatisSupport.update(this.getClass().getName() + ".updateAbc00200Model", param);
	}

	/**
	 * 단일 데이터 삭제 처리
	 * @param abc00200Model
	 */
	public void deleteAbc00200Model(HashMap<String, Object> param) throws Exception {
		this.mybatisSupport.delete(this.getClass().getName() + ".deleteAbc00200Model", param);
	}
	
	/**
	 * 단일 데이터 삭제 처리
	 * @param abc00200Model
	 */
	public void deleteAbc00300Model(HashMap<String, Object> param) throws Exception {
		this.mybatisSupport.delete(this.getClass().getName() + ".deleteAbc00300Model", param);
	}
	
	/**
	 * 단일 데이터 수정 처리
	 * @param HashMap<String, Object> param
	 */
	public void updateRstMst(HashMap<String, Object> param) throws Exception {
		this.mybatisSupport.update(this.getClass().getName() + ".updateRstMst", param);
	}
	
	/**
	 * 단일 데이터 수정 처리
	 * @param HashMap<String, Object> param
	 */
	public void updateReviewMst(HashMap<String, Object> param) throws Exception {
		this.mybatisSupport.update(this.getClass().getName() + ".updateReviewMst", param);
	}

}
