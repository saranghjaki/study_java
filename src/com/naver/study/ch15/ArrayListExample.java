package com.naver.study.ch15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main (String[]args) {
		List<String> list = new ArrayList<String>(); 
		//인터페이스  = 구현클래스 List 가 ArrayList 받아서 사용
//		List list =new List(); 기존방식
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/Jsp");
		list.add(2,"Database");
		list.add("iBATIS");
		
		int size =list.size();
		System.out.println("총객체수:"+ size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2:"+ skill);
		System.out.println();
		 
		for(int i=0; i<list.size(); i++){
		 String str = list.get(i);
		 System.out.println(i+":"+ str);
	}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
	
		for(int i=0; i<list.size(); i++){
		 String str = list.get(i);
		 System.out.println(i+":"+ str);
			} 

	}
	
}
