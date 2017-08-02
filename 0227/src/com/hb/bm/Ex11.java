package com.hb.bm;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex11 extends JFrame{
	JButton first, prev, next, last;
	JPanel jp1, jp2, jp3, jp4, jp5;
	JPanel pg1, pg2;
	CardLayout card;
	public Ex11() {
		setTitle("ī�巹�̾ƿ�");
		pg1 = new JPanel();
		pg2 = new JPanel();

		jp1 = new JPanel();
		jp1.setBackground(Color.pink);
		jp1.add(new JLabel("ù��° ī��"));

		jp2 = new JPanel();
		jp2.setBackground(Color.yellow);
		jp2.add(new JLabel("�ι�° ī��"));

		jp3 = new JPanel();
		jp3.setBackground(Color.CYAN);
		jp3.add(new JLabel("����° ī��"));

		jp4 = new JPanel();
		jp4.setBackground(Color.GREEN);
		jp4.add(new JLabel("�׹�° ī��"));

		jp5 = new JPanel();
		jp5.setBackground(Color.ORANGE);
		jp5.add(new JLabel("�ټ���° ī��"));

		card = new CardLayout();
		pg1 = new JPanel();
		pg1.setLayout(card);

		// ī�巹�̾ƿ� �߰� add(������Ʈ,"�̸�");
		// ���߿� �ش� ī�带 �̸��� ȣ��(card.show())�Ѵ�.
		pg1.add(jp1, "1");
		pg1.add(jp2, "2");
		pg1.add(jp3, "3");
		pg1.add(jp4, "4");
		pg1.add(jp5, "5");

		first = new JButton("<<");
		prev = new JButton("<");
		next = new JButton(">");
		last = new JButton(">>");

		pg2 = new JPanel();
		pg2.add(first);
		pg2.add(prev);
		pg2.add(next);
		pg2.add(last);

		add(pg1, BorderLayout.CENTER);
		add(pg2, BorderLayout.SOUTH);

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();

		setBounds(ds.width / 2 - 250, ds.height / 2 - 170, 500, 340);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		first.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.first(pg1);
			}
		});
		prev.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.previous(pg1);
			}
		});
		next.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(pg1);
			}
		});
		last.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.last(pg1);
			}
		});
		
		// ���ϴ� ī�带 ùȭ�� ���ϱ�
		// card.show(ī�带 ������ �ִ� �г�, "ī���̸�");
		   card.show(pg1, "3");
	}
	public static void main(String[] args) {
		new Ex11();
	}
}
