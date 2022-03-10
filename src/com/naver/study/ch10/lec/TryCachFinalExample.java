package com.naver.study.ch10.lec;

public class TryCachFinalExample {

	public static void main(String[] args)  {
		
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("클래스가 존재하지 않습니다");
			//e.printStackTrace();
//		}finally {
//			System.out.println("d");
		}
	}
//	public static void main(String[] args) throws Throwable  {
//		Class clazz = Class.forName("java.lang.String2");
	
public static void main1(String[] args) throws ClassNotFoundException  {
	Class clazz = Class.forName("java.lang.String2");

}
}
