class Test05{
     public static void main(String[] args){
  	int time = 3662 ; // 초

        int h, m, s, res ;

        // 1시간 = 60분, 1분 = 60 초, 1시간 = 3600초
         h = time / 3600 ;  // 1
         res = time % 3600;  // 62

         m = res / 60 ;
         s = res % 60 ;

     System.out.println(time+"초는 "+h+"시간 "+m+"분 " + s +"초");

     }
}