package com.hjbz.stuxm.module.mongodb.dao;


import com.hjbz.stuxm.module.mongodb.entity.City;
import com.hjbz.stuxm.module.mongodb.entity.County;
import com.hjbz.stuxm.module.mongodb.entity.Province;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 *  从mysql数据中查询数据的mapper <br>
 *  Author:news. <br>
 *  Time:2019年8月7日 <br>
 */
@Mapper
@Component
public interface QueryMapper {


	/**
	 * 根据省份代码查询省份
	 * @param provinceCode  省份代码
	 * @return
	 */
	Province findProvinceByProvinceCode(String provinceCode);

	/**
	 * 根据省份代码查询下辖市
	 * @param provinceCode  省份代码
	 * @return
	 */
	List<City> findCityByProvinceCode(String provinceCode);


	/**
	 * 根据市代码查询下辖县
	 * @param cityCode  市代码
	 * @return
	 */
	List<County> findCountyByCityCode(String cityCode);


}
