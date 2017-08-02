package com.hb.am;
class Ex04 
{
	// this ; 클래스 안에서 객체 자기 자신을 지칭하는 예약어
	//         클래스를 객체로 만들 때 생성된 주소값을 의미한다.
	// 지역변수와 멤버변수의 이름이 같을때 멤버변수에 this를 붙인다.
  
	private String name = "둘리" ;
	private int age = 10 ;

	// 기본생성자
	public Ex04(){  
		//this("한빛");
		System.out.println("기본 : " + this);	
	}
	public Ex04(String n){
		this();
        name = n ;
      System.out.println("기본 X : " + this);
	}
	public String getName(){ return name; }
    public void setName(String name){
	    this.name = name ;	
	}

}
