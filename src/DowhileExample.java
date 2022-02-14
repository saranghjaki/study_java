import java.util.Scanner;

public class DowhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//프로그램출력
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종류하려면 q를 입력하세요");
		
		
		//객체생성 스캐너라는 변수를 만들기 인푸스트링 변수만듦
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		//do는 일단 실행 > 
		// 콘솔에 누르면 읽음 읽은값을 출력
		//니가 읽은 값이 q가 아니면 계속 돌고 맞으면 빠져나옴
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while(!inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램종료");
	}

}
