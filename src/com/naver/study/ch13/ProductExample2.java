package com.naver.study.ch13;

public class ProductExample2 {

	public static void main(String[] args) {
	//	Product prduct = new Product<>();
		 Product<Car,Integer>product = new Product<>();
			
		 product.setKind(new Car());
		 product.setModel(450);
		 
		 Car rtCar = product.getKind();
		 int rtString = product.getModel();
		
		System.out.println(rtCar +":"+ rtString);

		
	}

}
