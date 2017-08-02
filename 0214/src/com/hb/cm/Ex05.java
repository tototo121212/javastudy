package com.hb.cm;

public class Ex05 extends Ex04{
	String name ="홍둘리";
	
	// 오버라이딩: 부모클래스의 메소드를 가지고와서
	//          자기마음대로 변경하는 것
	
	// 오버라이딩의 반대 : final 메소드
	//   부모클래스의 메소드를 가지고와서 사용만 할 수 있다.
	//   즉 부모클래스이 메소드의 내용을  변경할 수 없다.
	
	public void add(){
		age = age + 10 ;
		System.out.println(age);
	}
	
	@Override
	public void sub() {
		age = age -15;
		System.out.println(age);
	}
}
