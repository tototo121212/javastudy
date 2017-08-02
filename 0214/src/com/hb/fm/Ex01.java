package com.hb.fm;

// 추상클래스 : 추상메소드를 하나 이상 가지고 있는 클래스를 말함
//              일반클래스가 가지고 있는 멤버들을 모두 가질 수 있다. 
// **추상메소드 : body가 없는 메소드, 즉 구체화가 되지 않은 메소드를 말함
// 추상 클래스나 추상메소드는 반드시 abstract 예약어를 사용해야 된다.

// 추상클래스를 상속받으면 자식클래스는 두가지로 나눠진다.
// 1. 일반 클래스 : 부모가 가지는 추상메소드를 오버라이딩해서 반드시 구체화 해라
// 2. 추상 클래스 : 오버라이딩이 하지않으며 자동으로 추상클래스가 된다.
public abstract class Ex01 {
	int su1 = 10 ;
	static int su2 = 20;
	final int su3 = 30 ;
	final static int su4 = 40 ;
	
	public void prn(){
		su1++;
		su2++; 
		// su3++;
	    // su4++;
	}
	public static void prn2(){
		System.out.println(su2);
		System.out.println(su4);
	}
	
	// 추상메소드 : body가 없는 메소드, 반드시 abstract를 붙여라(클래스에도 붙여라)
	public abstract void prn3();
}






