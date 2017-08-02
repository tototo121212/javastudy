package com.hb.am;
class Ex02 
{
	// 오버로딩 : 클래스 안에서 같은이름의 메소드가 여러개 존재하는 것
	//            반드시 인자(매개변수)는 달라야 한다.

	public void getLength(boolean n){
        String str = n+"";
		getLength(str);
	}
	public void getLength(int n){
        String str = n+"";
		getLength(str);
	}
	public void getLength(long n){
        String str = n+"";
		getLength(str);
	}
	public void getLength(float n){
        String str = n+"";
		getLength(str);
	}
	public void getLength(double n){
        String str = n+"";
		getLength(str);
	}    
	public void getLength(String n){
       System.out.println("입력한 값 : " + n);
	   System.out.println("입력한 값의 길이 : " + n.length());
	}

}
