package basic_class_11.object;

class Student{
	int studentID;
	String studentName;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return studentID + ", " + studentName;
	}
	
}
public class EqualTest {
	
	public static void main(String[] args) {
		Student s1 = new Student(100,"인순이");
		Student s11 = s1;
		Student s3 = new Student(100,"인순이");
		
		if(s1 == s11) {
			System.out.println("주소 같음");
		}else System.out.println("주소 다름");
		
		if(s1.equals(s11)) {
			System.out.println("값 동일");
		}else System.out.println("값 다름");
		
		if(s1 == s3) {
			System.out.println("주소 같음");
		}else System.out.println("주소 다름");
		
		if(s1.equals(s3)) {
			System.out.println("값 동일");
		}else System.out.println("값 다름");
		
		Object o =s1;
		
		System.out.println(s1);
		System.out.println(o);
	}

}
