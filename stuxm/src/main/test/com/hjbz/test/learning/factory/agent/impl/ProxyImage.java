package com.hjbz.test.learning.factory.agent.impl;

import com.hjbz.test.learning.factory.agent.Image;

public class ProxyImage implements Image {

	private  RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName){
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if(realImage == null){
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}
}
