package Exception_10;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		int arr[] = new int [5];
		
		for(int i = 0 ; i <= 5 ; i++) {	//Exception 발생. 배열의 방번호를 넘겨 버림
			//ArrayIndexOutOfBoundsException : 배열의 방번호를 넘겨버렸을때 발생
			arr[i] = i;
			System.out.println(arr[i]);
		}
		System.out.println("프로그램 정상 종료");
	}

}
