class Ex04{
    public static void main(String[] args){
	 // ���� if��
         //   if(���ǽ� 1) {
         //     ����1�� ���̸� �����ϴ� ����
         //    }else if(���ǽ�2){
         //      ����1�� �����̸鼭 ����2�� ���� ����
         //    }else if(���ǽ�3){
         //      ����1, ����2�� �����̸鼭 ����3�� ���� ���� 
         //    }else{
         //      ����1,����2, ����3�̸�� ������, ������ 
         //    }

       // ����� 90�̻��̸� A����, 80�̻��̸� B����, 70�̻��̸� C���� �������� F���� 
        double avg = 74.5 ;
        String res= "";
        if(avg >= 90){
            res = "A ����" ;
        }else if(avg >= 80) {
            res = "B ����" ;
        }else if(avg >= 70) {
            res = "C ����" ;
        }else{
            res = "F ����" ;
        } 
  	System.out.println(res);

      // char ch�� A, a �̸� ������ī, B,b�̸� ����� C, c �̸� ĳ���� �������� �ѱ�
       char ch ='d';
      if(ch == 'A' || ch == 'a'){
            res ="������ī";
      }else if(ch == 'B' || ch == 'b'){
            res ="�����";
      }else if(ch == 'C' || ch == 'c'){
            res ="ĳ����";
      }else {
            res ="�ѱ�";
      }
  	System.out.println(res);      
      
      // char ch2�� �빮��, ����, �ҹ��ڸ� �Ǻ�
       char ch2 = 'A' ;
       if(ch2>='A' && ch2<='Z'){
         res = "�빮��";
       }else if(ch2>='a' && ch2<='z'){
         res = "�ҹ���";
       }else if(ch2>='0' && ch2<='9'){
         res = "����";
       }else{
         res = "Ư������";
       }
   	System.out.println(res); 


      // �޴� 1�̸� ī���ī 3500, 2�̸� ī��� 4000, 3�̸� �Ƹ޸�ī�� 3000, 
      // 4�̸� �����꽺 3500�̴�.
      // ������ ���� 10000�̴�.
      // ģ���� 2�� �Ծ���. �ܵ��� �󸶸� �޾ƾ� �ϳ�(�ΰ���10%) 	

       int menu = 3 ;
       String coff ="";
       int dan = 0 ;
       int vat = 0 ;
       int total = 0 ;
       int input = 10000 ;
       int output = 0 ;
       int su = 2 ;
       if(menu ==1 ){
          coff = "ī���ī";
          dan = 3500;
       }else if(menu ==2){
          coff = "ī���";
          dan = 4000;
       }else if(menu == 3 ){
          coff = "�Ƹ޸�ī��";
          dan = 3000;
       }else if(menu ==4){
          coff = "�����꽺";
          dan = 3500;
       }
      vat = (int)(dan * su * 0.1);
      total = (dan * su) + vat ;
      output = input - total;
     
      System.out.println("������ �� ; " + input);
      System.out.println("Ŀ������ ; " + coff);
      System.out.println("�ܰ� ; " + dan);    
      System.out.println("���� ; " + su);
      System.out.println("�ΰ��� ; " + vat);
      System.out.println("�Ѿ� ; " + total);
      System.out.println("�ܵ� ; " + output);
   }
}


















