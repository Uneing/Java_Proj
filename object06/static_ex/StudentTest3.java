package object06.static_ex;

public class StudentTest3 {

	public static void main(String[] args) {
		Student3  lee = new Student3(); //객체 생성시 serialNum 증가
		lee.studentName = "이자바";
		System.out.println(lee.getSerialNum());
		System.out.println();

		Student3  kim = new Student3();
		kim.studentName = "김자바";
		System.out.println(kim.getSerialNum());
		System.out.println();
		
		Student3  choi = new Student3();
		choi.studentName = "최자바";
		System.out.println(choi.getSerialNum());
		System.out.println();
	}

}
