package com.naver.study.ch15;

import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) {
		Properties properties = new Properties ();
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path,"utf-8");
		Properties.load(new FileReader())

	}

}
