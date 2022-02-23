package ch06;

public class SeventhCarExample {

		 int speed= 0;
		 void run() {
			System.out.println(speed +"으로달립니다");
		}
	public static void main(String[] args) {
		
	//	speed = 10; //상단에 static을 사용해야함
	//	run(); //static내에 함수를 사용하는법 객체생성
		SeventhCarExample seventhCar = new SeventhCarExample();
		seventhCar.speed =10;
		seventhCar.run();
			
	}

}
