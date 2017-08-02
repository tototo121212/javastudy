class Ex5{
     public static void main(String[] args){
     
      // 정수형 : 소수점이 없는 숫자, 기본 int형이다.
      //         byte < short < int < long

      // byte ; -128 ~ 127 까지 표현 가능

       byte su = 127 ;
       //     su = 128 ;
       //     su = 127 + 1 ;
            su = 127

       byte su2 = -128 ;
       System.out.println(su + 1); // 128

      // byte + byte, byte + short 의 결과는 모두 int로 나와야 한다.
      // 자바 계산은 int 이상으로 결과 나온다.
      // byte result =  su + su2 ; // 오류
 	 int result =  su + su2 ;
       System.out.println(result);

     // long형은 숫자 뒤에 L 또는 l 를 붙인다. 물론 생략가능하다
      long num = 123L;
      long num2 = 214;
      long sum = num + num2 ;
      System.out.println(sum);

   // 실수형 : 소수점이 있는 숫자, 기본 double형이다.
   //         float < double        
   // float는 반드시 숫자 뒤에 F 또는 f를 붙인다. 생략불가

      float pi = 3.14f;
   // float pi2 = 3.14;  // 오류
     System.out.println(pi);
   }
}








