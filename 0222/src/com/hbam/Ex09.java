package com.hbam;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Ex09 extends JFrame implements ActionListener{
	JButton jb;
	JProgressBar jpb1, jpb2 ;
	JPanel jp;
	public Ex09() {
		setTitle("프로그래스바");
		jp = new JPanel();
		jpb1 = new JProgressBar();
		jpb2 = new JProgressBar();
		
		jb = new JButton("시작");
		
		jp.add(jb);
		jp.add(jpb1);
		jp.add(jpb2);
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-200, ds.height/2-50, 400, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new Ex09();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int cnt1 = 0 ;
		int cnt2 = 0 ;
		while(cnt1 <= jpb1.getMaximum()){
			cnt1 = cnt1 + 1 ;
			cnt2 = cnt2 + 10 ;
			// 프로그래스바에 값넣기
			jpb1.setValue(cnt1);
			jpb2.setValue(cnt2);
		}
	}
}









