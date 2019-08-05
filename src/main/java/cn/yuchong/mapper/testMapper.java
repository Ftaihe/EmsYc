package cn.yuchong.mapper;

import cn.yuchong.entity.test;

public interface testMapper {

	/**
	 * 
	 * @param t 插入的测试数据对象
	 * @return    执行成功的sql行数
	 */
	public Integer insertTest(test t);
	
}
