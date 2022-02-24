package com.naver.study.ch07;

public class DmbCallPhone extends CallPhone  {
//자식 
	//필드
	int channel;
	
//	생성자 (명시적 생성자)
	DmbCallPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel= channel;
	}
	//메소드 
	void turnOnDmB() {
		System.out.println("채널"+channel+"번 DMB방송 수신을 시작합니다");
	}
	void changeChannelDmb(int channel) {
		this.channel =channel;
		System.out.println("채널"+channel+"번으로 바꿉니다");
	}
	void turnOffDmb() {
		
		System.out.println("DMB수신을 멈춥니다");
	}
	
	
}
