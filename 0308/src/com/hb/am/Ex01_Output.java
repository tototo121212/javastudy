package com.hb.am;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// ��ü����ȭ : ��ü�� ������ �ִ� ������ ���Ϸ� �����ϴµ�
//             ���ķ� ���� �����(�˾� ���� ����.)
public class Ex01_Output {
	public static void main(String[] args) {
		//  vo�������� ��ü ����
		Ex01_VO t1 = new Ex01_VO("ȫ�浿", 12, "����", true);
		Ex01_VO t2 = new Ex01_VO("�Ѹ�", 1012, "�ϱ�", true);
		Ex01_VO t3 = new Ex01_VO("��ġ", 112, "����", true);
		Ex01_VO t4 = new Ex01_VO("������", 32, "����", true);
		Ex01_VO t5 = new Ex01_VO("������", 1012, "����", false);
		Ex01_VO t6 = new Ex01_VO("ȫ�浿", 12, "����", true);
		Ex01_VO t7 = new Ex01_VO("�Ѹ�", 1012, "�ϱ�", true);
		Ex01_VO t8 = new Ex01_VO("��ġ", 112, "����", true);
		Ex01_VO t9 = new Ex01_VO("������", 32, "����", true);
		Ex01_VO t10 = new Ex01_VO("������", 1012, "����", false);
		Ex01_VO t11 = new Ex01_VO("ȫ�浿", 12, "����", true);
		Ex01_VO t12 = new Ex01_VO("�Ѹ�", 1012, "�ϱ�", true);
		Ex01_VO t13 = new Ex01_VO("��ġ", 112, "����", true);
		Ex01_VO t14 = new Ex01_VO("������", 32, "����", true);
		Ex01_VO t15 = new Ex01_VO("������", 1012, "����", false);
		
		// ������� ��ü�� ������(�÷���)
		ArrayList<Ex01_VO> list = new ArrayList<>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);
		list.add(t8);
		list.add(t9);
		list.add(t10);
		list.add(t11);
		list.add(t12);
		list.add(t13);
		list.add(t14);
		list.add(t15);
		
		// ���� ��ü�鸦 ����ȭ ���� => ���Ϸ� ����� ��
		// ��ü ����ȭ�� (ObjectOutputStream.writeObject())
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try{
			fos = new FileOutputStream("c:/util/objectdata.txt");
			oos = new ObjectOutputStream(fos);
			
			// ��ü ����ȭ
			oos.writeObject(list);
			oos.flush();
		}catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}


		
		
		
		
		
		
		
		