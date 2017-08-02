package com.hb.pm;

public class Ex04 {
	 // static : 객체생성과 상관잆이 먼저 생성됨, 누구나 접근 가능 => 공요
	//      별도의 static 메모리에 만들어짐
	//      지역변수나 클래스에는 정의할 수 없다.(예외)내부클래스에서는 가능)
	//      static 메소드는 일반변수를 참조할 수 없다.
 
	
	int a = 0 ;
	static int b = 0 ;
	public Ex04(){
		a++;
		b++;
	}
	
	public void sum (int k1, int k2){
		System.out.println("결과 + " +(k1+k2) );
		double PI = 3.14 ;
		// 지역변수는 static 사용불가
		// double static PI2 = 3.14 ; // 오류
	}
	
	public static void sub(int k){
		// 멤버변수 사용 참조 불가
		// int res = k - a ;
		int res2 = k - b ;
	}
}








