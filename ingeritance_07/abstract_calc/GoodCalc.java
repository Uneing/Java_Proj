package ingeritance_07.abstract_calc;

public class GoodCalc extends Calculator{//Calcultor 클래스의 추상메소드(선언)==>구현
	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) { //배열의 값을 할당 받아서 평균을 리턴
		double sum = 0;
		for(int i = 0 ; i < a.length ; i++) {
			sum += a[i];
		}
		return sum/a.length;
	}
		public int times(int[] b) {
		int tim = 1;
		for(int i = 0; i < b.length; i++) {
			tim *= b[i];
		}
		return tim;	
	}

	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		int[] cc= {4,5,6,7,8,9}; //정수형 배열에 값을 할당
		int[] dd= new int[5];
		dd[0] = 30;
		dd[1] = 40;
		dd[2] = 50;
		dd[3] = 60;
		dd[4] = 70;
		int[] ee = {2,3,4,5,6,7};
		System.out.println(c.add(2, 3));
		System.out.println(c.substract(2, 3));
		System.out.println(c.average(new int [] {2,3,4}));
		System.out.println(c.average(cc));
		System.out.println(c.average(dd));
		System.out.println(c.times(ee));
	}

	


}
