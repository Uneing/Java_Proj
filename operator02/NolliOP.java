package operator02;

public class NolliOP {
	public static void main(String[] args) {
		/*
		 * && 논리합
		 * || 논리곱
		 * ! 부정
		 * &, | 비트연산자(AND, OR)
		 * 
		 * b1 && b2 
		 *b1과 b2가 모두가 true일때만 true이고 나머지 false리턴
		 *단 b1이 false이면 b2는 무시하고(계산안하고) false를 리턴한다
		 *
		 *b1 || b2
		 *b1과 b2가 모두가 false일때만 false이고 나머지 true리턴
		 *단 b1이 true이면 b2는 무시하고(계산안하고) true를 리턴한다
		 *
		 *b1 & b2 
		 *b1과 b2가 모두가 true일때만 true이고 나머지는 false리턴
		 *무조건 b1, b2를 수행한다.
		 *
		 *b1 | b2
		 *b1과 b2가 모두가 false일때만 false이고 나머지는 true리턴
		 *무조건 b1, b2를 수행한다.
		 *
		 *^ , | 연산자가 &&,||연산자보다 우선 순위가 높다.
		 */
		boolean b1=(5>3) && (2>3);
		System.out.println(b1);
		boolean b2=(5>3) ||(5<2);
		System.out.println(b2);
		
		boolean b3 = !(5<2);
		System.out.println(b3);
		
		System.out.println(true ^ false);
		System.out.println(true ^ true);
		
		int num1 = 100, num2 = 200;
		System.out.println(num1>100 && num2>100);//false
		System.out.println(num1>90 && num2>100);//true
		
		//단락회로평가
		num1 = 10;
		int i = 2;
		//boolean b4 =( (num1=num1+10)<10) && ((i=i+2)<10); 
		/*boolean b4 =( (num1=num1+10)<10) & ((i=i+2)<10);//
		System.out.println(b4);
		System.out.println(num1);
		System.out.println(i);
		*/
		
		 //boolean b4 =( (num1=num1+10)>10) ||((i=i+2)<10);
		boolean b4 =( (num1=num1+10)>10) | ((i=i+2)<10);
		System.out.println(b4);
		System.out.println(num1);
		System.out.println(i);
	}

}
