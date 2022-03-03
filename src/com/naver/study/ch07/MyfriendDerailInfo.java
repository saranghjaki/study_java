package com.naver.study.ch07;

public class MyfriendDerailInfo extends MyfriendInfo {

	private String adderss ="";
	private String phone ="";
	
	public void printAdderss() {
		System.out.println(adderss);
	}
	public void printphone() {
		System.out.println(phone);
	}
		public String getAdderss() {
			return adderss;
		}
		public void setAdderss(String setstrAdderss) {
			this.adderss = adderss;
		}
		
		public String getPhone() {
			return adderss;
		}
		public void setPhone(String setPhone) {
			this.phone = phone;
		}
		
}
