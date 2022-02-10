package com.naver.study;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 50;
		
//		char grade = (score >90 ?'A':'B');
//		char grade = (score >90 ?'A': (score >80 ?'B':'C'));
		
		int sore =50;
		char grade=(score>90? 'A':(score>80?'B':(score>70?'C':(score>60?'D':'E'))));
		
		System.out.println("grade :"+grade);
		
		
	}

}
