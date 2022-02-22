package ch06;

public class ThirdCar {
// 필드
	 String company ="현대자동차";
	 String color;
	 String model;
	 int maxspeed;
	 
//	 생성자
	 ThirdCar(){
		 
	 }
		
	 ThirdCar( String model){
		 this(model,null,0);
	 }
	 ThirdCar( String model,String color){
		 this(model,color,0);
	 }
	 ThirdCar( String model,String color,int maxspeed){
		 this.model =model;
		 this.color =color;
		 this.maxspeed =maxspeed;
		
	 }
	 
	
}