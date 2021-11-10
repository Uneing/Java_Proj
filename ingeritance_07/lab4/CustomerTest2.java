package ingeritance_07.lab4;

public class CustomerTest2 {

	public static void main(String[] args) {
		
		VIPCustomer choi = new VIPCustomer(10020,"CHOI",12345);
		choi.bonusPoint = 10000;
		
		System.out.println(choi.showCustomerInfo());
	}

}
