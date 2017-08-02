import java.util.*;
class Ex06{
      public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            Random ran = new Random();
            double allCount = 0 ;
            double vCount = 0 ;  

            exit :
            while(true) {
                  allCount ++ ;
                  int com = (int)(ran.nextDouble() *2) +1; // 1아니면 2
                  System.out.print("1.높음 2.낮음 >> ");
                  int user = scan.nextInt();
                  
                 if(user == com ){
                        vCount++;
                      System.out.println("맞음");             
                  }else{
                     System.out.println("틀림");
                  }
                   while(true){
                     System.out.print("계속할까요?(y/n)");
	        String str = scan.next();
	       if(str.equalsIgnoreCase("y")){
                	break; 
	        }else if(str.equalsIgnoreCase("n")){
                	break exit;
	        }else{
               	continue;
	        }
                 }
            }
          System.out.println("수고하셨습니다.");
          System.out.println("당신의 승률 : "+
		(int)((vCount/allCount)*100)+"%");
      }
}