package com.naver.study;

public class operationsPromotionExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//연산 : + - * /%
		//형이 틀린경우 큰형으로 자동 형변환
			int a =10;
			double b= 10.0;
		//	int c =(a + b);  //Type mismatch: cannot convert from double to intd
			int d =(int)(a + b);
			int e = a +(int) b;
			double f = a + b;
			
			System.out.println("d:"+d);
			System.out.println("e:"+e);
			System.out.println("f:"+f);
			
		
		//정수형 연산(byte int short은 int로 자동 형변환, long은 예외
		
		
	byte byteValue1 = 10;
	byte byteValue2 = 20;
	//byte byteValue3 = byteValue1 + byteValue2; 컴파일에러
		int intValue1 =byteValue1 + byteValue2;
	System.out.println("intValue1:"+intValue1);
	
	//chat은 int와 연산가능
	
	char charValue1 ='A';
	char charValue2 =1;
	//char charValue3 = charValue1 +charValue2;
	int intValue2 = charValue1 + charValue2;
	System.out.println("유니코드="+intValue2);
	System.out.println("출력문자="+(char)intValue2);
	
	int intValue3 = 10;
	int intValue4 = intValue3/4;
	System.out.println(intValue4);
	
	int intValue5 = 10;
	//int intValue6 = 10 /4.0;//컴파일러에러
	double doubleValue = intValue5  / 4.0;
	System.out.println(doubleValue);
	
	long aa =1;
	long bb =2;
	long cc = (aa + bb);
	System.out.println("cc:"+cc);
	
	short aaa =1;
	short bbb=2;
	short ccc =(aaa+ bbb);
	System.out.println("ccc:"+ccc);
	
	}
	
}
