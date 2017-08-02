package com.hb.bm;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex12_3 extends JPanel{
	CardLayout card;
	JPanel jp;
	JButton jb;
	public Ex12_3() {}
	public Ex12_3(CardLayout card) {
		this.card = card;
		setBackground(Color.ORANGE);
		
		jp = new JPanel();
		jb = new JButton("이전");
		
		jp.add(new JLabel("로그인 성공"));
		jp.add(jb);
		
		add(jp);
		
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(getParent(), "first");
			}
		});
	}
}
