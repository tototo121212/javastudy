class Test03{
     public static void main(String[] args){
	// �Է� => ó�� => ���
	
	int input = 10000; // ������ �ݾ�
        int dan = 3500; // ī���ī �ܰ�
        int su = 2 ; // ����

       // �հ�, �ΰ���, �ѱݾ�, �ܵ� => ó���ϱ�
        int sum = dan * 2 ;
        int vat = (int)(sum * 0.1);		
        int total = sum + vat ;
        int output = input - total ;
     
        // ����ϱ�
        System.out.println("������ �� : " + input);
        System.out.println("�ܰ� : " + dan);
        System.out.println("���� : " + su);
        System.out.println("�ΰ��� : " + vat);
        System.out.println("��ǰ�Ѿ� : " + total);
        System.out.println("�Ž��� �� : " + output);
     }
}




