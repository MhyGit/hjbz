package com.hjbz.test.learning.factory.abstracts;

public class TestAbstractFactroy {

	public static void main(String[] args) {
		//获得car的工厂
		AbstractFactory factory = FactoryProducer.getFactory("car");

		//通过car的工厂得到具体汽车的实现类并执行buy方法
		factory.getCar("audi").buy();

		//获得car的工厂
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		colorFactory.getCarColor("green").fill();

	}



}
