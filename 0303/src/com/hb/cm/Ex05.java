package com.hb.cm;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex05 extends JFrame{
	int x =0 , y =50;
	JPanel jp1;
	JButton jb1;
	CanvasTest ct;
	Toolkit toolkit = getToolkit();
	public Ex05() {
		setTitle("°ø³îÀÌ");
		jp1 = new JPanel();
		jb1 = new JButton("¡Ú");
		
		ct = new CanvasTest();
		jp1.add(jb1);
		add(jp1, BorderLayout.NORTH);
		add(ct, BorderLayout.CENTER);
		
		Dimension ds =  toolkit.getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable() {
					@Override
					public void run() {
						while(x < ct.getWidth()-30){
							x += 10 ;
							try {
								Thread.sleep(500);	
							} catch (Exception e2) {
							}
							ct.repaint();
						}
					}
				} ).start();
				new Thread(new Runnable() {
					@Override
					public void run() {
						while(y<ct.getHeight()-30){
							y += 10 ;
							try {
								Thread.sleep(500);	
							} catch (Exception e2) {
							}
							ct.repaint();
						}
					}
				}).start();
			}
		});
	}
	private class CanvasTest extends JPanel {
		@Override
		public void paint(Graphics g) {
			g.clearRect(0, 0, getWidth(), getHeight());
			g.setColor(Color.GREEN);
			g.fillOval(x, 50, 30, 30);
			g.setColor(Color.MAGENTA);
			g.fillOval(460, y, 30, 30);
			
		}
	}
	public static void main(String[] args) {
		new Ex05();
	}
}
