package ControlStatment03;

import java.io.IOException;

public class WhileStatement {

	public static void main(String[] args) throws IOException {
		/*
		 * while 반복의 수가 정해져 있지 않을때 주로 사용 
		 * 
		 * 초기식;
		 * while(반복조건식){
		 * 수행문;
		 * [증감식;]
		 * 
		 * }
		 * 조건식은 비교식 내지 논리식이여야한다.
		 * 조건식이 참일 동안 반복수행
		 * 초기식은 반드시 초기화해야된다.
		 * 
		 * 무한반복 
		 * while(true){
		 * 수행문;
		 */
		//1에서 10까지 누적함
		int i=1;
		int sum = 0;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		System.out.println(i);
		
		i =1;
		sum = 0;
		while(i<=1000) {
			if(i%3==0^i%5==0)//if((i%3==0||i%5==0) && i%15!=0)
			sum += i;
			i++;
		}
				System.out.println(sum);	
		
	/*
		System.out.println("문자열 입력 : ");
		char word;
		while((word=(char)System.in.read()) !=13) {
			System.out.println(word);
		}
		System.out.println();
		*/
		int j=1;
		while(j<5 ) {//행번호
			int k = 1;
			while(k<5) {
				if(j==k)System.out.printf("%-2d",1);
				else System.out.printf("%-2d",0);
				k++;
			}
			System.out.printf("%n");
			j++;
		}
		
		j=1;
		while(j<6) {
			int k=1;
			while(k<6) {
				if(j>=k) System.out.printf("*");	
				k++;
			}
			System.out.println();
			j++;
		}
		j=1;
		while(j<6) {
			int k=1;
			while(k<6) {
				if(k>=j) System.out.printf("*");	
				else System.out.printf(" ");	
				k++;
			}
			System.out.println();
			j++;
		}
		
		j=1;
		while(j<10) {
			int k=2;
			while(k<10) {
				System.out.printf("%d * %d = %-3d  ",j,k,(j*k));
				k++;
			}
			System.out.println();
			j++;
		}
			
		
	}
}
