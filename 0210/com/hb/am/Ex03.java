package com.hb.am;
class Ex03 
{
	private String name ="일지매";
	private int age = 15 ;;
	private String addr = "전라도" ;

    // 생성자  : return type X, 클래스이름과 같다., 멤버변수 값의 초기화
	//           생성자는 오버로딩이 가능( 객체를 만드는 방법이 다양하다)
	
    public Ex03(String n){
      //  name = "홍길동" ;
	  //	age = 12 ;
	  //	addr = "충청도" ;
	  name = n ;
	}
   public Ex03(String n , int k){
	    name = n;
		age = k ;
   }
   public Ex03(int k, String n){
		 name = n;
		age = k ;
   }
  
    // getter ;
    public String getName(){    return name ;	}
	public int getAge(){    return age ;	}
	public String getAddr(){      return addr ; }
}
