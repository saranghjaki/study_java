package ch06;

public class CarProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		//int b = 1;
		Car car =new Car(); //Car() 생성자 = 함수이다 new :연산자

		//데이터타입:Car(하나의 함수로봄) 객체변수:car
		Car car2;
		car2 =new Car();
		
		//객체 접근 연산자
	//	car.company;
		
		System.out.println(car.company);
		

		
		car.c = car.Speadup(10);
	}

}
