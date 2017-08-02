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

// ����Ʈ : list�� itemlistener // Jlist�� ListSelectionListener
public class Ex09 extends JFrame implements ActionListener, ListSelectionListener{
	JPanel jp1, jp2;
	JButton jb1 ;
	String[] items = {"����","�౸","�߱�","��","�豸" }; 
	JList list ;
	JTextArea jta;
	JScrollPane jsp ;
	JButton jb2;
	public Ex09() {
		setTitle("����Ʈ �̺�Ʈ");
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		jb1 = new JButton("exit");
		jb2 = new JButton("����");
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
		
		// ���� ����
		// list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// list.addListSelectionListener(this);
		
		// ���� ����
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
			// ���� �����϶� : �������� �����Ѽ� ���
			 ArrayList<String> jlist =(ArrayList<String>) list.getSelectedValuesList();
			  for(String k : jlist){
				  jta.append(k+"\n");
			  }
		}
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		 // ���� ����Ǹ�  true   
		 boolean b = e.getValueIsAdjusting();
		 if(b){
			 // ���� �����϶�
			 /*
		     String msg = (String)((JList)(e.getSource())).getSelectedValue();
		     jta.append(msg+"���� \n");
		     */
			 // jta.append(items[((JList)(e.getSource())).getSelectedIndex()]+"\n");
			 // jta.append("����\n");
		 }
	}
}









