package stream_19.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Animal implements Externalizable{
	String name;
	int age;
	
	Animal(){}
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name + ", " + age;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeInt(age);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		age = in.readInt();
	}
}
public class Lab2_Externalizable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Animal lion = new Animal("사자", 10);
		Animal tiger = new Animal("호랑이", 20);
		
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\animal.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(lion);
		oos.writeObject(tiger);
		
		System.out.println("===직렬화 성공(Externalizable)===");
		
		FileInputStream fis = new FileInputStream("C:\\Temp\\animal.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
	
		Animal p1 = (Animal)ois.readObject();
		Animal p2 = (Animal)ois.readObject();
		
		System.out.println(p1);
		System.out.println(p2); 
	}

}
