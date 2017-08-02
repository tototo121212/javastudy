package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Ex05_1 extends JFrame{
	JPanel jp;
	JComboBox<String> jcom ;
	String[] items = {"선택","그림1", "그림2"};
	Image image;
	CanvasTest ct = new CanvasTest();
	Toolkit toolkit = getToolkit();
	public Ex05_1() {
	   setTitle("콤보박스");
	   jp = new JPanel();
	   jcom = new JComboBox<>(items);
	   jp.add(jcom);
	   
	   add(jp,BorderLayout.NORTH);
	   add(ct,BorderLayout.CENTER);
	   
	     Dimension ds =  toolkit.getScreenSize();
		 setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setResizable(false);
		 setVisible(true);
		 
		 jcom.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==e.SELECTED){
					String s =(String)e.getItem();
					if(s.equals("그림1")){
						image = toolkit.getImage("src/img/image1.gif");
					}else if(s.equals("그림2")){
						image = toolkit.getImage("src/img/image2.gif");
					}
				}
			}
		});
	}
	private class CanvasTest extends JPanel{
		@Override
		public void paint(Graphics g) {
			g.clearRect(0, 0, getWidth(), getHeight());
			g.drawImage(image, getWidth()/2-50, getHeight()/2-50,this);
			repaint();
		}
	}
	public static void main(String[] args) {
		new Ex05_1();
	}
}
