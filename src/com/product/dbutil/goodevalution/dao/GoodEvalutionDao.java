package com.product.dbutil.goodevalution.dao;

import java.util.List;
import java.util.Map;

import com.product.dbutil.order.dao.OrderDao;
import com.product.dbutil.order.service.OrderService;

public class GoodEvalutionDao extends OrderDao{

	@Override
	public boolean updataOneItem(String sql, List<Object> params) {
		// TODO Auto-generated method stub
		return super.updataOneItem(sql, params);
	}

	@Override
	public Map<String, Object> queryOneRecord(String sql, List<Object> params) {
		// TODO Auto-generated method stub
		return super.queryOneRecord(sql, params);
	}

	@Override
	public List<Map<String, Object>> queryMultiRecord(String sql,
			List<Object> params) {
		// TODO Auto-generated method stub
		return super.queryMultiRecord(sql, params);
	}

	

}
