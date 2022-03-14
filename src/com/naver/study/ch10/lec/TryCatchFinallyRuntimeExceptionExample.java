package com.naver.study.ch10.lec;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		
		String data1 = null;
		String data2 = null;
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		int result = value1 +value2;
		System.out.println(data1+ "+"+ data2 + "="+ result);
		//	System.out.println(asgs[0]);
		try {
		data1 = args[0];
		data2 = args[1];
		}catch(ArrayIndexOutOfBoundsException e) {		
			System.out.println("실행 매개값의수가부족합니다");
			System.out.println("[실행방법]");
			System.out.println("javaTryCatchFinallyRuntimeExceptionExample num1 num2");

			
			return;
		}
		try {	
		int	value1 = Integer.parseInt(data1); //data1은 String 1 이라서 강제 캐스팅이 필요
		int	value2 = Integer.parseInt(data2);
		int result = value1 + value2;
		
		System.out.println(data1+ "+"+data1+"="+result);
		}catch(NumberFormatException e) {
		System.out.println("숫자로 변환할수없습니다");
		}finally {
			System.out.println("다시 시도해 주십시오");
		}
	}
		
	}
	

