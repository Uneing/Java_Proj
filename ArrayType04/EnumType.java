package ArrayType04;

import java.util.Calendar;

public class EnumType {

	public static void main(String[] args) {
		/*
		 * 열거 타입
		 * public enum 열거타입이름 {상수1이름, 상수2이름..}
		 * 데이터타입
		 * 상수는 주로 대문자로 사용
		 * 허용 가능한 값들을 제한
		 * 
		 * 열거타입 변수 :
		 * 열거타입변수;
		 * EX ) Week week;
		 * 
		 * 열거체이름, 열거상수
		 * ex ) week = week.MONDAY
		 */
		
		Week today;
		today = Week.MONDAY;
		System.out.println(Week.MONDAY);
		
		//name()메소드
		String name = today.name();
		System.out.println(name);
		//ordinal()메소드
		//전체열거 객체 중 몇 번째 열거 객체인지 리턴
		System.out.println(today.ordinal());
		
		//compareTo()메소드
		Week day1= Week.MONDAY;
		Week day2 = Week.TUESDAY;
		
		int result = day1.compareTo(day2);
		System.out.println(result);
		
		//valueOf(매개변수) 메소드
		Week weekDay=Week.valueOf("SATURDAY");
		System.out.println(weekDay);
		
		Calendar cal = Calendar.getInstance();
		int wk = cal.get(Calendar.DAY_OF_WEEK);
		Week tday = Week.SUNDAY;
		switch(wk) {
		case 1 : tday=Week.SUNDAY;break;
		case 2 : tday=Week.MONDAY;break;
		case 3 : tday=Week.TUESDAY;break;
		case 4 : tday=Week.WENDESDAY;break;
		case 5 : tday=Week.THIRSDAY;break;
		case 6 : tday=Week.FRIDAY;break;
		case 7 : tday=Week.SATURDAY;break;
		}
		System.out.println(tday);
	}

}
