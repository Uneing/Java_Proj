package generic_12.restrict;

public class Plastic extends Material{

	@Override
	public void doPrinting() {
		System.out.println("플라스틱 재료로 프린팅 합니다.");
	}
	public String toString() {
		return "재료는 플라스틱입니다.";
	}

}
