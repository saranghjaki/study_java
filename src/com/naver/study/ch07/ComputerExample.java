package com.naver.study.ch07;
//실핼클래스
public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r= 10;
		
		Calculator  calculator = new Calculator();
		
		System.out.println("원면적: "+calculator.areaCircle(2));
						
		Computer computer = new Computer();
		
		System.out.println("원면적: "+ computer.areaCircle(2));
	}

}
