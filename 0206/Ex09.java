class Ex09{
    public static void main(String[] args){
        // continue문: 현재반복문을 탈출하는 것이 아니라
        //             continue문아래 실행문을 무시하고
        //             다음회차를 위해 증감식으로 간다.(for 문)
        //             증감식이 없으면 조건식으로 간다.(while문)
        //             이때 조건식 전에 증감식이 있어야 무한 루프를 당하지 않는다.

       // 0 - 10 출력
       for(int i=0; i < 11 ; i++){
          System.out.print(i +" ");
       } 
      System.out.println(":::::::::::::::::::::");


      // 0 - 10 출력 (i가 3일때 countinue);
       for(int i=0; i < 11 ; i++){
          if(i==3) continue ;
          System.out.print(i +" ");
       } 
      System.out.println(":::::::::::::::::::::");

     int k = -1 ;
      while(k<10){
       k++;
       if(k==3) continue ;  
       System.out.print(k+" ");
      }
      System.out.println(":::::::::::::::::::::");

      // 0-10 짝수
     for(int i=0; i < 11 ; i++){
       if(i%2==0){
          System.out.print(i+" ");     
       }
     } 
     System.out.println(":::::::::::::::::::::");

      // 0-10 짝수
     for(int i=0; i < 11 ; i++){
       if(i%2!=0) continue;
         System.out.print(i+" ");     
     } 
     System.out.println(":::::::::::::::::::::");
    
  // 이중 for문안에 존재하는 continue문은 안쪽 for문의 증감식으로 이동한다.
    for(int i=1; i<4; i++){
       for(int j=1; j<6; j++){
         // if(j==3) continue ;
            if(i==2) continue ;
          System.out.print("i="+i+",j="+j+" ");
       }
       System.out.println();
    }
   System.out.println(":::::::::::::::::::::");

  // continue label문 : label아래 존재하는 반복문의 증감식으로 이동한다. 
   
   a :
   for(int i=1; i<4; i++){
       for(int j=1; j<6; j++){
          // if(j==3) continue a;
            if(i==2) continue a; 
          System.out.print("i="+i+",j="+j+" ");
       }
       System.out.println();
    }
   System.out.println(":::::::::::::::::::::");


   }
}







