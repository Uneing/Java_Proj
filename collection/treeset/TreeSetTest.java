package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	//정렬해서 저장(오른차순) < HashSet과의 차이점.
	//Comparable 인터페이스의 compareTo()메소드를 재정의 했기 때문
	//중복된 값을 저장
	//index가 없다 > Iterator 사용
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		System.out.println(treeSet); //toString() 재정의
		System.out.println("=====================");
		
		treeSet.add("D");
		treeSet.add("K");
		treeSet.add("A");
		treeSet.add("G");
		treeSet.add("Z");
		treeSet.add("X");
		
		for(String s : treeSet) {	//향상된 for문으로 출력
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("======Iterator로 출력======");
		Iterator<String> ir = treeSet.iterator();
		while(ir.hasNext()) {
			System.out.print(ir.next() + " ");
		}
	}

}
