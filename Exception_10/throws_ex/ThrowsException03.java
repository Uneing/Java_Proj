package Exception_10.throws_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException; //동적로딩 : 실행시에 확인 : Class.forName()

public class ThrowsException03 {
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className); //클래스의 전체 이름을 받아서 존재하는지 확인
		return c; //Class.forName(전체 클래스) : 동적로딩이 지원, 
		//동적로딩 : 컴파일시에 이름을 확인하는 것이 아니라 실행시에 이름 확인
	}
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		//throws Exception을 처리하는 객체 생성
		
	/*	try {//Multi catch : 두개의 Exception에 대해서 하나로 처리
			test.loadClass("a.txt", "java.lang.String1");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
		*/
		try {//Surround catch : 각각의 Exception에 대해서 각각처리
			Class d = test.loadClass("C:\\test\\c.txt", "java.lang.String");
			System.out.println(d.getClass());
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e);
			System.out.println("파일이 없습니다.");
		} catch (ClassNotFoundException e) { //동적 로딩이 적용되어서 나중에 확인
			//e.printStackTrace();
			System.out.println(e);
			System.out.println("클래스파일이 없습니다.");
		} catch (Exception e) { //그 외의 모든 Exception을 처리함.
			System.out.println(e);
		}
		System.out.println("프로그램 종료");
	}

}
