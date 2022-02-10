package ch4.copy;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		단순대입
//
		int result =0;
//		result += 10;
		result = result + 10;
		System.out.println("result:"+result);//10
		
		result -=5;
		System.out.println("result:"+result);//5

		result *= 3;
		System.out.println("result:"+result);//15
		
		result /= 5;
		System.out.println("result:"+result);//3
		
		result %= 3;
		System.out.println("result:"+result);//0
		
	}

}
