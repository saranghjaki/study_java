package ch5;

public class ArrayLengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] score = {83,90,87,99};
		
		 int sum = 0;
		//score.length 배열의 사이즈 
		 System.out.println("score.length: "+score.length);
		 
		for(int i=0; i<score.length; i++ ) {
		sum += score[i];
	}
		System.out.println("총합은: "+sum);

		 }

}
