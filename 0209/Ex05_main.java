import java.util.* ;
class Ex05_main 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        Ex05 test = new Ex05();
        Ex05_2 test2 = new Ex05_2();

		// 이름 국어 영어 수학 를 받아
        System.out.print("이름 : " );
		String name = scan.next();
		System.out.print("국어 : " );
		int kor = scan.nextInt();
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		System.out.print("수학 : ");
		int math = scan.nextInt();

		// 합계 구하는 메소드 호출
          int sum =  test.add(kor, eng, math);
		// 평균 구하는 메소드 호출
           double avg = test.avg(sum);
		// 학점 구하는 메소드 호출
          String hak = test.hak(avg);
		// 출력하는 메호드 호출
		  test.prn(name, sum, avg, hak);
        /////////////////////////////////////////////
		System.out.println(":::::::::::::::::::::::::");
         test2.add(kor, eng, math);
		 test2.prn(name);

	}
}
