import java.util.*;
class Ex09{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
      
      chk:
      while(true){
        System.out.print("이름 : ");
        String name = scan.next();
         
       System.out.print("국어 : ");
        int kor = scan.nextInt();

       System.out.print("영어 : ");
        int eng = scan.nextInt();

       System.out.print("수학 : ");
        int math = scan.nextInt();

       int sum = kor + eng + math ;
       double avg = sum / 3.0 ;
       String hak ="" ;

       if(avg >=90){
           hak = "A 학점";
       }else if(avg >= 80 ){
          hak ="B 학점";
       } else if(avg >= 70 ){
          hak ="C 학점";
       } else {
          hak ="F 학점";
       } 
      
      System.out.println("이름 : " + name);  
      System.out.println("총점 : " + sum);  
      System.out.println("평균 : " + ((int)(avg*10)/10.0));  
      System.out.println("학점 : " + hak);
      while(true){
           System.out.print("계속할까요(y/n)?");
           String str = scan.next();
           if(str.equalsIgnoreCase("y")){
               break;
           }else if(str.equalsIgnoreCase("n")){
                break chk;
           }else{
               continue;
           }
     }
   }
 }
}