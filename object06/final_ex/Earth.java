package object06.final_ex;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;

	static {	//static 상수의 표면적 초기화
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
			//final 키가 들어가 있는 상수는  초기값이 반드시 할당
			// 상수 이름은 대문자, 변수 이름은 소문자
	}
	// static final : 모든 객체에서 참조할 경우 객체 내부에 상수를 로드하지 않고
	//               stack 영역에 저장해서 모든 객체들이 공유해서 사용하도록 설정
}
