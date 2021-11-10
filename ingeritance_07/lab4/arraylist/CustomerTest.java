package ingeritance_07.lab4.arraylist;

import java.util.*;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer Lee = new Customer(10010, "이순신");
		Customer Shin = new Customer(10020, "신사임당");
		Customer Hong = new GoldCustomer(10030,"홍길동");	//업캐스팅
		Customer Yul = new GoldCustomer(10040, "율곡"); //업캐스팅
		Customer Kim = new VIPCustomer(10050, "김유신", 12345); //업캐스팅
		
		customerList.add(Lee);	//index 0
		customerList.add(Shin); //index 1
		customerList.add(Hong); //index 2
		customerList.add(Yul); //index 3
		customerList.add(Kim); //index 4
		
		System.out.println("========고객 정보 출력========");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		System.out.println("========보너스 포인트와 할인율 계산========");
		int price = 10000;
		
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불 하셨습니다.");
			System.out.println(customer.getCustomerName() + "님의 현재 포인트는 "+ customer.bonusPoint + "점 입니다.");
		}
		Customer c = customerList.get(4);
		System.out.println(c.showCustomerInfo());
		
	}

}
