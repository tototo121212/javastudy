package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex05 extends JFrame{
	public Ex05() {
		setTitle("����");
		
		JPanel jp1 = new JPanel();
		JTextField jtf1 = new JTextField(10);
		jp1.add(new JLabel("�̸� : "));
		jp1.add(jtf1);
		
		JPanel jp2 = new JPanel();
		JTextField jtf2 = new JTextField(10);
		JTextField jtf3 = new JTextField(10);
		JTextField jtf4 = new JTextField(10);
		
		jp2.add(new JLabel("���� : "));
		jp2.add(jtf2);
		jp2.add(new JLabel("���� : "));
		jp2.add(jtf3);
		jp2.add(new JLabel("���� : "));
		jp2.add(jtf4);
		
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true);
		jta.setEditable(false);
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JPanel jp3 = new JPanel();
		JButton jb1 = new JButton("���");
		JButton jb2 = new JButton("����");
		JButton jb3 = new JButton("���");
	    jp3.add(jb1);	
	    jp3.add(jb2);	
	    jp3.add(jb3);
	    
		JPanel jp4 = new JPanel();
		jp4.setLayout(new BorderLayout());
		
		jp4.add(jp2,BorderLayout.NORTH);
		jp4.add(jsp,BorderLayout.CENTER);
		jp4.add(jp3,BorderLayout.SOUTH);
		
		add(jp1,BorderLayout.NORTH);
		add(jp4,BorderLayout.CENTER);
		
		 Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		 setBounds(ds.width/2-300, ds.height/2-250, 600, 500);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setResizable(false);
		 setVisible(true);
	}
	public static void main(String[] args) {
		new Ex05();
	}
}










