package ch06;

public class Earth {
	static final double EARTH_RADIUS =1.0;
	static final double EARTH_SURFACE_AREA ;

	static {
		EARTH_SURFACE_AREA = 4*Math.PI+EARTH_RADIUS*EARTH_RADIUS;
	}
	
	
	static final String HOME_URL ="www.11st.co.kr/first";
	//자주쓰이는 것은 상수화
}
