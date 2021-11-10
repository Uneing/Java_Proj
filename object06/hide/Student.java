package object06.hide;

public class Student {
	int studentid;				//학번 
	private String studentname; //학생이름, private : <정보의 은닉>, setter를 사용해서 외부에서 값을 할당.
	int grade;					//학년
	String address;				//주소
	
	
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	

	
			//getter : 변수의 값을 돌려줄때 사용하는 메소드, public
			//setter : 변수의 값을 할당할때 사용하는 메소드, public
	/*
	public String getstudentname() {	//getter
		return studentname;
	}
	public void setstudentname(String studentname) {	//setter
		this.studentname = studentname;
	}
	*/
	
	//자동으로 getter, setter 만들기 
	
	
	
	

}
