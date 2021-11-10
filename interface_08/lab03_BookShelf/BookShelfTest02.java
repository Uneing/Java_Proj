package interface_08.lab03_BookShelf;

public class BookShelfTest02 {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		for (int i = 0; i < 100; i++) {
			shelfQueue.enQueue("태백산맥" +( i+1) + "권");
		}
		System.out.println("책장의 책의 수량은 : " + shelfQueue.getSize() + "권");
		System.out.println();

		for (int i = 0; i < 30; i++) {
			System.out.println(shelfQueue.deQueue());
		}
		System.out.println("책장의 책의 수량은 : " + shelfQueue.getSize() + "권");
	}

}
