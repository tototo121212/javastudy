package com.hb.am;

public class Ex02 extends Thread{
	public void prn(){
		for (int i = 0; i < 10 ; i++) {
			System.out.println("°¡ : " + Thread.currentThread().getName());
		}
	}
	@Override
	public void run() {
		for (int i = 0; i < 10 ; i++) {
			System.out.println("°¡1 : " + Thread.currentThread().getName());
		}
	}
	@Override
	public void start() {
		for (int i = 0; i < 10 ; i++) {
			System.out.println("°¡2 : " + Thread.currentThread().getName());
		}
	}
}
