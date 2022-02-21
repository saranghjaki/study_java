package ch06;

public class SecondCarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SecondCar secondCar =new SecondCar();
		
		System.out.println("SecondCar.company"+secondCar.company);
		System.out. println("SecondCar.model"+secondCar.model);
		System.out .println("SecondCar.maxSpeed"+secondCar.maxSpeed);
	
		secondCar.model ="미니카";
		secondCar.maxSpeed =500;
		
		System.out.println("SecondCar.company"+secondCar.company);
		System.out. println("SecondCar.model"+secondCar.model);
		System.out .println("SecondCar.maxSpeed"+secondCar.maxSpeed);
		
		SecondCar secondCar1 =new SecondCar("빠른카");
		System.out.println("-------------------");
		System.out.println("SecondCar1.company"+secondCar1.company);
		System.out. println("SecondCar1.model"+secondCar1.model);
		System.out .println("SecondCar1.maxSpeed"+secondCar1.maxSpeed);
		
		SecondCar secondCar2 =new SecondCar("왕빠른카","red");
		System.out.println("-------------------");
		System.out.println("SecondCar2.company"+secondCar2.company);
		System.out. println("SecondCar2.model"+secondCar2.model);
		System.out .println("SecondCar2.maxSpeed"+secondCar2.maxSpeed);
		
		SecondCar secondCar3 =new SecondCar("왕왕빠른카","blue",700);
		System.out.println("-------------------");
		System.out.println("SecondCar2.company"+secondCar2.company);
		System.out. println("SecondCar2.model"+secondCar2.model);
		System.out .println("SecondCar2.maxSpeed"+secondCar2.maxSpeed);
		
		
	}

}
