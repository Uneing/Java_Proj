package Exception_10.auto_close;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {	//AutoClose없이 객체 해제(삭제)
 //finally에서 close()메소드 호출
	public static void main(String[] args)  {
		FileInputStream fis = null;
		
		try {
		fis = new FileInputStream("C:\\test\\input.txt");
		
		System.out.println((char)fis.read()); //한글자를 읽어서 char로 출력
		System.out.println((char)fis.read());
		System.out.println((char)fis.read());
		
		//IOexception 하위에 FildeNotFoundException이 존재
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			//e.printStackTrace();
			System.out.println(e);
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				//e.printStackTrace();
				System.out.println(e);
			}catch(NullPointerException e) {
				System.out.println(e);
			}
		}
	}

}
