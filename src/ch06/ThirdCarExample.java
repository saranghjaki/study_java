package ch06;

public class ThirdCarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThirdCar ThirdCar1 =new ThirdCar();
		System.out.println("ThirdCar.company"+ThirdCar1.company);
	

		ThirdCar ThirdCar2 =new ThirdCar("자가용");
		System.out.println("ThirdCar2.company"+ThirdCar2.company);
		System.out.println("ThirdCar2.model"+ThirdCar2.model);
		
		ThirdCar ThirdCar3 =new ThirdCar("자가용","빨강");
		System.out.println("ThirdCar3.company"+ThirdCar3.company);
		System.out.println("ThirdCar3.model"+ThirdCar3.model);
		System.out.println("ThirdCar3.color"+ThirdCar3.color);
		

		ThirdCar ThirdCar4 =new ThirdCar("택시","검정",200);
		System.out.println("ThirdCar4.company"+ThirdCar4.company);
		System.out.println("ThirdCar4.model"+ThirdCar4.model);
		System.out.println("ThirdCar4.color"+ThirdCar4.color);
		System.out.println("ThirdCar4.maxSpeed"+ThirdCar4.maxspeed);
		
	}

}
