class  Ex05
{
	 
	 // �հ� �޼ҵ� (����, ����, ����) ��ȯ�� ����
	 public int add (int a, int b, int c){
          return a + b + c ;
	 }

	 // ��� �޼ҵ� (�հ�) ��ȯ�� ����
	 public double avg (int a){
          return a/3.0 ;
	 }

	 // ���� ���ϴ� �޼ҵ� (���) ��ȯ�� ����
      public String hak (double a){
         String res ="" ;
		  if(a >= 90){
              res = "A����";
		  }else if(a >= 80){
              res = "B����";
		  }else if(a >= 70){
             res ="C����";
		  }else{
             res ="F����";
		  }
         return res ;
	  }


	 // ����� ����ϴ� �޼ҵ�(�̸�, �հ�, ���, ����) ��ȯ���� ����. 
	 public void prn(String a, int b, double c, String d){
         System.out.println("�̸� : " + a );
		 System.out.println("�հ� : " + b );
         System.out.println("��� : " + c );
         System.out.println("���� : " + d );
	 }
}
