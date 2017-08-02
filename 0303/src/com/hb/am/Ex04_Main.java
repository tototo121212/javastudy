package com.hb.am;

public class Ex04_Main {
	public static void main(String[] args) {
		// 일반적인 사용방법
		System.out.println("main : " +Thread.currentThread().getName());
		Ex01 test1 = new Ex01();
		Ex02 test2 = new Ex02();
		Ex03 test3 = new Ex03();
		
		test1.prn();
		test2.prn();
		test3.prn();
		
		test1.start();
		test2.start();
		test3.start();

		System.out.println("main : " +Thread.currentThread().getName());
		System.out.println("수고하셨습니다.");
	}
}
