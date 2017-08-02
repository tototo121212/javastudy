import java.util.*;
class Ex07{
    public static void main(String[] args){
          Scanner scan = new Scanner(System.in);

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
        	 System.out.print("계속할까요(y/n)? ");
         	 String str = scan.next();
         	 if(str.equalsIgnoreCase("n")) break;
       } 

       
    }
}



