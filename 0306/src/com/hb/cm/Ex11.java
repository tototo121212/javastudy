package com.hb.cm;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex11 extends JFrame{
	JPanel jp1, jp2;
	JButton jb1;
	JTextField jtf1, jtf2;
	FileInputStream fis = null;
	FileOutputStream fos = null;
	public Ex11() {
		setTitle("복사하기");
		jp1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		jtf1 = new JTextField(15);
		jtf2 = new JTextField(15);
		
		jb1 = new JButton("복사하기");
		
		jp1.add(new JLabel("원본위치 : "));
		jp1.add(jtf1);
		
		jp2.add(new JLabel("사본위치 : "));
		jp2.add(jtf2);
		jp2.add(jb1);
		
		setLayout(new GridLayout(2, 1));
		add(jp1);
		add(jp2);
		
		setBounds(100, 100, 350, 120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String input = jtf1.getText().trim();
				String output = jtf2.getText().trim();
				int b = 0 ;
				try {
					fis = new FileInputStream(input);
					fos = new FileOutputStream(output);
					while((b=fis.read()) != -1){
						fos.write(b);
						fos.flush();
					}
					jtf1.setText("");
					jtf2.setText("");
				} catch (Exception e2) {
				} finally{
					try {
						
					} catch (Exception e3) {
					}
				}
			}
		});
	}
	public static void main(String[] args) {
		new Ex11();
	}
}













