
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = (int) (Math.random() *(45-1+1)+ 1);
		int num2 = (int) (Math.random() *(45-1+1)+ 1);
		int num3 = (int) (Math.random() *(45-1+1)+ 1);
		int num4 = (int) (Math.random() *(45-1+1)+ 1);
		int num5 = (int) (Math.random() *(45-1+1)+ 1);
		int num6 = (int) (Math.random() *(45-1+1)+ 1);
		
		if(num1==num2 | num1==num3 | num1==num4 | num1==num5 |num1==num6|num2==num3 | num2==num4 | num2==num5 
				|num2==num6|num3==num4 | num3==num5 | num3==num6|num4==num5 | num4==num6) {
			System.out.println("다시 돌려주세요");
			}
		
		else {
			System.out.println("첫번째 숫자는"+num1+"입니다");
			System.out.println("두번째 숫자는"+num2+"입니다");
			System.out.println("세번째 숫자는"+ num3+"입니다");
			System.out.println("네번째 숫자는"+num4+"입니다");
			System.out.println("다섯번째 숫자는"+num5+"입니다");
			System.out.println("여섯번째 숫자는"+ num6+"입니다");
		}
		
//		case
//		break
//		default
//		break
	}

}
