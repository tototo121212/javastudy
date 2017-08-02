package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex13 extends JFrame {
	JPanel jp;
	JButton jb;
	Image[] image = new Image[45];
	Toolkit toolkit = getToolkit();
	// Set<Integer> set = new HashSet<>();
	CanvasTest ct = new CanvasTest();
	int[] su = new int[6];
	public Ex13() {
		setTitle("로또2");
		jp = new JPanel();
		jb = new JButton("번호 생성");
		jp.add(jb);

		add(jp, BorderLayout.EAST);
		add(ct, BorderLayout.CENTER);

		setBounds(100, 100, 900, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ct.repaint();
			}
		});
	}

	private class CanvasTest extends Canvas {
		public CanvasTest() {
			// 이미지 넣기
			for (int i = 0; i < image.length; i++) {
				image[i] = toolkit.getImage("src/imagesLotto/"+(i+1)+".gif");
			}
		}
		@Override
		public void paint(Graphics g) {
			// 숫자 넣기
			// set방식으로
			for (int i = 0; i < su.length; i++) {
				su[i] = (int)(Math.random()*45)+1;
				for(int j=0; j<i; j++ ){
					if(su[i]==su[j]){ 
						i--;
				   	   break;
					}
				}
			}
			// 숫자를 그림으로 
			for(int i=0; i<su.length; i++){
				g.drawImage(image[su[i]-1],(i*120) ,25, this);
			}
		}
	}
	public static void main(String[] args) {
		new Ex13();
	}

}
