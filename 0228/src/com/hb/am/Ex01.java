package com.hb.am;

// ����ó�� : try ~ catch ~
// try{
//      ���� �߻� ������ ����;     
//   }catch(���ܰ�ü e){
//      ���� �߻��� ó������;
//   }
// ���� : ���ܰ� �߻��Ǹ� ���������� ������ �ȴ�.
//       ����ó���� ���������� ���Ḧ �������� ����� �����ϰ�
//       ���ܹ߻��� ���ܸ� ó���Ѵ�. 
//       ���ܹ߻����� �Ʒ��� �����ϴ� ��ɾ���� �����ϰ� 
//       �ٷ� catch������ �̵��ȴ�.
public class Ex01 {
	public static void main(String[] args) {
		try {
			int[] var = { 10, 20, 30 };
			for (int i = 0; i <= var.length; i++) {
				System.out.println(1);
				System.out.println(2);
				System.out.println("var[" + i + "]=" + var[i]);
				System.out.println(3);
				System.out.println(4);
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("�迭 ũ�Ⱑ �߸� �Ǿ����ϴ�.");
		}
		System.out.println("�����ϼ̽��ϴ�.");
	}
}




