package com.hbam;

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

public class Ex08 extends JFrame implements ActionListener{
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
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
	}
	public static void main(String[] args) {
		new Ex08();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int com = (int)(Math.random()*3);
		JButton user = (JButton)(e.getSource());
		String msg = "" ;		
		if(user == jb1){ // 가위
			if(com==0){  // 가위
				msg = "비김";
			}else if(com==1){  // 바위
				msg = "짐";
			}else if(com==2){  // 보
				msg = "이김";
			}
		}else if(user == jb2){  //바위
			if(com==0){
				msg = "이김";
			}else if(com==1){
				msg = "비김";
			}else if(com==2){
				msg = "짐";
			}
		}else if(user == jb3){ // 보
			if(com==0){
				msg = "짐";
			}else if(com==1){
				msg = "이김";
			}else if(com==2){
				msg = "비김";
			}	
		}
		output.setText("");
		output.setText(msg);
	}
}










