package ch4.copy;

public class StringConcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 ="JDK "+ 1.8;
		String str2 =str1 +"입니다";
		
		System.out.println("str2:" + str2);
		
		String strA ="수랑:";
		String strB = "010123456";
		String strC =strA + strB;
		
//		이름 : 전화번호
		
		System.out.println("strC: "+strC);
//				
	}

}
