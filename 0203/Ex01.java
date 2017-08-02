class Ex01{
     public static void main(String[] args){
        // 삼항 연산자
        // 형식) 자료형 변수명 = 조건식 ? 참일때 실행문 : 거짓일때 실행문 ;
        // 주의 사항:변수의 자료형과 참일때 실행문의 결과의 자료형,
        //           거짓일때 실행문의 결과의 자료형, 3가지는 반드시 모두 같은 자료형 
        // 조건식은 boolean형(true, false,  비교연산(>=,<=,...), 논리연산(&&,||,!))

	 String res =  true ? "안녕하세요" : "A" ;
         System.out.println(res);

        int res2 = true ? 100+10 : 'A'  ;
	System.out.println(res2);

        // 어떤수 k가 홀수인지 짝수인지 판별하자
        int k = 47 ;
        String result =  (k%2 == 0) ? "짝수" : "홀수" ;
        System.out.println(result);

       // 어떤 문자 k2 가 대문자인지 소문자인지 판별하자
        char k2 = '1';
        
        // result = (k2>=65 && k2<=90)?"대문자":"소문자";
        // result = (k2>='A' && k2<='Z')?"대문자":"소문자";
           result = (k2>='A' && k2<='Z')?"대문자":k2>='a' && k2<='z' ?"소문자":"다시입력";
	System.out.println(result);
        
       // 어떤사람의 평균이 90이상이면 A학점, 80이상이면 B학점, 나머지 F학점
         int avg = 79 ;
        result = avg>=90 ? "A 학점" : avg>=80 ? "B 학점" : "F 학점" ;       
	System.out.println(result);

       // 성별이 1또는 3이면 남성, 2또는4이면 여성, 나머지 외국인
        int gender = 7 ; 
        result = (gender == 1 || gender == 3)? "남성" :  (gender == 2 || gender == 4)? "여성" : "외국인" ;
	System.out.println(result);

      //  8시간까지는 시간당 6,780 이고, 초과하면 1.5배 지급
       int time = 10 ;
       int dan = 6780;
       int pay = 0 ;
        pay = (time>8) ? (8*dan) + (int)((time-8)*dan*1.5)  : dan * time ;
       System.out.println(pay);
     }
}















