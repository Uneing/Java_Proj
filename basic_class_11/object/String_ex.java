package basic_class_11.object;

public class String_ex {

	public static void main(String[] args) {
		//<String을 객체화해서 객체 변수에 저장 > :Heap 영역에 저장
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1)); //10진수
		System.out.println(str2);
		System.out.println(System.identityHashCode(str2)); //주소출력
		System.out.println(str1 == str2); // ==은 객체를 비교할 떄 객체의 번지 비교
		System.out.println(str1.equals(str2)); // equals() 값을 비교
		
		//<String을 객체화하지 않고 변수에 저장 > 값이 상수풀에 저장이됨.
		String str3 = "이순신";
		String str4 = "이순신";
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str3 == str4); //주소비교
		System.out.println(str3.equals(str4)); //내용물비교
	}

}
