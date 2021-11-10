package ingeritance_07.lab4.arraylist;

public class Customer { //고객 정보를 나타내는 부모 클래스
	protected int customerID;	//고객 ID
	protected String customerName; //고객 이름
	protected String customerGrade; //고객 등급(VIP, Gold, Silver...)
								//적립 포인트, 할인율
	int bonusPoint; //보너스 포인트, 포인트적립 : 등급에 따라 적립
	double bonusRatio; //포인트 적립 비율 : 등급에 따라 할인
	
	public Customer() {
		initCustomer();
	}
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	private void initCustomer() {	//고객 등급을 초기화 하는 메소드
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	public int calcPrice(int price) {	//구매한 물품에 대해서 보너스 포인트를 적립하는 메소드
		bonusPoint += price * bonusRatio; //기존의 보너스 포인트에서 새로운 보너스 포인트를 적립
		return price;	//일반 고객은 가격 할인 없음
	}
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " +
				bonusPoint + "입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}







}
