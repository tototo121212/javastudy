class Ex03_main 
{
	public static void main(String[] args) 
	{
		// 부가세 메소드는 static 이므로 객체 생성전에 호출 가능
		// 호출시 클래스.메소드 이름
		// 반환형이 있으므로 반환형에 맞게 변수를 만들어 받아 준다.
		double res = Ex03.vat(1000);
		System.out.println("vat : " + res);

		// instance 메소드는 클래스를 객체로 만들어야 사용가능하다.
		// 메소드에서 생성되는 변수는 메소드가 끝나면 사라진다.(지역변수)
		// 메소드가 실행되지않으면 만들어지지 않는다. (지역변수)
		Ex03 test = new Ex03();
		// 메소드 호출할때 반드시 매개변수의 자료형과 갯수는 맞춰야 한다.
		//  자료형이나 갯수가 다르면 다른메소드드 취급합니다.
		int res1 =  test.add(10, 20);
		System.out.println("add 결과 :" +res1);
       
		res1 =  test.add(10, 'a');
		System.out.println("add 결과 :" +res1);

		res1 = test.sub(10,20);
        System.out.println("sub 결과 :" +res1);

		test.mul(10,20);
		test.div(10,20);
	}
}
