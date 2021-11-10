package lamda_14.lamda.lab01;

public class StringConcatTest {

	public static void main(String[] args) {
		
		//1. 객체 지향으로 출력 : 객체의 메소드로 호출. //구현 클래스 생성, 여러번 사용
		String s1 = "Hello";
		String s2 = "World";
		
		System.out.println("===1. 객체 지향으로 출력하는 방법===");
		StringConcatImpl sci = new StringConcatImpl();
		
		sci.makeString(s1, s2);
		
		//2. 람다식을 사용해서 출력 //구현 클래스 없이 작동됨. //임시적 사용
		//람다식은 익명 내부 클래스로 작동이됨.
		System.out.println("===2. 람다식으로 출력하는 방법===");
		StringConcat sc = (s, v) -> System.out.println(s +", " + v); 
		sc.makeString(s1, s2);	//람다식으로 던져주는 변수
		
		//3. 익명 내부 클래스를 사용해서 출력 //구현 클래스를 직접 내부에서 생성 //임시적 사용
		System.out.println("===3. 익명 내부 클래스를 사용해서 출력하는 방법===");
		StringConcat sc2 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
			}
			
		};
		
		sc2.makeString(s1, s2);	//익명 내부 클래스 호출
	}

}
