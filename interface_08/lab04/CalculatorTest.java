package interface_08.lab04;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		Calc newCalc = calc; 	//업캐스팅
		calc.description(); //default 메소드 호출
		
		int [] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));	//정적 메소드 호출
			
	}

}
