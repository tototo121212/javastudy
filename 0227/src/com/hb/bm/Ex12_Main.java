package com.hb.bm;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex12_Main extends JFrame {
	CardLayout card;
	JPanel cards;

	public Ex12_Main() {
		setTitle("카드레이아웃2");
		card = new CardLayout();
		cards = new JPanel();
		cards.setLayout(card);

		// 각각의 카드(페널)를 cards에 넣어서 호출해야 된다.
		// 각각의 카드를 별도의 클래스로 만듬
		Ex12_1 first = new Ex12_1(card);
		Ex12_2 second = new Ex12_2(card);
		Ex12_3 thrid = new Ex12_3(card);

		cards.add(first, "first");
		cards.add(second, "second");
		cards.add(thrid, "thrid");

		add(cards);

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension ds = tk.getScreenSize();

		setBounds(ds.width / 2 - 250, ds.height / 2 - 170, 500, 340);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Ex12_Main();
	}
}
