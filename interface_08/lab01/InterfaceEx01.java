package interface_08.lab01;

public class InterfaceEx01 {

	public static void main(String[] args) {
		SmartPhone sm = new SmartPhone();
		sm.printLog();
		sm.cendCall();
		sm.play();
		System.out.println("3과 5를 더하면 " + sm.calculate(3, 5));
		sm.schedule();
		
		
	}

}
