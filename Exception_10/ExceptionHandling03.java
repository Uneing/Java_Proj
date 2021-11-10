package Exception_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling03 { // finally{} 블락에 객체를 종료

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("e.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.out.println("catch 블락 작동");
		} finally {// try{}블락이 실행 되면 finall{}은 반드시 실행 (예외 발생과 상관없이 작동)
			System.out.println("finally 블락 실행");

			//if (fis != null) {
				try {
					fis.close(); // 객체를 메모리에서 제거 (예외처리 해야함)
					System.out.println("객체 정상 메모리에서 제거");
				} catch (IOException e) {
					System.out.println("객체 정상 메모리에서 제거안됨 (null)");
					e.printStackTrace();
				}
		//	}
		}
		System.out.println("프로그램 종료");

	}

}
