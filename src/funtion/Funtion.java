package funtion;

public class Funtion {
	

	public static void main(String[] args) {
		//함수의 사용
		add(3,4);
		println(add(3, 4));
//		int sum = add (3,4);
//		int sum1 = div(3,4);
//		int sum2 = div2(3,4);
//		int sum3 = mul(3,4);
//		int sum4 = sub(3,4);
//		
//		System.out.println(sum);
//		System.out.println(sum1);
//		System.out.println(sum2);
//		System.out.println(sum3);
//		System.out.println(sum4);
//	
	}
//		public 리턴자료형 메소드명 (입력자료형1 입력변수1 입력자료형2 입력변수....)
//		...
//		return 리턴값; //리턴자료형이 void 인 경우 return 문이 필요없다
			
	
//	함수 선언
	public static int add (int a , int b) {
		
		int result = a+ b;
		return result;
	}
	public static int sub (int a , int b) {
		
		int  result  = a- b;
		return  a- b; ;
	}
	public static int mul (int a , int b) {
		
		int result = a+ b;
		return result;
	}
	public static int div(int a , int b) {
		
		int result = a/ b;
		return result;
	}
	public static int div2 (int a , int b) {
		
		int result= a% b;
		return result;
	}
// - * % / 대한 함수를 선언 후 사용하는 프로그램밍을 완성하시오 	
	
	
	public int abc(int a, int b, String d, boolean e) {
			System.out.println(a);
			return 1;
		}
	public String ddd() {
			
			return "";
		}
		public boolean def() {
			
			return true;
		}
	}


