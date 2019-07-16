package com.hjbz.test.learning.factory.abstracts;

import com.hjbz.test.learning.factory.abstracts.impl.*;

public class CarFactroy extends AbstractFactory{


	@Override
	public CarColor getCarColor(String colorName) {
		return null;
	}

	@Override
	public Car getCar(String carName) {
		if (carName == null){
			return null;
		}
		if (carName.equalsIgnoreCase("AUDI")){
			return new  Audi();
		}else if (carName.equalsIgnoreCase("BAOMA")){
			return new Baoma();
		}else if (carName.equalsIgnoreCase("BENCHI")){
			return new Benchi();
		}
		return null;
	}


}
