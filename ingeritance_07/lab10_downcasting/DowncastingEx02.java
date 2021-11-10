package ingeritance_07.lab10_downcasting;

public class DowncastingEx02 {

	public static void main(String[] args) {
		Student s;	// 객체 변수 (인스턴스 변수) 선언 : s
		Person p;	// 객체 변수 (인스턴스 변수) 선언 : p
		
		s = new Student("홍길동");
		System.out.println("=====업캐스팅====");
		p = s ; //업캐스팅
	//	p = (Person) s; //업캐스팅 : 강제 데이타타입 생략가능
		p.id = "2000";
		p.name = "김자반";
		p.fly();
		
		System.out.println("=====다운캐스팅====");
		s = (Student)p; //다운 캐스팅 : 강제 데이터 타입 명시 
		s.id = "3000";
		s.name = "홍자바";
		s.grade = "4";
		s.department = "sales";
		s.fly();
	}

}
