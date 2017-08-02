package com.hb.am;

public class Ex03 extends Thread{
	public void prn(){
		for (int i = 0; i < 10 ; i++) {
			System.out.println("숫자 : " + Thread.currentThread().getName());
		}
	}
	@Override
	public void run() {
		for (int i = 0; i < 10 ; i++) {
			System.out.println("숫자1 : " + Thread.currentThread().getName());
		}
	}
	@Override
	public void start() {
		for (int i = 0; i < 10 ; i++) {
			System.out.println("숫자2 : " + Thread.currentThread().getName());
		}
	}
}
