package ingeritance_07;

public class ColorPoint extends Point{	//Point클래스를 상속받는 ColorPoint 자식 클래스
	private String color ;	//정의 색
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColor() {	//컬러 점의 좌표를 출력
		System.out.println(color);
		showpoint(); //부모클래스에서 상속 받은 메소드 호출
	}

}
