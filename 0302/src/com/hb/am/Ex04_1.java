package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex04_1 extends JFrame {
	JPanel jp1;
	ButtonGroup bg;
	JRadioButton jrb1,jrb2;
	Image image;
	CanvasTest ct = new CanvasTest();
	Toolkit toolkit = getToolkit();
	public Ex04_1() {
		setTitle("라디오버튼 1");
		jp1 = new JPanel();
		
		bg = new ButtonGroup();
		jrb1 = new JRadioButton("그림1");
		jrb2 = new JRadioButton("그림2");
		
		
		bg.add(jrb1);
		bg.add(jrb2);
		
		jp1.add(jrb1);
		jp1.add(jrb2);
		
		
		add(jp1,BorderLayout.NORTH);
		add(ct,BorderLayout.CENTER);
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 // 창 크기를 움직이면 다시 그려진다.
		 setResizable(false);
		 setVisible(true);
		 
		 jrb1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == e.SELECTED){
					image = toolkit.getImage("src/img/image1.gif");
				}
			}
		});
		 jrb2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == e.SELECTED){
					image = toolkit.getImage("src/img/image2.gif");
				}
			}
		});
	}
	private class CanvasTest extends JPanel{
		@Override
		public void paint(Graphics g) {
			g.clearRect(0, 0, getWidth(), getHeight());
			g.drawImage(image, getWidth()/2-50, getHeight()/2-50,100,100, this);
			//  다시 그릴때 
			repaint();
		}
	}
	public static void main(String[] args) {
		new Ex04_1();
	}
}
