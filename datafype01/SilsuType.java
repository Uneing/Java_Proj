package datafype01;

import java.math.BigDecimal;

public class SilsuType {

	public static void main(String[] args) {
		//부동소수점 방식 : 가수부(1.6) , 지수부(10의 -3승)
		//정수형보다는 실수형이 더 큰 그릇이다.
		//long(정수형 : 8byte), float(실수형 : 4byte)
		long In = 100;
		float fl = 200;
		//long =In + fl; [x] long형과 float형 연산결과는 float
		float f1 = In + fl;
		System.out.println(f1);
		
		//실수형에서 기본 데이타 타입은 double이다.
		//소수점이 붙으면 무조건 double형으로 인식
		//단, 소수점이 붙지 않은 값은 float에 담을 수 있다.
		
		//float f2 = 3.14; [x] float형에 소수를 담았기에 에러남.
		
		//1. 형변환
		float f2 = (float)3.14;
		System.out.println(f2);
		
		//2. 실수 뒤에 f or F를 붙인다. (float형 나타냄)
		f2 = 3.14f;
		System.out.println(f2);
		
		//실수형도 같은 자료형끼리의 연산결과는 같은 자료형, 
		//큰 자료형과 작은 자료형과의 연산결과는 큰 자료형
		
		float f3 = 300, f4 = 400, f5;
		f5 = f3 + f4;
		System.out.println(f5);
		
		double d1 = 10.0, d2; // double형은 소수점 붙이기
		//f3 = f3 + d1;[x] float형과 double형의 연산결과는 double형이기 때문
		d2 = f3 + d1;
		System.out.println(d2);
		
		/* 반지름이 10인 원의 면적을 구해라 
		 * 단 면적을 저장하는 변수의 타입을 3가지 형태(int/float/double)의
		 * 자료형에 저장하고 출력하여라.
		 * 그리고 소수점을 제거하여라
		 * 원의 면적 : 반지름 * 반지름 * 3.14
		 * 단, 아래의 변수 radius 와 pi를 사용해서 구해라
		 */
		
		
		/* float radius = 10;
		double pi = 3.14;
		int area = (int)(radius * radius* pi);
		System.out.println(area); */
		
		int radius = 10;
		double pi = 3.14;
		 		  // float pi = 3.14f;도 가능
		int iarea;
		float farea;
		double darea;
		  
		iarea = (int)(radius * radius * pi);
		farea =(float)(radius * radius * pi); 
		//farea =(radius * radius * (float)3.14); 도 가능
		darea = radius * radius * 3.14;
		System.out.println(iarea);
		System.out.println(farea);
		System.out.println(darea);
		
		// 부동소수 방식 연산오류
		double dl1 = 0.1;
		double dl2 = 0.2;
		
		System.out.println(dl1 + dl2);
		System.out.println(dl1 * dl2);
		System.out.println(dl1 + dl2 == 0.3);
		/* BigDecimal 타입1. compareTo(BigDecimal타입2)
		 * 값이 같으면 0
		 * BigDecimal 타입1가리키는 값이 더 크면 1
		 * 작으면 -1
		 */
		BigDecimal big1 = new BigDecimal("0.1");
		//BigDecimal은 부동소수의 정확한 계산을 위한 참조변수
		BigDecimal big2 = new BigDecimal("0.2");
		BigDecimal big3 = big1.add(big2);
		System.out.println(big3);
		
		System.out.println(big3.compareTo(new BigDecimal("0.3")));
		//compareTo 비교 연산자 
 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
