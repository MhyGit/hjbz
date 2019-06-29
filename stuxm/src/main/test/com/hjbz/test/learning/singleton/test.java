package com.hjbz.test.learning.singleton;

import org.junit.Test;

public class test {

	/**
	 * 测试饿汉模式
	 */
	@Test
	public void testHungrySingleton(){
		HungrySingleton instance1 = HungrySingleton.getInstance();
		HungrySingleton instance2 = HungrySingleton.getInstance();
		if (instance1 == instance2){
			System.out.println("创建的是一个实例，符合单例");
		}else{
			System.out.println("不是同一个实例");
		}
	}

	/**
	 * 测试懒模式
	 */
	@Test
	public void testLazySingleton(){
		LazySingleton instance1 = LazySingleton.getInstance();
		LazySingleton instance2 = LazySingleton.getInstance();
		if (instance1 == instance2){
			System.out.println("创建的是一个实例，符合单例");
		}else{
			System.out.println("不是同一个实例");
		}
	}

}
