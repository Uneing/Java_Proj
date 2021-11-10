package interface_08.lab01;

public class SmartPhone extends PDA implements MobilePhoneInterface,MP3Interface{

	@Override
	public void cendCall() { //Phone
		System.out.println("따르르르르ㅡ르르릉ㄹ으ㅡㄹㅇ");
	}

	@Override
	public void receiveCall() { //Phone
		System.out.println("전화왔음 빨리 받아 ;;");
	}

	@Override
	public void play() { //MP3
		System.out.println("ASAP~ 내 통장 잔고 반~쪼가리~");
	}

	@Override
	public void stop() { //MP3
		System.out.println("뚝 - (음악꺼짐)");
	}

	@Override
	public void sendSMS() { //Mobile
		System.out.println("문자 ㄱㄱ");
	}

	@Override
	public void receiveSMS() { //Mobile
		System.out.println("문자 옴 빨리 봐 ;;");
	}
	public void schedule() {
		System.out.println("일정 관리 좀,,,");
	}
	

}
