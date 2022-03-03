package com.naver.study.ch07;

public class Java100_oop_Parselnt1 {
	public static void main(String[]args){
		int a = 1;
		int b = 2;
		int c = a + b;
		System.out.println("a+b="+ c);
	
	    String a1 = "1";
	    String b1 = "2";
	    String c1 = a1 + b1;
	    System.out.println("a+b=" + c1);
		System.out.println(c1.getClass().getName());
		
		int a2 = Integer.parseInt(a1);
		int b2 = Integer.parseInt(b1);
		System.out.print(a2 + b2);
		
		
		System.out.println(Integer.parseInt("2022"));
		
	     
		
	}
}
}
