package com.hjbz.test.learning.factory.abstracts;

import com.hjbz.test.learning.factory.abstracts.Car;
import com.hjbz.test.learning.factory.abstracts.CarColor;

/**
 * 为 Car 和 CarColor 对象创建抽象类来获取工厂。
 */
public abstract class AbstractFactory {

	public abstract CarColor getCarColor(String colorName);

	public abstract Car getCar(String carName) ;


}
