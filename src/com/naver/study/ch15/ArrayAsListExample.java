package com.naver.study.ch15;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("허영수","신우진","우디");
			for(String name: list1) {
				System.out.println(name);
			}
			List<Integer> list2 = Arrays.asList(1,2,3);
			for(int value: list2) {
				System.out.println( value);
			}

	}

}
