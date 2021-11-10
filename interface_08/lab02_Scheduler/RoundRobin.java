package interface_08.lab02_Scheduler;

public class RoundRobin implements Scheduler{
	//상담원 한 명씩 돌아가며 동일하게 상담 업무를 배분함.
	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옴");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");
	}
	
}
