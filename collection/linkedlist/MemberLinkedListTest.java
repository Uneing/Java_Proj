package collection.linkedlist;

import collection.Member;
import collection.arraylist.MemberArrayList;

public class MemberLinkedListTest {

	public static void main(String[] args) {
		MemberLinkedList memberArrayList = new MemberLinkedList();
		
		Member memberLee = new Member(1001, "이지원");	//객체생성
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서원");
		Member memberHong = new Member(1004, "홍길동");
		
		memberArrayList.addMember(memberLee);	//객체추가
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		System.out.println("======ArrayList 모든 객체 출력======");
		memberArrayList.showAllMember();
		
		System.out.println("====LinkedList에 특정방에 값을 추가한 경우====");
		memberArrayList.addMember2(1, memberHong);
		memberArrayList.showAllMember();
		
		System.out.println("======특정회원 삭제======");
		memberArrayList.removeMember(1002); //member값을 직접 넣어 삭제
		memberArrayList.removeMember(memberHong.getMemberid());
		memberArrayList.showAllMember();
	}

}
