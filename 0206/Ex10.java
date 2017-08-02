class Ex10{
   public static void main(String[] args){
      // String 클래스 ;  문자열을 처리할 수 있도록 도와주는 클래스
      // String이 가진 기본 메소드(동작 = 기능) 들을 알아보자

       String jumin = "880915";
       String msg ="대한민국 ♥ Korea";
       String msg2 = "Korea";
       String msg3 = "korea";

       // 1. charAt(int index) : char => index는 자리값(위치값)=>0부터시작
       //     해당 위치값 받아서 해당 위치에 존재하는 문자를 추출한다.
       char ch  =  jumin.charAt(3);
       System.out.println(ch);
        
       ch = msg.charAt(5);
       System.out.println(ch);

       ch = msg.charAt(9);
       System.out.println(ch);

       for(int i=0 ; i < 5; i++){
           ch = msg2.charAt(i);
           if(ch>='A' && ch<='Z'){
               System.out.print(ch);
           }else if(ch>='a'&& ch<='z'){
               System.out.print((char)(ch-32));
           }else{
              System.out.println("나도 몰라");
           }
       }
       System.out.println();

      // 2.equals(String str) : boolean
      // str문자열과 해당 문자열이 같냐(대소문자구별)같으면 true, 다르면 false;
         boolean res = msg2.equals(msg3);
         System.out.println(res);

      // 3.equalsIgnoreCase : boolean
      // str문자열과 해당 문자열이 같냐(대소문자구별X)같으면 true, 다르면 false;       
	 res = msg2.equalsIgnoreCase(msg3);
         System.out.println(res);

      // 4. indexOf(int ch): int   => int ch(char형 숫자)
      //    indexOf(String str) : int 
      //  해당문자나 문자열이 존재하면 존재하는 위치값을 출력, 존재하지않음 -1    
        
      String str1 = "abcdabcd★ABCDABCD" ;
      int result = str1.indexOf("★");
      System.out.println(result);
      
      String jum ="890912-1010101";
      
      // 성별구하기
      char result2 = jum.charAt(7);
      System.out.println(result2);
   
      int result3 = jum.indexOf("-") + 1 ; // 7
      result2 = jum.charAt(result3);
      System.out.println(result2);

      // 찾기
      result3 = str1.indexOf("bc");
      System.out.println(result3);

      // 5. lastIndexOf(int ch):int , lastIndexOf(String str)  : int
      // 여러개가 존재하면 마지막 문자나 문자열의 위치값 표시
         result3 = str1.lastIndexOf("bc");
         System.out.println("bc : " +result3);

     // 6. length() : int // 해당문자열의 길이(갯수)를 숫자로 표현
      String str2 ="First love ";
      int result4 = str2.length();
      System.out.println(str2 +"의 문자길이 : " + result4);

      for(int i=0 ; i < str2.length(); i++){
            char kk = str2.charAt(i);
           if(kk>='A' && kk<='Z'){
                 System.out.print(kk);
           }else if(kk>='a' && kk<='z'){
                System.out.print((char)(kk-32));
           }
      } 

     // 7. replace("원래문자열","바꿀문자열") : String
      String str3 = "대한민국" ;
      String str4 =  str3.replace("대한","大韓");
      System.out.println("결과 : "+ str3);
      System.out.println("결과 : "+ str4);
      str4 =  str3.replace("한","한 ♥ ");
      System.out.println("결과 : "+ str4);

    // 8. substring(시작위치값) : String
    //    substring(시작위치, 끝위치) : String, 끝위치는 포함안함
    //        끝위치 - 시작위치 : 추출하는 문자의 수

    String jumin2 = "880915";
    String year = "19"+ jumin2.substring(0,2);
    System.out.println(year);

    // 10. toLowerCase() : 지정한 문자열을 소문자로 만듬.
    // 11. toUpperCase() : 지정한 문자열을 대문자로 만듬.

     String str5 ="AbcDESg123가나다Abcdefg";

     String str6 = str5.toLowerCase();
     System.out.println(str6);

     String str7 = str5.toUpperCase();
     System.out.println(str7);

    // 12. trim() : 앞뒤에 쓸데없은 공백문자 제거 (문자사이공백은제거 못함)
     String str8 ="   rksk  1231   ASDFB    ";
     System.out.println("결과:"+str8 +"/"+ str8.length());
     String str9 = str8.trim();
     System.out.println("결과:"+str9+"/"+str9.length());

    // 13. valueOf(각종자료형) : String => 각종자료형을 문자열로 변경한다.
     boolean b1 = true ;
     int num1 = 321;
     long num2 = 412L;
     double do1 = 3.14;
     float do2 = 78.654f;
     char ch1 = 'A' ;

     String result5 = String.valueOf(b1);
     System.out.println(result5 + 10);

     result5 = String.valueOf(num1);
     System.out.println(result5 + 10);

     result5 = String.valueOf(num2);
     System.out.println(result5 + 10);

     result5 = String.valueOf(do1);
     System.out.println(result5 + 10);

     result5 = String.valueOf(do2);
     System.out.println(result5 + 10);
    
     result5 = String.valueOf(ch1);
     System.out.println(result5 + 10);

     System.out.println("::::::::::::::::::::::::::");

     System.out.println(b1+""+10);
     System.out.println(num1+""+10);
     System.out.println(num2+""+10);
     System.out.println(do1+""+10);
     System.out.println(do2+""+10);
     System.out.println(ch1+""+10);
      
   // 14. 문자로된 각종 자료형을 실제 자료형으로 변경시킴
      
     String msg10 = "true";  // "true"와 "false" 둘중 하나만 입력가능
     if(Boolean.parseBoolean(msg10)){
        System.out.println("방가방가");
     }else{
        System.out.println("Hi~~~~");
     }

     String msg11 = "100";
     System.out.println(msg11+10);//10010
     System.out.println(I211)+10);//110  
 
     String msg12 = "3.14";
     System.out.println(msg12+10);//10010
     System.out.println(Double.parseDouble(msg12)+10);//110  
   }
}















