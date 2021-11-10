package datafype01;

public class JungsuType {

	public static void main(String[] args) {
		/*
		 * 큰자료형과 작은 자료형의 연산 겨로가는 큰 자료형을 따른다.
		 * 같은 자료형끼리는 연산 결과는 같은 자료형이 된다.
		 * 
		 * 예외] int형보다 작은 자료형(byte,shrt,char)들끼리 연산결과는 int형이다. 
		 *     즉, 적용이 안된다.
		 */
		// 기본 자료형 중 수치형의 정수형의 대표 자료형은 int
		byte b1; //변수선언 
		b1 = 127 ;
		System.out.println(b1);
		
		b1=(byte)128; // [ㅇ] 형변환 , 예상치 못한 값이 저장됨.
		System.out.println(b1);
		//  int형보다 작은 자료형(byte,shrt,char)들끼리 연산결과는 int형이다. 
		byte b2 = 20, b3 = 30;
		int n =b2 + b3; //더하기 연산결과는 int형이다.
		System.out.println(n);
		
		byte b4 = (byte) n; //byte b4 = (byte)(b2 +b3); [o]
		System.out.println(b4);
		
		short s1=1000, s2=2000;
		//short s3 = s1 + s2;
		n = s1 + s2;
		
		System.out.println(n);
		short s3 = (short)n;
		System.out.println(s3);
		
		//정수형에서 int형보다 작은 자료형들을 제외한 
		//자료형들끼리(int,long)의 연산결과는 모두 원칙을 따른다.
		//즉 int형과 int형의 연산결과는 int형
		//long형과 long형의 연산결과는 long형
		//int형과 long형의 연산결과는 long형
		
		n = 1000;
		long ln1 = 2000;
		long ln2 = n + ln1;
		/*
		 * 22억 뒤에 L을 붙인다.
		 */
		long ln3 = 2200000000L; // "l"도 가능 (대,소문자 o)
		
		// 숫자 앞에 0이 붙으면 8진수
		int n1 = 0412;
		System.out.println(n1);
		
		// 숫자 앞에 0x가 붙으면 16진수 (0X)
		n1 = 0x1F; // 16*1 + 1*15 + 31
		System.out.println(n1);
		/* 문제) 국,영,수 총합을 다른 변수에 넣어 출력하기
		 * 국어 89 영어 99 수학 78
		 */
		int ko = 89,en = 99 ,ma = 78;
		int total = ko + en + ma;
		System.out.println("국,영,수 각각 점수와 총합 점수를 출력하시오.\n12");
		System.out.println("국어점수 : " + ko);
		System.out.println("영어점수 : " + en);
		System.out.println("수학점수 : " + ma);
		System.out.println("종합점수 : " + total);
		
		
		// 1. 국어, 영어, 수학점수 및 점수 총합을 저장할 수 있는 변수 4개를 선언하여라(int형 사용)
		// int kor, eng, math, total;
		// 2. 국어에는 89, 영어는 99, 수학은 78을 저장하여라
		// kor = 89; eng = 99; math = 78;
		// 3. 국영수의 총합을 구해서 1번에서 선언한 총합 저장을 변수에 저장하여라
		// total = 266;
		// 4. 각 국영수 점수 및 총합을 출력하여라.
		// System.out.println("국어점수 : " + kor);
		// System.out.println("영어점수 : " + eng);
		// System.out.println("수학점수 : " + math);
		// System.out.println("종합 : " + total);
		
		// 정수 2100000000 + 2100000000
		int n2 = 2100000000;
		int n3 = 2100000000;
		long n4 = (long)n2 + (long)n3;
		System.out.println(n4);
		
	}

}
