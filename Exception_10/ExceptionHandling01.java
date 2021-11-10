package Exception_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ExceptionHandling01 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
		//fis = new FileInputStream("c.txt"); //이클립스의 프로젝트 하위
			fis = new FileInputStream("C:\\test\\c.txt"); 
		} catch(FileNotFoundException e) {
			System.out.println(e);
			System.out.println("catch 블락 작동");
		}
		finally {//try{}블락이 실행 되면 finall{}은 반드시 실행 (예외 발생과 상관없이 작동)
			System.out.println("finally 블락 실행");
		}
		System.out.println("프로그램 종료");
		
		
		
	}

}
