package com.hb.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 컴포넌트 : 특정한 기능 또는 관련된 기능을 제공하는 하나의 객체
//            화면을 구성하는 객체
//          예) 레이블, 콤보박스, 리스트, 라디오버튼, 체크박스, 컨테이너,...
 
// 컨테이너 : 자기의 여역에 컴포넌트를 포함시키고 관리하는 역할을 하며,
//            다른 컨테이너를 포함 시킬 수도 있는 객체
//           예) : 패널, 다이얼 로그, 프레임 , 스크롤 페인,....

// 프레임 : 하나의 창

// 창의 구조 ; 컴퓨터 | 창(프레임=컨테이너) | 패널(컨테이너) | 컴포넌트 | 사람


public class Ex01 extends JFrame{
	public Ex01() {
		super("버튼 컴포넌트");
		
		// 컴포넌트
		JButton jb1 = new JButton();
		jb1.setText("첫번째 버튼");
		
		JButton jb2 = new JButton("두번째 버튼");
		JButton jb3 = new JButton("세번째 버튼");
		JButton jb4 = new JButton("네번째 버튼");
		JButton jb5 = new JButton("다섯번째 버튼");
		
		
		// 컨테이너
		JPanel jp = new JPanel();
		
		// 컴포넌트를 컨테이너에게 붙일때 사용하는 메소드 : add
		 jp.add(jb1);
		 jp.add(jb2);
		 jp.add(jb3);
		 jp.add(jb4);
		 jp.add(jb5);
		
		// 컴포넌트를 가진 컨테이너를 컨테이너(프레임)에 붙인다.
		add(jp);
		
		// add(jb1);
		// add(jb2);
		
		setSize(300, 300);
		setLocation(0, 0);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex01();
	}
}










