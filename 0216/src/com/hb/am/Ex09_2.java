package com.hb.am;

import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class Ex09_2 extends JPanel{
	public Ex09_2() {
		 // 컴포넌트
	       JCheckBox jcb1 = new JCheckBox();
	       jcb1.setText("야구");
	       JCheckBox jcb2 = new JCheckBox("축구");
	       JCheckBox jcb3 = new JCheckBox("배구", true);
	       JCheckBox jcb4 = new JCheckBox("농구");
	       
	       // 컴포넌트를 컨테이너에게 붙인다.
	       add(jcb1);
	      add(jcb2);
	       add(jcb3);
	       add(jcb4);
	}
}
