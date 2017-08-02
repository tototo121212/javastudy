package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

 // ������Ʈ�� ȭ�鿡 ��ġ�ϴ� ��� => Layout
 // Layout ���� = > ��ġ������ (Layout Manager)
 // ��ġ�ϴ� ��� : 
 // FlowLayout : ��� �߾� ���� ��ġ (��) JPanel
 // BorderLayout : ��,��,��,��,�߾� ��ġ
 //                ��,��,��,��,�߾��� ǥ������ ������ ������ ������Ʈ�� 
 //                ȭ���� ä���. (��) JFrame
 // GridLayout : ��������
 // BoxLayout : �ϳ��� ��, �ϳ��� ���� �����.
 // ������ǥ : ������Ʈ���� ��ǥ�� �����ؼ� ��ġ�ϴ� ���
 // CardLayout : �������� ī�带 �׾Ƶ� �� �ϳ��� �����ִ� ����
 //              �������� �ִٰ� �̺�Ʈ�� �߻��ϸ� �ϳ��� �����ִ� ����

public class Ex01_7 extends JFrame{
	
	public Ex01_7() {
		setTitle("������ǥ");
		JPanel jp = new JPanel();
		
		JButton jb1 = new JButton("��ư1");
		JButton jb2 = new JButton("��ư2");
		JButton jb3 = new JButton("��ư3");
		JButton jb4 = new JButton("��ư4");
		JButton jb5 = new JButton("��ư5");
		
		// JP�� ������ǥ�� ������
		 jp.setLayout(null);
		 jb1.setBounds(100, 5, 100, 50);
		 jb2.setBounds(205, 60, 100, 50);
		 
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-300,ds.height/2-300,600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex01_7();
	}
}
