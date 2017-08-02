package com.hb.am;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex03 extends JFrame{
	ImageTest it = new ImageTest();
	Toolkit toolkit = getToolkit();
	public Ex03() {
		add(it);
		 Dimension ds =  toolkit.getScreenSize();
		 setBounds(ds.width/2-500, ds.height/2-400, 1000, 800);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setResizable(false);
		 setVisible(true);
	}
	
	// 내부 클래스
	private class ImageTest extends JPanel{
		Image img;
		public ImageTest() {
			toolkit = getToolkit();
			img = toolkit.getImage("src/img/image2.gif");
		}
		@Override
		public void paint(Graphics g) {
			g.drawImage(img, 10, 10, this);
		}
	}
	public static void main(String[] args) {
		new Ex03();
	}
}
