package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Ex02_Main extends JFrame{
	Ex02_Canvas can = new Ex02_Canvas();
	Toolkit toolkit = getToolkit();
	public Ex02_Main() {
		 add(can);
		 Dimension ds =  toolkit.getScreenSize();
		 setBounds(ds.width/2-500, ds.height/2-400, 1000, 800);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setResizable(false);
		 setVisible(true);
	}
	public static void main(String[] args) {
		new Ex02_Main();
	}
}
