package com.hb.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();

		jf.setTitle("�ι�° ��ư");

		JButton jb1 = new JButton("ù��° ��ư");
		JButton jb2 = new JButton("�ι�° ��ư");
		JButton jb3 = new JButton("����° ��ư");
		JButton jb4 = new JButton("�׹�° ��ư");
		JButton jb5 = new JButton("�ټ���° ��ư");

		// �����̳�
		JPanel jp = new JPanel();

		// ������Ʈ�� �����̳ʿ��� ���϶� ����ϴ� �޼ҵ� : add
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);

		// ������Ʈ�� ���� �����̳ʸ� �����̳�(������)�� ���δ�.
		jf.add(jp);
		
		jf.setSize(300, 300);
		jf.setLocation(0, 0);
		jf.setVisible(true);
		
	}
}









