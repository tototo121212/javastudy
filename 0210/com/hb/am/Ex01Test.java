package com.hb.am;
class Ex01Test 
{
	public static void main(String[] args) 
	{
         // 객체 생성 : 생성자가 없으면 기본생성자로 생성한다.
		 Ex01 test = new Ex01();

		// 이름, 나이, 생사여부 출력
         String name = test.getName();
		 int age = test.getAge();
		 boolean live = test.getLive();

		 System.out.println("이름 : " + name);
		 System.out.println("나이 : " + age);
		 System.out.println("생사여부 : " + live);
         System.out.println();
		// 이름 => 펭귄, 나이 =>2살  정보변경 

		test.setName("펭귄");
		test.setAge(2);

        name = test.getName();
		age = test.getAge();

		 System.out.println("이름 : " + name);
		 System.out.println("나이 : " + age);
	
	}
}
