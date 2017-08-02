package com.hb.cm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex01 extends JFrame {
	JPanel jp1,jp2,jp3;
	JLabel jl1,jl2,jl3;
	JTextField jtf1,jtf2,jtf3;
	JTextArea jta;
	JScrollPane jsc;
	JButton jb1,jb2,jb3;
	
	
	public Ex01(){
		setTitle("계산기1");
		jp1 = new JPanel(new GridLayout(1, 3));
		jp2 = new JPanel();
		
		
		jl1 = new JLabel("숫자1");
		jtf1 = new JTextField(10);
		jl2 = new JLabel("숫자2");
		jtf2 = new JTextField(10);
		jl3 = new JLabel("연산자");
		jtf3 = new JTextField(10);
		
		jp1.add(jl1);
		jp1.add(jtf1);
		jp1.add(jl2);
		jp1.add(jtf2);
		jp1.add(jl3);
		jp1.add(jtf3);

		jta = new JTextArea();
		jsc = new JScrollPane(jta,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		jb1 = new JButton("확인");
		jb2 = new JButton("취소");
		jb3 = new JButton("종료");
		
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
	
		add(jp1,BorderLayout.NORTH);
		add(jta,BorderLayout.CENTER);
		add(jp2,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		 setBounds(ds.width/2-200, ds.height/2-200, 400, 400);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setResizable(false);
		 setVisible(true);

		 jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jtf1.getText().length()>=1
					&&jtf2.getText().length()>=1
					&&jtf3.getText().length()>=1){
					int su1  = Integer.parseInt(jtf1.getText());
					int su2  = Integer.parseInt(jtf2.getText());					
					String op = jtf3.getText();
					int res = 0;
					switch (op) {
					case "+":res =  su1 + su2; break;
					case "-":res =  su1 - su2; break;
					case "*":res =  su1 * su2; break;
					case "/":res =  su1 / su2; break;
					}
					jta.setText(su1 + op + su2+"="+res+"\n");
					refresh();
		
				}else{
					JOptionPane.showMessageDialog(getParent(), "입력하세요");
					refresh();
					
				}
						
			}
				
					
				
	});	
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				refresh();
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		}); 
	
		 }			
		
	public void refresh(){
		jtf1.setText("");
		jtf2.setText("");
		jtf3.setText("");
		jta.setText("");
		jtf1.requestFocus();
	}			
			
		
	
	
		 	 
	
	public static void main(String[] args) {
		new Ex01();
	}
}
