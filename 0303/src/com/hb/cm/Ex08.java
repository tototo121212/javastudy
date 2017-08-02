package com.hb.cm;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex08 extends JFrame{
	JPanel jp ;
	JButton jb;
	Toolkit toolkit = getToolkit();
	Canvas canvas ;
	// 공들의 집합소
	ArrayList<Ex09> list;
	public Ex08() {
		list = new ArrayList<>();
		jp = new JPanel();
		jb = new JButton("↓");
		jp.add(jb);
		
		add(jp,BorderLayout.NORTH);
		add(canvas = new Canvas(){
			@Override
			public void paint(Graphics g) {
			  // list에 있는 공을 출력하기
				for(int i=0; i<list.size(); i++){
					Ex09 k = list.get(i);
				   g.setColor(Color.MAGENTA);
				   g.fillOval(k.x, k.y , 30, 30);
				}
			}
		},BorderLayout.CENTER);
		
		setBounds(100, 100, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼을 누르면 공을 생성
				// 각각의 공은 객체이다. => list에 저장 시킨다.
				// 내부클래스 타입은  this을 사용못함
				  Ex09 k = new Ex09(Ex08.this);
				  k.x = (int)(Math.random()*canvas.getWidth())-35;
				  list.add(k);
				  k.start();
			}
		});
	}
	
	public static void main(String[] args) {
		new Ex08();
	}
}







