package stream_19.outputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamTest1 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Temp\\output.txt");
		file.createNewFile();	//파일을 생성
		
		try(FileOutputStream fos = new FileOutputStream("C:\\Temp\\output.txt")){
			
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
		} catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("출력이 완료 되었습니다.");
	}

}
