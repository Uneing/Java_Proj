package ControlStatment03;

import java.io.IOException;

public class IfStatement03 {

	public static void main(String[] args) throws IOException {
		/*
		 * else if
		 */
		int kor = 99, eng = 80, math = 89;
		double avg = (kor + eng + math) / 3.0;

		if (avg >= 90)
			System.out.println("A");
		else if (avg >= 80)
			System.out.println("B");
		else if (avg >= 70)
			System.out.println("C");
		else if (avg >= 60)
			System.out.println("D");
		else
			System.out.println("F");

		/*System.out.println("한 문자를 입력하세요");
		char word = (char) System.in.read();
		if (word >= '0' && word <= '9') {
			if ((word - '0') % 2 == 0) {
				System.out.println("2의 배수");
			} else if (word % 2 != 0) {
				System.out.println("2의 배수가 아님");
			}
		} else if (word >= 'A' && word <= 'Z') {
			System.out.println("대문자");
		} else if (word >= 'a' && word <= 'z') {
			System.out.println("소문자");
		
		}*/
	
	/*	System.out.println("[한문자를 입력하세요]");
		int word = System.in.read();
		if(word % 2 ==0) {
			System.out.println("2의 배수입니다.");
		}else if(word % 2 !=0) {
			System.out.println("2의 배수가 아닙니다.");
		}else if(word>='a' && word<='z') {
			System.out.println("소문자입니다.");
		}else if(word>='A' && word<='Z') {
			System.out.println("대문자입니다.");
			
 */
		//입력받은 문자가 숫자이면 "숫자"
		//알파벳이면 알파벳
		//숫자도 알파벳도 아니면 기타 출력
		System.out.println("한 문자를 입력하세요");
		char word = (char) System.in.read();
		if(word >= '0' && word <= '9') {
			System.out.println("숫자");
		}
		else if(word>='a' && word<='z'||word>='A' && word<='Z') {
			System.out.println("알파벳");
		}
		else System.out.println("기타");
		
		//세 숫자 중 최대 값을 구하는 로직을 작성하자
		int num1=44, num2=50, num3=70;
		int max;
		if(num1>num2) max=num1;
		else max=num2;
		if(max>num3);
		else max=num3;
		System.out.println("최대값:"+max);
	
		
	}

}

