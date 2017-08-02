package com.hb.am;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Ex01 extends JFrame{
	Canvas can ; // 도화지
	Toolkit toolkit = getToolkit();
	Image image;
	public Ex01() {
		setTitle("Canvas");
		can = new Canvas(){
			// 그림 그리는 메소드, g => 붓
			@Override
			public void paint(Graphics g) {
			  // 선그리기: drawLine(시작위치, 끝위치)
				g.drawLine(10, 10, 110, 10);
				g.drawLine(10, 10, 10, 110);
				g.drawLine(110, 10, 110, 110);
				g.drawLine(10, 110, 110, 110);
				g.drawLine(10, 10, 110, 110);
				g.drawLine(110, 10, 10, 110);
				
				g.setColor(Color.RED);
				
				// 사각형 drawRect
				g.drawRect(120, 10, 100, 100);
				g.drawRect(130, 20, 80, 80);
				g.drawRect(140, 30, 60, 60);
				g.drawRect(150, 40, 40, 40);
				
				// 채원진 사각형 fillRect
				g.fillRect(230, 10, 100, 100);
				
				g.setColor(Color.CYAN);
				g.fillRect(240, 20, 80, 80);
				
				// 둥근모서리 사각형 : drawRoundRect
				g.drawRoundRect(340, 10, 100, 100, 0, 0);
				g.drawRoundRect(450, 10, 100, 100, 100, 100);
				
				// 빛의 3요소 : 0-255
				g.setColor(new Color(0, 0, 255));
				g.fillRoundRect(560, 10, 100, 100, 15, 15);
				g.fillRoundRect(670, 10, 100, 100, 30, 30);
				
				g.setColor(Color.ORANGE);
				g.drawOval(780, 10, 100, 100);
				g.fillOval(890, 10, 100, 100);
			
				g.setColor(Color.YELLOW);
				g.drawArc(10, 120, 100, 100, 0, 180);
				g.fillArc(120, 120, 100, 100, 0, 90);
				g.fillArc(230, 120, 100, 100, 90, 180);
				g.fillArc(340, 120, 100, 100, 180, 270);
				g.fillArc(450, 120, 100, 100, 270, 360);
				
				g.setColor(Color.BLACK);
				g.drawString("대한민국", 10, 230);
				
				// 그림 붙이기
				image =	toolkit.getDefaultToolkit().getImage("src/img/image1.gif");
				g.drawImage(image, 10,340,this);
				g.drawImage(image, 120, 340, 100, 100, this);
				g.drawImage(image, 230, 340, 100, 100,Color.YELLOW ,this);
			
			}
		};
	 add(can);
	 Dimension ds =  toolkit.getScreenSize();
	 setBounds(ds.width/2-500, ds.height/2-400, 1000, 800);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setResizable(false);
	 setVisible(true);
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
