package com.hbam;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Ex12_2 extends JPanel implements ActionListener{
	JPanel jp1 ;
	JButton jb1 ;
	CardLayout card ;
	public Ex12_2() {}
	public Ex12_2(CardLayout card) {
		setBackground(Color.ORANGE);
		 this.card = card;
		jp1 = new JPanel();
		jb1 = new JButton("뒤로가기");
		jp1.add(jb1);
		add(jp1);
		
		jb1.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		card.show(getParent(), "first");
	}
}

