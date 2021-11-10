package object06.lab4;

public class CarExample {

	public static void main(String[] args) {
	/*	Car mycar = new Car();

		mycar.setSpeed(-50);

		System.out.println("현재속도 : " + mycar.getSpeed());

		mycar.setSpeed(60);

		if (!mycar.isStop()) {
			mycar.setStop(true);
		}
		System.out.println("현재속도 : " + mycar.getSpeed());
	}*/
		int max = 0;
		int[] array = {4,8,1,2,3};
		for(int i = 0; i<= array.length ; i++ ) {
				if(i>max) max = i; 
		}	System.out.println("max: " + max);	
	}

}
