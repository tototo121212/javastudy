class Test03{
     public static void main(String[] args){
	// 입력 => 처리 => 출력
	
	int input = 10000; // 지불한 금액
        int dan = 3500; // 카페모카 단가
        int su = 2 ; // 수량

       // 합계, 부가세, 총금액, 잔돈 => 처리하기
        int sum = dan * 2 ;
        int vat = (int)(sum * 0.1);		
        int total = sum + vat ;
        int output = input - total ;
     
        // 출력하기
        System.out.println("지불한 돈 : " + input);
        System.out.println("단가 : " + dan);
        System.out.println("수량 : " + su);
        System.out.println("부가세 : " + vat);
        System.out.println("상품총액 : " + total);
        System.out.println("거스름 돈 : " + output);
     }
}




