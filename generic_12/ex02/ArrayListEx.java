package generic_12.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	//이름을 4개 입력 받아 ArrayList에 저장하고 제일 긴 이름을 출력
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		Scanner sc = new Scanner (System.in);
		
		//4명의 이름을 입력 받아서 ArrayList에 저장
		for(int i = 0 ; i < 4 ; i++) {
			System.out.println("이름을 입력하세요");
			String s = sc.next();	//스캐너에서 이름 입력
			a.add(s);				//ArrayList에 저장
		}
		//ArrayList에 저장된 모든 이름을 출력
		for(int i = 0 ; i< a.size() ; i++) {
			String name = a.get(i);
			System.out.println(name + " ");
		}
		// 가장 긴 이름을 출력
		int longnameindex = 0; //가장 긴 이름을 가진 이름의 방번호.
		for(int i = 0 ; i < a.size() ; i++) {
			if(a.get(longnameindex).length() < a.get(i).length()){
				longnameindex = i;
			}
		}
		System.out.println("가장 긴 이름은 : " + a.get(longnameindex));
		System.out.println("===========각 방의 글자 길이는==========================");
		System.out.println(a.get(0) + " : 0번방의 글자 길이는 " + a.get(0).length());
		System.out.println(a.get(1) + " : 1번방의 글자 길이는 " + a.get(1).length());
		System.out.println(a.get(2) + " : 2번방의 글자 길이는 " + a.get(2).length());
		System.out.println(a.get(3) + " : 3번방의 글자 길이는 " + a.get(3).length());
		
	}

}
