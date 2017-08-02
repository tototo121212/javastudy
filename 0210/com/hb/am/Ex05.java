package com.hb.am;

public class Ex05 {
	
	private String name ="둘리" ;
	private int age = 10 ;
	
	// this() : 생성자에서 다른 생성자를 호출할 때 사용 ;
	//          생성자 안에서 첫줄에서만 사용가능
	public Ex05() {
		// Ex05("희동이") ; // 오류발생
		 this("희동이");
		//this("둘리2", 15);
	    // System.out.println(this);
	}
	public Ex05(String name) {
		this("둘리2", 15) ;
		this.name = name ;
	}
	public Ex05(String name , int age) {
		this.name = name ;
		this.age = age ;
	}
	
	public String getName(){
	     return name ;
	}
	
}
