package com.hjbz.test.learning.singleton;

/**
 *  单例模式学习：
 *      应用场合：有些对象只需要一个就足够了。
 *      作用：保证整个应用程序中某个实例 有且只有一个
 *      类型：饿汉模式、懒汉模式
 *      区别：饿汉模式在加载类的时候比较慢，但运行时获取对象的速度比较快，并且线程安全
 *            懒汉模式在加载类的时候比较快，但运行时获取对象的速度比较慢，并且线程不安全
 */
public class HungrySingleton {
		/**
		 * 饿汉模式：在类加载的时候，就会创建这个类的唯一实例，这种叫饿汉模式
		 */

		//1，将构造方法私有化，不允许外部直接创建对象
		private HungrySingleton(){}

		//2.创建此类的唯一实例,使用private static修饰
		private static HungrySingleton instance = new HungrySingleton();

		//3.提供一个用于获取实例的方法，使用public static修饰
		public static HungrySingleton getInstance(){
			return instance;
		}
}
