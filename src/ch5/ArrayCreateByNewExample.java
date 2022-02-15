package ch5;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] score = {83,90,87,99}; //들어가는 수치를 정확히알때 사용
		
		int[]arr1 =new int[3]; //수치를 모를때 요방법
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1["+ i+"]"+arr1[i]);
		}
		
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		
	
		for(int i=0; i<3; i++) {
			System.out.println("arr1["+ i+"]"+arr1[i]);
	}
		
		arr1[0] = 11;
		arr1[1] = 22;
		arr1[2] = 33;
		//데이터는 또 들어갈수있음!!
	
		for(int i=0; i<3; i++) {
			System.out.println("arr1["+ i+"]"+arr1[i]);
	}
		
		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr2["+ i+"]"+arr2[i]);
		}
		arr2[0]= 1.0;
		arr2[1]= 2.0;
		arr2[2]= 3.0;
	
		for(int i=0; i<3; i++) {
			System.out.println("arr2["+ i+"]"+arr2[i]);
		}
	
		String[]arr3 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr3["+ i+"]"+arr3[i]);
		}
		arr3[0]= "전지현";
		arr3[1]= "징덩간";
		arr3[2]= "김또깡";
		for(int i=0; i<3; i++) {
			System.out.println("arr3["+ i+"]"+arr3[i]);
		}

	}
}
