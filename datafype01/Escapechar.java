package datafype01;

public class Escapechar {

	public static void main(String[] args) {
		/*Escape문자
		 *문자열 내에서 특수한 기능을 수행하는 문자(특수한 의미로 해석 되는 문자)
		 */
		//예]
		System.out.println("Hit HomeRun");
		System.out.println("Hit\t HomeRun");
		//1 \n 줄바꿈(line feed)기능
		System.out.println("Hit HomeRun");
		System.out.println("Hit\n HomeRun");
		System.out.println("\nHit HomeRun");
		//2 \r 커서를 해당 줄에서 맨 처음으로 (carrage return)
		System.out.println("My NickName is superMan\rxx");
		
		/* 
		 * 키보드의 A라고 치면 65라는 값이 저장됨
		 * 키보드로 엔터를 치면 13과 10이 저장됨
		 * 13은 \r의 아스키코드값
		 * 10의 \n의 아스키코드값
		 * 그러므로 엔터키는 \r\n이다.
		 */
		
		//?//3 \t 탭키 만큼 띄어 쓰기 가능 
		System.out.println("국어\t영어\t수학");
		System.out.println("국어t영어t수학");
		
		//4 \' single quotation표시
		//문자열을 '(싱글쿼테이션)으로 감싸도 되는 곳에서는 의미 있다.
		System.out.println("나의 닉네임은 '스마트보이'입니다.");
		System.out.println("나의 닉네임은 \'스마트보이 \' 입니다.");
		
		//?//5 \" double quotation표시
		//System.out.println("나의 닉네임은"스마트보이"입니다.");[x]
		System.out.println("나의 닉네임은 \" 스마트보이 \" 입니다.");
		
		//6 \\ 뒤에 \은 이스케이프 문자 역할을 하는
		//특수문자가 아니라는 것을 컴파일러에게 알려주는 기능(중요)
		System.out.println("D :\nDrive\table");
		System.out.println("D :\\nDrive\\table");
		System.out.println("D :\\Drive\\able");
		
		/*
		 * Format String : 출력형식을 지정하기 위한 형식 문자열
		 * %s(문자)나 %d(숫자)등의 변환 지시어 (Conversion Spcecifier)를
		 * 사용해서 원하는 출력 형식을 만들 수 있다.
		 * *변환지시어를 쓸 수 있는 메소드가 정해져 있다.
		 */
		/*주요 변환 지시어
		 * %d 정수값 출력시(byte/short/int/long)
		 * %f 실수값 출력시 (float/double)
		 * %c 한문자 출력시(char)
		 * %b boolean출력시
		 * %s 문자열출력시
		 * %n 줄바꿈(\r\n도 가능)
		 * %% %리터럴을 의미
		 */
		int kor = 99, eng = 80, math = 96;
		double avg = (kor+eng+math)/3.0;
		System.out.println(avg);
		
		System.out.println("[형식 문자열 미사용]");
		System.out.println(kor + " " + eng +" "+math+" "+avg);
		
		System.out.println("[형식 문자열 사용]");
		System.out.printf("%d %d %d %f\r\n",kor,eng,math,avg);
		//System.out.printf("%d %d %d %.14",kor,eng,math,avg);
		System.out.printf("%d\t%d\t%d\t%f%n",kor,eng,math,avg);
		System.out.printf("%s %s %s %s",kor,eng,math,avg);
		
		/* 
		 * 형식문자열에서 데이터 출력시 자릿수 지정
		 * 예 %숫자d
		 * %4c 한문자를 출력하는데 전체 자리수는 4
		 * %5d 정수 숫자를 출력하는데 전체 자리수는 5
		 * %6.2f% 실수를 출력하는데 
		 *        소수점 둘째자리까지만 출력하고 전체 자리수는 6(소수점 포함)
		 *        
		 * 자릿수 지정시 값을 오른쪽부터 채운다(양수일때)
		 * -를 붙이면 왼쪽부터 채운다
		 * printf("%4d", 12);
		 * --12
		 * printf("%-4d", 12);
		 * 12--		
		 */
		System.out.println("\n[출력 자리수 미 지정]");
		System.out.printf("%d %d %d %f%n",kor,eng,math,avg);
		System.out.println("[출력 자리수 지정");
		System.out.printf("%4d %4d %4d %7.2f%n",kor,eng,math,avg);
		System.out.printf("%-4d %-4d %-4d %.2f%n",kor,eng,math,avg);
		
		//기타
		System.out.printf("%c %b %.2f %s%n", '가',true,3.141123123,"우넹");
		System.out.printf("%s %s %s %s%n", '가',true,3.141123123,"우넹");
		//String으로 출력가능
		
		System.out.println("=======================================");
		System.out.printf("%20s%n","자바반 성적표");
		System.out.println("=======================================");
		System.out.printf("%-10s%-12s%s%n", "KOREA","ENGLISH","MATH");
		System.out.println("=======================================");
		System.out.printf("%-10s%-12s%-10s%s%n", kor,eng,math,(kor+eng+math)/3);
		System.out.printf("%-10s%-12s%-10s%s%n", 100,90,77,(100+90+77)/3);
		
		/* 성적표를 계산 출력하시요
		 * ?해당하는 부분은 실제 데이터를 계산해서 출력하여라
		 * 변수에 아래 각점수를 저장해서 사용해도 무방
		 * 단 평균은 소수점 둘째 자리까지만 출력하여라
		 * ================================
		 * name kor eng math total avg
		 * ================================
		 * HONG  95  70  90    ?   ?.??
		 * KIM   90  85  80    ?   99.0
		 * PARK 85  98  97    ?   88.12
		 */
		System.out.println("=====================================================");
		System.out.printf("%25s%n", "성적표");
		System.out.println("=====================================================");
		System.out.printf("%-10s%-10s%-10s%-10s%-10s%s%n","name","kor","eng","math","total","avg");
		System.out.println("=====================================================");
		System.out.printf("%-10s%-10s%-10s%-10s%-10s%.2f%n","HONG","95","70","90",95+70+90,(95+70+90)/3.0);
		System.out.printf("%-10s%-10s%-10s%-10s%-10s%.2f%n","KIM","90","85","80",90+85+80,(90+85+80)/3.0);
		System.out.printf("%-10s%-10s%-10s%-10s%-10s%.2f%n","PARK","85","98","97",85+98+97,(85+98+97)/3.0);

	}

}
