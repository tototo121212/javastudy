package com.hbam;

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

public class Ex06 extends JFrame implements ActionListener, ItemListener{
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
		setTitle("카페");
		jp1 = new JPanel();
		jp1.add(new JLabel("원하는 커피 선택"));
		
		 jp2 = new JPanel();
		// 라디오버튼 => ButtionGroup()
		 bg = new ButtonGroup();
		 jrb1 = new JRadioButton("아메리카노(3000)");
		 jrb2 = new JRadioButton("카페모카(4000)");
		 jrb3 = new JRadioButton("카페라떼(3500)");
		 jrb4 = new JRadioButton("과일쥬스(3000)");
		
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
		
		jp3.add(new JLabel("수량 : "));
		jp3.add(jtf1);
		jp3.add(new JLabel("입금액 : "));
		jp3.add(jtf2);
		
		 jta = new JTextArea();
		jta.setLineWrap(true);
		jta.setEditable(false);
		 jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		 jp4 = new JPanel();
		 jb1 =new JButton("계산");
		 jb2 =new JButton("종료");
		 jb3 =new JButton("취소");
		
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
		 
		 jb1.addActionListener(this);
		 jb2.addActionListener(this);
		 jb3.addActionListener(this);
		 
		 jrb1.addItemListener(this);
		 jrb2.addItemListener(this);
		 jrb3.addItemListener(this);
		 jrb4.addItemListener(this);
	}
	public static void main(String[] args) {
		new Ex06();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == e. SELECTED){
		   /*
			JRadioButton jrb = (JRadioButton)(e.getItem());
			if(jrb == jrb1){
			}else if(jrb == jrb2){
			}else if(jrb == jrb3){
			}else if(jrb == jrb4){
			}
			*/
			if(jrb1.isSelected()){
				coffeeStr ="아메리카노";
				coffeeInt = 3000 ;
			}else if(jrb2.isSelected()){
				coffeeStr ="카페모카";
				coffeeInt = 4000 ;
			}else if(jrb3.isSelected()){
				coffeeStr ="카페라떼";
				coffeeInt = 3500 ;
			}else if(jrb4.isSelected()){
				coffeeStr ="과일쥬스";
				coffeeInt = 3000 ;
			}
			
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton)(e.getSource());
		if(jb == jb1){
			if(jtf1.getText().length() ==0 || jtf2.getText().length() ==0){
				jta.append("제대로 입력하세요 \n");
			}else if(coffeeInt == 0){
				jta.append("선택을 하세요 \n");
			}else{
				int sum = Integer.parseInt(jtf1.getText()) * coffeeInt ;
				int vat = (int)(sum*0.1);
				int total = sum + vat ;
				int output = Integer.parseInt(jtf2.getText()) - total ;
				jta.append("커피종류 : " + coffeeStr + "\n");
				jta.append("단가 : " + coffeeInt+ "\n");
				jta.append("수량 : " + jtf1.getText() + "\n");
				jta.append("부가세 : " +vat + "\n");
				jta.append("총금액 : " +total + "\n");
				jta.append("입금액 : " + jtf2.getText()+ "\n");
				jta.append("잔돈 : " + output + "\n");
			}
		}else if(jb == jb2){
			System.exit(0);
		}else if(jb == jb3){
			jtf1.setText("");
			jtf2.setText("");
			jta.setText("");
			bg.clearSelection();
			jtf1.requestFocus();
		}
		
	}
}








