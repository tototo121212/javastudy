class Ex02_main 
{
	public static void main(String[] args) 
	{
        // ��ü ���������� static ȣ�� ���� instance�� ȣ�� �� �� ����.
		// static ȣ���� ; Ŭ�����̸�.�����̸�, Ŭ�����̸�.�޼ҵ�
         System.out.println(Ex02_1.su2);
         System.out.println(Ex02_1.SU3);


		// Ŭ������ ��ü ��������
		// Ŭ�����̸� �������� = new ������ ;
		// �ش� Ŭ������ �����ڸ� ������ �ʾ����� �⺻ �����ڸ� �̿��ؾߵȴ�.
		// �⺻ ������ = Ŭ�����̸�();
		// Ex02_1 Ŭ���� ��ü ��������.
		Ex02_1 test = new Ex02_1();

	    int res =  test.su1;
		System.out.println(res);
		System.out.println(test.su2);
		System.out.println(test.SU3);
		System.out.println(test.SU4);
	    System.out.println("�޼ҵ� ȣ����");
        test.prn();
		String mg = test.prn2();
		System.out.println(mg);
	    System.out.println("�޼ҵ� ȣ����");
	}
}
