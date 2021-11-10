package interface_08.lab01;

public class SamsungPhone implements Phone{
	//implements : 인터페이스를 구현하는 클래스

	@Override
	public void cendCall() {
		System.out.println("띠리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	public void flash() {	//메소드 추가 작성
		System.out.println("전화기에 불이 켜졌습니다.");
	}

}
