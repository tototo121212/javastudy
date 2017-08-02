package com.hb.am;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex09 extends JFrame{
	Image img;
	Toolkit toolkit = getToolkit();
	int x= -50; int y = -50;
	CavasTest ct = new CavasTest();
	public Ex09() {
		setTitle("Canvas ¿¬½À");
		add(ct);
		Dimension ds =  toolkit.getScreenSize();
		setBounds(ds.width/2-500, ds.height/2-400, 1000, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		ct.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				
				ct.repaint();
			}
		});
	}
	
	private class CavasTest extends JPanel{
		public CavasTest() {
			img = toolkit.getImage("src/img/image1.gif");
		}
		@Override
		public void paint(Graphics g) {
			g.clearRect(0, 0, getWidth(), getHeight());
			//g.drawImage(img, x-img.getWidth(this)/2, y, this);
			g.drawImage(img, x-25, y-25, 50, 50, this);
		}
	}
	public static void main(String[] args) {
		new Ex09();
	}
}
