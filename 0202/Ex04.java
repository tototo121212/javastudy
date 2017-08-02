class Ex04{
    public static void main(String[] args){
      // 증감연산자 : ++(1 증가), --(1 감소)
      // ++ 변수 : 해당 변수 값을 먼저 1증가 시키고 나머지 연산한다.
      // 변수 ++ : 나머지 연산을 먼저하고 맨 나중에 1증가 시킨다.

         int su1 = 10 ;
         int su2 = 10 ;

         System.out.println("su1 : " +  ++su1); 
         System.out.println("su2 : " +  su2++);
         System.out.println("su1 : " +  su1); 
         System.out.println("su2 : " +  su2);
    }
}