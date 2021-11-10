package ingeritance_07.lab10_polymorphism;

public class Tiger extends Animal{ //얘도 딱가리
	
	@Override
	public void move() {
		System.out.println("호랑이는 네 발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이는 사냥을 합니다.");
	}

}
