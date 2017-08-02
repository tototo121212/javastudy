package com.hb.am;

// 3. static 내부클래스
public class Ex04 {
	String name = "홍길동";
	int age = 14;
	
	// member내부클래스에서 내부클래스변수가 어쩔수 없이 static경우
	// 내부클래스를 static으로 만들어야 오류발생없음
	// 이것이 static 내부클래스이다.
	static class Ex04_1{
		String str = "임꺽정";
		int age = 123;
		static double pi = 3.14 ;
		static final double pi2 = 3.14;
	}
}
