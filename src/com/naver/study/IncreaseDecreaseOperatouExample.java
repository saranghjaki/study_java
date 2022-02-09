package com.naver.study;

public class IncreaseDecreaseOperatouExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y = 10;
		int z;
		
	
		
		System.out.println("----------------");
		x++;  //11
		++x;	//12
		System.out.println("x="+x); //x=12
		
		System.out.println("----------------");
		y--; //9
		--y; //8
		System.out.println("y="+y); //8
		
		System.out.println("----------------");
		z =x++; //12
		System.out.println("Z="+z); //12
		System.out.println("X="+x ); //13
		
		System.out.println("----------------");
		z =++x; //13
		System.out.println("Z="+z); //14
		System.out.println("X="+x ); //14
		
		System.out.println("----------------");
		z= ++x + y++;  //15  //8 =23
		System.out.println("Z="+z);  //23
		System.out.println("X="+x );  //15
		System.out.println("y="+y );  //9
		
		
		
	}

}
