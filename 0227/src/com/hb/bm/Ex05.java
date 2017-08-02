package com.hb.bm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex05 extends JFrame{
	JPanel jp1, jp2, jp3, jp4;
	JTextField jtf1, jtf2, jtf3, jtf4;
	JTextArea jta;
	JScrollPane jsp;
	JButton jb1, jb2, jb3 ;
	public Ex05() {
		setTitle("성적");
		
		jp1 = new JPanel();
		jtf1 = new JTextField(10);
		jp1.add(new JLabel("이름 : "));
		jp1.add(jtf1);
		
		jp2 = new JPanel();
		jtf2 = new JTextField(10);
		jtf3 = new JTextField(10);
		jtf4 = new JTextField(10);
		
		jp2.add(new JLabel("국어 : "));
		jp2.add(jtf2);
		jp2.add(new JLabel("영어 : "));
		jp2.add(jtf3);
		jp2.add(new JLabel("수학 : "));
		jp2.add(jtf4);
		
		jta = new JTextArea();
		jta.setLineWrap(true);
		jta.setEditable(false);
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		jp3 = new JPanel();
		jb1 = new JButton("계산");
		jb2 = new JButton("종료");
		jb3 = new JButton("취소");
	    jp3.add(jb1);	
	    jp3.add(jb2);	
	    jp3.add(jb3);
	    
		jp4 = new JPanel();
		jp4.setLayout(new BorderLayout());
		
		jp4.add(jp2,BorderLayout.NORTH);
		jp4.add(jsp,BorderLayout.CENTER);
		jp4.add(jp3,BorderLayout.SOUTH);
		
		add(jp1,BorderLayout.NORTH);
		add(jp4,BorderLayout.CENTER);
		
		 Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		 setBounds(ds.width/2-300, ds.height/2-250, 600, 500);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setResizable(false);
		 setVisible(true);
		 
		 jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if( jtf1.getText().length()==0 ||
						jtf2.getText().length()==0 ||
						jtf3.getText().length()==0 ||
						jtf4.getText().length()==0 ){
						jta.append("제대로 입력하세요");
					}else{
						String name = jtf1.getText();
						int kor = Integer.parseInt(jtf2.getText());
						int eng = Integer.parseInt(jtf3.getText());
						int math = Integer.parseInt(jtf4.getText());
						
						int sum = kor +eng + math;
						double avg = sum / 3.0;
						String hak = null;
						
						if(avg>=90){
							hak ="A학점";
						}else if(avg>=80){
							hak ="B학점";
						}else{
							hak ="F학점";
						}
						
						double r_avg = Math.floor(avg*100)/100 ;
						jta.append("이름 : " + name +"\n");
						jta.append("총점 : " + sum +"\n");
						jta.append("평균 : " + r_avg +"\n");
						jta.append("학점 : " + hak +"\n");
					}
			}
		});
		 jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		 jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
				jtf4.setText("");
				jta.setText("");
				jtf1.requestFocus();
			}
		});
	}
	public static void main(String[] args) {
		new Ex05();
	}
}














