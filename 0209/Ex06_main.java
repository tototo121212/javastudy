class Ex06_main 
{
	public static void main(String[] args) 
	{
		 // ��ü ���� �� static ���� : Ŭ�����̸�.
         //  System.out.println(Ex06.name3);
		 System.out.println(Ex06.age3);

         // ��ü ����
		 Ex06 test = new Ex06();

		 System.out.println(test.name);
		 System.out.println(test.age);

		 // System.out.println(test.name2);
		 // System.out.println(test.age2);
       
		  String n = test.getName2();
		  System.out.println(n);
		  int k = test.getAge2();
		  System.out.println(k);
		  System.out.println(":::::::::::::::::::::");
				
          test.setName2("�ʺ���");
		  test.setAge2(1);
		  n = test.getName2();
		  System.out.println(n);
		  k = test.getAge2();
		  System.out.println(k);
	}
}
