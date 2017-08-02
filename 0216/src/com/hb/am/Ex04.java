package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class Ex04 extends JFrame{
	public Ex04() {
		super("토글버튼");
		
		JPanel jp = new JPanel();
		
		JToggleButton jtb1 =new JToggleButton();
		jtb1.setText("축구");
		
		JToggleButton jtb2 = new JToggleButton("야구");
		jtb2.setSelected(true);
		
		JToggleButton jtb3 = new JToggleButton("배구",true);
		JToggleButton jtb4 = new JToggleButton("농구");
		
		jp.add(jtb1);
		jp.add(jtb2);
		jp.add(jtb3);
		jp.add(jtb4);
		
		add(jp);
		
		/*
		setSize(300, 300);
		setLocation(0, 0);
		setVisible(true);
		*/
		
		// 창을 화면 중앙에 놓기
		// 화면의 크기를 구하자
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		// setSize(300, 300);
		// setLocation(ds.width/2-150, ds.height/2-150);
		setBounds(ds.width/2-300,ds.height/2-50,600,100);		
	    setVisible(true);
	    setResizable(false);
	    // 정상적인 종료
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Ex04();
	}
}









