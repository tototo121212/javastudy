package com.hb.cm;

import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex08 extends JFrame{
	JPanel jp;
	JTextField jtf;
	JButton jb;
	JTextArea jta;
	JScrollPane jsp;
	public Ex08() {
		setTitle("파일쓰기");
		jp = new JPanel();
		jtf = new JTextField(20);
		jb = new JButton("저장");
		jta = new JTextArea();
		jta.setLineWrap(true);
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jp.add(new Label("파일경로 : "));
		jp.add(jtf);
		jp.add(jb);
		
		add(jp,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				prn();
			}
		});
		/*
		jtf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==e.VK_ENTER){
					prn();
				}
			}
		});
		*/
		jtf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				prn();
			}
		});
	}
	
	public void prn(){
		String path = jtf.getText().trim();
		File file = new File(path);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			String msg = jta.getText().replace("\n", "\r\n");
			  byte[]  b = msg.getBytes();
			  fos.write(b);
			  fos.flush();
			  jta.setText("");
			  jtf.setText("");
		} catch (Exception e) {
		} finally {
			try {
				
			} catch (Exception e2) {
			}
		}
	}
	public static void main(String[] args) {
		new Ex08();
	}
}









