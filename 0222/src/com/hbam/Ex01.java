package com.hbam;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex01 extends JFrame implements ActionListener{
	 JPanel jp1, jp2 ;
	 JTextField jtf1 ,jtf2, jtf3;
	 JTextArea jta;
	 JScrollPane jsp;
	 JButton jb1,jb2, jb3;
	public Ex01() {
	  super("계산기 1"); 
	  jp1 = new JPanel();
	  jtf1 = new JTextField(5);
	  jtf2 = new JTextField(5);
	  jtf3 = new JTextField(5);
	  
	  jp1.add(new Label("수1:"));
	  jp1.add(jtf1);
	  jp1.add(new Label("수2:"));
	  jp1.add(jtf2);
	  jp1.add(new Label("연산자:"));
	  jp1.add(jtf3);
	   
	  jta = new JTextArea();
	  jta.setLineWrap(true);
	  jta.setEditable(false); // 편집 불가능
	  jsp = new JScrollPane(jta,
			  ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
			  ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	
	 jp2 = new JPanel();
	 jb1= new JButton("계산");
	 jb2 = new JButton("종료");
	 jb3 = new JButton("취소");
	 
	 jp2.add(jb1);
	 jp2.add(jb2);
	 jp2.add(jb3);
	 
	 add(jp1,BorderLayout.NORTH);
	 add(jsp,BorderLayout.CENTER);
	 add(jp2,BorderLayout.SOUTH);
	 
	 Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
	 setBounds(ds.width/2-150, ds.height/2-150, 500, 300);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setResizable(false);
	 setVisible(true);
	  
	 jb1.addActionListener(this);
	 jb2.addActionListener(this);
	 jb3.addActionListener(this);
	 
	}
	public static void main(String[] args) {
		new Ex01();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	 JButton jb = (JButton)e.getSource() ;
		
	 if(jb == jb1){
		 if(jtf1.getText().length()== 0 || 
			jtf2.getText().length()== 0 || 
			jtf3.getText().length()== 0 ){
			 myinit();
			jta.append("제대로 입력하세요\n");
		 }else if(!(jtf3.getText().equals("+")||	 
			jtf3.getText().equals("-")||
			jtf3.getText().equals("*")||
			jtf3.getText().equals("/"))){
			 myinit();
			jta.append("정확하게 입력하세요\n");
		 }else if((jtf2.getText().equals("0")&&
				   jtf3.getText().equals("/"))){
			 myinit();
			jta.append("0으로는 나눌 수가 없네요\n");
		 }else{
			 try{
					int su1 = Integer.parseInt(jtf1.getText());
					int su2 = Integer.parseInt(jtf2.getText());
					String op = jtf3.getText();
					int res = 0 ;
					switch (op) {
						case "+": res = su1 + su2; break;
						case "-": res = su1 - su2; break;
						case "*": res = su1 * su2; break;
						case "/": res = su1 / su2; break;
					}
					jta.append(su1 + op + su2 + "=" + res + "\n");
			 }catch (Exception e1) {
				jta.append("숫자만 입력해 주세요");
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
			}
		 }	
	 }else if(jb == jb2){
		 System.exit(0);
	 }else if(jb == jb3){
		 myinit();
	 }
	}
	public void myinit(){
		jtf1.setText("");
		 jtf2.setText("");
		 jtf3.setText("");
		 jta.setText("");
		 jtf1.requestFocus();
	}
}












