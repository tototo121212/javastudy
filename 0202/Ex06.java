class Ex06{
     public static void main(String[] args){
	// 논리연산자 : 결과는 boolean형, 조건식 사용
        //  &&(AND, 논리곱, 교집합) :
        //  주어진 조건이 모두 true일때 결과 true
        //  false를 만나면 결과는 false, 뒤에 조건은 계산하지 않음
        //   숫자 >= && <= 숫자 => 범위 지정
             
       int su1 = 10;
       int su2 = 7 ;
       boolean res = (su1 >= 7) && (su2 >= 5);//true=true&&true 
       System.out.println("결과 : " + res); 
	
       res = (su1 >= 7) && (su2 <= 5); // false = true && false 
       System.out.println("결과 : " + res); 

       res = (su1 <= 7) && (su2 >= 5); // false = false && true 
       System.out.println("결과 : " + res); 

       res = (su1 <= 7) && (su2 <= 5); // false = false && false
       System.out.println("결과 : " + res); 

       int num1 = 10 ;
       int num2 = 20 ;

       res = ((num1=num1+12) > num2) && (num1 == (num2 = num2+2));

       System.out.println("res : " + res);
       System.out.println("num1 : " + num1);
       System.out.println("num2 : " + num2);

       int num3 = 10 ;
       int num4 = 20 ;

       res = ((num3=num3+12) < num4) && (num3 == (num4 = num4+2));

       System.out.println("res : " + res);
       System.out.println("num3 : " + num3);
       System.out.println("num4 : " + num4);

      // 논리연산자 : ||(or, 논리합, 합집합)
      // 주어진 조건 중 하나라도 true이면 결과는 true 
      // true를 만나면 결과는 true, 뒤 조건을 처리하지 않음

       int su3 = 10;
       int su4 = 7 ;
       res = (su3 >= 7) || (su4 >= 5);     //true=true||true 
       System.out.println("결과 : " + res); 
	
       res = (su3 >= 7) || (su4 <= 5);    // true = true || false 
       System.out.println("결과 : " + res); 

       res = (su3 <= 7) || (su4 >= 5);   // true = false || true 
       System.out.println("결과 : " + res); 

       res = (su3 <= 7) || (su4 <= 5);  // false = false || false
       System.out.println("결과 : " + res); 
 
       int num5 = 10 ;
       int num6 = 20 ;

       res = ((num5=num5+12) >= num6) || (num5 == (num6 = num6+2));

       System.out.println("res : " + res);
       System.out.println("num5 : " + num5);
       System.out.println("num6 : " + num6);
     
    }
}














