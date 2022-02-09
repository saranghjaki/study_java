package com.naver.study;

public class SignOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = -100;
		
		int result1 = +x; // + 부호 그대로 유지
		
		int result2 = -x; // - 부호변경
		
		System.out.println("result1="+result1);
		System.out.println("result2="+result2);
		
		short s = 100;
		//short result3 =  -s; //컴파일러 익셉션
		
		int result3= -s;
		System.out.println("result3="+result3);
	}

}
