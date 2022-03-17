package com.naver.study.ch15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		// MAP 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		// 객체저장
		map.put("신우진",85);
		map.put("허수랑",80);
		map.put("허영수",90);
		map.put("신우디",95);
		System.out.println("총 Entry수:"+ map.size());
		
		//객체찾기
		System.out.println("\t허수랑:"+ map.get("허수랑"));
		System.out.println();
		
		//객체를 하나씩처리
		Set<String> keySet  = map.keySet();
		Iterator<String> keyIterator =keySet.iterator();
		while(keyIterator.hasNext()) {
		String key =keyIterator.next();
		Integer value = map.get(key);
		System.out.println("\t"+key+":"+value);
		
		}
		System.out.println();
		
		//객체삭제
		map.remove("신우디");
		System.out.println("총 Entry수:"+ map.size());
		
	}

}
