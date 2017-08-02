package com.hb.pm;

public class Ex02Main {
	public static void main(String[] args) {
		
		System.out.println(Ex01.su);
		//  static이라도 private은 접근 불가
		// System.out.println(Ex01.su2);
		
		
		// 자식클래스 객체 생성
		Ex02 test = new Ex02();
		
		test.namePrn();
	}
}
