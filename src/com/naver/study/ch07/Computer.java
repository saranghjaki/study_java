package com.naver.study.ch07;
//설계클래스자식
public class Computer extends Calculator{

	@Override //오버라이드한 함수이다
	double areaCircle(double r) {
		
		System.out.println(" computer 객체의 areaCircle 실행");
		
		return Math.PI*r*r;
	}

	
}
