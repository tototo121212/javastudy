package com.hb.am;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class Ex09_1 extends JPanel{
	public Ex09_1() {
		// setBackground(Color.BLACK);
		JToggleButton jtb1 =new JToggleButton();
		jtb1.setText("绵备");
		
		JToggleButton jtb2 = new JToggleButton("具备");
		jtb2.setSelected(true);
		
		JToggleButton jtb3 = new JToggleButton("硅备",true);
		JToggleButton jtb4 = new JToggleButton("丑备");
		
		add(jtb1);
		add(jtb2);
		add(jtb3);
		add(jtb4);
		
		
	}
}
