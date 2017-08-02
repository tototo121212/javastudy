package com.hb.cm;

// 인터페이스를 상속받자

// 일반클래스 ; 오버라이딩
class Ex02 implements Ex01{
	@Override
	public void sub() {   }
	@Override
	public void mul() {  	}
}
// 추상 클래스 : 클래스 앞에 abstract 붙여서 추상 클래스로 만듬
abstract class Ex03 implements Ex01{
	public abstract void div();
}

// 인터페이스
interface Ex04 extends Ex01 {
	public void add();
}

// Ex04 구체화를 하지 않은 것 까지 모두 구체화를 해야 된다.
class Ex05 implements Ex04{

	@Override
	public void sub() {}

	@Override
	public void mul() {}

	@Override
	public void add() {}
	
}




