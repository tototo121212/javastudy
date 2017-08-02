package com.hb.am;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Ex08_can extends JPanel{
	int x = -30; int y = -30 ; int wh= 30;
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillOval(x-wh/2, y-wh/2, wh, wh);
	}
}
