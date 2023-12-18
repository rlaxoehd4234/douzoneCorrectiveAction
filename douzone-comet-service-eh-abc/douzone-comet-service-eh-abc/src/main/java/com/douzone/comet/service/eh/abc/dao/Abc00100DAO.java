package com.douzone.comet.service.eh.abc.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.douzone.comet.jdbc.mybatis.DzMybatisSupport;
import com.douzone.comet.service.eh.abc.models.Abc00100Model;
/** 
  * @description :
  * @Since   : 
  * @Author  :
  * @History :
  */
@Repository
public class Abc00100DAO  {

	private DzMybatisSupport mybatisSupport;

	@Autowired
	public Abc00100DAO(DzMybatisSupport mybatisSupport) {
		this.mybatisSupport = mybatisSupport;
	}

	/**
	 * 복수 데이터 목록 조회
	 * @param abc00100Model
	 * @return List<Abc00100Model>
	 */
	public List<Abc00100Model> selectAbc00100ModelList(HashMap<String, Object> param) throws Exception {
		return this.mybatisSupport.selectList(this.getClass().getName() + ".selectAbc00100ModelList", param);
	}

	/**
	 * 지동 채번 최대값 구하기
	 * @param abc00100Model
	 * @return List<Abc00100Model>
	 */
	public int selectMaxSq(HashMap<String, Object> param) throws Exception {
		return this.mybatisSupport.selectOne(this.getClass().getName() + ".selectMaxSq", param);
	}
	
	/**
	 * 순번 최대값 구하기
	 * @param abc00100Model
	 * @return List<Abc00100Model>
	 */
	public int selectMaxSqNo(HashMap<String, Object> param) throws Exception {
		return this.mybatisSupport.selectOne(this.getClass().getName() + ".selectMaxSqNo", param);
	}

	/**
	 * 시정조치요구 단일 데이터 입력 처리
	 * @param abc00100Model
	 */
	public void insertAbc00100Model(HashMap<String, Object> param) throws Exception {
		this.mybatisSupport.insert(this.getClass().getName() + ".insertAbc00100Model", param);
	}
	
	/**
	 * 시정조치결과 단일 데이터 입력 처리
	 * @param abc00100Model
	 */
	public void insertAbc00200Model(HashMap<String, Object> param) throws Exception {
		this.mybatisSupport.insert(this.getClass().getName() + ".insertAbc00200Model", param);
	}
	
	/**
	 * 시정초지검토 단일 데이터 입력 처리
	 * @param abc00100Model
	 */
	public void insertAbc00300Model(HashMap<String, Object> param) throws Exception {
		this.mybatisSupport.insert(this.getClass().getName() + ".insertAbc00300Model", param);
	}

	/**
	 * 단일 데이터 수정 처리
	 * @param abc00100Model
	 */
	public void updateAbc00100Model(HashMap<String, Object> param) throws Exception {
		this.mybatisSupport.update(this.getClass().getName() + ".updateAbc00100Model", param);
	}

	/**
	 * 단일 데이터 삭제 처리
	 * @param abc00100Model
	 */
	public void deleteAbc00100Model(HashMap<String, Object> param) throws Exception {
		this.mybatisSupport.delete(this.getClass().getName() + ".deleteAbc00100Model", param);
	}

	/**
	 * 단일 데이터 삭제 처리
	 * @param abc00100Model
	 */
	public void deleteAbc00200Model(HashMap<String, Object> param) throws Exception {
		this.mybatisSupport.delete(this.getClass().getName() + ".deleteAbc00200Model", param);
	}
	
	/**
	 * 단일 데이터 삭제 처리
	 * @param abc00100Model
	 */
	public void deleteAbc00300Model(HashMap<String, Object> param) throws Exception {
		this.mybatisSupport.delete(this.getClass().getName() + ".deleteAbc00300Model", param);
	}
}
