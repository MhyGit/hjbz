package com.hjbz.test.learning.singleton;

/**
 *  懒汉模式
 */
public class LazySingleton {

	//1。将构造方法私有化
	private LazySingleton(){};

	//2. 声明类的唯一实例，使用private static修饰，并不初始化
	private static LazySingleton instance;

	//3.提供一个用于获取实例的方法，使用public static修饰
	public static LazySingleton getInstance(){
		if (instance == null){
			instance = new LazySingleton();
		}
		return instance;
	}
}
