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

public class Ex01_6 extends JFrame{
	
	public Ex01_6() {
		setTitle("GridLayout");
		JPanel jp = new JPanel();
		
		JButton jb1 = new JButton("��ư1");
		JButton jb2 = new JButton("��ư2");
		JButton jb3 = new JButton("��ư3");
		JButton jb4 = new JButton("��ư4");
		JButton jb5 = new JButton("��ư5");
		
		// JPanel�� GridLayout���� ����
		// jp.setLayout(new GridLayout(5,0)); �����
		// jp.setLayout(new GridLayout(0,5)); // ������
		// jp.setLayout(new GridLayout(2,3,5,5)); // �����
		 jp.setLayout(new GridLayout(3,2,10,10)); // �����
		
		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150,ds.height/2-150,300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex01_6();
	}
}
