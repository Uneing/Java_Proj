package stream_19.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
	//	FileInputStream fis = new FileInputStream("input.txt");
	//	FileInputStream fis =new FileInputStream("C:\\Temp\\input.txt");
		
		FileInputStream fis = null;
		
		try {
		//	fis = new FileInputStream("input.txt");	//반드시 예외처리(FileNotFoundException)
			fis = new FileInputStream("C:\\Temp\\input.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			
		} catch (IOException e) {	//IOException은 FileNotFoundExceptiond의 상위
			System.out.println(e);
			//	e.printStackTrace();
		}
		System.out.println("end (프로그램 종료)");
	}

}
