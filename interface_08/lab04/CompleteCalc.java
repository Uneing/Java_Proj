package interface_08.lab04;

public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0){	//모든 언어에서 0으로 나누면 계산을 못한다.
			return num1/num2;
		}
		else {
			return CompleteCalc.ERROR;
		}
	}
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현함.");
	}
	@Override
	public void description() {
		super.description(); //부모클래스의 메소드를 호출
	}

}
