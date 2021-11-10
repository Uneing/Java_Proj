package ingeritance_07.p;

public class B extends A{
	void set() {
		pub = 1;
		pro = 2;
		def = 3;	
//		pri = 4; 접근 불가능
	}
	public void showInfo() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def);
//		System.out.println(pri);  접근 불가능
	}
}
