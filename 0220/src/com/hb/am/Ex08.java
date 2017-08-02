package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ex08 extends JFrame{
	public Ex08() {
		setTitle("피자 주문판");
		
		JPanel jp1 = new JPanel();
		jp1.add(new JLabel("자바 피자에 오신것을 환영합니다."));
		
		JPanel jp2 = new JPanel();
		JButton jb1 = new JButton("주문");
		JButton jb2 = new JButton("취소");
		JTextField jtf1 = new JTextField(15);
		jtf1.setEditable(false);
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jtf1);
		
		JPanel jp3 = new JPanel();
		ButtonGroup bg = new ButtonGroup();
		JRadioButton jrb1 = new JRadioButton("콤보",true);
		JRadioButton jrb2 = new JRadioButton("포테이토");
		JRadioButton jrb3 = new JRadioButton("불고기");
		jp3.setLayout(new GridLayout(3,0));
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		jp3.add(jrb1);
		jp3.add(jrb2);
		jp3.add(jrb3);
		jp3.setBorder(BorderFactory.createTitledBorder("종류"));

		JPanel jp4 = new JPanel();
		ButtonGroup bg2 = new ButtonGroup();
		JRadioButton jrb4 = new JRadioButton("피망");
		JRadioButton jrb5 = new JRadioButton("치즈",true);
		JRadioButton jrb6 = new JRadioButton("페페로니");
		JRadioButton jrb7 = new JRadioButton("베이커");
		jp4.setLayout(new GridLayout(4,0));
		bg2.add(jrb4);
		bg2.add(jrb5);
		bg2.add(jrb6);
		bg2.add(jrb7);
		jp4.add(jrb4);
		jp4.add(jrb5);
		jp4.add(jrb6);
		jp4.add(jrb7);
		jp4.setBorder(BorderFactory.createTitledBorder("추가토핑"));
		
		JPanel jp5 = new JPanel();
		ButtonGroup bg3 = new ButtonGroup();
		JRadioButton jrb8 = new JRadioButton("Small");
		JRadioButton jrb9 = new JRadioButton("Medium",true);
		JRadioButton jrb10 = new JRadioButton("Large");
		jp5.setLayout(new GridLayout(3,0));
		bg3.add(jrb8);
		bg3.add(jrb9);
		bg3.add(jrb10);
		jp5.add(jrb8);
		jp5.add(jrb9);
		jp5.add(jrb10);
		jp5.setBorder(BorderFactory.createTitledBorder("사이즈"));

		add(jp1,BorderLayout.NORTH);
		add(jp2,BorderLayout.SOUTH);
		add(jp3,BorderLayout.WEST);
		add(jp4,BorderLayout.CENTER);
		add(jp5,BorderLayout.EAST);
		
		 Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		 setBounds(ds.width/2-200, ds.height/2-150, 400, 300);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setResizable(false);
		 setVisible(true);
		
	}
	public static void main(String[] args) {
		new Ex08();
	}
}






