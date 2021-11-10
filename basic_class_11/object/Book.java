package basic_class_11.object;

public class Book {
	int bookNumber;	//기본 데이터 타입
	String bookTitle;	//Wraper Class : 객체형 데이터 타입
	
	Book(){} //기본생성자, bookNumber < 0 , bookTitle < null
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	public static void main(String[] args) {
		Book book1 = new Book ( 200, "개미");
		
		Object o = book1;
		System.out.println(book1);
		System.out.println(book1.toString());
		//Object Class의 toString()메소드는 객체의 주소를 출력
		//객체의 전체이름(패키지이름.클래스이름)@해쉬코드(주소)
	}

}
