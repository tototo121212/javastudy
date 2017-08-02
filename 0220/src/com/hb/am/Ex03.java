package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex03 extends JFrame{
		
	public Ex03() {
	  super("계산기 3"); 
	  JPanel jp1 = new JPanel();
	  JTextField jtf1 = new JTextField(5);
	  JTextField jtf2 = new JTextField(5);
	  
	  jp1.add(new Label("수1 :"));
	  jp1.add(jtf1);
	  jp1.add(new Label("수2 :"));
	  jp1.add(jtf2);
	  jp1.add(new Label("연산자 :"));
	  // 콤보 박스 => 항목를 배열로 먼저 만들어 붙인다.
	  String[] items = {"선택하세요","   +   ","   -   ","   *   ","   /   "};
	  JComboBox jcb = new JComboBox(items);
	  jp1.add(jcb);
	  
	 // JPanel jp2 = new JPanel();
	  JTextArea jta = new JTextArea();
	  jta.setLineWrap(true);
	  jta.setEditable(false); // 편집 불가능
	  JScrollPane jsp = new JScrollPane(jta,
			  ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
			  ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	 //jp2.add(jsp);
	
	 JPanel jp3 = new JPanel();
	 JButton jb1 = new JButton("계산");
	 JButton jb2 = new JButton("종료");
	 JButton jb3 = new JButton("취소");
	 
	 jp3.add(jb1);
	 jp3.add(jb2);
	 jp3.add(jb3);
	 
	 add(jp1,BorderLayout.NORTH);
	 add(jsp,BorderLayout.CENTER);
	 add(jp3,BorderLayout.SOUTH);
	 
	 Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
	 setBounds(ds.width/2-150, ds.height/2-150, 500, 300);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setResizable(false);
	 setVisible(true);
	  
	}
	public static void main(String[] args) {
		new Ex03();
	}
}
