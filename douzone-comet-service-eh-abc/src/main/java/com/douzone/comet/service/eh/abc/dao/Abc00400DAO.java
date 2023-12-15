package com.douzone.comet.service.eh.abc.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.douzone.comet.jdbc.mybatis.DzMybatisSupport;
import com.douzone.comet.service.eh.abc.models.Abc00400DtlModel;
import com.douzone.comet.service.eh.abc.models.Abc00400MstModel;
/** 
  * @description :
  * @Since   : 
  * @Author  :
  * @History :
  */
@Repository
public class Abc00400DAO  {

	private DzMybatisSupport mybatisSupport;

	@Autowired
	public Abc00400DAO(DzMybatisSupport mybatisSupport) {
		this.mybatisSupport = mybatisSupport;
	}

	/**
	 * 복수 데이터 목록 조회
	 * @param abc00400MstModel
	 * @return List<Abc00400MstModel>
	 */
	public List<Abc00400MstModel> selectAbc00400MstModelList(HashMap<String, Object> param) throws Exception {
		return this.mybatisSupport.selectList(this.getClass().getName() + ".selectAbc00400MstModelList", param);
	}

	/**
	 * 복수 데이터 목록 조회
	 * @param abc00400DtlModel
	 * @return List<Abc00400DtlModel>
	 */
	public List<Abc00400DtlModel> selectAbc00400DtlModelList(HashMap<String, Object> param) throws Exception {
		return this.mybatisSupport.selectList(this.getClass().getName() + ".selectAbc00400DtlModelList", param);
	}

}
