package com.hb.pm;

// 부모클래스
public class Ex01 {
	// 상속 : 클래스와 클래스간의 관계 (is a 관계)
	//       자식클래스가 부모클래스의 멤버(변수,상수,메소드)들을 아무런 제약없이 사용 
	//       즉 자식클래스의 능력 확장(extends 예약어 사용)
	
	String name = "홍길동";
	int age = 12 ;
	private String addr ="서울";
	static int su = 5 ;
	private static int su2 = 100;
	
	// this ; 클래스안에서 자기 자신(참조주소)을 지칭하는 예약어 
	public Ex01(String name) {
	   System.out.println("부모클래스생성자 : " + this);
	   this.name = name;
	}
	public void prn(){
		System.out.println("부모클래스메소드");
	}
	public static void prn2(){
		System.out.println("부모클래스static메소드");
	}
}




