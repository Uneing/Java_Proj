package array_05;

public class ObjectCopy2 {

	public static void main(String[] args) { //배열 객체의 얕은 복사, 배열의 주소 정보만 복사,
		Book[] array1 = new Book[3]; //객체의 배열방 3개생성
		Book[] array2 = new Book[3];
		
		array1[0] = new Book("태백산맥", "조정래");
		array1[1] = new Book("데미안", "헤르만 헤세");
		array1[2] = new Book("어떻게 살 것인가","유시민");
		
		System.arraycopy(array1, 0, array2, 0, 3);
		
		for(int i = 0 ; i < array2.length ; i++) {
			array2[i].showInfo();
		}
		
		array1[0].setBookName("나득");
		array1[0].setAuthor("박완서");
		
		System.out.println("==========================");
		
		for(int i = 0; i < array1.length ; i++) {
			array1[i].showInfo();
		}
		
		System.out.println("==========================");
		
		for(int i = 0; i < array2.length ; i++) {
			array2[i].showInfo();
		}
	}
}


