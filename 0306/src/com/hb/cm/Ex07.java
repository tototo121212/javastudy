package com.hb.cm;

import java.io.FileOutputStream;

// ��Ʈ�� : �����͸� ���������� ������ϴ� ��� 
// ����Ʈ ��Ʈ�� : 1byte�� �Է�, ����ϴ� ���
// ��� :  ����Ʈ�� �̷���� ����, ����, �Ҹ�, �׸�,,�� ��� ���� ����� ����
// ��� ��Ʈ��  OutputStream=> 
//             FileOutputStream : ������ �����ؼ� ������ ����ϴ� ��Ʈ��
public class Ex07 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			// ������ ���������.
			// ������, �����ȴ�.
			 fos = new FileOutputStream("c:/util/test02.txt");

			// �̾�⸦ �ϰ��� �ϸ� true�� �־�����
			// fos = new FileOutputStream("c:/util/test02.txt",true);
			// �ƽ�Ű �ڵ� 97�� a�̴�.
			// test02.txt�� a�� �� �ִ� ���� Ȯ���� �� �ִ�.
			// fos.write(97);
			// fos.flush();

			// ���� ���� �ֱ�
			/*
			int b = 'l';
			fos.write(b);
			fos.flush();
			b = 'o';
			fos.write(b);
			fos.flush();
			b = 'v';
			fos.write(b);
			fos.flush();
			b = 'e';
			fos.write(b);
			fos.flush();
			*/
			/*
			byte[] b = {'k','o','r','e','a',13,10,'b','o','y'};
			fos.write(b);
			fos.flush();
			*/
			String msg ="�ȳ��ϼ���\r\n12345\r\nHello~~\r\n��������";
			byte[] b = msg.getBytes();
			fos.write(b);
			fos.flush();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
