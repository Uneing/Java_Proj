package interface_08.lab03_BookShelf;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String>shelf; //ArrayList 선언, shelf : 인스턴스 변수
	
	public Shelf () {	//생성자 : 초기화
		shelf = new ArrayList<String>(); // ArrayList 생성
	} 
	public ArrayList<String> getShelf(){ //getter : shelf , 
		return shelf;
	}
	public int getCount() {	
		return shelf.size(); //ArrayList방의 갯수 : 책장의 남아있는 책의 갯수
	}

}
