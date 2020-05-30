package com.kevin.github;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		show1();
	}

	private static void show1() {
		HashMap<String, Person> map = new HashMap<String, Person>();
		map.put("西安", new Person("张三", 18));
		map.put("上海", new Person("李四", 18));
		map.put("深圳", new Person("王五", 18));
		map.put("北京", new Person("赵六", 18));
		map.put("西安", new Person("小田", 18));
		
		for (String  key : map.keySet()) {
			System.out.println(key+"=====>"+map.get(key));
		}
		
	}
}
