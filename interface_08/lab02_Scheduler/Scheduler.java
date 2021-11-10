package interface_08.lab02_Scheduler;

public interface Scheduler {
	void getNextCall();	//다음 콜을 받아오는 메소드
	void sendCallToAgent(); // 콜을 에이전트엑 보내는 메소드
}
