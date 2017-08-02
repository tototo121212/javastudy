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
		setTitle("ī�巹�̾ƿ�2");
		card = new CardLayout();
		cards = new JPanel();
		cards.setLayout(card);

		// ������ ī��(���)�� cards�� �־ ȣ���ؾ� �ȴ�.
		// ������ ī�带 ������ Ŭ������ ����
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
