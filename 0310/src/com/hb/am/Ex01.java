package com.hb.am;

import java.net.InetAddress;

// InetAddress : IP�ּҸ� ǥ���ϴ� Ŭ����
// �����ڴ� ���������� new �����ڷ� �������� ����
// 5�� static �޼ҵ带 ������ �����Ѵ�.
// localhost => ���� ���� ����ϰ� �ִ� ��ǻ�͸� ����
public class Ex01 {
	public static void main(String[] args) {
		try {
			InetAddress addr1 = InetAddress.getLocalHost();
			System.out.println("ȣ��Ʈ�̸� : "+addr1.getHostName());
			System.out.println("ȣ��ƮIP : "+addr1.getHostAddress());
			
			InetAddress addr2 = InetAddress.getByName("www.naver.com");
			System.out.println("ȣ��Ʈ�̸� : "+addr2.getHostName());
			System.out.println("ȣ��ƮIP : "+addr2.getHostAddress());
			
			InetAddress[] addr3 = InetAddress.getAllByName("www.daum.net");
			for(InetAddress k : addr3){
			System.out.println("�����̸� : "+ k.getHostName());
			System.out.println("����IP : "+ k.getHostAddress());
			System.out.println("::::::::::::::::::::::::::::::::::");
			
			}
			byte[] b = {125,(byte) 209,(byte) 222,(byte) 141};
			InetAddress addr4 = InetAddress.getByAddress(b);
			System.out.println("���̹��̸� : "+ addr4.getHostName());
			System.out.println("���̹�IP : "+ addr4.getHostAddress());
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}

