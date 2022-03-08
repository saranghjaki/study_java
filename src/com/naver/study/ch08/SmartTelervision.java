package com.naver.study.ch08;

public  SmartTelervision implements RemoteControl, Searchable {
	
	private int volume;

	
	public void turnOn() {
		

	
	System.out.println("TV를 켭니다");
}

	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다");
	}

	
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;

		}else {
			this.volume =volume;
		}
		System.out.println("현재 TV불륨"+volume);

	}
	public void serch(String url) {
		System.out.println(url+"을 검색합니다");
	}

}
