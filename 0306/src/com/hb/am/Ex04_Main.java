package com.hb.am;

public class Ex04_Main {
	public static void main(String[] args) {
		Ex04 test = new Ex04();
		new Thread(test,"user1").start();
		new Thread(test,"user2").start();
	}
}
