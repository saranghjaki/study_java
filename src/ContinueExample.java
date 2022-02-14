
public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			if(i%2 != 0 ) { //홀수면
				continue;
			//continue는 단독으로 사용되지 않는다
		}
		System.out.println(i); 
	}
 }
}
