package ch5;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//갯수만 우선 정하고 데이터는 나중에 채워넣자
		String[] strArray = new String[3];
		
			strArray[0] = "신우진";
			strArray[1] = "신우진";
			strArray[2] = new String("신우진");
			
			for(int i=0; i<strArray.length; i++) {
			
			System.out.println(strArray[i]);
			}
			System.out.println(strArray[0]==strArray[1]);
			System.out.println(strArray[0]==strArray[2]);
			
			System.out.println(strArray[0].equals(strArray[1]));
			System.out.println(strArray[0].equals(strArray[2]));
		
			
			
	
	}

}
