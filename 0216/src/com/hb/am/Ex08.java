package com.hb.am;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Ex08 extends JFrame{
	
	public Ex08() {
		setTitle("Tab");
		
		JTabbedPane jtab = new JTabbedPane();
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		jp1.setBackground(Color.BLUE);
		jp2.setBackground(Color.ORANGE);
		jp3.setBackground(Color.PINK);
		
		jtab.addTab("블루", jp1);
		jtab.addTab("오렌지", jp2);
		jtab.addTab("핑크", jp3);
		
		add(jtab);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Ex08();
	}
}
