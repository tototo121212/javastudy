package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

 // 컴포넌트를 화면에 배치하는 방법 => Layout
 // Layout 관리 = > 배치관리자 (Layout Manager)
 // 배치하는 방법 : 
 // FlowLayout : 상단 중앙 정렬 배치 (예) JPanel
 // BorderLayout : 동,서,남,북,중앙 배치
 //                동,서,남,북,중앙을 표시하지 않으면 마지막 컴포넌트가 
 //                화면을 채운다. (예) JFrame
 // GridLayout : 격자형식
 // BoxLayout : 하나의 행, 하나의 열로 만든다.
 // 절대좌표 : 컴포넌트마다 좌표를 지정해서 배치하는 방법
 // CardLayout : 여러장의 카드를 쌓아둔 후 하나씩 보여주는 형태
 //              뒤집어져 있다가 이벤트가 발생하면 하나씩 보여주는 형태

public class Ex01_3 extends JFrame{
	
	public Ex01_3() {
		setTitle("FlowLayout");
		
		// JFrame이 원래는 BorderLayout 인데  FlowLayout으로 변경
		// setLayout(new FlowLayout());
		
		JButton jb1 = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		JButton jb4 = new JButton("버튼4");
		JButton jb5 = new JButton("버튼5");
		
		// BorderLayout은 원래 5방향을 제시할 수 있다. 
		add(jb1,BorderLayout.EAST);
		add(jb2,BorderLayout.WEST);
		add(jb3,BorderLayout.SOUTH);
		add("North",jb4);
		add("Center",jb5);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150,ds.height/2-150,300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex01_3();
	}
}
