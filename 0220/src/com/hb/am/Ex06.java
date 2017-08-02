package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex06 extends JFrame{
	public Ex06() {
		setTitle("ī��");
		JPanel jp1 = new JPanel();
		jp1.add(new JLabel("���ϴ� Ŀ�� ����"));
		
		JPanel jp2 = new JPanel();
		// ������ư => ButtionGroup()
		ButtonGroup bg = new ButtonGroup();
		JRadioButton jrb1 = new JRadioButton("�Ƹ޸�ī��(3000)");
		JRadioButton jrb2 = new JRadioButton("ī���ī(4000)");
		JRadioButton jrb3 = new JRadioButton("ī���(3500)");
		JRadioButton jrb4 = new JRadioButton("�����꽺(3000)");
		
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		jp2.add(jrb1);
		jp2.add(jrb2);
		jp2.add(jrb3);
		jp2.add(jrb4);
		
		JPanel jp3 = new JPanel();
		JTextField jtf1 = new JTextField(10);
		JTextField jtf2 = new JTextField(10);
		
		jp3.add(new JLabel("���� : "));
		jp3.add(jtf1);
		jp3.add(new JLabel("�Աݾ� : "));
		jp3.add(jtf2);
		
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true);
		jta.setEditable(false);
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JPanel jp4 = new JPanel();
		JButton jb1 =new JButton("���");
		JButton jb2 =new JButton("����");
		JButton jb3 =new JButton("���");
		
		jp4.add(jb1);
		jp4.add(jb2);
		jp4.add(jb3);
		
		JPanel pg1 = new JPanel();
		pg1.setLayout(new BorderLayout());
		pg1.add(jp1,BorderLayout.NORTH);
		pg1.add(jp2,BorderLayout.CENTER);
		
		JPanel pg2 = new JPanel();
		pg2.setLayout(new BorderLayout());
		pg2.add(jp3,BorderLayout.NORTH);
		pg2.add(jsp,BorderLayout.CENTER);
		pg2.add(jp4,BorderLayout.SOUTH);
		
		add(pg1,BorderLayout.NORTH);
		add(pg2,BorderLayout.CENTER);
		
		 Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		 setBounds(ds.width/2-300, ds.height/2-250, 600, 500);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setResizable(false);
		 setVisible(true);
	}
	public static void main(String[] args) {
		new Ex06();
	}
}
