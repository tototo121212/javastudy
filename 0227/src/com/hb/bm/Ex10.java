package com.hb.bm;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Ex10 extends JFrame{
	JTextArea jta;
	JScrollPane jsp;
	public Ex10() {
		setTitle("키 이벤트");
		jta = new JTextArea();
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);
		
		add(jsp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-100,500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyCode() == e.VK_LEFT){
					jta.append("Left Key \n");
				}else if(e.getKeyCode() == e.VK_RIGHT){
					jta.append("RIGHT Key \n");
				}else if(e.getKeyCode() == e.VK_UP){
					jta.append("UP Key \n");
				}else if(e.getKeyCode() == e.VK_DOWN){
					jta.append("DOWN Key \n");
				}
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
	}
	
	public static void main(String[] args) {
		new Ex10();
	}
}
