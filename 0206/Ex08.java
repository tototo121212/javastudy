class Ex08{
   public static void main(String[] args){
       // break문  : 현재 반복문을 탈출할때 사용
      
       // 0-10 까지 출력
       for(int i=0; i < 11 ; i++){
          System.out.print(i + "  ");
       }
       System.out.println();
 
      for(int i=0; i < 11 ; i++){
          if(i==4) break;
          System.out.print(i + "  ");
       }
       System.out.println(":::::::::::::::::::::");
      
      int k = 0;
      while(k<11){
        if(k==4) break;
        System.out.print(k +" ");
       k++;
      }

     System.out.println(":::::::::::::::::::::");
     
     int p = 0;
     while(true){
      if(p == 4) break;
      System.out.print(p + " ");
      p++;
     }
   System.out.println(":::::::::::::::::::::");

    // 이중 for문 안에 존재하는 break문은 안쪽 for문만 빠져나온다.
     for(int i=1 ; i<4 ;i++){
        for(int j=1 ; j<6 ; j++){
            // if(j==3) break;
              if(i == 2) break;
           System.out.print("i=" + i + ", j="+j+"  ");
        }
       System.out.println();
     }         
    System.out.println(":::::::::::::::::::::"); 

    // break label 문 : label아래 존재하는 모든 반복을 탈출한다.
    chk :
     for(int i=1 ; i<4 ;i++){
        for(int j=1 ; j<6 ; j++){
             if(j==3) break chk;
           System.out.print("i=" + i + ", j="+j+"  ");
        }
       System.out.println();
     }         
    System.out.println(":::::::::::::::::::::"); 
   }
}














