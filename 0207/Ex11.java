import java.util.*;
class Ex11{
     public static void main(String[] args){
       chk : 
       while(true){
       Scanner scan = new Scanner(System.in);
      
       System.out.print("��1 : ");
       int su1 = scan.nextInt();

       System.out.print("��2 : ");
       int su2 = scan.nextInt();

       System.out.print("������(+,-,*,/) : ");
       String op = scan.next();
       int result = 0 ; 
       switch(op){
          case "+" : result = su1 + su2 ; break;
          case "-" : result = su1 - su2 ; break;
          case "*" : result = su1 * su2 ; break;
          case "/" : result = su1 / su2 ; break;
       }
       System.out.println(su1 + op + su2 + "=" + result);
        while(true){
	System.out.print("����ұ��?(y/n)");
	String str = scan.next();
	if(str.equalsIgnoreCase("y")){
		break;  // continue chk;
	}else if(str.equalsIgnoreCase("n")){
                break chk;
	}else{
               continue;
	}
         }
       }
    }
}