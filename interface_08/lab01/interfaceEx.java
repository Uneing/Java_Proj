package interface_08.lab01;

public class interfaceEx {

	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLog();
		phone.cendCall();
		phone.receiveCall();
		phone.flash(); //SamsungPhone에만 존재하는 메소드
		
		System.out.println("============");
		
		//인터페이스는 객체 생성X
//		Phone ph = new Phone();
		Phone ph = new SamsungPhone(); //타입변환 가능(업캐스팅)
		ph.printLog(); //default 메소드
		ph.cendCall(); 
		ph.receiveCall();
		SamsungPhone ss = (SamsungPhone)ph; //다운 캐스팅
		ss.flash(); 
	}

}
