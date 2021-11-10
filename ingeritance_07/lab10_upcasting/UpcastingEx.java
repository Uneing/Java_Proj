package ingeritance_07.lab10_upcasting;

public class UpcastingEx {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("홍길동");
		//s는 Person, Student의 필드와 메소드 접근
		
		p = s;
		//p는 Person의 필드와 메소드만 접근
		//단, 메소드 오버라이딩된 메소드에 접근했을떄
		System.out.println(p.name);
		
		p.fly(); //동적 바인딩 적용, 자식 클래스 fly() 출력
		
	//	p.grade = "A";
	//	p.department = "Com";
	}

}
