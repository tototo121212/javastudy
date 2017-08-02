package com.hb.am;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class Ex04_can extends JPanel{
	Image img;
	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawImage(img, getWidth()/2-50, getHeight()/2-50,100,100, this);
		repaint();
	}
}
