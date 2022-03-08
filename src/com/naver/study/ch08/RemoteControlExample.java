package com.naver.study.ch08;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audio audio = new Audio();
		Television television = new Television();
		//오류는 안나지만 사용안함 왜냐면 인터페이스 쓰는 의미가 없어서
		//인터페이스를 구현한 클래스는 위에 처럼 일반 클래스 객체 만들듯이 하면 안된다
		audio.turnOn();
		audio.turnOff();
		
//		인터페이스를 구현한 클래스를 사용해야 된다 할때는,
	//	RemoteControl remoteCotrol; //인터페이스 변수선언
		//remoteControl = new Audio();//구현객체로 초기화
		
		RemoteControl remoteCotrol =new Television(); //같은거임
		 remoteCotrol.turnOn();
		 remoteCotrol.turnOff();
		 
	//	 RemoteControl remoteCotrol2 =new Television();
	//	 remoteCotrol2.turnOn();
		 
	}

}
