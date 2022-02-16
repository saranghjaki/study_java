package ch5;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		다차원 배열
//		2 * n : (행 * 열) : 가로 * 세로
		
//		{99,88}
//		{77,66}
//		{55,44}
		// 3개 2개
		
		//데이터가 정해져있을때
		int[][] scores = {{99,88},{77,66},{55,44}};
		//데이터 사이즈만 정해져있을때
//		int[][] scores2 = new int[3][2];
		//데이터
//		int[][]score3 = new int[3][];
//		score3[0] = new int[2];
//		score3[1] = new int[2];
//		score3[2] = new int[2];
		
	//	System.out.println("scores.length:"+scores.length);
		//전체사이즈
		//중가로속의 갯수
		scores[2][1] =100;
		System.out.println(scores[2][1]);
		for(int i=0; i<scores.length; i++) {
		
//			System.out.println("scores[i].length:"+scores[i].length);
			
			for(int j=0; j<scores[i].length; j++) {
				
				System.out.println("score+[" +i+ "][" +j+ "]" +scores[i][j]);
				
			}
		
		}
	}

}
