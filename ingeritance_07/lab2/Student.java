package ingeritance_07.lab2;

public class Student extends Person {
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
//		weight = 99;	private 접근 제한자이므로 오류, setter를 사용 
		setWeight (99);	//setter를 통해서 값 할당
		
	}
}
