package object06.hide;

public class StudentTest {

	public static void main(String[] args) {
		Student studentlee = new Student();
		//studentlee.studentname = "이은혜"; // private : 접근 불가
		
		studentlee.setStudentname("이은혜"); // private으로 선언된 변수에 setter를 통한 변수 값 할당.
		
		
		System.out.println(studentlee.getStudentname()); //getter를 통해서 변수의 값을 받아온다.
	}

}
