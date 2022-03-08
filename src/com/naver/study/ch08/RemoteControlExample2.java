package com.naver.study.ch08;

public class RemoteControlExample2 {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			//익명구현케이스
			@Override
			public void turnOn() {
				System.out.println("zz");
				
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
		
						
		};
//콜론찍기!
		rc.turnOn();
	}

}
