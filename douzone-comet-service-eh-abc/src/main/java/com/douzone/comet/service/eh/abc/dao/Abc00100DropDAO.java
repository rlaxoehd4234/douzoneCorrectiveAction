package com.douzone.comet.service.eh.abc.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.douzone.comet.jdbc.mybatis.DzMybatisSupport;
import com.douzone.comet.service.eh.abc.models.Abc00100DropModel;
/** 
  * @description :
  * @Since   : 
  * @Author  :
  * @History :
  */
@Repository
public class Abc00100DropDAO  {

	private DzMybatisSupport mybatisSupport;

	@Autowired
	public Abc00100DropDAO(DzMybatisSupport mybatisSupport) {
		this.mybatisSupport = mybatisSupport;
	}

	/**
	 * 복수 데이터 목록 조회
	 * @param abc00100DropModel
	 * @return List<Abc00100DropModel>
	 */
	public List<Abc00100DropModel> selectAbc00100DropModelList(HashMap<String, Object> param) throws Exception {
		return this.mybatisSupport.selectList(this.getClass().getName() + ".selectAbc00100DropModelList", param);
	}

}
