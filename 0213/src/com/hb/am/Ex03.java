package com.hb.am;

import java.util.StringTokenizer;

public class Ex03 {
	public static void main(String[] args) {
	// 	StringTokenizer : ���ڿ��� ������.(String.split() )
	//  ������ : ������� ���� �� ����. �ʿ���� ���� ����
	//           ��ȯ���� String[] �ƴ϶� for���� ��� ����
		// ������ �Ϲ������� ������ ���� ��밡��
		StringTokenizer st = new StringTokenizer("this is a test");
		// countTokens() => ���������� ����
		 String[] arr = new String[st.countTokens()] ;
		 int i = 0 ;
		while (st.hasMoreTokens()) {
		    arr[i]= st.nextToken();
		    i++;
		}
		for (String k : arr) {
			System.out.println(k);
		}
        
		StringTokenizer st2 = new StringTokenizer("2013/02/13","/");
		while (st2.hasMoreTokens()) {
		    System.out.println(st2.nextToken());
		}
		
		
	}
}
