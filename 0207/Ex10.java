import java.util.*;
class Ex10{
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        chk : 
        while(true){
         System.out.print("�˹ٽð� : ");
         int time = scan.nextInt();
         int dan = 6870;
         int pay = 0 ;

         if(time>8){
            pay = (8*dan) +(int)((time-8)*dan*1.5);
         }else{
            pay = time * dan ;
        }
          while(true){
                System.out.println("����� �޿��� "+pay + " �Դϴ�.");    
                System.out.print("����ұ��(y/n)");
                String str = scan.next();
                if(str.equalsIgnoreCase("y")){
                   break;
                }else if(str.equalsIgnoreCase("n")){
                     break chk;
                 }else{
                     continue;
                  }
             }  //��while 
         }  // ��while
   
      }
}