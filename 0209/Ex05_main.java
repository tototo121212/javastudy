import java.util.* ;
class Ex05_main 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        Ex05 test = new Ex05();
        Ex05_2 test2 = new Ex05_2();

		// �̸� ���� ���� ���� �� �޾�
        System.out.print("�̸� : " );
		String name = scan.next();
		System.out.print("���� : " );
		int kor = scan.nextInt();
		System.out.print("���� : ");
		int eng = scan.nextInt();
		System.out.print("���� : ");
		int math = scan.nextInt();

		// �հ� ���ϴ� �޼ҵ� ȣ��
          int sum =  test.add(kor, eng, math);
		// ��� ���ϴ� �޼ҵ� ȣ��
           double avg = test.avg(sum);
		// ���� ���ϴ� �޼ҵ� ȣ��
          String hak = test.hak(avg);
		// ����ϴ� ��ȣ�� ȣ��
		  test.prn(name, sum, avg, hak);
        /////////////////////////////////////////////
		System.out.println(":::::::::::::::::::::::::");
         test2.add(kor, eng, math);
		 test2.prn(name);

	}
}
