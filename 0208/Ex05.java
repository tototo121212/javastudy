import java.util.*;
class Ex05{
      public static void main(String[] args){
           // 오늘 날짜 운수 만들기
           // Calendar를 이용해서 오늘 날짜 구하기
           // Math.random(),   Random()를 이용해서 운수%(0-100)를 만들기 

          // 오늘 날짜 
          Calendar now = Calendar.getInstance();
         // 년, 월, 일 구하기
           int year = now.get(Calendar.YEAR);
           int month = now.get(Calendar.MONTH)+1;
           int day = now.get(Calendar.DATE);
   
         // 랜덤을 이용해서 행운% 구하기      

            Random ran = new Random();
            int su = ran.nextInt(101);
            int su2 =  (int)(ran.nextDouble()*101);
            int su3 =  (int)(Math.random()*101);

           System.out.println(year+". " + month + ". " + day + " : 당신의 행운 : "+su +"% 입니다."); 
           System.out.println(year+". " + month + ". " + day + " : 당신의 행운 : "+su2 +"% 입니다.");
           System.out.println(year+". " + month + ". " + day + " : 당신의 행운 : "+su3 +"% 입니다.");




      }
}









