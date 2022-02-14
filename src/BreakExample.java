
public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			int num =(int) ((Math.random() *100) + 1 );
			System.out.println(num);
			if(num == 1) {
				break;
			}
		}
		System.out.println("peocess ended!");
	}
	
}
