package com.naver.study.ch13;

public class BoxingMethodExample {

	public static void main(String[] args) {
		
		Box<Integer> box = Util.<Integer>boxing(100);
		int ttInt = box.get();
		System.out.println("ttInt"+ttInt);
		
		Box<String> box2 = Util.<String>boxing("수랑");
		String ttInt2 = box2.get();
		System.out.println("ttInt2"+ttInt2);
		
	}

}
