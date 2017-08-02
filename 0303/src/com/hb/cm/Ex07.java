package com.hb.cm;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex07 extends JFrame{
	JPanel jp;
	JButton jb;
	Image image1, image2, image3, image4;
	Toolkit toolkit = getToolkit();
	int x1 = 10 ;
	int x2 = 10 ;
	int x3 = 10 ;
	int x4 = 10 ;
	CanvasTest ct = new CanvasTest();
	public Ex07() {
		setTitle("경주하기");
		jp = new JPanel();
		jb = new JButton("start");
		jp.add(jb);
		
		add(jp,BorderLayout.NORTH);
		add(ct,BorderLayout.CENTER);
		setBounds(100, 100, 900, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable() {
					@Override
					public void run() {
						while(x1 < ct.getWidth()-120){
							x1 = x1 + (int)(Math.random()*30);
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							ct.repaint();
						}
					}
				}).start();
				new Thread(new Runnable() {
					@Override
					public void run() {
						while(x2 < ct.getWidth()-120){
							x2 = x2 + (int)(Math.random()*30);
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							ct.repaint();
						}
					}
				}).start();
				new Thread(new Runnable() {
					@Override
					public void run() {
						while(x3 < ct.getWidth()-120){
							x3 = x3 + (int)(Math.random()*30);
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							ct.repaint();
						}
					}
				}).start();
				new Thread(new Runnable() {
					@Override
					public void run() {
						while(x4 < ct.getWidth()-120){
							x4 = x4 + (int)(Math.random()*30);
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							ct.repaint();
						}
					}
				}).start();
			}
		});
	}
	
	private class CanvasTest extends Canvas{
		public CanvasTest() {
			image1 = toolkit.getImage("src/img/image1.gif");
			image2 = toolkit.getImage("src/img/image2.gif");
			image3 = toolkit.getImage("src/img/image1.gif");
			image4 = toolkit.getImage("src/img/image2.gif");
		}
		@Override
		public void paint(Graphics g) {
			g.clearRect(0, 0, getWidth(), getHeight());
			g.drawImage(image1,x1,10,100,100,this);
			g.drawImage(image2,x2,110,100,100,this);
			g.drawImage(image1,x3,220,100,100,this);
			g.drawImage(image2,x4,330,100,100,this);
		}
	}
	public static void main(String[] args) {
		new Ex07();
	}
}
