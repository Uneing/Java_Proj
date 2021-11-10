package lamda_14.lamda.lab02.a;

import java.util.Scanner;

public class ArithmeticOperationTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 값 : ");
		int a = sc.nextInt();
		System.out.println("두 번째 값 : ");
		int b = sc.nextInt();
		
		try {
		System.out.println("1. 객체지향");
		ArithmeticOperationComp comp01 = new ArithmeticOperationComp();
		comp01.ArithmeticOper(a, b);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println("2. 람다식");
		ArithmeticOperation comp2 = (x, y) -> System.out.println("a + b = " + (x + y));
		ArithmeticOperation comp3 = (x, y) -> System.out.println("a - b = " + (x - y));
		ArithmeticOperation comp4 = (x, y) -> System.out.println("a * b = " + (x * y));
		ArithmeticOperation comp5 = (x, y) -> System.out.println("a / b = " + (x / y));
		comp2.ArithmeticOper(a, b);
		comp3.ArithmeticOper(a, b);
		comp4.ArithmeticOper(a, b);
		comp5.ArithmeticOper(a, b);
		
		System.out.println("3. 익명 내부 객체");
		ArithmeticOperation comp06 = new ArithmeticOperation() {

			@Override
			public void ArithmeticOper(int a, int b) {
				System.out.println("a + b = " + (a+b));
				System.out.println("a - b = " + (a-b));
				System.out.println("a * b = " + (a*b));
				System.out.println("a / b = " + (a/b));
			}
			
		};
		comp06.ArithmeticOper(a, b);
	}

}
