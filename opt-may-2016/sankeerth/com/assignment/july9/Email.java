package com.assignment.july9;

import java.util.HashMap;
import java.util.Map.Entry;

public class Email {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("Sankeerth", "sankeerth999@gmail.com");
		map.put("Krishna", "kalyanamkrish@gmail.com");
		map.put("Abhilash", "madhavaram.tinku@gmail.com");
		map.put("Kevin", "kevinsanthish08@gmail.com");
		map.put("Bhavin", "bhavinmps@gmail.com");
		map.put("Dayana", "dmallass@hawk.iit.edu");
		map.put("Jaise", "j.jaise1@gmail.com");
		map.put("Nipul", "nipulguru.patel@gmail.com");
		map.put("Anusha", "r.anusharao@gmail.com");
		map.put("Venkatesh", "sb1992v@gmail.com");
		map.put("Sooraj", "soorajkdas@gmail.com");
		map.put("Sharanya", "sharanya.s215@gmail.com");
		
		for(Entry<String, String> entry : map.entrySet()){
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Name: " + key + " | Email: " + value);
		}
		
	}

}
