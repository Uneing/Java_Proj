package ingeritance_07.abstract_calc;

public abstract class Calculator {	//추상 클래스 : 프로젝트 설계자가 구현부는 없이 선언만 해둠.
	
	public abstract int add(int a, int b);	//선언만 함, 자식 클래스에서 구현
	public abstract int substract (int a, int b);
	public abstract double average (int[] a);
	public abstract int times(int[] b);	// 배열을 인풋 받아 모두 곱하고 정수로 리턴

}
