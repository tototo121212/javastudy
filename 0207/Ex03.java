import java.util.* ;

class Ex03{
     public static void main(String[] args){
          Scanner scan = new Scanner(System.in);

          System.out.print("정수입력 : "  ) ;
          int su =  scan.nextInt();
          String result = "";
         if(su%2==0){
             result =" 짝수 "; 
         }else{
             result ="홀수";
         }
       System.out.println("당신 입력한 "+ su +"은 "+ result+" 입니다."); 
    }
}