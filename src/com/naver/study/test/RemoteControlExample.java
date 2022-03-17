package com.naver.study.test;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl tv =new Television(); 
		
		tv.turnOn();
		tv.setMute(true);
		tv.setMute(false);
		tv.setVolume(100);
		RemoteControl.changeBattery();
		tv.turnOff();
		
		System.out.println();
		
		tv.turnOn();
		tv.setMute(true);
		tv.setMute(false);
		tv.setVolume(-10);
		RemoteControl.changeBattery();
		tv.turnOff();
	
	
	}

}
