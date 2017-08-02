package com.hb.bm;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex13_Main extends JFrame{
	JPanel jp;
	JButton jb1, jb2;
	public Ex13_Main() {
		jp = new JPanel();
		jb1 = new JButton("회원가입");
		jb2 = new JButton("로그인");
		jp.add(jb1);
		jp.add(jb2);
		add(jp);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension ds = tk.getScreenSize();

		setBounds(ds.width / 2 - 150, ds.height / 2 - 150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Ex13_1();
			}
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Ex13_2();
			}
		});
	}
	public static void main(String[] args) {
		new Ex13_Main();
	}

}
