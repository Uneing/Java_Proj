package basic_class_11.object;

import java.util.Objects;

class MyDate{
	int day;
	int month;
	int year;
	
	MyDate(){}
	MyDate(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return year + "년 " + month + "월 " + day + "일 입니다." ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day,month,year);	//hash 코드를 생성해줌	
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate my = (MyDate)obj;
			if(this.day == my.day && this.month == my.month && this.year == my.year) {
				return true;
			}else {
				return false;
			}			
		}
		return false;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
public class EqualTest4 {

	public static void main(String[] args) {
			MyDate date1 = new MyDate(28,9,2021);
			System.out.println(date1);
			
			MyDate date2 = new MyDate();
			date2.day = 28;
			date2.month = 9;
			date2.year = 2021;
			System.out.println(date2);
			
			MyDate date3 = new MyDate();
			date3.setDay(28);
			date3.setMonth(9);
			date3.setYear(2021);
			System.out.println(date3);
			
			System.out.println(date1.equals(date2));
			System.out.println(date1.equals(date3));
			System.out.println("==================");
			System.out.println(date1.hashCode());
			System.out.println(date2.hashCode());
			System.out.println(date3.hashCode());
	}

}
