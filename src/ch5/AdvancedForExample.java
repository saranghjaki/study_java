package ch5;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[]scores = {95,77,84,93,87};
		int a= 0;
		for(int score :scores) { //배열이 있는만큼 돌고 첫번째값을 score로 잡음
			System.out.println(a+":score: "+score);
			a++;
		}
		
//		for(int i=0; i<scores.length; i++) {
//			System.out.println(scores[i]);
//		}
	}

}
