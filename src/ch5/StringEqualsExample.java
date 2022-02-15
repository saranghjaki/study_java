package ch5;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 ="신민철";
		String strVar2 ="신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가같음");
			
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
			
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이같음");
			
		}
		
		String strVar3 =new String ("신민철");
		String strVar4 =new String("신민철");
		//new연산자를 이용한 변수 선언
		if(strVar3 == strVar4) { //주소비교
			System.out.println("strVar3과 strVar4는 참조가같음");
			
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
			
		}
		if(strVar3.equals(strVar4)) { //문자열비교
			System.out.println("strVar3과 strVar4는 문자열이같음");
			
		}else {
			System.out.println("strVar3과 strVar4는 문자열이 다름");
		}
	}

}
