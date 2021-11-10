package ingeritance_07.lab4;

public class CustomerTest1 extends VIPCustomer{

	public static void main(String[] args) {
		Customer lee = new Customer();	//부모 객체를 생성
		lee.setCustomerID(10010);
		lee.setCustomerName("Lee");
		lee.bonusPoint = 1000;
		
		System.out.println(lee.showCustomerInfo());
		
		VIPCustomer kim = new VIPCustomer();  //자식 객체를 생성
		kim.setCustomerID(10020);
		kim.setCustomerName("kim");
		kim.bonusPoint = 1000;
		System.out.println(kim.showCustomerInfo());
	}

}
