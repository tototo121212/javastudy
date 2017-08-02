class Ex06{
    public static void main(String[] args){

       // for문의 끝을 만나면 무조건 증감식으로 이동
       // for문안에서 만든 변수(지역변수)는 for문 밖에서는 사용 불가

       // for(초기식; 조건식; 증감식){
       //     조건식이 참일때 실행할 문장
       //  }
          
       // 0 부터 10 까지 출력하자 
        for(int i = 0 ; i < 11 ; i++){
            System.out.println("i = " + i);
        } 

       // System.out.println(i);
        System.out.println(":::::::::::::::");
      int j ;
      for(j = 0 ; j < 11 ; j++){

      }
        System.out.println(j);  
      
     // 0-10까지 짝수 출력하기
     for(int i=0;  i < 11 ; i = i + 2){
        System.out.println("i="+i);
     }
   
     for(int i = 0; i <11; i++){
         if(i%2==0){
             System.out.println(i);
         }
     }

    // 5 단 출력하기
     for(int i=1; i < 10 ; i++){
         System.out.println(" 5 * " + i + "=" + (5*i));
     }

    // a-z까지 출력하기
    for(int i='a' ; i <='z'; i++){
        System.out.println((char)(i));
    }

    for(char i ='A' ; i<= 'Z'; i++){
        System.out.println(i);
    }
     
    // 0 -10 까지 누적합 구하기 (0+1+2+3+4+5+6+7+8+9+10 = 55)
    int sum = 0 ; // 전의 값들을 기억하는 변수 
    for(int i = 0 ; i < 11; i++){
        sum = sum + i ;
    }
    System.out.println("합 : " + sum);

    // 7! (7*6*5*4*3*2*1) 
     int sum2 = 1 ;
     for(int i=7; i>0; i--){
       sum2 = sum2 * i ;
     }
    System.out.println("합 : " + sum2);

    // 0 - 10 까지 홀수의 합, 짝수의 합를 각각 구하기
   int odd = 0 ;  // 홀수의 합 저장
   int even = 0 ; // 짝수의 합 저장

    for(int i=0; i < 11 ; i++){
        if(i%2==1){
         odd = odd + i ;
        }else{
          even = even + i;
        }
    }    

   System.out.println("홀수의 합 : " + odd); 
   System.out.println("짝수의 합 : " + even);

}
}















