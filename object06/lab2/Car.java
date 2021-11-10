package object06.lab2;

public class Car { // this : 객체 자신을 지칭
	String model;
	int speed;

	Car(String model) {// this 생략불가능

		this.model = model;   //model = m; this 생략가능
	}

	void setspeed(int speed) { // this 생략불가능

		this.speed = speed; //speed = s; this 생략가능
	}

	void run() {
		for (int i = 10; i <= 50; i += 10) { // i = i + 10
			this.setspeed(i);
			System.out.println(model + "가 달립니다.(시속" + speed + "km/h"); // this 생략가능
			//System.out.println(this.model + "가 달립니다.(시속" + this.speed + "km/h");
		}
	}
}
