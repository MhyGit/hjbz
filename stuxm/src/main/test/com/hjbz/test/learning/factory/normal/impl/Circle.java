package com.hjbz.test.learning.factory.normal.impl;

import com.hjbz.test.learning.factory.normal.Shape;

public class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("==================>>>>>画圆形....");
	}
}
