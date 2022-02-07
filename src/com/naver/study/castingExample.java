package com.naver.study;

public class castingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//강제형변환 :casting (원하는형)변수명
		
		int intValue = 44032;
		//short shortValue = 1;
		char charValue = (char)intValue;
		System.out.println("chatValue:"+charValue);
		
		long longValue =500;
		intValue =(int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue =(int) doubleValue;
	//	shortValue =(short)doubleValue;
		
		System.out.println(intValue);
		
		

}
}
