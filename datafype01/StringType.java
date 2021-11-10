package datafype01;

public class StringType {

	public static void main(String[] args) {
		/*
		 * String형 : 참조형 - 기본자료형이 아님 문자열을 저장할 수 있는 데이터 타입 자바에서 문자열을 나타낼때는 ""(double
		 * quotation) 감싼다. +는 숫자 연산에 사용 될 때는 더하기를 의미한다. 문자열에 사용될때는 문자열 연결을 의미한다. 문자열 +
		 * 숫자는 문자열이 됨.
		 */
		int num; // 변수 선언
		num = 99; // 변수 초기화

		// 1 참조형과 기본 자료형 사이에 형변환 불가
		// String strnum = num; [x] 정수형을 문자열에 담을 수 없음
		// int intNum = "100"; [x] 형변환이 안됨
		String strnum1 = 99 + "";
		String strnum2 = "100";

		// 문자열 + 숫자 => 99 + "100" => "99100"
		System.out.println(num + strnum2);

		// 2 new 연산자를 사용해서 문자열 저장
		String newstr = new String("new 연산자 사용");
		System.out.println(newstr);
		String stringLikeBasic = "기본형 자료형처럼 문자열저장";
		System.out.println(stringLikeBasic);

		// 3 +가 문자열에 사용될때는 연결의 의미
		String plusString;
		plusString = newstr + stringLikeBasic;
		System.out.println(plusString);

		int kor = 100, eng = 100, math = 100;
		//System.out.println("총점 : " + kor + eng + math);
		//문자열과 숫자를 +로 연결시 문자열이 됨.
		System.out.println("총점 : " + (kor + eng + math));
		
		
	}

}
