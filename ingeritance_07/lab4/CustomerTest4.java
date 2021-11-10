package ingeritance_07.lab4;

public class CustomerTest4 {

	public static void main(String[] args) {
		Customer vc = new VIPCustomer (100030, "홍길동", 2000);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName() + "님이 지불해야할 금액은 " + 
							vc.calcPrice(10000) + "입니다. ");
	}

}
