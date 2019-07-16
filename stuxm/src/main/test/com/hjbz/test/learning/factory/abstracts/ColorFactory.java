package com.hjbz.test.learning.factory.abstracts;

import com.hjbz.test.learning.factory.abstracts.impl.Blue;
import com.hjbz.test.learning.factory.abstracts.impl.Green;
import com.hjbz.test.learning.factory.abstracts.impl.Red;

public class ColorFactory extends AbstractFactory {
	@Override
	public CarColor getCarColor(String colorName) {
		if (colorName == null){
			return null;
		}
		if (colorName.equalsIgnoreCase("RED")) {
			return new Red();
		}else if (colorName.equalsIgnoreCase("GREEN")){
			return new Green();
		}else if (colorName.equalsIgnoreCase("BLUE")){
			return new Blue();
		}
		return null;
	}

	@Override
	public Car getCar(String carName) {
		return null;
	}
}
