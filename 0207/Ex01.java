import java.util.*;
class Ex01{
      public static void main(String[] args){
         //   Scanner �� java.lang�ȿ� �������������Ƿ� 
         //  import�� �ؾ� �ȴ�.
        
         System.out.print("�̸� : ");

        // Ű����� �Էµ� ������ scan�� ����Ѵ�.
         Scanner scan = new Scanner(System.in);
    
        // ����� ������ �ڹ��� �ڷ������� �����Ű��(scan.nextXXX)
        //  String name = scan.next();
         String name2 = scan.nextLine();
         
         System.out.print("���� : ");
         int age= scan.nextInt();
        
         System.out.print("Ű : ");
         double ki = scan.nextDouble();

         System.out.print("�����Դϱ� : ");
         boolean res = scan.nextBoolean();

        if(res){
	 //  System.out.println("����� �̸� : " + name);
           System.out.println("����� �̸� : " + name2);
           System.out.println("����� ���� : " + age);
           System.out.println("����� Ű : " + ki);
        }else{
           System.out.println("����� �Է��ϼ���");
       }

    }
}