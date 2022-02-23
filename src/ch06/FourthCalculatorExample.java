package ch06;

public class FourthCalculatorExample {

	public static void main(String[] args) {
	
		//FourthCalculator Calculator = new FourthCalculator();
		//static 객체 생성없이 접근가능하다!
		//단 클래스는 불가 클래스 내에만 가능 클래명.함수명
		double result1 = 10* 10 *FourthCalculator.pi;
		int result2 =FourthCalculator.plus(10,5);
		int result3 =FourthCalculator.minus(10,5);
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
	}

}
