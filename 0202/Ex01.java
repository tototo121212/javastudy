class Ex01{
    public static void main(String[] agrs){
         // 프로모션 : 자동형변환
         //            작은 자료형이 큰 자료형으로 변환되는 것
         //            정보 손실이 없음    
         // 디 모션  : 강제형변환(캐스팅) 
         //            큰 자료형이 작은 자료형으로 변환되는 것
         //            오류발생되지만 발생하지 않도록 조치하는 것
         //            정보 손실이 발생 될 수도 있다.
         
        // 프로모션
        long su1 = 10 ;  // long형 = int형
        int num1 = 20 ;
         su1 = num1 ;    // long형 = int형
        System.out.println(su1);
       
        char ch = 'a' ;
        num1 = ch ;  // int = char int가 더 큰 자료형이므로 오류 X
        System.out.println(num1);

        float su2 = su1 ;
        System.out.println(su2);

       // 디 모션 (강제로 형변환)
       // 자료형 변수명 = (왼쪽자료형)(데이터) ;
       int su3 = 128 ;
       byte num2 = (byte)(su3) ;
       System.out.println(num2);

       int num3 = 65 ;
       char ch2 = (char)num3 ; 
       System.out.println(ch2); 
       
    }
}















