package object06.cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// 학생 두명을 생성해서 버스와 지하철 탑승
		Student choi = new Student();
		Student Kim = new Student ("Kim", 5000); //Kim 학생 객체 생성 
		Student Lee = new Student ("Lee", 10000); //Lee 학생 객체 생성
		Student jang = new Student ("jang", 20000);
		
		Bus bus1 = new Bus (1);
		Kim.takebus(bus1); // Kim이 1번 버스를 탐
		Kim.showinfo();
		bus1.showinfo();
		
		
		Subway sub2 = new Subway("2호선");
		Lee.takesubway(sub2);
		Lee.showinfo();
		sub2.showinfo();
		
		jang.takebus(bus1);
		jang.takesubway(sub2);
		jang.showinfo();
		bus1.showinfo();
		sub2.showinfo();
	}

}
