import java.util.*;
class Ex04{
       public static void main(String[] args){
            // 난수를 발생하는 클래스 : Math.random(),   Random()
            // 1. Math.random() : double  => 0.0 ~ 1.0 미만의 난수 발생
                 
              double res1 = Math.random();
              System.out.println("결과 : "+ res1);

           // 범위를 지정하기 : (int)(Math.random() * 숫자) = 0 ~ 숫자전까지의 정수 발생
           int res2 = (int)(Math.random()*7); // 0-6 까지
              System.out.println("결과 : "+ res2); 

          // 2. Random 클래스 이용하기 위해 (선언, 생성)
            Random ran = new Random();
            System.out.println("ran의 주소 : "+  ran);
          
          // 각 자료형 별로 Random 추출이 가능 : nextXXXX(자료형)
          // nextBoolean() : true, false
          // nextDouble(), nextFloat(), nextInt(), nextLong() 등 자료형의 크기만큼 랜덤으로 추출 
         System.out.println("난수 : " + ran.nextBoolean());
         System.out.println("난수 : " + ran.nextDouble());
         System.out.println("난수 : " + ran.nextFloat());
         System.out.println("난수 : " + ran.nextInt());
         System.out.println("난수 : " + ran.nextLong());
         
         // 특정 범위를 지정하는 방법 ; ran.nextInt(숫자 = 범위) : 0 - 숫자전까지 
         System.out.println("난수 : " + ran.nextInt(10)); // 0-9까지  
      }
}








