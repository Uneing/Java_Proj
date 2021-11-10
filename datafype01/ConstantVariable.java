package datafype01;

/*
 * 상수 : 저장된 값이 절대 변하지 않는 메모리의 한 종류
 * 선언 방법 : final 자료형 변수명 = 초기값;
 * 상수 선언 후 중간에 값을 변경하면 에러
 * 변수명(상수명)은 보통 대문자로 선언한다.
 * 상수는 프로그램의 가독성을 높이며 유지 보수에도 유리하다.
 */

//클래스 안에 선언된 변수를 멤버변수, 상수라 한다.
//메소드 안에서 선언된 변수 나 상수를 지역변수 혹은 지역상수라 한다.


public class ConstantVariable {
	//final double PI; [x] 초기화를 안해서 
	//반드시 초기화 해야됨.
	//final double PI = 3.14;
	static final double PI = 3.14;
	static final int scissors = 1;
	static final int rock = 2;
	static final int paper = 3;
	
	public static void main(String[] args) {

		double dl = PI;
		//PI = 3.145; // 상수는 변할 수 없는 값
		
		final String nick_name ; // 지역상수 
		/*메소스(즉 지역)안에서 상수를 선언할때는 초기화를 사용전에만 해주면 된다.
		 * 보통 메소드(지역)안에서는 상수 선언을 안 함
		 * 주로 클래스 안에서 상수 선언 함.
		 */
		//System.out.println(nick_name);//[x] 초기화 안 함
		nick_name = "이은혜";
		System.out.println(nick_name);
		
		//nick_name = "오라클";[x] 변경불가
		//가독성
		int computer = 1, user =2; //가독성이 떨어짐
		
		computer = scissors;
		user = rock ;
		System.out.println("가독성이 높다.");
	}
	public static void test() {
		double dl = PI;
	}
}
