package ch4.copy;

public class IfNestedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int score = 50;
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
		
				grade ="D";
		
		}
		else {
			grade ="F";
			}
		

	System.out.println("학점은 :"+grade);
*/
		short x =2;
		short y =-2;
		String ss ="";
		//(-1000<=x<=1000; x!=0)
		if ((x>0) && (y>0)) {
			ss="A";
			
		}else if ((x<0) && (y>0)) {
			ss="B";
			
		}else if ((x<0) && (y<0)) {
			ss="C";
					}
		else {
		ss="D";
		}
		
		System.out.println(ss+"("+x +y+")");
		
	}
 }




