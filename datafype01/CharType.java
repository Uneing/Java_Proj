package datafype01;

public class CharType {

	public static void main(String[] args) {
		/* 아스키 코드 1btyte로 표현할 수 있는 문자
		 * (영문자 와 숫자,특수문자)
		 * 십진수의 정의한 값을 아스키 코드라함.
		 * 예] A의 아스키 코드값:65 (dlwlstn : 1000001)
		 * 
		 * 키보드에서 A라고 치면 컴퓨터 메모리에 
		 * 1000001로 저장됨
		 * 소문자 a는 아스키 코드값이 97
		 * 
		 * 유니코드 : 1Nyte로 표현이 안되는 문자
		 * (한글이나 한자등)은 2Byte가 필요하다.
		 * \\u16진수로 정의한 값을 유니코드라고 함.
		 */
	
		char c1 = 'A', c2 = 65, c3=0B1000001;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4 = '가';
		char c5 = '나';
		System.out.println(c4);
		System.out.println((int)c5);
		System.out.println((char)45208);
		System.out.println(c4 +""+ c5);
		
		//char형 : 하나의 문자를 저장할 수 있는 
		// 자료형(2byte), 0부터 ~2^16-1까지 저장.
		// 값 저장시 하나의 문자를 ''(single quotation)으로 감싼다.
		
		// char = -10; [x] //음수라서
		// char = "가"; [x] // "" 문자열(string) '' [o]
		
		char ch1 = 'A';
		int a =2;
		System.out.println((char)(ch1 + a)); //연산시 정수형으로 변함 
		
		//아스키(혹은 유니) 코드값(십진수)를 char형으로 형변환 하면 
		//해당 아스키(혹은 유니) 코드값에 일치하는 문자로 바꾼다.
		//반대로 어떤 문자를 int형으로 형변환하면 그 문자의 코드값(아스키 혹은 유니코드)을 알 수 있다.
		
		}

}
