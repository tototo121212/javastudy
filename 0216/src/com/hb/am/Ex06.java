package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class Ex06 extends JFrame{
	public Ex06() {
		super("리스트");
		JPanel jp = new JPanel();
		
		String[] items = {"좋아하는 운동","축구","야구","농구","배구"};
		JList jList = new JList(items);
		
		jp.add(jList);
		
		add(jp);
		
		// 특정항목을 먼저 나오게 하는 방법
		// jList.setSelectedIndex(2);
		 
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Ex06();
	}
}
