package com.hb.am;

import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class Ex09_2 extends JPanel{
	public Ex09_2() {
		 // ������Ʈ
	       JCheckBox jcb1 = new JCheckBox();
	       jcb1.setText("�߱�");
	       JCheckBox jcb2 = new JCheckBox("�౸");
	       JCheckBox jcb3 = new JCheckBox("�豸", true);
	       JCheckBox jcb4 = new JCheckBox("��");
	       
	       // ������Ʈ�� �����̳ʿ��� ���δ�.
	       add(jcb1);
	      add(jcb2);
	       add(jcb3);
	       add(jcb4);
	}
}
