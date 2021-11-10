package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;


public class MemberHashMap {
	
	/*
	 * Map :
	 * 1. key - value 쌍으로 저장
	 * 2. key에는 중복된 값을 넣을 수 없음
	 * 	- value는 중복된 값을 넣을 있음
	 * 3. 방번호 없음
	 * 4. key는 Hash 알고리즘을 사용해서 검색이 빠르다. (index = hash(key))
	 * 	- Hash알고리즘은 검색이 제일 빠른 알고리즘이다.
	 * 5. HashMap - 순서없이 저장
	 * 6. TreeMap - 순서를 가지고 저장, 출력(오름차순,내림차순)
	 */
	HashMap<Integer,Member> hashMap; //HashMap : key, Value
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>(); //HashMap 생성
	}
	public void addMember(Member member) {
		hashMap.put(member.getMemberid(), member); 
		//HashMap에 값을 저장할때 Put() 메소드 사용
	}
	public boolean removeMember(int memberid) {
		if(hashMap.containsKey(memberid)) { 
			//HashMap에서 값을 검색할때 Key를 사용해서 검색을
			//containsKey() 키 값을 검색.
			hashMap.remove(memberid); 
			//HashMap에서는 key를 삭제하면 key-value가 삭제
			return true;
		}
		System.out.println("그런 " + memberid + "가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		//Iterator를 사용해서 출력
		System.out.println("====Iterator를 사용해서 출력====");
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();	
			//get(key) : key에 대한 Value값을 가져온다.
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
		
		//for 문을 사용해서 출력
		System.out.println("====향상된 for문으로 출력====");
		for(Integer i : hashMap.keySet()) {
			Member member = hashMap.get(i);
			System.out.println(member);
		}
	}
}
