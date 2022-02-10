package com.naver.study;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 ="허영수";
		String str2 ="허영수";
		String str3 = new String("허영수");
		
	//	int a = 1; -> 메모리차지
		
		boolean result1 = (str1 == str2);
		System.out.println("result1"+ result1);

		boolean result2 = (str1 == str3);
		System.out.println("result2"+ result2);
	
		System.out.println("str1.equals(str2):"+str1.equals(str2));
		System.out.println("str1.equals(str3):"+str1.equals(str3));
	}

}

// 문자 객체 비교때는 .equals 를 사용해야함