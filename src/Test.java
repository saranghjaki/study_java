
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;	int sum2=0;	
		for(int i=1; i<=9;  i++ ) {
			
		for(int j=2; j<=9;  j++ ) {
			
		 if(i%2==0) {
				sum += (i*j);
		} else {
				sum2 += (i*j);
				
		}	
	    }
		
		
	  }
		System.out.println(sum);
		System.out.println(sum2);
	}
}
	
	

	

