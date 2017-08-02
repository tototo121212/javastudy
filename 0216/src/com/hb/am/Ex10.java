package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Ex10 extends JFrame{
	public Ex10() {
		setTitle("테이블 ( 표 )");
		
	    Ex10_1 ex10_1 = new Ex10_1();
	    
	    JTable table = new JTable(ex10_1);
	    	    
	    JScrollPane jsp = new JScrollPane(table);
	      add(jsp);
	    
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex10() ;
	}
}
