package com.naver.study.ch08;

public class DefayltMethodExample {

	public static void main(String[] args) {
		MyInterface myInterfaceA = new MyClassA();
		myInterfaceA.method();
		myInterfaceA.method2();
		
		
		MyInterface myInterfaceB = new MyClassB();
		myInterfaceB.method();
		myInterfaceB.method2();
	}

}
