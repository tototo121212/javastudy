package com.hb.bm;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 이벤트 : 사용자가 어떠한 행동, 동작 하는 것을 말함
// 소  스 : 이벤트가 발생되는 컴포넌트 (버튼, 체크박스, 라디오버튼,..)
// 리스너 : 이벤트를 감지, 이벤트가 발생되면 실제적으로 이벤트를 처리
//          할 수 있도록 만든 인터페이스
// 핸들러 : 리스너에 전달된 이벤트를 실제로 처리할 수 있도록 
//         이벤트 리스너에 포함 되어있는 추상 메소드를 재정의하여
//         실제로 처리하는 기능

// Action Event : 컴포넌트를 눌렀거나 선택되었을때 발생하는 이벤트
// Action Listener : Action이벤트 감지
// addActionListener => Action이벤트를 감지하고 실제로 이벤트객체를
//                     전달하는 역할
public class Ex01 extends JFrame /* implements ActionListener*/{
	JButton jb1,jb2,jb3;
	public Ex01() {
		setTitle("Action Event");
		JPanel jp1 = new JPanel();
		jb1 = new JButton("input");
		jb2 = new JButton("output");
		jb3 = new JButton("exit");
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		
		add(jp1);
		
		 Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		 setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setResizable(false);
		 setVisible(true);
		 
		// jb1.addActionListener(this);
		// jb2.addActionListener(this);
		// jb3.addActionListener(this);
		 
		 Ex02 test = new Ex02();
		 jb1.addActionListener(test);
		 jb2.addActionListener(test);
		 jb3.addActionListener(test);
	}
	public static void main(String[] args) {
		new Ex01();
	}
	
	// 이벤트하면 실제로 실행할 메소드
	/*
	@Override
	public void actionPerformed(ActionEvent e) {
		// System.out.println("버튼을 눌렀네");
		
		//이벤트 발생 대상 찾기
		// getActionCommand() => 이벤트대상의 text를 알려준다.
		 
		 방법1)
		 String msg =  e.getActionCommand();
		 if(msg.equals(jb1.getText())){
			 System.out.println("input 눌렀네");
		 }else if(msg.equals(jb2.getText())){
			 System.out.println("output 눌렀네");
		 }else if(msg.equals(jb3.getText())){
			 System.out.println("exit 눌렀네");
		 }
		 
		 // 방법3)
		 JButton jb =(JButton)(e.getSource());
		 if(jb==jb1){
		   System.out.println("input 눌렀네");
		 }else if(jb ==jb2){
		   System.out.println("output 눌렀네");
		 }else if(jb == jb3){
		   System.out.println("exit 눌렀네");
		  }
	}
	*/
}

class Ex02 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// String msg = e.getActionCommand();
		// System.out.println(msg + "눌렀네");
		
		// 방법2)
		 String msg = ((JButton)(e.getSource())).getText();
		 System.out.println(msg+"눌렀네");
	}
}














