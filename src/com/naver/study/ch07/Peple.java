package com.naver.study.ch07;

public class Peple {
	
	public String name;
	public String ssn;
	
	public Peple( String name, String ssn) {
		this. name =name;
		this. ssn =ssn;
		//부모에 생성자가 존재하면 자식 클래스에도 부모 생성자를 만들어줘야한다
		// 	super(name, ssn);
	}

}
