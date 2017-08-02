package com.hb.em;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class HbMemberTest extends JFrame implements ActionListener{
	JPanel jp1 , jp2, jp3, jp4, jp5, pg1, pg2 ;
	JTextField jtf1, jtf2, jtf3, jtf4, jtf5; 
	JButton jb1, jb2, jb3, jb4,jb5, jb6 ;
	JTextArea jta;
	JScrollPane jsp;
	Connection conn;
	Statement stmt;
	ResultSet rs ;
	public HbMemberTest() {
		jp1 = new JPanel(new GridLayout(0,2));
		jp2 = new JPanel(new GridLayout(0,2));
		jp3 = new JPanel(new GridLayout(0,2));
		jp4 = new JPanel(new GridLayout(0,2));
		jp5 = new JPanel(new GridLayout(0,2));
		pg1 = new JPanel(new GridLayout(5,0));
		pg2 = new JPanel();
		
		jtf1 = new JTextField();
		jtf2 = new JTextField();
		jtf3 = new JTextField();
		jtf4 = new JTextField();
		jtf5 = new JTextField();
		
		jb1 = new JButton("전체보기");
		jb2 = new JButton("삽입");
		jb3 = new JButton("삭제");
		jb4 = new JButton("검색");
		jb5 = new JButton("갱신");
		jb6 = new JButton("고치기");
		
		jp1.add(new JLabel("ID : ", JLabel.CENTER));
		jp1.add(jtf1);
		
		jp2.add(new JLabel("PWD : ", JLabel.CENTER));
		jp2.add(jtf2);
		
		jp3.add(new JLabel("NAME : ", JLabel.CENTER));
		jp3.add(jtf3);
		
		jp4.add(new JLabel("AGE : ", JLabel.CENTER));
		jp4.add(jtf4);
		
		jp5.add(new JLabel("ADDR : ", JLabel.CENTER));
		jp5.add(jtf5);
		
		jta = new JTextArea();
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);
		
		pg1.add(jp1);
		pg1.add(jp2);
		pg1.add(jp3);
		pg1.add(jp4);
		pg1.add(jp5);
		
		pg2.add(jb1);
		pg2.add(jb2);
		pg2.add(jb3);
		pg2.add(jb4);
		pg2.add(jb5);
		pg2.add(jb6);

		add(pg1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(pg2, BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-300, ds.height/2-300, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(this);
		jb4.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb5.addActionListener(this);
		jb6.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new HbMemberTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton)e.getSource();
		if(jb == jb1){
		 jta.setText("");
		   HBDAO dao = new HBDAO();
		   HBVO[] hvo = dao.getSelect();
		   jta.append("회원 전체정보\n");
		   jta.append("  idx\tid\tpwd\tname\tage\taddr\n");
		   for(HBVO k : hvo){
			   jta.append("  "+k.getIdx()+"\t");
			   jta.append(k.getId()+"\t");
			   jta.append(k.getPwd()+"\t");
			   jta.append(k.getName()+"\t");
			   jta.append(k.getAge()+"\t");
			   jta.append(k.getAddr()+"\n");
		   }
		}else if(jb == jb4){
			jta.setText("");
			HBDAO dao = new HBDAO();
			   HBVO[] hvo = dao.getSelectOne(jtf1.getText());
			   jta.append(jtf1.getText()+"님의 개인정보\n");
			   jta.append("  idx\tid\tpwd\tname\tage\taddr\n");
			   for(HBVO k : hvo){
				   jta.append("  "+k.getIdx()+"\t");
				   jta.append(k.getId()+"\t");
				   jta.append(k.getPwd()+"\t");
				   jta.append(k.getName()+"\t");
				   jta.append(k.getAge()+"\t");
				   jta.append(k.getAddr()+"\n");
			   }
		}else if(jb == jb2){
			HBDAO dao = new HBDAO();
			int res  = dao.getInsert(jtf1.getText(), jtf2.getText(), jtf3.getText(), Integer.parseInt(jtf4.getText()), jtf5.getText());
			jtf1.setText("");
			jtf2.setText("");
			jtf3.setText("");
			jtf4.setText("");
			jtf5.setText("");
			if(res>0){
				jta.setText("");
				   HBVO[] hvo = dao.getSelect();
				   jta.append("회원 전체정보\n");
				   jta.append("  idx\tid\tpwd\tname\tage\taddr\n");
				   for(HBVO k : hvo){
					   jta.append("  "+k.getIdx()+"\t");
					   jta.append(k.getId()+"\t");
					   jta.append(k.getPwd()+"\t");
					   jta.append(k.getName()+"\t");
					   jta.append(k.getAge()+"\t");
					   jta.append(k.getAddr()+"\n");
				   }
			}else{
				JOptionPane.showMessageDialog(getParent(), "삽입실패");
			}
		}else if(jb == jb3){
			HBDAO dao = new HBDAO();
			int res  = dao.getDelete(jtf1.getText(), jtf2.getText());
			jtf1.setText("");
			jtf2.setText("");
			if(res>0){
				jta.setText("");
				   HBVO[] hvo = dao.getSelect();
				   jta.append("회원 전체정보\n");
				   jta.append("  idx\tid\tpwd\tname\tage\taddr\n");
				   for(HBVO k : hvo){
					   jta.append("  "+k.getIdx()+"\t");
					   jta.append(k.getId()+"\t");
					   jta.append(k.getPwd()+"\t");
					   jta.append(k.getName()+"\t");
					   jta.append(k.getAge()+"\t");
					   jta.append(k.getAddr()+"\n");
				   }
			}else{
				JOptionPane.showMessageDialog(getParent(), "삭제실패");
			}
		}else if(jb == jb5){
			HBDAO dao = new HBDAO();
			HBVO vo = dao.getUpdate1(jtf1.getText());
			if(vo!=null){
				// jtf1.setEditable(false);
				// jtf2.setEditable(false);
				jtf2.setText(vo.getPwd());
				jtf3.setText(vo.getName());
				jtf4.setText(String.valueOf(vo.getAge()));
				jtf5.setText(vo.getAddr());
				
				
			}else{
				JOptionPane.showMessageDialog(getParent(), "갱신실패");
			}
		}else if(jb == jb6){
			HBDAO dao = new HBDAO();
			int res = dao.getUpdate2(jtf1.getText(),jtf2.getText(),jtf3.getText(),Integer.parseInt(jtf4.getText()),jtf5.getText());
			jtf1.setEditable(true);
			jtf2.setEditable(true);
			if(res >0){
		    	jta.setText("");
				   HBVO[] hvo = dao.getSelect();
				   jta.append("회원 전체정보\n");
				   jta.append("  idx\tid\tpwd\tname\tage\taddr\n");
				   for(HBVO k : hvo){
					   jta.append("  "+k.getIdx()+"\t");
					   jta.append(k.getId()+"\t");
					   jta.append(k.getPwd()+"\t");
					   jta.append(k.getName()+"\t");
					   jta.append(k.getAge()+"\t");
					   jta.append(k.getAddr()+"\n");
				   }
		    }else{
				JOptionPane.showMessageDialog(getParent(), "고치기실패");
			}
		}
		
	}
	
}










