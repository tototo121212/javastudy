package com.hb.am;

public class Ex03_Main {
	public static void main(String[] args) {
		// 내부클래스는 혼자서 객체 생성 안됨
		// Ex03_1 test = new Ex03_1();
		
		// Member처럼 외부클래스를 통해서 객체 생성 안됨
		// Ex03.Ex03_1 test = new Ex03().new Ex03_1();
		
		// 외부클래스 생성
		Ex03 test = new Ex03();
		// Ex03.Ex03_1 = test.new Ex03_1();
		// 내부클래스가 속한 외부클래스 메소드를 실행 한 후
		// 내부클래스 끝나는 지점과 외부메소드 끝나는 지점 사이에서 
		// Local 내부클래스를 생성해야 된다.
		// test.prn2();
	}
}
