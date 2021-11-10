package Exception_10;

public class ArrayExceptionHandling02 {

	public static void main(String[] args) {//try에서 예외가 발생되지 않을 경우 catch블락은 작동X
		int arr[] = new int[5];
		try {
		for(int i = 0 ; i <= 5 ; i++) {
			arr[i] = i;	//각방에 값을 추가
			System.out.println(arr[i]);
		}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);	//오류코도를 출력해라
			System.out.println("예외처리부분");
		}
	}

	}


