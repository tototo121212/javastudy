class Ex02{
	public static void main(String[] args){
        
         // String ; 참조자료형(클래스를 자료형으로 사용)
         //         특별히 String은 기본 자료형 처럼 사용된다.
         //         문자나 문자열을 처리하는데 사용하는 클래스다.

         // char는 '' , String는 "" 사용
         String str = "방가방가" ;
         System.out.println(str);

         // 주의사항 : String은 + 연산자를 사용할 수 있다.
         //  이때, + 연산자는 덧셈이 아니라 문자연결자이다.
         //  결과는 문자열 이다.
         String str2 = "10";
         int su1 = 10 ;
         System.out.println(str2 + su1);
         System.out.println("::::::::::::::::::::::::::::::::");
         System.out.println(str2 + 100); // 10100
         System.out.println(su1 + 100);  // 110
         System.out.println("결과 : " + str2 + 100); // 10100
         System.out.println("결과 : " + su1 + 100);  // 10100
	 System.out.println("결과 : " + (su1 + 100));
       }
}





