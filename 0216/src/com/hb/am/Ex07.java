package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex07 extends JFrame{
	public Ex07() {
	     setTitle("JTextComponet");
	     JPanel jp = new JPanel();
	     
	     JLabel jl1 = new JLabel("ID : ");
	     JTextField jtf = new JTextField();
	     jtf.setColumns(20);
	     jtf.setText("아이디 입력");
	     
	     JLabel jl2 = new JLabel("PW : ");
	     JPasswordField jpf = new JPasswordField("비번입력", 20);
	     
	     JLabel jl3 = new JLabel("자 기 소 개");
	     
	       // JTextArea = > 줄바꿈기능과 스크롤 기능 무조건 짝
	     JTextArea jta = new JTextArea(5, 20);
	     
	     // 자동 줄 바꿈 기능
	     jta.setLineWrap(true);
	     
	     // 스크롤 만들어서 설정하기
	     JScrollPane jsp = new JScrollPane(jta,   // 스크롤를 설치할 컴포넌트
	    		  ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, // 세로 스크롤
	    		 ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER); // 가로 스크롤
	    
	     jp.add(jl1);
	     jp.add(jtf);
	     jp.add(jl2);
	     jp.add(jpf);
	     jp.add(jl3);
	     jp.add(jsp);
	     
	     add(jp);
	     
	    Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(ds.width/-2-150, ds.height/2-150, 300, 300);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //setResizable(false);
	    setVisible(true);
	}
	public static void main(String[] args) {
		new Ex07();
	}
}
