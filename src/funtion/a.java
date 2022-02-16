package funtion;

public class a {

public static void main(String[] args) {
		
		int result[] = arithmeticOperation(6, 3);
		for(int i = 0; i < result.length; i++)
			System.out.println(result[i]);
	}
public static int[] arithmeticOperation(int a, int b) {
	
	int plus = a + b;
	int minus = a - b;
	int multiply = a * b;
	int divide = a / b;
	int result[] = {plus, minus, multiply, divide};
	
	System.out.println("a + b = " + plus);
	System.out.println("a - b = " + minus);
	System.out.println("a * b = " + multiply);
	System.out.println("a / b = " + divide);
	
	return result;
}

}
