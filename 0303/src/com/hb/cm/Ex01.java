package com.hb.cm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex01 extends JFrame{
	int x;
	JPanel jp1;
	JButton jb;
	CanvasTest ct = new CanvasTest();
	Toolkit toolkit = getToolkit();
	public Ex01() {
		setTitle("°ø³îÀÌ");
		jp1 = new JPanel();
		jb = new JButton("¡æ");
        
		ct = new CanvasTest();
		jp1.add(jb);

		add(jp1, BorderLayout.NORTH);
		add(ct, BorderLayout.CENTER);
		
		Dimension ds =  toolkit.getScreenSize();
		setBounds(ds.width/2-500, ds.height/2-400, 1000, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				while(x < ct.getWidth()-30){
					x +=1;
					ct.repaint();
				}
			}
		});
	}
	private class CanvasTest extends JPanel{
		@Override
		public void paint(Graphics g) {
			g.clearRect(0, 0, getWidth(), getHeight());
			g.setColor(Color.GREEN);
			g.fillOval(x, 50, 30, 30);
			
		}
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
