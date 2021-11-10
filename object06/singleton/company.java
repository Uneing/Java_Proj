package object06.singleton;

public class company { //싱클톤 : 클래스에서 단 하나의 객체만 생성하도록 구현한 디자인 패턴
	
	private static company instance = new company();
		//객체 생성을 Heap 영역이 아니라 stack 영역에 저장
		//싱글톤 객체는 private static으로 클래스 내부에서 선언, 생성 
	private company() {}   //기본 생성자를 private
						   //외부 클래스에서 생성자를 호출을 못하도록 설정
	public static company getInstance() {//외부에서 객체 생성 할 때,
		if(instance == null) {	//객체가 생성되도록 [리턴]설정
			instance = new company(); //메소드는 static으로 설정되어야
									 //외부에서 객체 생성없이 클래스 이름 호출
		}
		return instance;
	}
}
