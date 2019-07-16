package com.hjbz.test.learning.factory.abstracts;


/**
 * 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
 */
public class FactoryProducer {


	public static AbstractFactory getFactory(String choice){
		if(choice.equalsIgnoreCase("CAR")){
			return new CarFactroy();
		} else if(choice.equalsIgnoreCase("COLOR")){
			return new ColorFactory();
		}
		return null;
	}
}
