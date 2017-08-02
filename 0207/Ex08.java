import java.util.*;
class Ex08{
    public static void main(String[] args){
          Scanner scan = new Scanner(System.in);

          chk :
          while(true){
          	System.out.print("정수입력 : ");
          	int su = scan.nextInt();
          	String res = "";
          	if(su%2==0){
              	res = "짝수";
           	}else{
              	res = "홀수";
           	}
        	 System.out.println("당신이 선택한 수는 " + res + "입니다.");
        	
              while(true){
                      System.out.print("계속할까요(y/n)? ");
                      String str = scan.next();
         	        if(str.equalsIgnoreCase("y")){
                             break; // continue chk;
                    }else  if(str.equalsIgnoreCase("n")){
		break chk;
                   }else{
                        continue ;
                   }
              } //안쪽 while end
 
       } //while end 
    
    } // main end
}