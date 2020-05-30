package com.kevin.github;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GitHubCommit {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("张三", "1");
		map.put("李四", "2");
		map.put("王五", "3");
		map.put("赵六", "4");
		map.put("田七", "5");

		Set<String> keySet = map.keySet();
		for (String string : keySet) {
			//System.out.println(string);
			System.out.println(string+":"+map.get(string));
		}
		
		System.out.println("==================================");
		
		Set<Entry<String,String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+":"+value);
		}

	}
}
