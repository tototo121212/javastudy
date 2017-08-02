package com.hb.bm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ex07 extends JFrame{
	JPanel jp1, jp2, jp3, jp4, jp5;
	JButton jb1, jb2;
	JTextField jtf;
	ButtonGroup bg, bg2, bg3;
	JRadioButton jrb1, jrb2, jrb3, jrb4, jrb5, jrb6, jrb7, jrb8, jrb9, jrb10;
	int dan, add;
	double add2;
	String menu;
	public Ex07() {
		setTitle("피자 주문판");
		
		 jp1 = new JPanel();
		jp1.add(new JLabel("자바 피자에 오신것을 환영합니다."));
		
		 jp2 = new JPanel();
		 jb1 = new JButton("주문");
		 jb2 = new JButton("취소");
		 jtf = new JTextField(15);
		 jtf.setEditable(false);
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jtf);
		
		 jp3 = new JPanel();
		 bg = new ButtonGroup();
		 jrb1 = new JRadioButton("콤보");// 15000
		 jrb2 = new JRadioButton("포테이토"); // 20000
		 jrb3 = new JRadioButton("불고기");   // 30000
		jp3.setLayout(new GridLayout(3,0));
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		jp3.add(jrb1);
		jp3.add(jrb2);
		jp3.add(jrb3);
		jp3.setBorder(BorderFactory.createTitledBorder("종류"));

		 jp4 = new JPanel();
		 bg2 = new ButtonGroup();
		 jrb4 = new JRadioButton("피망");       // 1000
		 jrb5 = new JRadioButton("치즈");  // 500
		 jrb6 = new JRadioButton("페페로니");   // 1000
		 jrb7 = new JRadioButton("베이커");     // 1500
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
		
		 jp5 = new JPanel();
		 bg3 = new ButtonGroup();
		 jrb8 = new JRadioButton("Small");        // 80%
		 jrb9 = new JRadioButton("Medium");  // 100%
		 jrb10 = new JRadioButton("Large");       // 120%    
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
		
		 jrb1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==e.SELECTED) dan =15000;
			}
		});
		 jrb2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==e.SELECTED) dan =20000;
			}
		});
		 jrb3.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==e.SELECTED) dan =30000;
			}
		});
		 jrb4.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==e.SELECTED)  add= 1000 ;
			}
		});
		 jrb5.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==e.SELECTED)  add= 500 ;
			}
		});
		 jrb6.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==e.SELECTED)  add= 1000 ;	
			}
		});
		 jrb7.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==e.SELECTED)  add= 1500 ;
			}
		});
		 
		 jrb8.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==e.SELECTED)  add2= (int)(dan*0.8) ;
			}
		});
		 jrb9.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==e.SELECTED)  add2= (int)(dan*1.0);
			}
		});
		 jrb10.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==e.SELECTED)  add2= (int)(dan*1.2) ;
			}
		});
		 
		 jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jtf.setText((add+add2) +" 원");	
			}
		});
		 jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jtf.setText("");
				bg.clearSelection();
				bg2.clearSelection();
				bg3.clearSelection();
			}
		});
	}
	public static void main(String[] args) {
		new Ex07();
	}
}






