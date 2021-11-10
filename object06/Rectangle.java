package object06;

import java.util.Scanner;

public class Rectangle { // 넓이와 높이를 입력 받아서 넓이(면적)을 구하는 프로그램.
	int width;
	int height;

	public Rectangle() {
	} // 기본 생성자 생략 가능
		// 단, 다른 생성자가 없는 경우, 외부에서 호출하지 않는 경우

	public int getArea() { // int 값을 리턴 돌려주는 getArea 메소드
		return width * height;
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Scanner c = new Scanner(System.in);

		r.width = c.nextInt();
		r.height = c.nextInt();

		System.out.println(r.getArea());
	}

}
