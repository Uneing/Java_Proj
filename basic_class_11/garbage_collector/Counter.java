package basic_class_11.garbage_collector;

public class Counter {
//Garbage Collector(가비지 컬렉터) : 메모리의 쓰레기(사용하지않는 객체) 청소,
//System.gc();
//finalize() 메소드 : 가비지 컬렉터가 청소하기 전에 호출 되는 메소드
	//객체 소멸 직전에 호출되는 메소드
	//객체 소멸자(가비지 컬렉터)는 개체를 소멸하기 직전
	private int no;
	public Counter(int no) {
		this.no = no;
	}
	@Override
	protected void finalize() throws Throwable { //객체가 삭제될때 호출되는 메소드
		System.out.println(no + "번째의 finalize()가 실행됨(객체 소멸됨)");
	}
	
}
