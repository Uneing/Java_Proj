package ingeritance_07.lab14_p314_317;

public class Tire {
	public int maxRotation;	//최대 회전수(최대 수명)
	public int accumulatedRotation;	//누적 회전수
	public String location;	//타이어의 위치
	
	public Tire(String location, int maxRotation) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	public boolean roll() {	//차의 1번 운행
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {	//펑크가 안 났을 떄
			System.out.println(location + "Tire 수명 : " + 
		(maxRotation-accumulatedRotation) + "회");
			return true;
		}else { //펑크가 났을 떄
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}
	}
}
