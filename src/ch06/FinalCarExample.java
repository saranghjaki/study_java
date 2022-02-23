package ch06;

public class FinalCarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalCar finalCar =new FinalCar();
		
		//잘못된 속도변경
		finalCar.setSpeed(-50);
		System.out.println("현재속도:"+finalCar.getSpeed());
		//올바른 속도변경
		finalCar.setSpeed(60);
		
		//멈춤
		if(!finalCar.isStop()) {
			finalCar.setStop(true);
		}
		System.out.println("현재속도:"+finalCar.getSpeed());
	}

}
