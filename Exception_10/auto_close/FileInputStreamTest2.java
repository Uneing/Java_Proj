package Exception_10.auto_close;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {	//AutoClose를 사용해서 객체 해제.

	public static void main(String[] args) {
		//FileInputStream fis = null; 
		//FileInputStream은 Closeable 인터페이스를 구현하고 있다.
		
		try (FileInputStream fis = new FileInputStream("C:\\test\\input01.txt")){
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e);
		} catch (IOException e1) {
		//	e1.printStackTrace();
			System.out.println(e1);
		}
	}

}
