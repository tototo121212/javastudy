package com.hb.am;
class Ex02Test 
{
	public static void main(String[] args) 
	{
		Ex02 test = new
			Ex02();

		test.getLength(true);
		test.getLength(314);
		test.getLength(314L);
		test.getLength(3.14f);
		test.getLength(3.14);
		test.getLength("3.14");
	}
}
