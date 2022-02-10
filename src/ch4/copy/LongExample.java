package ch4.copy;

public class LongExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long var1 =10;
		long var2 =20;
	//	long var3 =10000000000;  //컴파일러에러 int 범위 벗어나면 L을 붙여야함
		long var4 =10000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
