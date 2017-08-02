package com.hb.cm;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Ex06 extends JFrame{
	JPanel jp;
	Toolkit toolkit = getToolkit();
	JButton jb1;
	JProgressBar jpb1, jpb2;
	public Ex06() {
		setTitle("프로그래스바");
		jp = new JPanel();
		jpb1 = new JProgressBar();
		jpb2 = new JProgressBar();
		jb1 = new JButton("start");
		
		jp.add(jb1);
		jp.add(jpb1);
		jp.add(jpb2);
		
		add(jp);
		
		Dimension ds =  toolkit.getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-30, 500, 60);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable() {
					@Override
					public void run() {
						go(jpb1);
					}
				}).start();
				new Thread(new Runnable() {
					@Override
					public void run() {
						go(jpb2);
					}
				}).start();
			}
		});
	}
	// 공통으로 처리되는 부분
	public void go(JProgressBar bar){
		int count = 0 ;
		while(count<bar.getMaximum()){
			count = count + (int)(Math.random()*10);
			bar.setValue(count);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		new Ex06();
	}
}











