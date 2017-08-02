package com.hb.bm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex08 extends JFrame {
	JPanel jp ;
	JTextField output;
	JTextField info ;
	JButton jb1, jb2, jb3 ;
	public Ex08() {
		setTitle("���� ���� ��");
		jp = new JPanel();
		jp.setLayout(new GridLayout(0, 3));
		
		jb1 = new JButton("����");
		jb2 = new JButton("����");
		jb3 = new JButton("��");
		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		
		output = new JTextField(20);
		info = new JTextField("�Ʒ��� ��ư �߿��� �ϳ��� Ŭ�� �Ͻÿ�");
		
		add(info, BorderLayout.NORTH);
		add(jp, BorderLayout.CENTER);
		add(output,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 125, ds.height / 2 - 75, 250, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int com = (int)(Math.random()*3);
				if(com==0){ // ����
					output.setText("���");
				}else if(com==1){ // ����
					output.setText("��");
				}else if(com==2){ // ��
					output.setText("�̱�");
				}
			}
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int com = (int)(Math.random()*3);
				if(com==0){ // ����
					output.setText("�̱�");
				}else if(com==1){ // ����
					output.setText("���");
				}else if(com==2){ // ��
					output.setText("��");
				}
			}
		});
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int com = (int)(Math.random()*3);
				if(com==0){ // ����
					output.setText("��");
				}else if(com==1){ // ����
					output.setText("�̱�");
				}else if(com==2){ // ��
					output.setText("���");
				}
			}
		});
	}
	public static void main(String[] args) {
		new Ex08();
	}
}










