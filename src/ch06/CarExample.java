package ch06;

public class CarExample {

	public static void main(String[] args) {
		
//		객체접근연사자(.)를 이용하여 car 객체 변수의 값을 참조
		Car1 car = new Car1();
		System.out.println("Speed:"+car.Speed);
		System.out.println("model:"+car.model);
		System.out.println("color:"+car.color);
		System.out.println("company:"+car.company);
		System.out.println("maxSpead:"+car.maxSpeed);
		upDown(car.Speed,car.maxSpeed);
		car.Speed = 500;
	//	System.out.println("Speed:"+car.Speed);
	}
		public static void upDown(int Speed,int maxSpeed) {
		if(Speed<maxSpeed) {
			System.out.println("speed가 maxSpeed 보다 낮습니다");
			System.out.println("Speed:"+Speed );
			System.out.println("maxSpead:"+maxSpeed);
		}else {
			System.out.println("speed가 maxSpeed 보다 높습니다");
			System.out.println("Speed:"+Speed );
			System.out.println("maxSpead:"+maxSpeed);
		}
		
	}

}
