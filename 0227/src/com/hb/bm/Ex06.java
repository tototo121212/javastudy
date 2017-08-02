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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex06 extends JFrame {
	JPanel jp1, jp2, jp3, jp4, jp5, pg1, pg2;
	ButtonGroup bg;
	JRadioButton jrb1, jrb2, jrb3, jrb4;
	JTextField jtf1, jtf2;
	JTextArea jta;
	JScrollPane jsp;
	JButton jb1, jb2, jb3;
	String coffeeStr ="";
	int coffeeInt =0;
	public Ex06() {
		setTitle("ī��");
		jp1 = new JPanel();
		jp1.add(new JLabel("���ϴ� Ŀ�� ����"));
		
		 jp2 = new JPanel();
		// ������ư => ButtionGroup()
		 bg = new ButtonGroup();
		 jrb1 = new JRadioButton("�Ƹ޸�ī��(3000)");
		 jrb2 = new JRadioButton("ī���ī(4000)");
		 jrb3 = new JRadioButton("ī���(3500)");
		 jrb4 = new JRadioButton("�����꽺(3000)");
		
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		jp2.add(jrb1);
		jp2.add(jrb2);
		jp2.add(jrb3);
		jp2.add(jrb4);
		
		 jp3 = new JPanel();
		 jtf1 = new JTextField(10);
		 jtf2 = new JTextField(10);
		
		jp3.add(new JLabel("���� : "));
		jp3.add(jtf1);
		jp3.add(new JLabel("�Աݾ� : "));
		jp3.add(jtf2);
		
		 jta = new JTextArea();
		jta.setLineWrap(true);
		jta.setEditable(false);
		 jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		 jp4 = new JPanel();
		 jb1 =new JButton("���");
		 jb2 =new JButton("����");
		 jb3 =new JButton("���");
		
		jp4.add(jb1);
		jp4.add(jb2);
		jp4.add(jb3);
		
		 pg1 = new JPanel();
		pg1.setLayout(new BorderLayout());
		pg1.add(jp1,BorderLayout.NORTH);
		pg1.add(jp2,BorderLayout.CENTER);
		
		 pg2 = new JPanel();
		pg2.setLayout(new BorderLayout());
		pg2.add(jp3,BorderLayout.NORTH);
		pg2.add(jsp,BorderLayout.CENTER);
		pg2.add(jp4,BorderLayout.SOUTH);
		
		add(pg1,BorderLayout.NORTH);
		add(pg2,BorderLayout.CENTER);
		
		 Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		 setBounds(ds.width/2-300, ds.height/2-250, 600, 500);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setResizable(false);
		 setVisible(true);
		 
		 jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jtf1.getText().length() ==0 || jtf2.getText().length() ==0){
					jta.append("����� �Է��ϼ��� \n");
				}else if(coffeeInt == 0){
					jta.append("������ �ϼ��� \n");
				}else{
					int sum = Integer.parseInt(jtf1.getText()) * coffeeInt ;
					int vat = (int)(sum*0.1);
					int total = sum + vat ;
					int output = Integer.parseInt(jtf2.getText()) - total ;
					jta.append("Ŀ������ : " + coffeeStr + "\n");
					jta.append("�ܰ� : " + coffeeInt+ "\n");
					jta.append("���� : " + jtf1.getText() + "\n");
					jta.append("�ΰ��� : " +vat + "\n");
					jta.append("�ѱݾ� : " +total + "\n");
					jta.append("�Աݾ� : " + jtf2.getText()+ "\n");
					jta.append("�ܵ� : " + output + "\n");
				}
			}
		});
		 jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		 jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jtf1.setText("");
				jtf2.setText("");
				jta.setText("");
				bg.clearSelection();
				jtf1.requestFocus();
			}
		});
		 
		 jrb1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				coffeeStr ="�Ƹ޸�ī��";
				coffeeInt = 3000 ;
			}
		});
		 jrb2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
					coffeeStr ="ī���ī";
					coffeeInt = 4000 ;
			}
		});
		 jrb3.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				coffeeStr ="ī���";
				coffeeInt = 3500 ;
			}
		});
		 jrb4.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				coffeeStr ="�����꽺";
				coffeeInt = 3000 ;
			}
		});
	}
	public static void main(String[] args) {
		new Ex06();
	}
}







