package ingeritance_07.lab10_polymorphism;

public class Human extends Animal { //딱까리
	
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}

}
