package object06.cooperation;

public class Subway { 
	String linenumber;   //호선번호
	int passengercount;  //승객수
	int money;           //지하철 수입
	
	Subway(String linenumber){     //생성자. 초기값으로 호선
		this.linenumber = linenumber;
	}
	void take (int money) { // 지하철의 수입을 처리하는 메소드
		this.money += money;	//this.money = this.money + money
		passengercount++;
	}
	void showinfo() {
		System.out.println(linenumber + "  " + passengercount + "  " + money);
	}
}
