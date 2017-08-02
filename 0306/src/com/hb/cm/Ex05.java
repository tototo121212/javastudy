package com.hb.cm;

import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex05 extends JFrame{
	JPanel jp;
	JTextField jtf;
	JButton jb;
	JTextArea jta;
	JScrollPane jsp;
	public Ex05() {
		setTitle("파일읽기");
		jp = new JPanel();
		jtf = new JTextField(20);
		jb = new JButton("열기");
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
		FileInputStream fis = null;
		File file = new File(jtf.getText().trim());
		int size = (int)file.length();
		byte[] b = new byte[size];
		try {
			fis = new FileInputStream(file);
			fis.read(b);
			jta.append(new String(b).trim());
			jtf.setText("");
		} catch (Exception e) {
		} finally {
			try {
				fis.close();
			} catch (Exception e2) {
			}
		}
	}
	public static void main(String[] args) {
		new Ex05();
	}
}









