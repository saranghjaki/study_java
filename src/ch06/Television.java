package ch06;

public class Television {

	public static String company = "samsung";
	public static String model = "OLED";
	public static String info; //INFO 조합을원할때 static
	
	//static 으로 선언안된 함수는 들어갈수었음
	String a ="aaa";
	 static {
		 info = company + ""+model;
	 }
}
