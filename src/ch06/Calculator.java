package ch06;

public class Calculator {
	public void poweron() {
		System.out.println("전원을 켭니다.");
	}
	
	public int plus(int x, int y) {
		int result =x+ y;
		return result;
	}
	
	public double divide(int x, int y) {
		double result =(double)x+ (double)y;
		return result;
	}
	
	
	public void poweroff() {
		System.out.println("전원을 끕니다.");
	

	}
}