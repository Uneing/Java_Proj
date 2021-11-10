package ingeritance_07.lab10_polymorphism;

import java.util.*;

public class AnimalTest4 {
	ArrayList<Animal> aniList = new ArrayList<Animal>();
	public void addAnimal() {	//ArrayList에 객체를 추가하는 메소드
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani : aniList) {
			ani.move();
		}
	}
	public void testCasting() {	//다운캐스팅
		for(int i = 0 ; i < aniList.size();i++) { //aniList.size() 배열 방의 갯수
			Animal ani = aniList.get(i); //aniList.get(i) 각 방의 값을 가지고 올 떄
		if(ani instanceof Human) {
			Human h = (Human)ani;//다운캐스팅
			h.readBook();
			
		}
		else if(ani instanceof Tiger) {
			Tiger t = (Tiger)ani;//다운캐스팅
			t.hunting();
		}
		else if(ani instanceof Eagle) {
			Eagle e = (Eagle)ani;//다운캐스팅
			e.flying();
		}
		else {
			System.out.println("지원되지 않는 타입");
			}
		}
	}
	public static void main(String[] args) {
		AnimalTest4 aTest = new AnimalTest4();
		aTest.addAnimal();
		System.out.println("===========================");
		System.out.println("<원래 타입으로 다운캐스팅 정보 출력>");
		aTest.testCasting();
	}

}
