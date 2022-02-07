package com.naver.study;

public class cheakValueBeforeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =300;
		System.out.println("Byte.MIN_VALUE:"+Byte.MIN_VALUE); //상수
		System.out.println("Byte.MAX_VALUE:"+Byte.MAX_VALUE); //상수

		System.out.println("Short.MIN_VALUE:"+Short.MIN_VALUE); //상수
		System.out.println("Short.MAX_VALUE:"+Short.MAX_VALUE); //상수
		
		
		System.out.println("Integer.MIN_VALUE:"+Integer.MIN_VALUE); //상수
		System.out.println("Integer.MAX_VALUE:"+Integer.MAX_VALUE); //상수
		
		System.out.println("Long.MIN_VALUE:"+Long.MIN_VALUE); //상수
		System.out.println("Long.MAX_VALUE:"+Long.MAX_VALUE); //상수

		System.out.println("Float.MIN_VALUE:"+Float.MIN_VALUE); //상수
		System.out.println("Float.MAX_VALUE:"+Float.MAX_VALUE); //상수
		
		System.out.println("Double.MIN_VALUE:"+Double.MIN_VALUE); //상수
		System.out.println("Double.MAX_VALUE:"+Double.MAX_VALUE); //상수
	
		if((i<Byte.MIN_VALUE)||(i>Byte.MAX_VALUE)) {
			System.out.println("byte타입으로 변환할수 없습니다");
			System.out.println("값을 다시 확인해 주세요");
		}else {
			byte b = (byte)i;
			System.out.println(b);
			System.out.println("정상적으로 캐스팅 되었습니다");
			}
		}
		
		}
