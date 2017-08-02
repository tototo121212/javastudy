package com.hb.am;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex06_2 extends JFrame{
	Ex06_can ct = new Ex06_can();
	Toolkit toolkit = getToolkit();
	
	public Ex06_2() {
	   setTitle("Canvas 연습");
	   
	   add(ct);
	   Dimension ds = toolkit.getScreenSize();
	   setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   //setResizable(false);
	   setVisible(true);
	   
	   ct.addMouseListener(new MouseAdapter() {
		   @Override
		public void mouseClicked(MouseEvent e) {
			  // 클릭한 위치값
			   ct.x = e.getX();
			   ct.y = e.getY();
			   ct.repaint();
		}
	});
	}

	public static void main(String[] args) {
		new Ex06_2();
	}
}
