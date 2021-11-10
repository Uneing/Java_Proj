package ingeritance_07.lab4;

public class CustomerTest5 {

	public static void main(String[] args) {
		int price = 10000;
		Customer lee = new Customer(100100, "Lee");
		System.out.println(lee.getCustomerName() + "님이 지불해야할 금액은 " + 
							lee.calcPrice(10000) + "입니다. ");
		
		VIPCustomer kim = new VIPCustomer(100200, "Kim", 6789);
		System.out.println(kim.getCustomerName() + "님이 지불해야할 금액은 " + 
				kim.calcPrice(10000) + "입니다. ");
		
		Customer vc = new VIPCustomer(10030, "홀", 2000);
		System.out.println(vc.getCustomerName() + "님이 지불해야할 금액은 " + 
				vc.calcPrice(10000) + "입니다. ");		
				
		//업캐스팅 : 자식 객체를 생성해서 부모 객체의 타입으로 형식을 변화느 
		//단, 메소드 오버라이딩이 있을 경우 동적 바인딩에 의해서 자식 객체의 메소드 호출
				
				
	}

}
