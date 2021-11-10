package ingeritance_07.r;

import ingeritance_07.q.A;	//다른 패키지의 클래스를 사용할때 import필요

public class B extends A{
	void set() {
		pub = 1;	// 어디서든지 접근 가능
		pro = 2;	// 상속관계에 있는 다른 패키지에서까지 접근 가능
//		def = 3;	다른 패키지에서 접근 불가능
//		pri = 4;	같은 클래스만 가능
	}
	void showInfo() {
		System.out.println(pub);
		System.out.println(pro);
//		System.out.println(def);
//		System.out.println(pri);
	}
}
