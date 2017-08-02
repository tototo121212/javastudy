package com.hb.am;

public class Ex03_Main {
	public static void main(String[] args) {
		Ex03 test = new Ex03();
		new Thread(test, "mother").start();
		new Thread(test, "son").start();
		new Thread(test, "dog").start();
		new Thread(test, "cat").start();
		new Thread(test, "tiger").start();
	}
}
