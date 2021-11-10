package generic_12.restrict;

public class Water extends Material{

	public String toString() {
		return "재료는 물입니다";
	}
	@Override
	public void doPrinting() {
		System.out.println("물로 프린트 합니다.");		
	}

}
