package basic_class_11.object;
class Student1{
	int studentID;
	String studentName;
	
	public Student1(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return studentID + ", " + studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student1) {
			Student1 std = (Student1)obj;
			if(studentID == std.studentID) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {	//equals() 메소드를 오버라이딩 해서 객체의 값을 비교할때
		return studentID; //비교하는 변수의 hashcode() 메소드를 오버라이딩 해야한다.
	}
	
}
public class EqualTest2 {

	public static void main(String[] args) {
		Student1 lee = new Student1 (1000, "이순신");
		Student1 lee2 = new Student1 (1000, "이순신");
		System.out.println(lee);
		System.out.println(lee == lee2); //주소
		System.out.println(lee.equals(lee2)); //주소
		//Object Class의 equlas() 메소드는 주소를 비교
		//객체의 studentID가 같은 경우 같다라고 재정의 equals() 메소드를 오버라이딩
		
		System.out.println(lee.hashCode());
		System.out.println(lee2.hashCode());
		
		System.out.println(System.identityHashCode(lee));
		System.out.println(System.identityHashCode(lee2));
	}

}
