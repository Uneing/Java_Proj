package stream_19.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\data.txt");
		FileInputStream fis = new FileInputStream("C:\\Temp\\data.txt");
		
		DataOutputStream dos = new DataOutputStream(fos);
		DataInputStream dis = new DataInputStream(fis);
		//다양한 형식의 자료형을 처리, 주의 : 아웃풋 자료형과 인풋 자료형이 동일해야함.
		//오라클(MS-SQL, My-SQL) -> HTML,CSS,JS,JSP,Spring, 리액트, 파이썬...
	
	dos.writeByte(100);
	dos.writeChar('A');
	dos.write(10);
	dos.writeFloat(3.14F);	//F 꼭 
	dos.writeDouble(3.14159);
	dos.writeUTF("안녕하세요."); //String
	System.out.println("출력 완료 <- 외부 파일에 저장");
	
	System.out.println("===인풋해서 출력===");
	System.out.println(dis.readByte());
	System.out.println(dis.readChar());
	System.out.println(dis.read());
	System.out.println(dis.readFloat());
	System.out.println(dis.readDouble());
	System.out.println(dis.readUTF());
	}

}
