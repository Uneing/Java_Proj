package object06.cooperation;

public class Bus {
	int busnumber; //버스 번호
	int passengercount; //승객수
	int money; //수입
	
	public Bus (int busnumber) {
		this.busnumber = busnumber;
	}
	
	public void take (int money) { // 버스의 수입 및 승객수를 처리하는 메소드
		this.money += money;   //this.money = this.money + money
							   // 기존의 버스 수입에서 머니를 추가해서 다시 메모리에 저장
		passengercount++;  //승객 수를 증가
	}
	public void showinfo () {
		System.out.println(busnumber + "  " + passengercount + "  " + money);
	}
	
	
	
	

	
}
