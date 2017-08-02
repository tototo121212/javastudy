import java.util.*;
class Ex15{
      public static void main(String[] args){
         Scanner scan = new Scanner(System.in);

        String[] name = new String[5];
        int[] kor = new int[5];
        int[] eng = new int[5];
        int[] math = new int[5];
        int[] sum = new int[5];
        double[] avg = new double[5];
        String[] hak = new String[5];
        int[] rank = new int[5];
      
        for(int i=0; i<name.length; i++){
          System.out.print("이름 : ");
          name[i]=scan.next();
          System.out.print("국어 : ");         
          kor[i]=scan.nextInt();
          System.out.print("영어 : ");         
          eng[i]=scan.nextInt();
          System.out.print("수어 : ");         
          math[i]=scan.nextInt();
 
         sum[i] = kor[i] + eng[i] + math[i] ;
         avg[i] = (int)((sum[i]/ 3.0) *10)/10.0 ;
  
         if(avg[i] >= 90){
            hak[i] = "A";
         }else if(avg[i] >= 80){
            hak[i] = "B";
         }else if(avg[i]>= 70){
            hak[i] = "C";
         }else{
            hak[i] = "F"; 
         }
            //  모든 학생은 1등이다.
           rank[i] = 1 ;
       }  // 입력 끝
              
     // 순위 구하기( 전체와 비교해서 나(i)보다  남(j)이 크면  내 순위 ++ ;
      for(int i=0; i<name.length; i++){
             for(int j=0; j<name.length; j++){
                if( sum[i] < sum[j]) rank[i]++;
             } 
      }

      // 출력하기
       System.out.println("이름\t총점\t평균\t학점\t순위");
       for(int i=0; i<name.length; i++){
          System.out.println(name[i]+"\t"+sum[i]+"\t"+avg[i]+"\t"+hak[i]+"\t"+rank[i]);
       }

      }
}