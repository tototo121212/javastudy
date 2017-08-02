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

public class Ex03 extends JFrame{
	int x =0 , y =50;
	JPanel jp1;
	JButton jb1, jb2;
	CanvasTest ct;
	Toolkit toolkit = getToolkit();
	public Ex03() {
		setTitle("공놀이");
		jp1 = new JPanel();
		jb1 = new JButton("→");
		jb2 = new JButton("↓");
		
		ct = new CanvasTest();
		jp1.add(jb1);
		jp1.add(jb2);
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
				Task t1 = new Task("t1");
					t1.start();	
			}
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Task t2 = new Task("t2");
				t2.start();	
			}
		});
	}
	
	//내부 클래스 == 스레드클래스
	class Task extends Thread{
		String s;
		public Task(){}
		public Task(String s){
			this.s = s;
		}
		@Override
		public void run() {
			if(s.equals("t1")){
				while(x <= ct.getWidth()-30){
					x += 10 ;
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					ct.repaint();
				}
			}else if(s.equals("t2")){
				while(y <=ct.getHeight()-30){
					y += 10 ;
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					ct.repaint();
				}
			}
		}
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
		new Ex03();
	}
}
