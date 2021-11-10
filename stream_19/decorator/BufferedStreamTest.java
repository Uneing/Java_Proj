package stream_19.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {	//BufferedStream을 사용해서 복사, 8KB 처리, (복사를 빨리 함)

	public static void main(String[] args) throws IOException {
		//C:\Temp\a.exe -> C:\Temp\c.exe <-BufferedStream을 사용(RAM 8KByte 처리)
		//BufferedStream : 보조 스트림, RAM사용, 8KB처리
		
		FileInputStream fis = new FileInputStream("C:\\Temp\\a.exe");	//기반스트림
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\c.exe"); //기반스트림
	
		BufferedInputStream bis = new BufferedInputStream(fis); //보조스트림(인풋)
		BufferedOutputStream bos = new BufferedOutputStream(fos); //보조스트림(아웃풋)
		
		long millisecond = 0;
		millisecond = System.currentTimeMillis(); //복사전의 시스템의 시간을 밀리세컨드 단위로 저장
		int i;
		while((i = bis.read()) != -1) { //8KB 읽어 들임
			bos.write(i);				//8KB 쓰기
		}
		millisecond = System.currentTimeMillis() - millisecond; // 전체 복사 시간
	
		System.out.println("총 복사 시간은 : " + millisecond + " 밀리세컨드 입니다.");
	}

}
