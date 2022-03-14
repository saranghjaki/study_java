package com.naver.study.ch13;

public class ItemExample {

	public static void main(String[] args) {
	 Product<Car,Integer>product = new Product<>();
	
	 product.setKind(new Car());
	 product.setModel(450);
	}

}
