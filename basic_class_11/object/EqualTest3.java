package basic_class_11.object;
class Student3{
	int studentID;
	String studentName;
	int grade;
	
	Student3(int studentID, String studentName, int grade){
		this.studentID = studentID;
		this.studentName = studentName;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return studentID + "," + grade;
	}

	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student3) {
			Student3 std = (Student3)obj;
			if(studentName == std.studentName) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return  studentID;
	}

	
}
public class EqualTest3 {

	public static void main(String[] args) {
		Student3 std3 = new Student3(100,"강감찬",3);
		Student3 std4 = new Student3(200,"강감찬",4);
		Student3 std5 = new Student3(300,"강감찬",5);
		Student3 std6 = std5;
		System.out.println(std3);
		System.out.println(System.identityHashCode(std3));
		System.out.println(System.identityHashCode(std4));
		System.out.println(System.identityHashCode(std5));
		System.out.println(System.identityHashCode(std6));
		System.out.println(std3==std4);
		System.out.println(std3.equals(std4));
		System.out.println(std4.equals(std5));
		System.out.println(std5.equals(std6));
	}

}
