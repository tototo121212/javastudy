package com.hb.bm;

public class Main {
	public static void main(String[] args) {
		Car car = new Car();
		Producer  producer = new Producer(car);
		Customer customer = new Customer(car);
		
		new Thread(producer).start();
		new Thread(customer).start();
	}
}
