class Ex05_2 
{
	 int sum = 0 ;
	 double avg = 0.0 ;
	 String res = "" ;

	// �հ� �޼ҵ� (����, ����, ����) ��ȯ�� X
	 public void add (int a, int b, int c){
         sum = a + b + c ;
		 avg(sum);
	 }
	 // ��� �޼ҵ� (�հ�) ��ȯ�� X
	 public void avg (int a){
          avg = a/3.0 ;
		  hak(avg);
	 }
	 // ���� ���ϴ� �޼ҵ� (���) ��ȯ�� X
      public void hak (double a){
          if(a >= 90){
              res = "A����";
		  }else if(a >= 80){
              res = "B����";
		  }else if(a >= 70){
             res ="C����";
		  }else{
             res ="F����";
		  }
 	  }
	
	  // ����� ����ϴ� �޼ҵ�(�̸�, �հ�, ���, ����) ��ȯ���� ����. 
	 public void prn(String a){
         System.out.println("�̸� : " + a );
		 System.out.println("�հ� : " + sum );
         System.out.println("��� : " + avg );
         System.out.println("���� : " + res );
	 }
}
