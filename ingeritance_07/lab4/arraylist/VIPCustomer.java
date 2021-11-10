package ingeritance_07.lab4.arraylist;

public class VIPCustomer extends Customer{
	private int agentID; //VIP 고객은 담당 사원이 특별 관리,
	double saleRatio; //물품의 할인율, VIP고객에게만 적용
	
	public VIPCustomer() {
		customerGrade = "VIP"; //상속된 필드, 고객등급
		bonusRatio = 0.05; //상속된 필드, 보너스 적립 비율
		saleRatio = 0.1; //물품의 할인율
	}

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}

	public int calprice(int price) {
		bonusPoint += price*bonusRatio;	//보너스 포인트 적립
		return price - (int)(price * saleRatio); //VIP 고객이면 할인(10%)
	}
	public int getAgent() {return agentID;} //VIP 고객 담당 사원
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원은 " + agentID + "입니다.";
	}
	
	
	
	
}