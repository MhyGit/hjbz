package com.hjbz.test.learning.factory.agent.impl;

import com.hjbz.test.learning.factory.agent.Image;

public class RealImage implements Image {

	private String imageName;


	public RealImage(String imageName){
		this.imageName = imageName;
		loadFromDisk(imageName);
	}

	private void loadFromDisk(String fileName){
		System.out.println("Loading " + fileName+"...");
	}

	@Override
	public void display() {
		System.out.println("显示图片:"+imageName);
	}


}
