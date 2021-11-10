package ingeritance_07.lab9;

class Shape {	//슈퍼 클래스, 메소드 재정의[오버라이팅]를 사용해서 다형성 구현
	public Shape next;	
	public Shape( ) {next = null;} //생성자 
	public void draw() {
		System.out.println("Shape");
	}
}
	class Line extends Shape{	
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}

