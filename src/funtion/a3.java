package funtion;

public class a3 {

public static void main(String[] args) {
		
//		int result[] = arithmeticOperation(6, 3);
//		for(int i = 0; i < result.length; i++)
//			System.out.println(result[i]);
//		
		for(int i :arithmeticOperation(6,3)) {
			System.out.println(i);
		}
		System.out.println(add("허영수","예쁘당"));
	}
public static int[] arithmeticOperation(int a, int b) {
	
	int plus = a + b;
	int minus = a - b;
	int multiply = a * b;
	int divide = a / b;
	int divide2 = a % b;
	int result[] = {plus, minus, multiply, divide, divide2};
//	
//	System.out.println("a + b = " + plus);
//	System.out.println("a - b = " + minus);
//	System.out.println("a * b = " + multiply);
//	System.out.println("a / b = " + divide);
	
	return result;
}
public static String add(String a, String b) {
	String addd = a + b;
			return addd;	
 }
}

