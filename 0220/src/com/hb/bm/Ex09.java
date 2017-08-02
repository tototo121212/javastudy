package com.hb.bm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

// 리스트 : list는 itemlistener // Jlist는 ListSelectionListener
public class Ex09 extends JFrame implements ActionListener, ListSelectionListener{
	JPanel jp1, jp2;
	JButton jb1 ;
	String[] items = {"선택","축구","야구","농구","배구" }; 
	JList list ;
	JTextArea jta;
	JScrollPane jsp ;
	JButton jb2;
	public Ex09() {
		setTitle("리스트 이벤트");
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		jb1 = new JButton("exit");
		jb2 = new JButton("선택");
		list = new JList(items);
		
		jta = new JTextArea(5,25);
		jta.setLineWrap(true);
		jta.setEditable(true);
		
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jp1.add(list);
		jp2.add(jb1);
		jp2.add(jb2);
		
		add(jp1,BorderLayout.NORTH);
		add(jp2,BorderLayout.CENTER);
		add(jsp,BorderLayout.SOUTH);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension ds = tk.getScreenSize();

		setBounds(ds.width / 2 - 150, ds.height / 2 - 150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		// list.addListSelectionListener(this);
		
		// 단일 선택
		// list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// list.addListSelectionListener(this);
		
		// 다중 선택
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		list.addListSelectionListener(this);
	}
	
	public static void main(String[] args) {
		new Ex09();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		   JButton jb = (JButton) e.getSource();
		if(jb==jb1){
			System.exit(0);
		}else if(jb==jb2){
			// 다중 선택일때 : 최종값민 기억시켜서 출력
			 ArrayList<String> jlist =(ArrayList<String>) list.getSelectedValuesList();
			  for(String k : jlist){
				  jta.append(k+"\n");
			  }
		}
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		 // 값이 변경되면  true   
		 boolean b = e.getValueIsAdjusting();
		 if(b){
			 // 단일 선택일때
			 /*
		     String msg = (String)((JList)(e.getSource())).getSelectedValue();
		     jta.append(msg+"선택 \n");
		     */
			 // jta.append(items[((JList)(e.getSource())).getSelectedIndex()]+"\n");
			 // jta.append("선택\n");
		 }
	}
}









