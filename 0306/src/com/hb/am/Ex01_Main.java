package com.hb.am;

public class Ex01_Main {
	public static void main(String[] args) {
		System.out.println("메인 시작: " + Thread.currentThread().getName());
		Ex01 test = new Ex01();
		test.start();
		// join() :  현재 스레드는 join()를 호출한 스레드가 끝날때까지
		//           무조건 대기상태에 빠진다. join()를 호출한 스레드가 
		//           끝나야 다시 실행 할 수 있다.
		try {
			test.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메인 끝: " + Thread.currentThread().getName());
	}
}
