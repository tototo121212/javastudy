package com.hb.bm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;

public class Ex08 extends JFrame implements ActionListener, ItemListener{
	JPanel jp1 ;
	String[] items = {"선택하세요","축구","야구","농구","배구"};
	JComboBox jcom ;
	JButton jb ;
	JTextArea jta;
	JScrollPane jsp ;
	public Ex08() {
		setTitle("콤보박스");
		jp1 = new JPanel();
		
		jcom = new JComboBox(items);
		
		
		jb = new JButton("exit");
		jta = new JTextArea(10,25);
		jsp = new JScrollPane(jta, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);
				
		jp1.add(jcom);
		jp1.add(jb);
		
		add(jp1,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension ds = tk.getScreenSize();

		setBounds(ds.width / 2 - 150, ds.height / 2 - 150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb.addActionListener(this);
		jcom.addItemListener(this);
	}
	
	public static void main(String[] args) {
		new Ex08();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		 String msg =(String)e.getItem();
		 if(e.getStateChange()==e.SELECTED){
			jta.append(msg+"선택 \n");	
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
