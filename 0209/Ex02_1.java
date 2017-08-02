class Ex02_1 
{
	int su1 = 10 ;                // 변수  ,, instance
	static int su2 = 20 ;         // 변수     static
	static final int SU3 = 30 ;   // 상수     static
	final int SU4 = 40 ;          // 상수     instance

	public void prn(){
		System.out.println("메소드시작"); 
       su1 = su1 + 10 ;
       su2 = su2 + 10 ;
//	   SU3 = SU3 + 10 ;
//     SU4 = SU4 + 10 ;
       System.out.println(su1);
	   System.out.println(su2);
	   System.out.println("메소드끝");
	}

	public String prn2(){
		System.out.println("메소드시작"); 
		String msg = "점심 먹자 ";
		System.out.println("메소드끝");

		return msg ;
	}
}
