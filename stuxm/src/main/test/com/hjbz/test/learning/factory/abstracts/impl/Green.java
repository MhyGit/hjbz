package com.hjbz.test.learning.factory.abstracts.impl;

import com.hjbz.test.learning.factory.abstracts.CarColor;

public class Green implements CarColor {
	@Override
	public void fill() {
		System.out.println("填充了绿色...");
	}
}
