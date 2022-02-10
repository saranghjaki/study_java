package ch4.copy;

public class promotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//작은형이 큰형으로 변환은 문제가 발생하지 않는다
		//하지만 큰형이 작은형으로 변환이 되려면 문제가 생긴다
		//byte < short < int < long
		//float< double
		
		byte byteValue =10;
		System.out.println("byteValue:"+byteValue);
		
		int intValue =byteValue; //int<- byte
		System.out.println("intValue:"+intValue);
		
		char charValue ='가';
		System.out.println("charValue:"+charValue);
		
		intValue =charValue ; //int <-char
		System.out.println("가의 유니코드 =" +intValue);
		
		intValue =500;
		long longValue =intValue; //long <- int
		System.out.println("longValue:"+longValue);
		
		intValue =200;
		double doubleValue =intValue; //double <- int
		float floatValue = intValue; //float <- int
		System.out.println("doubleValue:"+doubleValue);
		System.out.println("floatValue:"+floatValue);
		
		
	}

}
