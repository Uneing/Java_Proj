package Exception_10.custom_Exception.p444;

public class BalanceInsufficientException extends Exception{ //Exception선언
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		super(message); //getmessage로 출력
	}
}
