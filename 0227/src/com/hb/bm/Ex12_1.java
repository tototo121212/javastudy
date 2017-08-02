package com.hb.bm;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ex12_1 extends JPanel {
	CardLayout card;
	// 생성자에서 인자를 받으면 전역변수 전환 해라
	JButton jb1, jb2;
	JTextField jtf ;
	JPasswordField jpf;
	JPanel jp;
	public Ex12_1() {}
	public Ex12_1(CardLayout card) {
		this.card=card ;
		
		jp = new JPanel();
		jp.setLayout(new GridLayout(3, 2));
		setLayout(new BorderLayout());
		
		jtf = new JTextField(20);
		jpf = new JPasswordField(20);
		jb1 = new JButton("회원가입");
		jb2 = new JButton("로그인");
		
		jp.add(new JLabel("아이디"));
		jp.add(jtf);
		jp.add(new JLabel("패스워드"));
		jp.add(jpf);
		jp.add(jb1);
		jp.add(jb2);
		
		add(jp,BorderLayout.SOUTH);
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(getParent(), "second");
			}
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(getParent(), "thrid");
			}
		});
	}
}












