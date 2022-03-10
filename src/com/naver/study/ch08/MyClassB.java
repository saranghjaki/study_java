package com.naver.study.ch08;

public class MyClassB implements MyInterface {

	@Override
	public void method() {
		System.out.println(" MyClassB-method1실행");


	}

	@Override
	public void method2() {
		
//		MyInterface.super.merhod2();
		System.out.println(" MyClassB-method2실행");
	}

}
