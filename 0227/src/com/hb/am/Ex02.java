package com.hb.am;

// 내부클래스 : 클래스안에 클래스가 정의 되어있는 클래스
//             외부클래스를 생성한 후 내부클래스를 생성할수 있다.
//             (static은 예외)
//             외부클래스의 멤버들을 마음대로 사용가능(private도)
//             컴파일한 후 $가 붙는다.
//      종류 : Member, Local, static, Anonymous

// 1. Member : 외부클래스{.. 내부클래스 ..}
public class Ex02 {
   int su1 = 10 ;
   final int su2 = 20 ;
   static int su3 = 30 ;
   static final int su4 = 40 ;
   private int su5 = 50 ;
   // 생성자
   public Ex02() {
	System.out.println("여기는 외부클래스 : " + this);
   }
   // 일반 메소드
   public void prn(){
	   int num1 = 100 ;
	   final int num2 = 200 ;
	   // 지역변수는 static을 사용할 수 없다.
	   // static int num3 = 300 ;
	   // static final int num4 = 400 ;
	   // private도 안됨
	   // private int num5 = 50 ;
	   System.out.println("여기는 외부메소드");
   }
   
   // 내부 클래스
   class Ex02_1{
	   int s1 = 10 ;
	   final int s2 = 20 ;
	  // 내부클래스는 static 사용못함.
	  // 사용 할 경우 클래스에도 static을 붙여라 
	  // static int s3 = 30 ;
	   static final int s4 = 40 ;
	   private int s5 = 50 ;
	   // 생성자	   
	   public Ex02_1() {
		   System.out.println("내부클래스 생성자 : "+ this);
	   }
	   // 내부클래스 메소드
	   public void in_prn(){
		   int number1 = 10 ;
		   final int number2 = 20 ;
		  // static int su3 = 30 ;
		  // static final int su4 = 40 ;
		  // private int su5 = 50 ; 
		   
		   // 외부클래스 변수들
		   System.out.println(su1);
		   System.out.println(su2);
		   System.out.println(su3);
		   System.out.println(su4);
		   System.out.println(su5);
		   System.out.println(":::::::::::::");
		  // 외부클래스 메소드
		   prn();
	   }
   }
}













