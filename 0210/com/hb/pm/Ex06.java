package com.hb.pm;

public class Ex06 {
	// static �ʱ�ȭ 
	// ����) static { �ʱ�ȭ }
	
	int a = 10 ;
	static int b = 20;
	static {
		b = 100 ;
		c = 1000 ;
	}
	static int c = 2000 ;
	
	public void add(){
		System.out.println(a);
	}
	public static void main(String[] args) {
		int k1 = 10 ;
		// main �� static �̱� ������ ������� ��� �� �� ����.
		// System.out.println(a); 
		System.out.println(b); // 100
		System.out.println(c);  // 2000
		System.out.println(k1);
	}
}







