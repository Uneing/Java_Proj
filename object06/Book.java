package object06;

public class Book { // this()로 다른 생성자를 호출  ==> 생성자로 인한 중복 코드 제거
	String title;
	String author;

	void show() {
		System.out.println(title + " " + author);
	}
	
	public Book () {
		this (" " , " "); //다른 생성자 호출
		System.out.println("생성자 호출됨");
	}
	public Book(String title) {
		this(title, "작자 미상");
		
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public static void main(String[] args) {
		Book lp = new Book("어린왕자","생텍쥐베리");
		Book ls = new Book("춘향전");
		Book eB = new Book();
		lp.show();
		ls.show();

	}

}
