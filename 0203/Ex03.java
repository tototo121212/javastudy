class Ex03{
    public static void main(String[] args){
       // if(조건식){
       //    조건식이 참일때 실행할 문장들;
       // }else{
       //    조건이 거짓일때 실행할 문장들;
       // }    
        
       // int su가 60이상이면 합격,아니면 불합격
          int su = 40 ;
          String res = "";
          if(su >=60){
             res = "합격";
          }else{
             res = "불합격";
          }
          System.out.println(res);

       // gender가 1,3이면 남성, 2,4이면 여성, 나머지는 외국인
         int gender = 14 ;
        if(gender==1 || gender==2 || gender == 3 || gender== 4){
          if(gender ==1 || gender == 3){
              res = "남성";
           }else{
              res = "여성";
           }
        }else{
          res = "외국인";
        }
          System.out.println(res);


      
       // 수1 과 수2를 비교해서 큰수를 출력하시오
         int num1 = 40;
         int num2 = 50 ;
         int result = num1 ;

        if(num1 > num2){
           result = num1;
        }else{
           result = num2;
        }
       System.out.println(result);
           
   }
}











