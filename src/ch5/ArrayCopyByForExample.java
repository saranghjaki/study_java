package ch5;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,2,3};
		int[] arr2 = new int[5];
		
		//arr1 3개였는데 5개로 늘어서 arr2를 만들어 값을 넣어야함
		
		for(int i=0; i< arr1.length; i++) {
			arr2[i] = arr1[i];
		}
	
			arr2[3] = 5;
			arr2[4] = 4;
			
			for(int i =0; i<arr2.length; i++)
				System.out.println(arr2[i]);
	}
}
