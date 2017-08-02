package com.hb.am;

public class Ex02_Main {
	public static void main(String[] args) {
		
	// 내부클래스는 별도로(내부클래스혼자) 개체 생성이 안됨
	//	Ex02_1 test = new Ex02_1();
		
    // 반드시 외부클래스를 통해서만 만들어라
		Ex02 test = new Ex02();
		System.out.println("::::::::::::::::::::");
		Ex02.Ex02_1 test1 = new Ex02().new Ex02_1();
		System.out.println("::::::::::::::::::::");
		Ex02.Ex02_1 test2 = test.new Ex02_1();
		System.out.println(":::::::외부클래스 접근:::::::");
		
	// 외부클래스에접근하기
		System.out.println(test.su1);
		System.out.println(test.su2);
		System.out.println(test.su3);
		System.out.println(test.su4);
	//	System.out.println(test.su5); // private
		test.prn();
		System.out.println("::::::::내부클래스 접근::::::::::");
	//  내부클래스 접근
	    System.out.println(test2.s1);
	    System.out.println(test2.s2);
	    System.out.println(test2.s4);
	    test2.in_prn();
	}
}









