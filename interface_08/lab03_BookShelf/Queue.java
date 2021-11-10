package interface_08.lab03_BookShelf;

public interface Queue {	//Queue : 책장(ArrayList)
	void enQueue(String title);	//책장에 책이 저장됨.
	String deQueue(); //책장에 책이 빠짐.
	int getSize(); //책장의 책의 갯수
	
}
