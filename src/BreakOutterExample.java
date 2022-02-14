
public class BreakOutterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//상위를 빠져 나가고 싶을때 상위에 이름을 정해주고 break +이름
		Outter: 
		for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-"+ lower);
					if(upper=='B'|lower=='b') {
						break Outter;
					}
			}
		}
	}

}
