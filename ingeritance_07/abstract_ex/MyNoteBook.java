package ingeritance_07.abstract_ex;

public class MyNoteBook extends NoteBook{

	@Override
	public void typing() {
		System.out.println("나의 노트북 타이핑");
	}
	public void myNoteBookOnly() {
		System.out.println("마이노트북에만 존재하는 메소드 - myNoteBookOnly");
	}

}
