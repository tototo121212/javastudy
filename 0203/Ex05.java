class Ex05{
	public static void main(String[] args){
           //  인자값 : byte, short, int, char ,String 
           //  인자값에는 조건식 X (비교연산, 논리연산, boolean형)
           //  break는 현재 switch문을 빠져나가는 명령,  
           //  생략하면 break문을 만날때까지 실행한다.
           // switch(인자값){
           //    case 조건값1 : 수행문들;    break;
           //    case 조건값2 : 수행문들;    break;
           //    case 조건값3 : 수행문들;    break;
	   //    case 조건값4 : 수행문들;    break;
           //    default : 수행문들 ;
           //  } 

      // char ch가 A, a 이면 아프리카, B,b이면 브라질 C, c 이면 캐나다. 나머지는 한국
            char ch = 'a' ;
            switch(ch){
                case 'A' : 
                case 'a' : System.out.println("아프리카");break;
                case 'B' :  
                case 'b' : System.out.println("브라질"); break;
                case 'C' : 
                case 'c' : System.out.println("캐나다"); break;
                default : System.out.println("한국");
            }
      // month 가 3,4,5  "봄", 6,7,8 "여름" , 9,10,11 "가을", 12,1,2 "겨울"   
        int month = 2 ;
         switch(month){
            case 12 : 
            case 1 :
            case 2 : System.out.println("겨울"); break;
            case 3 : 
            case 4 :
            case 5 : System.out.println("봄"); break;
            case 6 : 
            case 7 :
            case 8 : System.out.println("여름"); break;
            case 9 : 
            case 10 :
            case 11 : System.out.println("가을"); break;
         }

      // 평균이 90이상이면 A학점, 80이상이면 B학점, 70이상이면 C학점나머지는 F학점
       double avg = 87.5 ;
       switch((int)(avg/10)){
           case 10 :
           case 9 : System.out.println("A학점"); break;
           case 8 : System.out.println("B학점"); break;
           case 7 : System.out.println("C학점"); break;
           default : System.out.println("F학점"); break;
       }
     // 1번 카페모카 3500, 2번 아메리카노 3000, 3번 카페라떼 4000 이다.
     // 10000원을 지불하고 친구와 아메리카노 2잔을 먹었다. 
     // 잔돈은 얼마를 받아야 하는가(부가세10%)
        
       int input = 10000;
       int menu = 1 ;
       int su = 2 ;
       String coff= "";
       int dan = 0 ;
       int vat = 0 ;
       int total = 0 ;
       int output = 0 ;

       switch(menu){
         case 1 : coff="카페모카"; 
                  dan = 3500 ; 
                  break;
         case 2 : coff="아메리카노"; 
                  dan = 3000 ; 
                  break;
         case 3 : coff="카페라떼"; 
                  dan = 4000 ; 
                 break;
       }  
      
    vat = (int)(dan * su * 0.1);
    total = dan * su + vat ;
    output = input - total;
    
    System.out.println(output);  

  
    }
}






























