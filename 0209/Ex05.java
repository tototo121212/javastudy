class  Ex05
{
	 
	 // 합계 메소드 (국어, 영어, 수학) 반환형 존재
	 public int add (int a, int b, int c){
          return a + b + c ;
	 }

	 // 평균 메소드 (합계) 반환형 존재
	 public double avg (int a){
          return a/3.0 ;
	 }

	 // 학점 구하는 메소드 (평균) 반환형 존재
      public String hak (double a){
         String res ="" ;
		  if(a >= 90){
              res = "A학점";
		  }else if(a >= 80){
              res = "B학점";
		  }else if(a >= 70){
             res ="C학점";
		  }else{
             res ="F학점";
		  }
         return res ;
	  }


	 // 결과를 출력하는 메소드(이름, 합계, 평균, 학점) 반환형이 없다. 
	 public void prn(String a, int b, double c, String d){
         System.out.println("이름 : " + a );
		 System.out.println("합계 : " + b );
         System.out.println("평균 : " + c );
         System.out.println("학점 : " + d );
	 }
}
