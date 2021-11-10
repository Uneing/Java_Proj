package Exception_10.Ex;

import java.util.Scanner;

public class CompleteCalc extends Calculator implements Calc{
		int a;
		int b;
	
	CompleteCalc(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	@Override	
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int times(int a, int b) {
		return a*b;
	}

	@Override
	int substract(int a, int b) {
		return a-b;
	}

	@Override
	int divide(int a, int b) {
		return a/b;
	}
	
	@Override
	public String toString() {
		return "더하기 : " + add(a, b) + " 빼기 : " + substract(a, b) 
			+ " 곱하기 : " + times(a, b) + ", 나누기 : " + divide(a, b);
	}

	public static void main(String[] args) {
		//Calc 인터페이스를 구현, Calculator 추상 클래스 구현
		//스캐너로 두개의 정수를 인풋 받아서 객체 자체를 print 했을 때 
		//System.out.println(CompleteCalc); < 사칙연산 다 출력되도록 함.
		//a / b : b가 0인 경우 Exception 발생
		//ArithmeticException
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 a : ");
		int a = sc.nextInt();
		System.out.print("정수 b : ");
		int b = sc.nextInt();
		
		CompleteCalc com = new CompleteCalc(a, b);
			System.out.println(com.add(a, b));
			System.out.println(com.substract(a, b));
			System.out.println(com.times(a, b));
			
				
		try {			
			System.out.println(com);			
			}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("프로그램 종료");
		
		
		
	}



}
