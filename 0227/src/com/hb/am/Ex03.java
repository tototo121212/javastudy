package com.hb.am;

// 2. Local 내부 클래스 : 외부클래스 메소드 안에 내부클래스가 존재
//                       외부클래스의 지역변수처럼 사용된다.
// 특징) 외부클래스의 메소드가 실행될때 내부클래스 생성된다.
// 형식) 외부클래스{ 멤버들..., 메소드(){내부클래스{}}  }
public class Ex03 {
	int su1 = 100;
	public Ex03() {
		System.out.println("외부클래스생성자 : " + this);
	}
	public void prn(){
		 int s = 10;
		System.out.println("외부클래스메소드");
		System.out.println(su1 + s);
	}
	public void prn2(){
		int num1 = 1000;
		int num2 = 2000;
		
		// Local내부클래스에서는 static 사용 불가
		 class Ex03_1{
			int number1 = 1 ;
		//	static int number2 = 2 ;
			static final int number3 = 3;
			final int number4 = 4 ;
			
			public void in_prn(){
				// 외부클래스변수,메소드 사용가능
				System.out.println(su1 );
				// 다른 메소드의 지역변수는 사용불가
				// System.out.println(su1 + s );
				prn();
			} // 내부메소드 끝
		}// 내부클래스 끝
		 Ex03_1 t = new Ex03_1();
		 System.out.println(":: 내부클래스 변수::");
		 System.out.println(t.number1);
		 System.out.println(t.number3);
		 System.out.println(t.number4);
		 System.out.println(":: 내부클래스 메소드::");
		 t.in_prn();
		 
		 System.out.println("외부클래스의 변수");
		 System.out.println(su1);
		 System.out.println("외부클래스의 메소드");
		 prn();
		// 다른 지역의 변수 사용 불가 
		// System.out.println(prn.s);
		// 소속된 지역의 변수는 사용 가능
		 System.out.println(num1);
		 
	} // 외부메소드 끝
} // 외부클래스 끝










