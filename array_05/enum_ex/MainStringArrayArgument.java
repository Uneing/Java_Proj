package array_05.enum_ex;

public class MainStringArrayArgument {	//main() 메소드에 args 인자로 값을 던져 주기

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("프로그램 사용법");
			//System.out.println("java MainStringArrayArgument num1 num2");
			System.out.println("정수값 2개를 arg인자로 입력하시오\n ex) 10 20");
			System.exit(0); //프로그램 강제 종료
		}	
		String StrNum1 = args[0];
		String StrNum2 = args[1];
		System.out.println(StrNum1 + StrNum2); //문자열 40 + 50
		
		int num1 = Integer.parseInt(StrNum1); //숫자로된 문자열을 정수형으로 타입 변환
		int num2 = Integer.parseInt(StrNum2); //숫자로된 문자열을 정수형으로 타입 변환	
		
		int result = num1 + num2 ;
		System.out.println(result);
		
		Integer aa = 10;
		System.out.println(StrNum1.getClass().getSimpleName());
		System.out.println(StrNum1.getClass().getName());
		System.out.println(aa.getClass().getName());
	}

}
