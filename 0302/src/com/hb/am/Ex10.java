package com.hb.am;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex10 extends JFrame{
	Image img ;
	Toolkit toolkit = getToolkit();
	int x = 200;
	CanvasTest ct = new CanvasTest();
	public Ex10() {
		setTitle("Canvas ¿¬½À");
		add(ct);
		Dimension ds =  toolkit.getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				switch (key) {
				case KeyEvent.VK_LEFT:
					if(x <= 0){
						x = 0 ;
					}else{
						x = x - 10 ;
					}
					break;

				case KeyEvent.VK_RIGHT:
					if(x >= ct.getWidth()-100){
						x = ct.getWidth()-100;
					}else{
						x = x + 10 ;
					}
					break;
				}
				ct.repaint();
			}
		});
	}
	private class CanvasTest extends JPanel{
		public CanvasTest() {
			img = toolkit.getImage("src/img/image1.gif");
		}
		@Override
		public void paint(Graphics g) {
		   g.clearRect(0, 0, getWidth(), getHeight());
		   g.drawImage(img, x, 380, 100, 100, this);
		}
	}
	public static void main(String[] args) {
		new Ex10();
	}
}
