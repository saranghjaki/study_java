
package ch06;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Korean korean =new Korean();
		
		System.out.println("korean.nation"+korean.nation);
		System.out. println("korean.ssn"+korean.ssn);
		System.out .println("korean.name"+korean.name);
		
		korean.name ="허영수";
		korean.ssn="1231564564456";
		System.out.println("-------------------");
		System.out.println("korean.nation"+korean.nation);
		System.out. println("korean.ssn"+korean.ssn);
		System.out .println("korean.name"+korean.name);
		
		Korean korean2 =new Korean("전지현","1231546546465456");
		System.out.println("-------------------");
		System.out.println("korean2.nation"+korean2.nation);
		System.out. println("korean2.ssn"+korean2.ssn);
		System.out .println("korean2.name"+korean2.name);
		
		Korean korean3 =new Korean("김지우","486465461656");
		System.out.println("-------------------");
		System.out.println("korean3.nation"+korean3.nation);
		System.out. println("korean3.ssn"+korean3.ssn);
		System.out .println("korean3.name"+korean3.name);
	
	}

}
