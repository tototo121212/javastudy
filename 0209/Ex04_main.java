import java.util.*;
class Ex04_main 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        Ex04 test = new Ex04();

		System.out.print("첫번째 수 : ");
		int su1 = scan.nextInt();

        System.out.print("두번째 수 : ");
		// int su2 = scan.nextInt();
		String su2 = scan.next();

        int res = test.add(su1, su2);
        System.out.println("결과 : " +res);

  
	}
}
