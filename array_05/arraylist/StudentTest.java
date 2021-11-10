package array_05.arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student (1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		
		Student studentKim = new Student (1002,"kim");
		studentKim.addSubject("국어",70);
		studentKim.addSubject("수학",85);
		studentKim.addSubject("영어", 100);
		
		studentLee.showStudentInfo();
		System.out.println("=======================================");
		studentKim.showStudentInfo();
		
		Student studentSong = new Student (10003, "Hoog");
		studentSong.addSubject("국어", 90);
		studentSong.addSubject("수학", 70);
		studentSong.addSubject("영어", 80);
		studentSong.addSubject("물리", 60);
		studentSong.addSubject("철학", 100);
		
		System.out.println("=======================================");
		studentSong.showStudentInfo();
	}

}
