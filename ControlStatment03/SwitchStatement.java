package ControlStatment03;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) throws IOException {
		/*switch : if문처럼 조건에 따라서 분기하는 제어문
		 * 정수식:결과값이 long형은 안됨
		 * 정수식은 산술이거나 직접 변수를 정수식으로 사용
		 * 예 ] num%4,num
		 * switch(정수식){ //산술식, 문자
		 * 	case 값:
		 * 		명령문1;
		 * 		break;
		 * [default :
		 * 		명령문;
		 * 		[break;]
		 */
		
		Scanner sc = new Scanner(System.in);
		/*System.out.println("숫자를 입력하세요");
		int inputNumber = sc.nextInt();
		System.out.println("입력한 숫자 : "+inputNumber);
		int remain = inputNumber%3;
		System.out.println("[if문으로 나머지값 판단]");
		if(remain==0)System.out.println("나머지가0");
		else if(remain==1) System.out.println("나머지가1");
		else System.out.println("나머지가2");
		
		System.out.println("[switch문으로 나머지값 판단]");
		switch(inputNumber) {
		case 0:
			System.out.println("나머지가0");
			break;
		case 1:
			System.out.println("나머지가1");
			break;
		default : 
			System.out.println("나머지가2");
		}
		//switch문에는 정수식 즉 결과값이 long형을 뺀 타입만 허용
		//boolean값은 불가 즉 비교식이나 논리식 사용할 수 없다.
		//switch(inputNumber%3==0) {}//[x]
		byte b=3;
		switch(b) {
			case 1:
				System.out.println("b에 저장된 값1");
			case 2:
				System.out.println("b에 저장된 값1");
			case 3:
				System.out.println("b에 저장된 값1");
			
			case 4:
				System.out.println("b에 저장된 값1");			
		}
		
		//계산기 출력
		System.out.println("첫번째 숫자 입력");
		int fnum=sc.nextInt();
		System.out.println("연산자 기호 입력(+,-,*,/)입력");
		char op = (char)System.in.read();
		System.out.println("두번째 숫자 입력");
		int snum = sc.nextInt();
		System.out.printf("%d %d %c%n",fnum,snum,op);
		
		switch(op) {
		case'+' :
			System.out.printf("%d + %d = %d%n", fnum,snum,fnum+snum);
			break;
		case'-' :
			System.out.printf("%d - %d = %d%n", fnum,snum,fnum+snum);
			break;
		case'*' :
			System.out.printf("%d * %d = %d%n", fnum,snum,fnum+snum);
			break;
		case'/' :
			System.out.printf("%d / %d = %d%n", fnum,snum,fnum+snum);
			break;			
		}
		
		String sub = "수학";
		switch(sub) {
		case "국어":
		System.out.println("과목은 국어"); break;
		case "수학" : 
			System.out.println("과목은 수학");break;
		}
		*/
		/* 여러 case를 동시에 처리할때는
		 * case 값1 :
		 * case 값2 :
		 * case 값n : 실행문 n; break;
		 * 값1인경우, 값2인경우, 값n인경우에도 위의 실행문n이 실행됨
		 */
		/*int inputNum = sc.nextInt();
		switch(inputNum) {
			case 1:
			case 2:
			case 100:
			case 200:
				System.out.println("1이거나 2이거나 100이거나 200 중 하나");
				break;
			case 300:
				System.out.println(inputNum);
		}*/
		
		System.out.println("국어점수 : ");
		int kor = sc.nextInt();
		System.out.println("수학점수 : ");
		int eng = sc.nextInt();
		System.out.println("영어점수 : ");
		int math = sc.nextInt();
		int avg = (kor+eng+math)/30;//소수점 사라짐
		switch(avg) {
		case 100:
			System.out.println("A");
		break;
		case 90:
			System.out.println("A");
		break;
		case 80:
			System.out.println("B");
		break;
		case 70:
			System.out.println("C");
		break;
		case 60:
			System.out.println("D");
		break;
		default :
			System.out.println("F");
		}
		System.out.println("메달 색을 입력해주세요.(gold,silver.bronze)");
		String medal = sc.next();
		
		
		switch(medal) {
		case "gold":
			System.out.println("금메달");
			break;
		case "silver" :
			System.out.println("은메달");
			break;
		case "bronze" :
			System.out.println("동메달");
			break;
		default:
			System.out.println("메달이 없습니다.");
		}
	}///main

}////class
