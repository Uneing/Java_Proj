package basic_class_11.object;

public class B //[extends Object] <== 생략되어 있다. 컴파일 시에 컴파일러가 자동으로 삽입
{	//Java의 모든 클래스는 Object 클래스를 상속 받는다.
	//import java.lang.Object
	//java.lang.* <==자동으로 임포트됨. 컴파일시에 컴파일러가 자동으로 import함.
	//모든 클래스는 Object 클래스의 메소드를 사용할 수 있다.
	//Object 클래스의 메소드를 재정의 할 수 있다. (Final 키가 있는 메소드는 재정의 불가)
	//모든 클래스는 Object 클래스로 업캐스팅.
	B(){}
	int a = 1;
	void b() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		B b = new B();
		
		Object c = b; //Object타입으로 업캐스팅
		B d = (B) c;
		
		b.a = 10;
		b.b();
		
		b.toString(); //Object 클래스의 메소드
	}

}
