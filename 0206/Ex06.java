class Ex06{
    public static void main(String[] args){
       // while �� : for���� ���� �ݺ���

       // �ʱ��;
       // while(���ǽ�){
       // ���ǽ��� ���̸� ����
       // ������;
       // }

       // �ʱ��;
       // while(true){
       //  if(��������) break;
       //  ���๮��
       //  if(��������) break;
       //  ������; 
       // } 

       // 0-10 ���� ���
       int i = 0 ;
       while(i < 11){
         System.out.print(i+" ");
         i++;
       }
    System.out.println();
      // 0-10���� ¦�� ����ϱ�
      int j = 0 ;
      while(j<11){
        System.out.print(j+" ");
        j = j + 2 ;
      }
    System.out.println();

    int k = 0 ;
    while(k<11){
     if(k%2==0){
       System.out.print(k+" "); 
      }
     k++;
    }
   System.out.println();

   // 5 �� ����ϱ�
   int su1 = 1 ;
   while(su1 <10){
   	System.out.println("5 * "+su1+"="+(5*su1));
    su1 ++;
   }

   // a-z���� ����ϱ�
  char ch='a';
  while(ch <= 'z'){
    System.out.print(ch +" ");
   ch++;
  } 
 System.out.println();

// 0 -10 ���� ������ ���ϱ� (0+1+2+3+4+5+6+7+8+9+10 = 55) 

// 7! (7*6*5*4*3*2*1) 

// 0 - 10 ���� Ȧ���� ��, ¦���� �ո� ���� ���ϱ� 


   }
}









