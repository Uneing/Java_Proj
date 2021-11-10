package stream_19.outputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamTest2 {

	public static void main(String[] args) throws IOException {
		// fos = new FileOutputStream("C:\\Temp\\output2.txt");
		File file = new File("C:\\Temp\\output2.txt");
		file.createNewFile();
		
		try(FileOutputStream fos = new FileOutputStream("C:\\Temp\\output2.txt")){	//java 9버전부터 지원함
			byte[] bs = new byte[26];	//A~z : 26자
			byte data = 65;
			
			for(int i = 0 ; i < bs.length ; i++) {	//A~z까지 배열에 넣음
				bs[i] = data;
				data++;
			}
			fos.write(bs); //배열의 값을 한꺼번에 아웃풋 스트리믕ㄹ 사용해서 파일에 출력(저장)
		}catch (IOException e) {
			
		}
		System.out.println("출력이 완료 되었습니다.");
	}

}
