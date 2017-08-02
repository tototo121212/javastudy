package com.hb.em;


 // 자식 클래스
public class Ex02 extends Ex01{

	@Override
	public void prn() {
		System.out.println("자식prn()");
	}
	
	// static 메소드는 부모클래스 가져와도 오버라이딩이라고 안함
	 public static void prn2(){
	    	// static 메소드는 static 변수만 사용가능
	    	// 지역변수도 사용할 수 있다.
	    	int k = 10 ;
	    	System.out.println("자식 static prn2()");
			// System.out.println(su1);
			 System.out.println(su2);
			//  System.out.println(su3);
			 System.out.println(su4);
			 
			 System.out.println(k);
	    }
	    
	 // 부모클래스의 prn3() final 이므로 오버라이딩 못함
	 
}
