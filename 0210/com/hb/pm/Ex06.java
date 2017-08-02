package com.hb.pm;

public class Ex06 {
	// static 초기화 
	// 형식) static { 초기화 }
	
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
		// main 도 static 이기 때문에 멤버변수 사용 할 수 없다.
		// System.out.println(a); 
		System.out.println(b); // 100
		System.out.println(c);  // 2000
		System.out.println(k1);
	}
}







