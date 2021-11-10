package object06.static_ex;

public class StudentTest1 {

	public static void main(String[] args) {
		Student lee = new Student();
		lee.setStudentName("이자바");
		System.out.println(lee.serialNum);   //객체 생성 후 출력
		lee.serialNum++;
		
		Student kim = new Student();
		kim.setStudentName("김자바");
		System.out.println(kim.serialNum);
		kim.serialNum++;	
		
		
		System.out.println();
		
		System.out.println(Student.serialNum ); 
		// 객체 생성 없이 출력 , 믈래스이름. 으로 바로 호출 가능
		Student.serialNum++;//클래스 이름으로 증가		 
		
		System.out.println();
		
		System.out.println(Student.getSerialNum()); 
		

	}

}
