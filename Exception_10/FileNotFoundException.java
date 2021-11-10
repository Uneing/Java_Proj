package Exception_10;

import java.io.FileInputStream;


public class FileNotFoundException {	//FileNotFoundException : 파일의 경로를 찾을수 없을 경우 예외

	public static void main(String[] args) {
		FileInputStream fis = null;	//파일에서 값을 읽어오는 스트림
		
		try {
		fis = new FileInputStream("a.txt");
		}
		catch(Exception e) {
			System.out.println(e);	//오류정보 출력
			System.out.println("예외발생함");
		}
		System.out.println("프로그램 정상 종료");
		
	}

}
