package com.hbam;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex12_main extends JFrame {
	JPanel cards;
    CardLayout card ;
	public Ex12_main() {
		setTitle("카드레이아웃2");
		card = new CardLayout();
		cards = new JPanel(card);

		// 각 페널을 생성하고 cards에 넣는다.
		Ex12_1 first = new Ex12_1(card);
		Ex12_2 second = new Ex12_2(card);
		Ex12_3 thrid = new Ex12_3(card);

		cards.add(first, "first");
		cards.add(second, "second");
		cards.add(thrid, "thrid");

		add(cards);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 150, ds.height / 2 - 150, 500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex12_main();
	}

}
