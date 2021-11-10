package ingeritance_07;

public class ColorPointEx {

	public static void main(String[] args) {
		Point p = new Point(); //Point 객체 생성
		p.set(1, 2);
		p.showpoint();
		
		System.out.println(p);	//객체 주소 출력
		
		ColorPoint cp = new ColorPoint(); //ColorPoint 객체 생성
		cp.set(3, 4);	//cp 객체는 set()메소드가 없다. 상속된 메소드
		cp.setColor("RED");
		cp.showColor();
		
		System.out.println(cp); //객체 주소 출력
		
		
	}

}
