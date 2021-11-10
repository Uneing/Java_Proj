package Exception_10;

public class ArrayExceptionHandling01 {	//try에서 예외가 발생할 경우 catch블락이 작동

	public static void main(String[] args) {
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
		System.out.println("프로그램 정상 종료");
	}

}

/*try { 
	//예외가 발생될 부분
}catch (예외처리부분 e){
	//예외를 처리 할 부분, try내에서 예외가 발생이 되면 작동
}*/
