package com.hbam;

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

public class Ex11 extends JFrame implements ActionListener{
	JButton first, prev, next, last ;
	JPanel jp1, jp2, jp3, jp4, jp5; // ī��
	JPanel pg1,pg2;
	CardLayout card;
	public Ex11() {
		setTitle("ī�巹�̾ƿ�");
		pg1 = new JPanel();
		pg2 = new JPanel();
		
		jp1 = new JPanel();
		jp1.setBackground(Color.PINK);
		jp1.add(new JLabel("ù��° ī��"));
		
		jp2 = new JPanel();
		jp2.setBackground(Color.BLUE);
		jp2.add(new JLabel("�ѹ�° ī��"));
		
		jp3 = new JPanel();
		jp3.setBackground(Color.RED);
		jp3.add(new JLabel("�¹�° ī��"));
		
		jp4 = new JPanel();
		jp4.setBackground(Color.GREEN);
		jp4.add(new JLabel("�ݹ�° ī��"));
		
		jp5 = new JPanel();
		jp5.setBackground(Color.MAGENTA);
		jp5.add(new JLabel("�ټ���° ī��"));
		
		card = new CardLayout();
		pg1.setLayout(card);
		
		// ī�巹�̾ƿ� �߰� �� add(������Ʈ,"ȣ���̸�");
		// �ش� ī�� ȣ���Ҷ� card.show()�̿��Ѵ�.
		pg1.add(jp1, "1");
		pg1.add(jp2, "2");
		pg1.add(jp3, "3");
		pg1.add(jp4, "4");
		pg1.add(jp5, "5");
		
		first = new JButton("<<");
		prev = new JButton("<");
		next = new JButton(">");
		last = new JButton(">>");
		
		pg2.add(first);
		pg2.add(prev);
		pg2.add(next);
		pg2.add(last);
		
		add(pg1,BorderLayout.CENTER);
		add(pg2,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250,ds.height/2-170,500,340);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		first.addActionListener(this);
		prev.addActionListener(this);
		next.addActionListener(this);
		last.addActionListener(this);
		
		card.show(pg1, "3");
	}
	public static void main(String[] args) {
		new Ex11();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton)(e.getSource());
		if(jb==first){
			card.first(pg1);
		}else if(jb == prev){
			card.previous(pg1);
		}else if(jb == next){
			card.next(pg1);
		}else if(jb == last){
			card.last(pg1);
		}
	}
}
