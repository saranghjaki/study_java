package ch5;

import java.util.Calendar;

public class EnumMethodExample { //class
//클래스 안에는 함수. funtion (함수의 시작을 알리는 곳 아래)
	
//	함수 = 기능
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Week abc = Week.MONDAY;
//		Week def = Week.SUNDAY;
//		
//		System.out.println(abc);
//		System.out.println(def);
		
		Week today = null;
		//캘린더라는 객체 호출 현재 날짜 시스템 호출(문법)
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (week) {
		
			case 1:
				today =Week.SUNDAY; break;
			case 2:
				today =Week.MONDAY; break;
			case 3:
				today =Week.TUESDAY; break;
			case 4:
				today =Week.WEDNESDAY; break;
			case 5:
				today =Week.THURSDAY; break;
			case 6:
				today =Week.FRIDAY; break;
			case 7:
				today =Week.SATURDAY; break;
		}
		System.out.println("오늘 요일"+today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 놉니다");
			
		}else {
			System.out.println("열심히 자바합니다");
		}
	}

	public void abc() {}
}


