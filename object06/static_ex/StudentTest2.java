package object06.static_ex;

public class StudentTest2 {

	public static void main(String[] args) {
		Student2  lee = new Student2(); //객체 생성시 serialNum 증가
		lee.studentName = "이자바";
		System.out.println(lee.serialNum);
		System.out.println();

		Student2  kim = new Student2();
		kim.studentName = "김자바";
		System.out.println(kim.serialNum);
		System.out.println();
		
		Student2  choi = new Student2();
		choi.studentName = "최자바";
		System.out.println(choi.serialNum);
		System.out.println();
	}

}
