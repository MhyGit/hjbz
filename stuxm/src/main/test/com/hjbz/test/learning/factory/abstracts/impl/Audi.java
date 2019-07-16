package com.hjbz.test.learning.factory.abstracts.impl;

import com.hjbz.test.learning.factory.abstracts.Car;

/**
 *  奥迪
 */
public class Audi implements Car {


	@Override
	public void buy() {
		System.out.println("买了一辆奥迪车...");
	}
}
