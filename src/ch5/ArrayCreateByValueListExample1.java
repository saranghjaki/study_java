package ch5;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		int[] score; //선언
//
//		int score2[]; //선언
//		
//		int[] score3 = {1,2,3}; //객체 생성
//		//갯수는 처음 만들때 몇개를 만들어도 상관없음
//		int score4[] = {4,5,6}; //객체 생성
//		
//		double[] score6 = {1,2,3,4};
//		
//		String[] strArray = {"허영수","신우진"};
//		데이터 타입이 동일해야함
//		순서는 무조건 0부터 시작한다.index{0,1,2,3}
//		총객수를 원할하게 늘릴수있다

		int[] score = {83,90,87,99};
		double[] score6 = {1,2,3,4};
 		System.out.println("score[0]:" + score[0] );
 		System.out.println("score[1]:" + score[1] );
 		System.out.println("score[2]:" + score[2] );
 		
 		int sum = 0;
 		for(int i=0; i<4; i++) {
 			
 			sum += score6[i];
 			
 		}
 		System.out.println("총합은:"+sum);
 		System.out.println("평균은:"+(double)sum/4);
 		
	}

}
