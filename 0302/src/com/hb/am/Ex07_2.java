package com.hb.am;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex07_2 extends JFrame{
	Ex07_can ct = new Ex07_can();
	Toolkit toolkit = getToolkit();
	public Ex07_2() {
	   setTitle("Canvas ����");
	   
	   add(ct);
	   Dimension ds = toolkit.getScreenSize();
	   setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   setResizable(false);
	   setVisible(true);
	   
	   ct.addMouseListener(new MouseAdapter() {
		   @Override
		public void mouseClicked(MouseEvent e) {
			  // Ŭ���� ��ġ��
			   ct.x = e.getX();
			   ct.y = e.getY();
			   ct.repaint();
			   
		}
	});
	}
	public static void main(String[] args) {
		new Ex07_2();
	}
}
