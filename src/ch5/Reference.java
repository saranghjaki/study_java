package ch5;

public class Reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 // 변수
// 1.기본(원시)
// 2.참조
//		2.1 배열
//		2.2 열거
//		2.3 클래스(String)
//		2.4 인터페이스

// 참조 : 냄비안에 데이터가 있는 것이 아니라 데이터가 저장되어있는 주소를 넣는다		
// 참조형도 초기화 null
// NullPointExcetion : npe
// 사용(대입,호출(접근))이 불가
//		str.equals() //이때 str이 null이면 오류
//		==, != 과 같은 관계 연산자는 사용 할 수 있다.
	
		
//		String: 문자열 저장을 위한 객체
		String str1= null;
		String str2= "";
		String str3;  //null로 초기화되어있음
		
		if(str1 == str2) { //주소값 비교
			
		}
		str1.equals(str2); // 문자열비고
	
//		배열 :동일 데이터의 집합
//		ex)1학년 2반 학생들의 수학 성적
//     (15명) 78 44 90 97 100 ... 88(15개)
//		int mathScore010201 = 78;
//		int mathScore010202 = 88;
//		int mathScore010203 = 90;
//		이런 정보를 다 묶어보림
		
//영어 성적		int mathScore0102 = {78,44,90,97,...,100};
//영어 수학		int mathScore0102 = {78,78},{44,90},{50,9},...,{100,50}};
//		
//			선언
	}

}
