
public class SwichStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String position ="과장";
	
		switch(position){
			case "사원":
				System.out.println("월급 300만원");
				break;
			case "대리":
				System.out.println("월급 400만원");
				break;
			case "과장":
				System.out.println("월급 500만원");
				break;
			case "부장":
				System.out.println("월급 600만원");
				break;
			default :
				System.out.println("기분급적용");
				break;
		}
	}

}
