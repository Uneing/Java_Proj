package ingeritance_07.lab4;

public class CustomerText3 {

	public static void main(String[] args) {
		Customer jang = new Customer(10010,"Jang");
		jang.bonusPoint = 1000;
		
		VIPCustomer jo = new VIPCustomer(10020,"Jo",12345);
		jo.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(jang.getCustomerName()+"님이 지불해야 할 금액은 " +
							jang.calcPrice(price)+"입니다.");
	
		System.out.println(jo.getCustomerName() + "님이 지불해야 할 금액은 " +
							jo.calcPrice(price) + "입니다.");
			//동적 바인딩 : 상속 관계에서 부모클래스와 자식클래스에서 동일한 메소드가 존재할 경우
			// 			 자식 클래스의 메소드로 바인딩이 된다.
	}

}
