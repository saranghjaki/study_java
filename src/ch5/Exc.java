package ch5;

public class Exc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] y = {1,2,3,4,5,6,7,8,9};
		int[] x = {2,3,4,5,6,7,8,9};
		int result =0;
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<y.length; j++) {
			 result = x[i]* y[j];
			//	System.out.print(x[i]+"*"+y[j]+"="+result+"\t");		
				System.out.println(x[i]);		
				
			}
			System.out.println();
		}
		
	
	
		
	}

}
