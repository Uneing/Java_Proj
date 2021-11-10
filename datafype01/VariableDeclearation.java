package datafype01;

public class VariableDeclearation {

	public static void main(String[] args) {
		System.out.println("[변수 선언 방법 첫 번째]");
		//자료형(data type)변수형
		int x; //int형(숫자-정수) 저장할 수 있는 x라는 이름의 메모리를 할당해주세요.
		x = 10; //변수 초기화 
		
		int y = 0B1010; //2진수
		int z = 012; //8진수
		int k = 0xA; //16진수
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(k);
		System.out.println();
		
		System.out.println("[변수 선언 방법 두 번째]");
		int xx = 200; //선언과 동시에 초기화
		System.out.println(xx);
		
		System.out.println("[변수 선언 방법 세 번째 - 동시에 같은 타입의 변수 여러개 선언하기]");
		int yy,zz = 300,kk;
		
		//System.out.println(); 초기화 X 사용불가
		yy = zz;
		
		System.out.println(yy);
		
		//yy = zz + kk; 초기화 X 사용불가 
		kk = 500;
		System.out.println(zz+kk);
		
		//항상 = (대입(할당)연산자)의 왼쪽에는 
		//값을 변경할 수 있는 변수가 와야한다.
		//오른쪽에는 값이나 값이 저장된 변수가 온다
		
		int XX; //자바는 대소문자를 구분한다.
		// 명명 규칙에 어긋나는 경우
		// 숫자로 시작하는 경우
		//_나 $를 제외한 특수문자 포함 될 경우
		// 예약어를 사용하는 경우 
		
		int ioj;
		int _ioj, i_oj, ioj_;
		int $ioj, i$oj, ioj$;
		//int #ioj; [X]
		//int public;[X]
		int puBlic; //대소문자 구분, 예약어X [O]
		
		int stuName; //카멜규칙 변수명 선언 
		
	
	
	
	}

}
