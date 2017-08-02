class Ex04{
    public static void main(String[] args){
	 // 다중 if문
         //   if(조건식 1) {
         //     조건1이 참이면 실행하는 문장
         //    }else if(조건식2){
         //      조건1은 거짓이면서 조건2가 참인 문장
         //    }else if(조건식3){
         //      조건1, 조건2가 거짓이면서 조건3이 참인 문자 
         //    }else{
         //      조건1,조건2, 조건3이모두 거짓인, 나머지 
         //    }

       // 평균이 90이상이면 A학점, 80이상이면 B학점, 70이상이면 C학점 나머지는 F학점 
        double avg = 74.5 ;
        String res= "";
        if(avg >= 90){
            res = "A 학점" ;
        }else if(avg >= 80) {
            res = "B 학점" ;
        }else if(avg >= 70) {
            res = "C 학점" ;
        }else{
            res = "F 학점" ;
        } 
  	System.out.println(res);

      // char ch가 A, a 이면 아프리카, B,b이면 브라질 C, c 이면 캐나다 나머지는 한국
       char ch ='d';
      if(ch == 'A' || ch == 'a'){
            res ="아프리카";
      }else if(ch == 'B' || ch == 'b'){
            res ="브라질";
      }else if(ch == 'C' || ch == 'c'){
            res ="캐나다";
      }else {
            res ="한국";
      }
  	System.out.println(res);      
      
      // char ch2가 대문자, 숫자, 소문자를 판별
       char ch2 = 'A' ;
       if(ch2>='A' && ch2<='Z'){
         res = "대문자";
       }else if(ch2>='a' && ch2<='z'){
         res = "소문자";
       }else if(ch2>='0' && ch2<='9'){
         res = "숫자";
       }else{
         res = "특수문자";
       }
   	System.out.println(res); 


      // 메뉴 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000, 
      // 4이면 과일쥬스 3500이다.
      // 지불한 돈은 10000이다.
      // 친구와 2잔 먹었다. 잔돈은 얼마를 받아야 하나(부가세10%) 	

       int menu = 3 ;
       String coff ="";
       int dan = 0 ;
       int vat = 0 ;
       int total = 0 ;
       int input = 10000 ;
       int output = 0 ;
       int su = 2 ;
       if(menu ==1 ){
          coff = "카페모카";
          dan = 3500;
       }else if(menu ==2){
          coff = "카페라떼";
          dan = 4000;
       }else if(menu == 3 ){
          coff = "아메리카노";
          dan = 3000;
       }else if(menu ==4){
          coff = "과일쥬스";
          dan = 3500;
       }
      vat = (int)(dan * su * 0.1);
      total = (dan * su) + vat ;
      output = input - total;
     
      System.out.println("지불한 돈 ; " + input);
      System.out.println("커피종류 ; " + coff);
      System.out.println("단가 ; " + dan);    
      System.out.println("수량 ; " + su);
      System.out.println("부가세 ; " + vat);
      System.out.println("총액 ; " + total);
      System.out.println("잔돈 ; " + output);
   }
}


















