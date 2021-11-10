package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member; //다른 패키지의 클래슬르 사용하려면 import가 필요

public class MemberArrayList {
	private ArrayList<Member> arrayList; //ArrayList<Member>변수 arrayMember 선언
	public MemberArrayList() {	//생성자 : 매개변수 없는 생성자
		arrayList = new ArrayList<Member>();	//ArrayList<Member> 생성		
	}
	public void addMember(Member member) {
		arrayList.add(member);	//맨 마지막 방에 삽입
	}
	public void addMember2(int a, Member member) { //특정 Index 방에 값을 삽입.
		arrayList.add(a, member);	//특정 방에 값을 삽입
	}
	public boolean removeMember(int memberid) {
		//for문을 사용해서 arrayList에 저장된 memberid를 검색해서 해당 객체 삭제
		/*for(int i = 0 ; i < arrayList.size(); i++) {
			Member member = arrayList.get(i); //각 방의 객체를 가져와서 member변수에 할당.
		int tempid = member.getMemberid(); //객체의 저장된 memberid의 값을 가져와서 tempid할당.
		if(tempid == memberid) {
			arrayList.remove(i); //방번호로 삭제
			return true;	//삭제후 삭제된 정보 출력
			}
		}*/
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {//다음 방의 값이 존재할 동안(true), 존재하지 않으면(false)
			Member member = ir.next(); //방의 값을 반환. List에서 get() 메소드와 동일
			int tempid = member.getMemberid();
			if(tempid == memberid) {
				arrayList.remove(member); //객체 이름으로 삭제
				return true;
			}
		}
		
		System.out.println(memberid + "가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		/*for(Member member : arrayList) {
			System.out.println(member);
		}*/
		for(int i = 0 ; i <arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member + " index " + i);
		}
		System.out.println();
	}
}
