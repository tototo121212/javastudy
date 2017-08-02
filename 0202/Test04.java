class Test04{
     public static void main(String[] args){
	// 입력값
        int su = 3781;
       
       // 처리 
       int c, b, s, i ; //천, 백, 십, 일의 값을 저장
       int r ; // 나머지
	
       c = su / 1000 ;  // 3
       r = su % 1000 ;  // 781
 
       b = r / 100 ; // 7
       r = r % 100 ; // 81

       s = r / 10 ; // 8
       i = r % 10 ; // 1

       System.out.println("천의 자리 : " + c);
       System.out.println("백의 자리 : " + b);
       System.out.println("십의 자리 : " + s);
       System.out.println("일의 자리 : " + i);
       
    }
}







