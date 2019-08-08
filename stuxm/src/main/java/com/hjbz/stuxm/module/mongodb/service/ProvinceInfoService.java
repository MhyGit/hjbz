package com.hjbz.stuxm.module.mongodb.service;


import com.hjbz.stuxm.module.mongodb.entity.City;
import com.hjbz.stuxm.module.mongodb.entity.County;
import com.hjbz.stuxm.module.mongodb.entity.Province;

import java.util.List;

/**
 * 处理省份信息的Service <br>
 *  Author:news. <br>
 *  Time:2019年8月7日 <br>
 */
public interface ProvinceInfoService {

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


	/**
	 * 往MongoDB中插入省份信息数据
	 * @param province 省份实体类
	 */
	void insertProvinceInfo(Province province);


	/**
	 * 根据身份代码从MongoDB中查询数据
	 * @param provinceCode
	 * @return
	 */
	List<Province> queryProvinceInfo(String provinceCode);


}
