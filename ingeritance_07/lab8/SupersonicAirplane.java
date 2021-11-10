package ingeritance_07.lab8;

public class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	@Override 	//어노테이션 , @Override : 메소드 재정의 할 때 오류를 방지하기 위해서 사용
				//메소드 재의의[오버라이딩] : 부모클래스의 데이터 타입, 매개변수 갯수, 순서
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			super.fly();
		}
	}
}
