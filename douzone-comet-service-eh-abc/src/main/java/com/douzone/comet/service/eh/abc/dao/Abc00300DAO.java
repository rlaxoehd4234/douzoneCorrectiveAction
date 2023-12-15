package com.douzone.comet.service.eh.abc.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.douzone.comet.jdbc.mybatis.DzMybatisSupport;
import com.douzone.comet.service.eh.abc.models.Abc00300Model;
/** 
  * @description :
  * @Since   : 
  * @Author  :
  * @History :
  */
@Repository
public class Abc00300DAO  {

	private DzMybatisSupport mybatisSupport;

	@Autowired
	public Abc00300DAO(DzMybatisSupport mybatisSupport) {
		this.mybatisSupport = mybatisSupport;
	}

	/**
	 * 복수 데이터 목록 조회
	 * @param abc00300Model
	 * @return List<Abc00300Model>
	 */
	public List<Abc00300Model> selectAbc00300ModelList(HashMap<String, Object> param) throws Exception {
		return this.mybatisSupport.selectList(this.getClass().getName() + ".selectAbc00300ModelList", param);
	}

	/**
	 * 단일 데이터 조회
	 * @param abc00300Model
	 * @return List<Abc00300Model>
	 */
	public Abc00300Model selectAbc00300Model(HashMap<String, Object> param) throws Exception {
		return this.mybatisSupport.selectOne(this.getClass().getName() + ".selectAbc00300Model", param);
	}

	/**
	 * 단일 데이터 입력 처리
	 * @param abc00300Model
	 */
	public void insertAbc00300Model(HashMap<String, Object> param) throws Exception {
		this.mybatisSupport.insert(this.getClass().getName() + ".insertAbc00300Model", param);
	}

	/**
	 * 단일 데이터 수정 처리
	 * @param abc00300Model
	 */
	public void updateAbc00300Model(HashMap<String, Object> param) throws Exception {
		this.mybatisSupport.update(this.getClass().getName() + ".updateAbc00300Model", param);
	}

	/**
	 * 단일 데이터 삭제 처리
	 * @param abc00300Model
	 */
	public void deleteAbc00300Model(HashMap<String, Object> param) throws Exception {
		this.mybatisSupport.delete(this.getClass().getName() + ".deleteAbc00300Model", param);
	}

}
