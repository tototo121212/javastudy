class Ex06{
    public static void main(String[] args){

       // for���� ���� ������ ������ ���������� �̵�
       // for���ȿ��� ���� ����(��������)�� for�� �ۿ����� ��� �Ұ�

       // for(�ʱ��; ���ǽ�; ������){
       //     ���ǽ��� ���϶� ������ ����
       //  }
          
       // 0 ���� 10 ���� ������� 
        for(int i = 0 ; i < 11 ; i++){
            System.out.println("i = " + i);
        } 

       // System.out.println(i);
        System.out.println(":::::::::::::::");
      int j ;
      for(j = 0 ; j < 11 ; j++){

      }
        System.out.println(j);  
      
     // 0-10���� ¦�� ����ϱ�
     for(int i=0;  i < 11 ; i = i + 2){
        System.out.println("i="+i);
     }
   
     for(int i = 0; i <11; i++){
         if(i%2==0){
             System.out.println(i);
         }
     }

    // 5 �� ����ϱ�
     for(int i=1; i < 10 ; i++){
         System.out.println(" 5 * " + i + "=" + (5*i));
     }

    // a-z���� ����ϱ�
    for(int i='a' ; i <='z'; i++){
        System.out.println((char)(i));
    }

    for(char i ='A' ; i<= 'Z'; i++){
        System.out.println(i);
    }
     
    // 0 -10 ���� ������ ���ϱ� (0+1+2+3+4+5+6+7+8+9+10 = 55)
    int sum = 0 ; // ���� ������ ����ϴ� ���� 
    for(int i = 0 ; i < 11; i++){
        sum = sum + i ;
    }
    System.out.println("�� : " + sum);

    // 7! (7*6*5*4*3*2*1) 
     int sum2 = 1 ;
     for(int i=7; i>0; i--){
       sum2 = sum2 * i ;
     }
    System.out.println("�� : " + sum2);

    // 0 - 10 ���� Ȧ���� ��, ¦���� �ո� ���� ���ϱ�
   int odd = 0 ;  // Ȧ���� �� ����
   int even = 0 ; // ¦���� �� ����

    for(int i=0; i < 11 ; i++){
        if(i%2==1){
         odd = odd + i ;
        }else{
          even = even + i;
        }
    }    

   System.out.println("Ȧ���� �� : " + odd); 
   System.out.println("¦���� �� : " + even);

}
}















