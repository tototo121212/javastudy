package com.hb.am;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex01 extends JFrame{
	public Ex01() {
	   setTitle("체크박스");
	   
	   // 패널 : 컨테이너
       JPanel jp = new JPanel();
       
       // 컴포넌트
       JCheckBox jcb1 = new JCheckBox();
       jcb1.setText("야구");
       JCheckBox jcb2 = new JCheckBox("축구");
       JCheckBox jcb3 = new JCheckBox("배구", true);
       JCheckBox jcb4 = new JCheckBox("농구");
       
       // 컴포넌트를 컨테이너에게 붙인다.
       jp.add(jcb1);
       jp.add(jcb2);
       jp.add(jcb3);
       jp.add(jcb4);
       
       // 컨테이너를 프레임(컨테이너)에 붙인다.
       add(jp);
       
       setSize(300, 300);
       setLocation(0, 0);
       setVisible(true);
       	   
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
