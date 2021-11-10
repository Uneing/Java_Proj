package basic_class_11.object;

public class Integer_ex {

	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1);
		System.out.println(System.identityHashCode(i1));
		System.out.println(i2);
		System.out.println(System.identityHashCode(i2));
		System.out.println(i1 == i2); //객체 주소 비교
		System.out.println(i1.equals(i2)); //객체 값 비교
		
		Integer i3 = 300;
		Integer i4 = 300;
		System.out.println(i3);
		System.out.println(System.identityHashCode(i3));
		System.out.println(i4);
		System.out.println(System.identityHashCode(i4));
		System.out.println(i3 == i4); //객체 주소 비교
		System.out.println(i3.equals(i4)); //객체 값 비교
	}

}
