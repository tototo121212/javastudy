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
             System.out.print("1.����, 2.���� >> ");
	   int user = scan.nextInt();
               String result = null;
	   // ��ǻ���� ���� ���ϱ�(ī�� : 1 -10 , J,Q,K)
             int com = ran.nextInt(13)+1;
             // (int)(ran.nextDouble() * 13 +1);
            // (int)(Math.random() * 13 + 1);
           if(com>=1 && com<=6){
              if(user==1){
                 result="Ʋ��";
	  }else if(user==2){
	  myCount++;
               result="����";
	  }
          }else if(com>=8 && com<=13){
	  if(user==1){
	       myCount++;
	       result="����";
	  }else if(user==2){
                 result="Ʋ��";
               }
          }else if(com==7){
                result="���";
        }
           System.out.println("��� : " + result);

           while(true){
             System.out.print("����ұ��?(y/n)");
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
        System.out.println("�����ϼ̽��ϴ�.");
		System.out.println("����� �·� : "+
			(int)((myCount/allCount)*100)+"%");
       }
}