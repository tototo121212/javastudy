package com.hb.bm;

import java.awt.BorderLayout;
import java.awt.Dimension;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Ex03 extends JFrame implements ActionListener{
	JButton jb1,jb2,jb3;
	JTextArea jta;
	JPanel jp1 ;
	JScrollPane jsp ;
	public Ex03() {
		setTitle("Action Event2");
		jp1= new JPanel();
		jb1 = new JButton("input");
		jb2 = new JButton("output");
		jb3 = new JButton("exit");
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		
		jta = new JTextArea();
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);
		
		add(jp1,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		
		 Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		 setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setResizable(false);
		 setVisible(true);
		 
		 // 이벤트처리
		 jb1.addActionListener(this);
		 jb2.addActionListener(this);
		 jb3.addActionListener(this);
		
	}
	public static void main(String[] args) {
		new Ex03();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton)(e.getSource());
		if(jb==jb1){
			jta.append("input 클릭 \n");
		}else if(jb==jb2){
			jta.append("output 클릭 \n");
		}else if(jb==jb3){
			// 프로그램 종료
			System.exit(0);
		}
	}
}














