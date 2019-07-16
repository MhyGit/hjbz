package com.hjbz.test.learning.factory.abstracts.impl;

import com.hjbz.test.learning.factory.abstracts.Car;

public class Benchi implements Car {
	@Override
	public void buy() {
		System.out.println("买了一辆奔驰车...");
	}
}
