package com.hb.cm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// ��Ʈ�� : �����͸� ���������� ������ϴ� ��� 
// ����Ʈ ��Ʈ�� : 1byte�� �Է�, ����ϴ� ���
// ��� :  ����Ʈ�� �̷���� ����, ����, �Ҹ�, �׸�,,�� ��� ���� ����� ����

// �Է� ��Ʈ�� : InputStream => 
//              FileInputStream : ������ �о�帮�� ��Ʈ��
public class Ex03 {
	public static void main(String[] args) {
		FileInputStream fis= null;
		// File file = new File("c:/util/test01.txt");
		
		// read()�� ����ϸ� �ƽ�Ű�ڵ尪(0-255)�� �ޱ����� ����
		int k = 0;
		try {
			fis = new FileInputStream("c:/util/test01.txt");
			// fis = new FileInputStream(file);
			
			// read()�� 1byte��(�ѱ���) �о k�� �����
			// k = fis.read();
			
			// �ƽ�Ű�ڵ尪(����) => ���ڷ� ����
			// System.out.println(k);
			// System.out.println((char)(k));
			
			// ��ü���� �о����
			/*
			while(true){
				k = fis.read();
				// ���̻� �������� ������ -1�� ���´�.
				if(k == -1) break;
				System.out.println((char)k);
			}
			*/
			// -1�� �ƴҶ� ����, -1������ �������� ����
			while((k=fis.read())!= -1){
				System.out.println((char)k);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				 fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}









