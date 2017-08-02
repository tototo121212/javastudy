import java.util.*;
class Ex10{
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        chk : 
        while(true){
         System.out.print("알바시간 : ");
         int time = scan.nextInt();
         int dan = 6870;
         int pay = 0 ;

         if(time>8){
            pay = (8*dan) +(int)((time-8)*dan*1.5);
         }else{
            pay = time * dan ;
        }
          while(true){
                System.out.println("당신의 급여는 "+pay + " 입니다.");    
                System.out.print("계속할까요(y/n)");
                String str = scan.next();
                if(str.equalsIgnoreCase("y")){
                   break;
                }else if(str.equalsIgnoreCase("n")){
                     break chk;
                 }else{
                     continue;
                  }
             }  //안while 
         }  // 밖while
   
      }
}