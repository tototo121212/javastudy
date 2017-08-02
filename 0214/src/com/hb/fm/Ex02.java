package com.hb.fm;

// 추상클래스를 상속받으면 자식클래스는 두가지로 나눠진다.
// 1. 일반 클래스 : 부모가 가지는 추상메소드를 오버라이딩해서 반드시 구체화 해라
// 2. 추상 클래스 : 오버라이딩이 하지않으며 자동으로 추상클래스가 된다.

// 일반클래스
class Ex02 extends Ex01{
	@Override
	public void prn3() {
	}
}
// 추상클래스
  abstract class Ex03 extends Ex01{
	
}

 abstract class Ex04 extends Ex03{
	 public abstract void prn4();
 }
 
 
 class Ex05 extends Ex04{
	@Override
	public void prn4() {
		
	}
	@Override
	public void prn3() {
		
	}
	 
 }
 
 
 
 
 
 