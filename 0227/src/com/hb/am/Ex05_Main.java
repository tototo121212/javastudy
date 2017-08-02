package com.hb.am;

public class Ex05_Main {
	public static void main(String[] args) {
		Ex05_1 test = new Ex05_1();
		test.prn();
		
		test.prn2(new TestInner() {
			@Override
			public void prnData() {
				System.out.println("인터페이스 사용법3");
				System.out.println(TestInner.data);
			}
		});
	}
}
