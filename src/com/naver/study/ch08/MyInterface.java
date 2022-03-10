package com.naver.study.ch08;

public interface MyInterface {
	void method();  //public abstract 추상메서드생략
	//void merthod2();	
	//새로운 기능을 인터페이스에 추가하면 추상메서드는 자식클래스에서 오버라이드 강제적으로 해야함
	
	//하지만 디폴트메서드는 강제로 추가 할 필요없다 하지만 오버라이드는 가능
	//디폴트는 강제성이 낮고 오류가능성이 낮음
	//공통성이 있는거는 구현객체에 적는게 아니라 여기에 디폴트로 선언해 바로 찾아 갈 수 있게한다.
	default void method2() {
		System.out.println(" MyInterface-method1실행");
	}-`
}
