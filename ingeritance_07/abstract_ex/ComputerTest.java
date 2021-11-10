package ingeritance_07.abstract_ex;

import java.util.ArrayList;

public class ComputerTest {

	public static void main(String[] args) {
//		Computer c1 = new Computer(); //추상클래스이므로 객체 생성 불가
		Computer c2 = new Desktop(); //콘크리트 클래스이므로 객체 생성 가능
//		Computer c3 = new NoteBook(); //추상클래스이므로 객체 생성 불가
		Computer c4 = new MyNoteBook();//콘크리트 클래스이므로 객체 생성 가능
		System.out.println("=====Desktop 객체정보=====");
		c2.display();
		c2.typing();
		c2.turnOn();
		c2.turnOff();
		
		System.out.println("=====MyNoteBook 객체정보=====");
		c4.display();
		c4.typing();
		c4.turnOn();
		c4.turnOff();
		
		System.out.println("=====각각의 클래스의 메소드 호출=====");
		Desktop d = (Desktop)c2;	//다운캐스팅
		d.desktopOnly();
		NoteBook n = (NoteBook)c4;
		n.notdBookOnly();	
		MyNoteBook m = (MyNoteBook)c4;
		m.myNoteBookOnly();
		System.out.println("=====각 클래스를 ArrayList에 저장 후 출력=====");
		ArrayList<Computer>arr = new ArrayList<Computer>();
		arr.add(c2);
		arr.add(c4);
		
		Computer c = arr.get(0);
		c.display();
		c.typing();
		c.turnOn();
		c.turnOff();
		Desktop dd = (Desktop)c;
		dd.desktopOnly();
		
		Computer cc = arr.get(1);
		cc.display();
		cc.typing();
		cc.turnOn();
		cc.turnOff();
		
		MyNoteBook mm = (MyNoteBook)cc;
		mm.notdBookOnly(); //NoteBook 메소드
		mm.myNoteBookOnly(); //MyNoteBook 메소드
		System.out.println("=====instanceof를 사용해서 다운캐스팅=====");
		for(int i = 0 ; i < arr.size() ; i++) {
			Computer com = arr.get(i);
			if(com instanceof Desktop) {
				Desktop de = (Desktop) com;
				de.desktopOnly();
			}
			if(com instanceof NoteBook) {
				NoteBook note = (NoteBook)com;
				note.notdBookOnly();
			}
			if(com instanceof MyNoteBook) {
				MyNoteBook my = (MyNoteBook)com;
				my.myNoteBookOnly();
			}
		}
	}

}
