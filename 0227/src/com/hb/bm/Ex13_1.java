package com.hb.bm;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex13_1 extends JFrame{
	 JPanel jp ;
	public Ex13_1() {
		jp = new JPanel();
		jp.add(new JLabel("회원가입창 입니다."));
		
		add(jp);
		setBounds(300, 300, 300, 300);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
