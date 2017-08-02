class Ex05{
   public void main(String[] args){
	// 비교연산자 : > , < , >=, <=, ==, != 
        // 주의 사항 : 문자열(String)은 ==(같다) , 사용하지 않는다.
        //             char는 코드값(숫자)으로 저장되므로 사용가능
        // 결과는 무조건 boolean형, 조건식에 많이 사용됨
       

         int su1 = 20 ;
         int su2 = 30 ;
         boolean res =  su1 > su2 ; 

         System.out.println("결과 : " + res);

         char ch1 = 'A' ;
         char ch2 = 'a' ;
	 res = ch1 > ch2 ;
         System.out.println("결과 : " + res);    

        // 어떤문자 k 가 대문자? , 소문자 ? 
         char k = 'P' ;
         
         //res =  k>=65 && k<=90; // 대문자
         //       k>=97 && k<=122; // 소문자  
      
         // res =  k>='A' && k<='Z'; // 대문자
         //        k>='a' && k<='z'; // 소문자          

                  
    
        
   }
}












