package ControlStatment03;

public class DowhileStatement {

	public static void main(String[] args) {
		/*
		 * 형식
		 * [초기식;]
		 * do {
		 * 수행문1;
		 * [증감식;]
		 * } while(조건식);
		 * 
		 * 조건식은 비교식 내지 논리식이어야한다.
		 * 무조건 한번은 수행한다. 그외는 while문과 통일하다 즉 조건식 참일동안 반복 수행
		 * 초기식은 반드시 초기화해야된다.
		 */
		
		//1에서 10까지 누적함
		int i = 1;
		int sum = 0;
		do {
			sum+=i;
			i++;
		}while(i<=10);
		
		System.out.println(sum);
		System.out.println(i);
		
		i=1;
		
		do {int j=1;
			do {
				
				if(j==i)System.out.printf("%-2d",1);
				else System.out.printf("%-2d",0);
				j++;
				
			}while(j<5);
			System.out.println();
			i++;
		}while(i<5);
		
		i=1;
		
		do {int j=1;
			do {
				
				if(j<=i)System.out.printf("%2c",'*');
				j++;
			}while(j<6);
			System.out.println();
			i++;
		}while(i<6);
		
		i=1;
		do {int j=2;
			do {
				System.out.printf("%d * %d = %-3d",i,j,i*j);
				j++;
			}while(j<10);
			System.out.println();
			i++;
		}while(i<10);

	}///main

}///class
