package collection.arraylist;

import java.util.ArrayList;

class MyQueue {
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	//큐에 값을 넣을때 사용하는 용어 : enQueue
	public void enQueue(String data) {
		arrayQueue.add(data);	//큐에 값을 할당.
	}
	//큐에 값을 제거할때 사용하는 용어 : deQueue
	public String deQueue() {
		int len = arrayQueue.size();
		if(len == 0) {
			System.out.println("큐가 비어있습니다.");
			return null;
		}
		return  (arrayQueue.remove(0)); //index 0의 값을 삭제.
	}
	public void showAll() {
		for(int i = 0 ; i < arrayQueue.size() ; i++) {
			String a = arrayQueue.get(i);
			System.out.println(a + "  Index" + i );
		}
	}
}
public class QueueTest {
// 큐 :  LIFO ( Last In First Out) : 먼저 들어간 값이 먼저 
//      나오는 자료주고, 예) 콜센타의 전화상담콜
	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue(); //큐에 자료저장.
		
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		queue.enQueue("D");
		
		queue.showAll();
		System.out.println("===================");
		
		queue.deQueue();
		queue.showAll();
		
		System.out.println("===================");
		
		queue.deQueue();
		queue.showAll();
	}

}
