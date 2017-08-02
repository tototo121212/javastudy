import java.util.*;
class Ex08{
       public static void main(String[] args){
             Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	double allCount = 0 ;
	double myCount = 0 ;
             exit:
	while(true){
	allCount++;
             System.out.print("1.높음, 2.낮음 >> ");
	   int user = scan.nextInt();
               String result = null;
	   // 컴퓨터의 숫자 구하기(카드 : 1 -10 , J,Q,K)
             int com = ran.nextInt(13)+1;
             // (int)(ran.nextDouble() * 13 +1);
            // (int)(Math.random() * 13 + 1);
           if(com>=1 && com<=6){
              if(user==1){
                 result="틀림";
	  }else if(user==2){
	  myCount++;
               result="맞음";
	  }
          }else if(com>=8 && com<=13){
	  if(user==1){
	       myCount++;
	       result="맞음";
	  }else if(user==2){
                 result="틀림";
               }
          }else if(com==7){
                result="비김";
        }
           System.out.println("결과 : " + result);

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
			(int)((myCount/allCount)*100)+"%");
       }
}