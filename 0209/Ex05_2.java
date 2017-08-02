class Ex05_2 
{
	 int sum = 0 ;
	 double avg = 0.0 ;
	 String res = "" ;

	// 합계 메소드 (국어, 영어, 수학) 반환형 X
	 public void add (int a, int b, int c){
         sum = a + b + c ;
		 avg(sum);
	 }
	 // 평균 메소드 (합계) 반환형 X
	 public void avg (int a){
          avg = a/3.0 ;
		  hak(avg);
	 }
	 // 학점 구하는 메소드 (평균) 반환형 X
      public void hak (double a){
          if(a >= 90){
              res = "A학점";
		  }else if(a >= 80){
              res = "B학점";
		  }else if(a >= 70){
             res ="C학점";
		  }else{
             res ="F학점";
		  }
 	  }
	
	  // 결과를 출력하는 메소드(이름, 합계, 평균, 학점) 반환형이 없다. 
	 public void prn(String a){
         System.out.println("이름 : " + a );
		 System.out.println("합계 : " + sum );
         System.out.println("평균 : " + avg );
         System.out.println("학점 : " + res );
	 }
}
