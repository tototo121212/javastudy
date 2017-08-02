class Ex02_main 
{
	public static void main(String[] args) 
	{
        // 객체 생성전에는 static 호출 가능 instance는 호출 할 수 없다.
		// static 호출방법 ; 클래스이름.변수이름, 클래스이름.메소드
         System.out.println(Ex02_1.su2);
         System.out.println(Ex02_1.SU3);


		// 클래스를 객체 생성하자
		// 클래스이름 참조변수 = new 생성자 ;
		// 해당 클래스에 생성자를 만들지 않았으면 기본 생성자를 이용해야된다.
		// 기본 생성자 = 클래스이름();
		// Ex02_1 클래스 객체 생성하자.
		Ex02_1 test = new Ex02_1();

	    int res =  test.su1;
		System.out.println(res);
		System.out.println(test.su2);
		System.out.println(test.SU3);
		System.out.println(test.SU4);
	    System.out.println("메소드 호출전");
        test.prn();
		String mg = test.prn2();
		System.out.println(mg);
	    System.out.println("메소드 호출후");
	}
}
