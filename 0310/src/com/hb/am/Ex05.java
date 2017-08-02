package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class Ex05 extends JFrame{
	ArrayList<String> list = new ArrayList<>();
	
	public Ex05() {
	JPanel a= new JPanel();
	JPasswordField jpf = new JPasswordField(15);
	JButton jb1 = new JButton("¹øÈ£1");
	a.add(jpf);
	a.add(jb1);
	
	add(a);
	
	jb1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			 
			System.out.println(new String(jpf.getPassword()));
			
			
		}
	});
		
	Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
	setBounds(300, 300, 300, 300);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);
	setVisible(true);
	
	
	}
	public static void main(String[] args) {
		new Ex05();
	}
}
