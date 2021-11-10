package basic_class_11.object.clone_ex;

class Point{
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
}
class Circle implements Cloneable{ //Circle 클래스는 객체 복제를 허용
	Point point;	//객체 변수 
	int radius;		//반지름
	
	public Circle(int x, int y, int radius) //생성자
	{
		point = new Point(x,y);
	}
	public String toString() {
	  return "원의 원점은 " + point + "이고, 반지름은" + radius + "임.";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10,20,30); //객체 생성
		
		Circle copyCircle = (Circle) circle.clone(); //객체 복사
		
		System.out.println(circle);
		System.out.println(copyCircle);
		
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
	}

}
