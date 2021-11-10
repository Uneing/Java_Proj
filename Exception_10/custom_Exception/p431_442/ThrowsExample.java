package Exception_10.custom_Exception.p431_442;

public class ThrowsExample {
	public static void findClass()throws ClassNotFoundException{
		Class claszz = Class.forName("java.lang.String2");
	}
	public static void main(String[] args) {
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	

}
