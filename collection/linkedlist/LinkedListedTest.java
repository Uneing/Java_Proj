package collection.linkedlist;

import java.util.LinkedList;

public class LinkedListedTest {
	public static void main(String []args) {
	LinkedList<String> myList = new LinkedList<String>();
	myList.add("A"); //0
	myList.add("B"); //1
	myList.add("c"); //2
	
	System.out.println(myList); //LinkedList의 toString이 재정의 되어있음.
	
	
	System.out.println("===index1번방에 D 값 추가===");
	myList.add(1, "D");
	System.out.println(myList);
	
	System.out.println("===addFirst() 메소드 사용===");
	myList.addFirst("O"); // 첫번째 자리(index 0)에 값추가
	System.out.println(myList);
	
	System.out.println("===addLast() 메소드 사용===");
	myList.addLast("k"); // 마지막 자리에 값추가
	System.out.println(myList);
	
	System.out.println("===remove() 메소드 사용===");
	myList.remove(1); //index1을 삭제
	System.out.println(myList);
	
	System.out.println("===removeLast() 메소드 사용===");
	myList.removeLast(); //마지막자리 삭제
	System.out.println(myList);
	
	System.out.println("===removeFirst() 메소드 사용===");
	myList.removeFirst(); //처음자리 삭제
	System.out.println(myList);
	}
}
