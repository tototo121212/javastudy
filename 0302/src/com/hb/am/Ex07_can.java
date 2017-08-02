package com.hb.am;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Ex07_can extends JPanel{
	int x = -30; int y = -30 ; int wh= 30;
	@Override
	public void paint(Graphics g) {
		
		int r = (int)(Math.random()*255);
		int g1 = (int)(Math.random()*255);
		int b = (int)(Math.random()*255);
		g.setColor(new Color(r, g1, b));
		g.clearRect(0, 0, getWidth(), getHeight());
		g.fillOval(x-wh/2, y-wh/2, wh, wh);
	}
}
