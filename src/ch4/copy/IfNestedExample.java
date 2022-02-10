package ch4.copy;

public class IfNestedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 60;
		String grade="";
		if(score>=90) {
			if(score>=95) {
			 grade ="A+";
			} else {
				grade ="A";
			}
		}
		if(score>=80) {
			if(score>=85) {
				grade ="B+";
			} else {
				grade ="B";
			}
		}
		if(score>=70) {
			if(score>=75) {
				grade ="C+";
			} else {
				grade ="C";
			}
		}
		if(score>=60) {
			if(score>=65) {
				grade ="D+";
			} else {
				grade ="D";
			}
		}
		if(score>=50) {
			if(score>=50) {
				grade ="F";
			} else {
				grade ="F";
			}
		}

		System.out.println("학점은 :"+grade);
	}
	}


