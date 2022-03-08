package com.naver.study.ch08;

public class RemoteControlExample3 {

	public static void main(String[] args) {
		//인터페이스먼저선언2개라서 2번
		RemoteControl remoteControl =new SmartTelervision();
		Searchable searchable =new SmartTelervision();
		
		
		
		remoteControl.turnOff();
		remoteControl.turnOn();
		remoteControl.setVolume(5);
		searchable.serch("ㅎㅎㅎ");
		
	}

}
