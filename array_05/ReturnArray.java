package array_05;

public class ReturnArray {
	static int[] makeArray() {
		 int temp[] = new int[4];	// 정수형 배열 방 4개 생성
		for(int i = 0 ; i<temp.length;i++) {	//for문을 사용해서 각 방에 정수값을 할당.
			temp[i] = i;	//배열의 각방에 값 : 0,1,2,3
		}
		return temp;
	}
	public static void main(String args[]) {
		int intArray[];
		intArray = makeArray(); //메소드로부러 배열을 전달 받음.
		//intArray = ReturnArray.makeArray();  //static으로 인해 클래스로 호출가능
		for(int i = 0 ; i <intArray.length ; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		System.out.println("===========================");
		
		intArray[0] = 50;
		intArray[1] = 60;
		intArray[2] = 70;
		intArray[3] = 80;
		
		for(int a : intArray) {
			System.out.print( a + " ");
		}
	}
}
//객체없을때 static 생성해야지만 호출가능