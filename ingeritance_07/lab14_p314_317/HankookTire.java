package ingeritance_07.lab14_p314_317;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) { //펑크가 안 났을때 true 리턴
			System.out.println(location + " HankookTire 수명 : " +
		(maxRotation-accumulatedRotation) + "회");
			return true;
		} else {// 펑크가 났을때
			System.out.println("***" + location + "HankookTire 펑크 ***");
			return false;
		}
	}
}
