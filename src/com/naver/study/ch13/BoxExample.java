package com.naver.study.ch13;

public class BoxExample {
	public static void main(String[] args) {
//	Box box =new Box(); //기존방식
//	//Box 객체 중에서 한개 즉, 지네릭 타입은 String 으로 된 것 이다.
//	//String t;
//	box.set("박스"); //String 타입이 들어간다
//	String str = box.get();
//	System.out.println("str:"+str);
	
		
	Box<String> box = new Box<String> ();
	box.set("허영수");
	String str = box.get();
	System.out.println("str:"+str);

	Box<Integer> box2 = new Box<Integer> ();
	box2.set(11);
	int number = box2.get();
	System.out.println("number:"+number);
	
	System.out.println();
	
	Box<Double> box3 = new Box<Double> ();
	box3.set(3.12); // set으로 데이터를 받아서
	Double bouble = box3.get(); // get 으로 사용하겠다.
	System.out.println("bouble : "+ bouble);
	
	}
}
