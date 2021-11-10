package datafype01;

public class TypeCasting {

	public static void main(String[] args) {
		/*
		 * 묵시적 형변환 : 작은 그릇의 데이터를 -> 큰 그릇에 넣을때 => 형변환이 자동으로 일어남
		 * 
		 * 명시적 형변환 큰 그릇의 데이터를 -> 작은 그릇에 넣을때 => 자료의 손실이 일어 날 수도 있음
		 */

		byte b1 = 65;
		short s1;
		s1 = b1; // 묵시적 형변환
		System.out.println(b1 + "   " + s1);
		int num1 = s1 + b1; // 묵시적 형변환

		char ch1 = (char) b1; // 명시적 형변환
		System.out.println(ch1);

		short s2 = 100;
		byte b2 = (byte) s2;
		System.out.println(b2);
		int num2 = 300;
		b2 = (byte) num2;
		System.out.println(b2);
		// byte는 -128~127이기 때문에 원활한 값이 안 나옴
		// 데이터 손실

		double dl = 3.14;
		int num3 = (int) (num2 + dl); // 데이터 손실

		//String str = "컴퓨터";// 참조형 자료

		System.out.println(dl + "     " + num2 + "     " + num3);
	}

}
