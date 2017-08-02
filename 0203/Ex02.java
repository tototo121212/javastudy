class Ex02{
    public static void main(String[] args){
	// 단순 if문 : 조건을 제시하고 참일 경우만 실행
        //             조건이 거짓일때는 if문 자체를 무시
        // 형식 :  if(조건식) {
        //            조건식이 참일때 실행할 문장들
        //          }
        // 주의사항 ; 조건식이 참일때 실행할 문장이 한 문장이면 {} 생략가능
      


        // 총점(sum)이 60 이상이면 합격
         int sum = 59 ;
         String res = "불합격" ;
         if(sum >= 60){
          // System.out.println("합격");
              res = "합격"; 
         }
         System.out.println(res); 

       // 총점(sum)이 60이상이면 합격,나머지 불합격
        if(sum>=60){
           res ="합격" ;
        }
        if(sum<60){
           res ="불합격" ;
        }
       System.out.println(res);

        // 어떤수 k가 홀수인지 짝수인지 판별하자
        int k = 2;
        res = "홀수";
        if(k%2==0){
           res ="짝수" ;
        }
       System.out.println(res);       

       // 어떤 문자 k2 가 대문자인지 소문자인지 판별하자
         char k2 = 'A';
         res = "소문자";
        if(k2>='A' && k2<='Z'){
            res ="대문자";
        }
       System.out.println(res);

       // 8시간까지는 시간당 6,780 이고, 초과하면 1.5배 지급
      int time =8;  
      int dan = 6780 ;
      int pay = time * 6780;
      if(time > 8){
          pay = (8*dan)+ (int)(1.5*(time-8)*dan);
       }
       System.out.println(pay);      

    }
}































