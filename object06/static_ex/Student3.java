package object06.static_ex;

public class Student3 {
	private static int serialNum = 1000; //외부클래스에서 접근 차단
										//getter,setter통해서 접근 가능
									//무결성을 체크해서 적용할 수 있다.
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student3() {
		serialNum++;
		studentID = serialNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}

	public static void setSerialNum(int serialNum) { //무결성을 제공할 수 있음
		Student.serialNum = serialNum;
	}
}
