package com.hjbz.stuxm.module.echarts.dao;

import com.hjbz.stuxm.module.echarts.entity.Paramter;
import com.hjbz.stuxm.module.echarts.entity.Qsmyfx;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface SearchMapper {

	/**
	 * 按条件查询数据
	 * @param paramter
	 * @return
	 */
	List<Qsmyfx> findAllData(Paramter paramter);

}
