package stream_19.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
	//Finally 생략, Try With Resource

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			//try with resource, Finally에 close를 자동으로 처리
			//FileInputstream은 AutoCloseable인터페이스의 close() 메소드 재정의
			int i;
			while((i = fis.read()) != - 1) {	//EOF(End of File): -1
				//파일의 마지막 끝까지 읽어온다. IOException
				System.out.println((char) i );
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
