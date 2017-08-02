package com.hb.pm;

public class Ex05Test {
	public static void main(String[] args) {
		Ex05 test = new Ex05("종로");
		Ex05.interest = 0.2f ;
		
		test.getInfo();
		
		Ex05 test2 = new Ex05("신촌");
		test2.getInfo();
		
		Ex05 test3 = new Ex05("강남");
		Ex05.interest = 0.15f;
		
		test3.getInfo();

		Ex05 test4 = new Ex05("서초");
		test4.getInfo();
	}
}
