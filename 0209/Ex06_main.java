class Ex06_main 
{
	public static void main(String[] args) 
	{
		 // 객체 생성 전 static 접근 : 클래스이름.
         //  System.out.println(Ex06.name3);
		 System.out.println(Ex06.age3);

         // 객체 생성
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
				
          test.setName2("초복이");
		  test.setAge2(1);
		  n = test.getName2();
		  System.out.println(n);
		  k = test.getAge2();
		  System.out.println(k);
	}
}
