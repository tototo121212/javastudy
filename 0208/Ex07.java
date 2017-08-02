import java.util.*;
class Ex07{
      public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            Random ran = new Random();
            double allCount = 0 ;
            double vCount = 0 ;  

            exit :
            while(true) {
                  allCount ++ ;
                  int com =  (int)(ran.nextDouble() *3) ;  // 0 1 2
              //  int com =   Math.abs(ran.nextInt())%3 ;  // 0 1 2
                  System.out.println("1.°¡À§ 2.¹ÙÀ§ 3.º¸ >> ");
                  int user = scan.nextInt(); // 1, 2, 3
                  String res ="";
                 if(com == 0){   // °¡À§
                      if(user==1){
		res ="ºñ±è";
                      }else if(user ==2){
		vCount ++;
                          res ="ÀÌ±è";
                      }else if(user ==3){
		res ="Áü";
                     } 
                 }else if(com == 1){  // ¹ÙÀ§
                      if(user==1){
		res ="Áü";
                      }else if(user ==2){
		res ="ºñ±è";
                      }else if(user ==3){
		vCount ++;
		res ="ÀÌ±è";
                     } 
                }else if(com == 2){ // º¸
                      if(user==1){
		vCount ++;
		res ="ÀÌ±è";
                      }else if(user ==2){
		res ="Áü";
                      }else if(user ==3){
		res ="ºñ±è";
                     } 
                } 
                  System.out.println("°á°ú : " + res);
 
                   while(true){
                     System.out.print("°è¼ÓÇÒ±î¿ä?(y/n)");
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
          System.out.println("¼ö°íÇÏ¼Ì½À´Ï´Ù.");
          System.out.println("´ç½ÅÀÇ ½Â·ü : "+
		(int)((vCount/allCount)*100)+"%");
      }
}