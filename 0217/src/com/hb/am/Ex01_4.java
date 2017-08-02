package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

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

public class Ex01_4 extends JFrame{
	
	public Ex01_4() {
		setTitle("FlowLayout");
		
		// JFrame�� ������ BorderLayout �ε�  FlowLayout���� ����
		setLayout(new FlowLayout());
		
		JButton jb1 = new JButton("��ư1");
		JButton jb2 = new JButton("��ư2");
		JButton jb3 = new JButton("��ư3");
		JButton jb4 = new JButton("��ư4");
		JButton jb5 = new JButton("��ư5");
		
	
		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
		add(jb5);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150,ds.height/2-150,300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex01_4();
	}
}