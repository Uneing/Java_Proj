package array_05;

public class ObjectCopy3 {

	public static void main(String[] args) {
		Book[] array1 = new Book[3]; // 객체의 배열방 3개생성
		Book[] array2 = new Book[3];

		array1[0] = new Book("태백산맥", "조정래");
		array1[1] = new Book("데미안", "헤르만 헤세");
		array1[2] = new Book("어떻게 살 것인가", "유시민");
		
		array2[0] = new Book();	//객체를 직접 생성 후 복사
		array2[1] = new Book();
		array2[2] = new Book();
		
		for (int i = 0 ; i < array1.length ; i++) {	//각각의 요소를 직접 복사
			array2[i].setBookName(array1[i].getBookName());
			array2[i].setAuthor(array1[i].getAuthor());
		}
		
		for(int i = 0 ; i < array2.length ; i++) { // array2 출력
			array2[i].showInfo();
		}
		
		array1[0].setBookName("나목");
		array1[0].setAuthor("박완서");
		
		System.out.println("===========array1=============");
		for(int i =0 ; i<array1.length ; i++) {
			array1[i].showInfo();
		}
		System.out.println("===========array2=============");
		for(int i =0 ; i<array2.length ; i++) {
			array2[i].showInfo();
		}	
		// p.152 p.154 p.157 p.158 
	}
}
