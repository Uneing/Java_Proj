package stream_19.serialization;

import java.io.*; // 하위의 모든 클래스 import

class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6690655526646153686L;
	String name;	//직렬화해서(C:\Temp\student.dat)
	int id;			//역직렬화 : 직렬화된 파일에서 변수의 값을 읽어옮
	String phoneNumber;	//객체 3개 생성,
	String email;
	
	Student(){}
	Student(String name, int id, String phoneNumber, String email){
		this.name = name;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.email = email;
		
	}
	
	public String toString () {
		return name +", "+id+", "+phoneNumber+", "+email;
	}
}
public class Lab1_Serialization {

	public static void main(String[] args) throws IOException {
		Student stKim = new Student("김", 1,"1234-1234","eud@na.com");
		Student stLee = new Student("이", 2,"2345-2345","ght@na.com");
		Student stAhn = new Student("안", 3,"3456-3456","bcx@na.com");
	      
	       FileOutputStream fos = new FileOutputStream("C:\\Temp\\student.dat");
	      ObjectOutputStream oos = new ObjectOutputStream(fos);
	      
	      oos.writeObject(stKim);      //객체를 저장 
	      oos.writeObject(stLee);
	      oos.writeObject(stAhn);
	      System.out.println("======직렬화 성공======");
	}

}
