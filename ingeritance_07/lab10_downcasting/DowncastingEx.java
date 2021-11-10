package ingeritance_07.lab10_downcasting;

public class DowncastingEx {

	public static void main(String[] args) {
		System.out.println("======업 캐스팅======");
		Person p = new Student("홍길동");	//업 캐스팅:부모 클래스의 필드, 메소드 접근
										//단, 오버라이딩 된 메소드 호출시 동적 바인딩 적용
		p.id = "1000";
		System.out.println(p.id + ", " + p.name);
		
		System.out.println("======다운 캐스팅======");
		Student s = (Student) p; //다운 캐스팅 : 부모, 자식 클래스의 필드,메소드 모두 접근
								//강제로 자료형을 명시
		
		s.department = "HR";
		s.grade = "4";
		s.id = "1001";
		s.name = "김유신";
		System.out.println(s.id + ", " + s.name + ", " + s.grade +
					", " + s.department);
	}

}
