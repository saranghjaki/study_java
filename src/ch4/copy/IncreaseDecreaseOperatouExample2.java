package ch4.copy;

public class IncreaseDecreaseOperatouExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		++ : 1증감
//		-- : 1감소
//		++x; 피 연산자를 1 증가 시키고 다른 연산 수행
//		x++; 다른 연산 수행 후 피연산자 1 증가
// 		다른 연산자가 없으면 앞에 있으나 뒤에 있으나 결과는 똑같다
		
		
		int x = 10;
		int y = 10;
		int a = 0;
		int b = 0;
		
		++x;
		System.out.println(x);

		y++;
		System.out.println(y);
		
		a= ++x;  // x12
				// x12
		
		b= x++; //x12
				//x13
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		
		
	}

}
