package lamda_14.inner_class;

class OutClass{	//외부 클래스 (인스턴스 외부클래스 : 인스턴스변수, 정적 변수 선언이 가능
	
	private int num = 10;		//외부 클래스의 private 변수, 인스턴스 변수
	private static int sNum = 20;//외부 클래스의 private 변수,정적변수, 객체화(사용), 객체화없이도 사용(클래스이름사용)
	
	private InClass inClass; //외부의 클래스를 객체화 할때, 내부 클래스도 객체화  하기 위한 변수,
	public OutClass() { //생성자 : 외부 클래스의 생성자 호출시 내부클래스를 객체화
		inClass = new InClass();
	}
	static void outTest() {
		System.out.println("인스턴스 외부 클래스의 정적 메소드 사용 가능");
	}
	public void usingClass() { //내부 클래스의 메소드 호출 
		inClass.inTest();
	}
	class InClass{	//내부 클래스(인스턴스 내부 클래스) : 외부 클래스와 빈번하게 작업을 처리
		// 인스턴스 내부 클래스는 정적변수와 정적 메소드를 사용할 수 없다.
		int inNum = 100; //내부 클래스의 인스턴스(멤버) 변수, 객체화 시켰을때 사용
	//	static int sInNum = 200; //인스턴스 내부 클래스에서는 정적 변수를 사용 할 수 없다.
	
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
			System.out.println("InClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");
		
		}
	//	static void sTest() {정적 메소드 : 인스턴스 내부 클래스에서 사용 불가능(오류)}
	
	public void usingClass() {	//내부 클래스 변수를 사용하여 메소드 호출하기
		inClass.inTest();
		}
	} //내부 클래스의 끝
	static class InStaticClass{ //정적 내부 클래스 : 인스턴스변수, 정적변수, 인스턴스메소드, 정적메소드 모두 사용 사능
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			//num += 10; //외부 클래스의 인스턴스 변수를 사용 할 수 없다.
			inNum += 10;
			sInNum +=10;
			System.out.println("InStaticClass inNum = " + inNum + "(정적 내부 클래스의 인스턴스 변수)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(정적 내부 클래스의 정적 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
		}
		static void sTest() {	//정적 메소드 : 인스턴스 변수 사용 불가, 정적 변수는 사용가능
			//num += 10;
			//inNum += 10; //내부 클래스의 인스턴스 변수
			sInNum += 10 ; 
			
			System.out.println("OutClass sNum" + sNum + "(외부 클래스의 정적 변수)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(정적 내부 클래스의 정적 변수)");
		}
	}
}	//외부 클래스의 끝

public class InnerClassTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스를 호출하여 내부클래스 기능을 호출");
		outClass.usingClass();	//외부 클래스의 usingClass() 메소드 호출 (내부 클래스의 inTest()메소드 호출)
		System.out.println();
		
		// OutClass.InClass inClass = new outClass.InClass(); 
		// InClass가 인스턴스 내부 클래스 이므로 상위 클래스를 인스턴스화애서 <<인스턴스이름.new>>
		
		//내부 인스턴스 클래스 객체 생성
		OutClass.InClass inClass = outClass.new InClass(); //내부클래스 객체 생성
		System.out.println("외부 클래스 변수를 사용하여 내부 클래스 객체 생성");
		inClass.inTest();
		
		//외부 클래스를 생성하지 않고 정적 내부 클래스 호출
		//정적내부 클래스는 외부클래스의 인스턴스 생성 없이 객체 생성
		OutClass.InStaticClass sInClass= new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스 인스턴스 메소드 호출");
		sInClass.inTest();
		
		System.out.println("정적 내부 클래스의 정적 메소드 호출");
		OutClass.InStaticClass.sTest();
	}

}
