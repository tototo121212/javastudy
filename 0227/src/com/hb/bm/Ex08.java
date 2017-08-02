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
		setTitle("가위 바위 보");
		jp = new JPanel();
		jp.setLayout(new GridLayout(0, 3));
		
		jb1 = new JButton("가위");
		jb2 = new JButton("바위");
		jb3 = new JButton("보");
		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		
		output = new JTextField(20);
		info = new JTextField("아래의 버튼 중에서 하나를 클릭 하시오");
		
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
				if(com==0){ // 가위
					output.setText("비김");
				}else if(com==1){ // 바위
					output.setText("짐");
				}else if(com==2){ // 보
					output.setText("이김");
				}
			}
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int com = (int)(Math.random()*3);
				if(com==0){ // 가위
					output.setText("이김");
				}else if(com==1){ // 바위
					output.setText("비김");
				}else if(com==2){ // 보
					output.setText("짐");
				}
			}
		});
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int com = (int)(Math.random()*3);
				if(com==0){ // 가위
					output.setText("짐");
				}else if(com==1){ // 바위
					output.setText("이김");
				}else if(com==2){ // 보
					output.setText("비김");
				}
			}
		});
	}
	public static void main(String[] args) {
		new Ex08();
	}
}










