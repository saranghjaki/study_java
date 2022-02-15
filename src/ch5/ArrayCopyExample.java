package ch5;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3};
		int[] arr2 = new int[5];
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println();
		System.arraycopy(arr1,0, arr2,1, arr1.length);
//	카피를 할 객체 / 카피를 받을 객체/ 몇개를 
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
	

}
