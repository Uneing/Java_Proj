package ControlStatment03;

public class Forstatement {

	public static void main(String[] args) {
		/* for 어떤 명령문들을 반복하고자 할 떄 사용하는 제어문
		 * 
		 * for(초기화식;반복조건식;증감식){
		 * 	실행문
		 * }
		 * 
		 * ~초기식화식 : 최초 한번 실행
		 * ~반복조건식 : 조건식을 만족할 동안 계속 반복
		 * ~증감식: 한번 수행 할 때 마다 증감
		 * 
		 * ~실행문이 하나일때 {} 생략가능
		 * 
		 * 1 초기화식 생략
		 * int i = 0;
		 * for(;조건식;증감식){
		 * 	실행문;
		 * }
		 * 
		 * 2 조건식 생략
		 * for(초기화;;증감식){
		 * 	실행문; break;
		 * }
		 * 
		 * 3 증감식 생략
		 * for(초기화;조건식;){
		 * 	실행문; i++;
		 * }
		 * 
		 * 4 무한반복 (모두 생략)
		 * for(;;){
		 * }
		 * for(;true;){
		 * }
		 * 
		 * -for문은 반복횟수가 정해진 경우 주로 사용
		 * 반대로 반복횟수를 모를 경우에는 while문을 사용
		 */
		//반복문을 이용해서 1부터 10까지 누적 
		int sum=0; //누적합을 저장할 변수
		for (int i=1;i<=10;i++) {
			sum += i;
			
		}
		System.out.println(sum);
		
		//1부터 10까지 숫자중 2의 배수의 합
		sum = 0;
		for (int i=0;i<=10; i +=2 ) {
			sum += i;
			
		}
		System.out.println(sum);
		
		//1부터 10까지 숫자중 2의 배수의 합
		sum = 0;
		for(int i = 0; i<=10; i++) {
			if(i%2==0) sum +=i;
		}
		System.out.println(sum);
		
		//System.out.println(i); [x]
		//for 밖에 i를 초기식으로 사용 
		int i = 1;
		for(;i<=10;i++) {
			
		}
		System.out.println(i);
		
		for(int k = 0;k>0;k--) {
			System.out.println(k);
		}
		sum = 0;
		for(int w=0;w<=100;w++) {
			if(w%3==0||w%5==0) {
				sum +=w;
				
			}
		}System.out.println(sum);
		
		//1 ||하고 && 연산자 사용
		sum = 0;
		for(int w=0;w<=100;w++) {
			if((w%3==0||w%5==0)&&w%15!=0) {
					sum += w;								
			}	
		}System.out.println(sum);
		
		//2 ^연산자 사용
		sum = 0;
		for(int w=0;w<=100;w++) {
			if(w%3==0 ^ w%5==0) sum += w;
		}System.out.println(sum);
		
		/*중첩for문 : for문 안의 for문
		 *이중for문에서 바깥for문은 행을 의미
		 *이중for문에서 안쪽for문은 열을 의미
		 */
		
		for(int j=0;j<2;j++) {
			for(int k=0;k<2;k++)
				System.out.println("Hello World");
		}
		int h=0;
		for(int j=1;j<5;j++) {
			for(int k=1;k<5;k++) {
				if(j+k==5) {
					System.out.printf("1 ");
					h=k;
				}
				else System.out.printf("0 ");
			}
			System.out.printf("(%d,%d)%n",j,h);
		}
		
	   /*for(int j=1;j<6;j++) {
			for(int k=1;k<6;k++) {
				if(j>=k) System.out.printf("*");
				else System.out.printf("%n");
			}*/
			
		/*	for(int p=1; p<=5; p++) {
				for(int k=1; k<=p; k++) {
					System.out.print("*");				
				}
				System.out.println();
			}

			System.out.println();*/
		
		for(int j=1;j<=5;j++) {
			for(int k = 1;k<=5;k++) {
				if(j>=k) System.out.printf("%2c",'*');
			}
			System.out.println();
		}
/*		for(int j=5;j>=1;j--) {
			for(int k = 1;k<=5;k++) {
				if(j>=k) System.out.printf("%2c",'*');
			}
			System.out.println();
		}*/
		for(int j=5;j<=1;j--) {
			for(int k = 1;k<=5;k++) {
				if(k>=j) System.out.printf("%2c",'*');
				else System.out.printf("%2c",' ');
			}
			System.out.println();
		}
		//구구단 출력
		for(int j=1;j<10;j++) {
			for(int k = 1;k<10;k++) {
				System.out.printf("%d * %d= %d\n",j,k,(j*k));
			}
			System.out.println();
		}
		
		//무한루프
		for(;;) {
		System.out.println("무한루프");
		break;
		}
	}//main
}//class
