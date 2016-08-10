package com.infoq.java;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author 	Lian
 * @time	2016年8月10日
 */
public class Converter {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("hello");

		/**
		 * 从直觉上来说。Object是String的父类，这种转换应该是合理的。
		 * 但是实际上这会产生隐含的类型转换问题，因此编译器直接就禁止这样的行为。
		 * 
		 * I think: 把List<String>当作参数传过去是没问题，问题处在传过去后List<Object>的使用上，
		 * Ojbect不仅是String的父类，也是其他类的父类，如果在向下转换时转为Integer等，那么运行时就会报错
		 */
//		method(list);
	}

	public static void method(List<Object> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
}
