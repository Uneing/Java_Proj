package stream_19.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Lab1_ReadSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis =new FileInputStream("C:\\Temp\\student.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student p1 = (Student)ois.readObject();	//첫번째 객체를 읽어서 p1에 할당
		Student p2 = (Student)ois.readObject();	//두번째 객체를 읽어서 p2에 할당
		Student p3 = (Student)ois.readObject();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}

}
