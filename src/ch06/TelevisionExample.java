package ch06;

public class TelevisionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//static도 함수선언가능하다 그러나 사용은 잘 안함 
		Television televison = new Television();
		System.out.println("Television.company: "+Television.company);
		System.out.println("Television.model: "+Television.model);
		System.out.println("Televisioninfo: "+Television.info);
		System.out.println("Televisionaaa: "+televison.a);
	//	System.out.println("Televisionaaa: "+Television.a);
	}

}
