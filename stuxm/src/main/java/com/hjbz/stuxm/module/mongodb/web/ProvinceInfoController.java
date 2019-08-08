package com.hjbz.stuxm.module.mongodb.web;

import com.hjbz.stuxm.module.mongodb.entity.City;
import com.hjbz.stuxm.module.mongodb.entity.County;
import com.hjbz.stuxm.module.mongodb.entity.Province;
import com.hjbz.stuxm.module.mongodb.service.ProvinceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 处理省份信息的Controller <br>
 *  Author:news. <br>
 *  Time:2019年8月7日 <br>
 */
@Controller
@RequestMapping("/province")
public class ProvinceInfoController {

	@Autowired
	private ProvinceInfoService provinceInfoService;


	@RequestMapping("/insertProvinceInfo")
	@ResponseBody
	public String insertProvinceInfo(String provinceCode){
		Province province = provinceInfoService.findProvinceByProvinceCode(provinceCode);
		List<City> cityList = provinceInfoService.findCityByProvinceCode(provinceCode);
		if(cityList != null && province != null){
			province.setCityList(cityList);
		}
		for(City city : cityList){
			List<County> countyList = provinceInfoService.findCountyByCityCode(city.getCode());
			if(countyList != null && province != null){
				city.setCountyList(countyList);
			}
		}
		if(cityList != null && province != null){
			province.setCityList(cityList);
		}
		provinceInfoService.insertProvinceInfo(province);

		System.out.println("========================插入数据完成========================");

		List<Province> provinceList = provinceInfoService.queryProvinceInfo(provinceCode);

		System.out.println("========================查询数据完成========================");

		return provinceList.get(provinceList.size()-1).toString();
	}



}
