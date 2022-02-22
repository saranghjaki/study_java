package ch06;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calculator = new Calculator();
		
		calculator.poweron(); //함수 (필드아님) Calculator에 있어야함

		int result1 = calculator.plus(5,6); //함수
		System.out.println("result1"+result1);
		
		byte x =10;
		byte y =4;
		double result2 = calculator.divide(x,y);
		System.out.println("result2"+result2);
		
		calculator.poweroff();
	}

}
