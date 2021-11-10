package basic_class_11.class_ex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		Class pclass1 = person.getClass();;//Object클래스의 getClass()메소드 사용
		System.out.println(pclass1.getName());
		
		Class pclass2 = Person.class;
		System.out.println(pclass2.getName());
		
		Class pclass3 = Class.forName("basic_class_11.class_ex.Person");
		//클래스 이름으로 가져오기
		System.out.println(pclass3.getName());
		
		System.out.println(person.getClass());
	}

}
