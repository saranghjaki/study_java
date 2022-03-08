package com.naver.study.ch08;

public class Example {

	public static void main(String[] args) {
		 InterFaceA  interFaceA =new ImplementationC();
		 InterFaceB  interFaceB =new ImplementationC();
		 InterFaceC  interFaceC =new ImplementationC();
		 
		 interFaceA.methodA();
		 interFaceC.methodA();
		 interFaceB.methodB();
		 interFaceC.methodC();

	}

}
