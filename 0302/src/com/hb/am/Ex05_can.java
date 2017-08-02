package com.hb.am;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class Ex05_can extends JPanel {
	Image image ;
	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawImage(image, getWidth()/2-50, getHeight()/2-50,this);
		repaint();
	}
}
