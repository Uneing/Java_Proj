package interface_08.lab01;

public interface Phone {
	int TIMEOUT = 10000; //상수
	void cendCall();
	void receiveCall();
	default void printLog() {
		System.out.println("로고를 프린트합니다.");
	}
}
