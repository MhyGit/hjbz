package com.hjbz.test.learning.factory.normal;

import com.hjbz.test.learning.factory.normal.impl.Circle;
import com.hjbz.test.learning.factory.normal.impl.Rectangle;
import com.hjbz.test.learning.factory.normal.impl.Square;

public class ShapeFactory {

	public Shape getShape(String shapeName){
		if (shapeName == null){
			return null;
		}
		if (shapeName.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}else if (shapeName.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}else if (shapeName.equalsIgnoreCase("SQUARE")){
			return new Square();
		}
		return null;
	}

}
