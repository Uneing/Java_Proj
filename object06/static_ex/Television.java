package object06.static_ex;

public class Television {
	static String company = "Samsung"; //static  변수에 초기값 입력
	static String model = "LCD"; //static  변수에 초기값 입력
	static String info; //static  변수에 초기값 할당 되지 않는 상태
		//static 키가 들어가있지 않는 필드는 초기값을 생성자에서 적용
	public Television() {}
	static {	//static 키가 적용된 필드에 초기값을 할달 할 때 사용, 초기화 블록
		info = company + "-" + model;
	}
}
