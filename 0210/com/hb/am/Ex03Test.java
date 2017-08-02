package com.hb.am;
class Ex03Test 
{
	public static void main(String[] args) 
	{
		// 객체 생성
		Ex03 test = new Ex03("임꺽정");

		// 멤버변수값 확인
		String name = test.getName();
		int age = test.getAge();
		String addr = test.getAddr();

		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
		System.out.println(":::::::::::::::::::::");
        
		Ex03 test2 = new Ex03("둘리", 1000);
		name = test2.getName();
		age = test2.getAge();
        addr = test2.getAddr();
		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
		System.out.println(":::::::::::::::::::::");

		Ex03 test3 = new Ex03(1970,"태권브이");
		name = test3.getName();
		age = test3.getAge();
        addr = test3.getAddr();
		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
		System.out.println(":::::::::::::::::::::");

	}
}
