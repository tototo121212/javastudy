import java.util.*;
class Ex14{
    public static void main(String[] args){
        // 키보드를 통해서 나라이름 받기
         Scanner scan = new Scanner(System.in);
   
       // 배열 만들기
        String[] str = new String[5];
      
      // 배열에 넣기  
      for(int i=0; i < str.length; i++){
         System.out.print("나라입력 : ");
         str[i] = scan.next();
      }

     System.out.print("당신이 입력한 나라들 : ");
      //  배열 내용 출력하기
        for(int i=0; i < str.length ; i++){
             System.out.print(str[i]+", "); 
        }
    }
}



