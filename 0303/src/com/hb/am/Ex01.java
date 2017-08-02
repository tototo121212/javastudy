package com.hb.am;

public class Ex01 extends Thread{
	public void prn(){
		for ( ; ; ) {
			System.out.println("a : " + Thread.currentThread().getName());
		}
	}
	@Override
	public void run() {
		for (int i = 0; i < 10 ; i++) {
			System.out.println("a1 : " + Thread.currentThread().getName());
		}
	}
	@Override
	public void start() {
		for (int i = 0; i < 10 ; i++) {
			System.out.println("a2 : " + Thread.currentThread().getName());
		}
	}
}
