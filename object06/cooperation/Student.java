package object06.cooperation;

public class Student {
	String studentname; // 학생이름
	int grade; // 학년
	int money; // 학생이 가진 돈
	
	public Student() {} // 기본 생성자(인풋값이 없고, 실행부가 없는 생성자)
						// 메모리 초기화, 생략 가능
						// 다른 생성자가 있을때 외부에서 호출시 반드시 명시
	Student(String studentname, int money) { // 학생이름과 가진 돈 초기화
		this.studentname = studentname;
		this.money = money;
	}

	void takebus(Bus bus) { // 버스를 탔을때
		bus.take(1000); // 버스의 수입을 증가, 버스에 돈을 지불
		this.money -= 1000; // this. money = this.money - money
	}

	void takesubway(Subway subway) { // 지하철을 탔을때
		subway.take(1500); // 지하철 요금을 지불
		this.money -= 1500; // 자신의 돈에서 1500원 지출 
	}

	void showinfo() {
		System.out.println(studentname + " " + money);
	}
}
