package com.hb.am;

import com.hb.am.Ex04.Ex04_1;

public class Ex04_main {
	public static void main(String[] args) {
		System.out.println(Ex04_1.pi);
		System.out.println(Ex04_1.pi2);
		
		// static ����Ŭ������ ������ ��ü ���� �� ���ٰ���
		Ex04_1 test = new Ex04_1();
		System.out.println(test.str);
		System.out.println(test.age);
	}
}
