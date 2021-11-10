package object06.singleton;

public class CompanyTest {

	public static void main(String[] args) {
//		company my = new company(); //company()가 private로 설정됨
									//외부클래스에서 호출 불가능
//		company me = new company();
		
		company my = company.getInstance();
		company me = company.getInstance();
		
		System.out.println(my == me);
		
		System.out.println(my); //객체의 주소 값 출력
		System.out.println(me);
	}

}
