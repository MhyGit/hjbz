package com.hjbz.test.learning.factory.abstracts.impl;

import com.hjbz.test.learning.factory.abstracts.CarColor;

public class Red implements CarColor {
	@Override
	public void fill() {
		System.out.println("填充了红色...");
	}
}
