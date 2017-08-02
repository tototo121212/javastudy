package com.hb.bm;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex12_2 extends JPanel {
	CardLayout card;
	JPanel jp;
	JButton jb;

	public Ex12_2() {
	}

	public Ex12_2(CardLayout card) {
		this.card = card;
		setBackground(Color.YELLOW);

		jp = new JPanel();
		jb = new JButton("이전");

		jp.add(new JLabel("회원가입 창"));
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
