package com.hb.bm;

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
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jb6.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new HbMemberTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton)e.getSource();
		if(jb == jb1){  // 전체보기
			jta.setText("");
			connet();
			getSelect();
		}else if(jb == jb2){   // 삽입
			jta.setText("");
			connet();
			getInsert(jtf1.getText(), jtf2.getText(), jtf3.getText(),
					Integer.parseInt(jtf4.getText()), jtf5.getText());
			jtf1.setText("");
			jtf2.setText("");
			jtf3.setText("");
			jtf4.setText("");
			jtf5.setText("");
		}else if(jb == jb3){  // 삭제
			jta.setText("");
			connet();
			getDelete(jtf1.getText(),jtf2.getText());
			jtf1.setText("");
			jtf2.setText("");
		}else if(jb == jb4){  // 검색
			jta.setText("");
			connet();
			getSelectOne(jtf1.getText());
			jtf1.setText("");
		}else if(jb == jb5){  // 갱신
			jta.setText("");
			connet();
			getUpdate1(jtf1.getText());
		}else if(jb == jb6){ // 고치기
			jta.setText("");
			connet();
			getUpdate2(jtf1.getText(), jtf2.getText(), jtf3.getText(),
					Integer.parseInt(jtf4.getText()), jtf5.getText());
			jtf1.setText("");
			jtf2.setText("");
			jtf3.setText("");
			jtf4.setText("");
			jtf5.setText("");
		}
		
	}
	
	// DB 접속하는 메소드
	public void connet(){
		// 1. JDBC 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String user ="hr";
			String password="1111";
			// 2. DB 접속
		  conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	// 전체보기 select
	public void getSelect(){
		try {
			String sql = "select * from hbmember order by idx";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			jta.append("\tidx\tid\tpwd\tname\tage\taddr\n");
			while(rs.next()){
				jta.append("\t"+rs.getInt("idx")+"\t");
				jta.append(rs.getString(2)+"\t");
				jta.append(rs.getString(3)+"\t");
				jta.append(rs.getString(4)+"\t");
				jta.append(rs.getInt(5)+"\t");
				jta.append(rs.getString(6)+"\n");
			}
		} catch (Exception e) {
		} finally{
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	// 아이디 가지고 조건 검색
	public void getSelectOne(String id){
		try {
			String sql = "select * from hbmember where id='"+id+"'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			jta.append("\tidx\tid\tpwd\tname\tage\taddr\n");
			while(rs.next()){
				jta.append("\t"+rs.getInt("idx")+"\t");
				jta.append(rs.getString(2)+"\t");
				jta.append(rs.getString(3)+"\t");
				jta.append(rs.getString(4)+"\t");
				jta.append(rs.getInt(5)+"\t");
				jta.append(rs.getString(6)+"\n");
			}
		} catch (Exception e) {
		} finally{
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	public void getInsert(String id, String pwd, String name, int age, String addr){
		try {
			String sql = 
			"insert into hbmember values(hbmember_seq.nextval,'"+id+"', '"+pwd+"', '"
			+name+"', "+age+", '"+addr+"')";
			stmt = conn.createStatement();
			int res = stmt.executeUpdate(sql);
			if(res>0){
				getSelect();
			}else{
				JOptionPane.showMessageDialog(getParent(), "삽입실패");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally{
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	public void getDelete(String id, String pwd){
		try {
			String sql = "delete from hbmember where id='"+id+"' and pwd ='"+pwd+"'";
			stmt = conn.createStatement();
			int res  = stmt.executeUpdate(sql);
			if(res>0){
				getSelect();
			}else{
				JOptionPane.showMessageDialog(getParent(), "삭제실패");
			}
		} catch (Exception e) {
		} finally{
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	public void getUpdate1(String id){
		try {
			String sql = "select * from hbmember where id='"+id+"'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				jtf1.setText(rs.getString(2));
				jtf2.setText(rs.getString(3));
				jtf3.setText(rs.getString(4));
				jtf4.setText(rs.getInt(5)+"");
				jtf5.setText(rs.getString(6));
			}
			jb1.setEnabled(false);
			jb2.setEnabled(false);
			jb3.setEnabled(false);
			jb4.setEnabled(false);
			jb5.setEnabled(false);
			jtf1.setEnabled(false);
			jtf2.setEnabled(false);
		} catch (Exception e) {
		} finally{
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	public void getUpdate2(String id, String pwd, String name, int age, String addr){
		jb1.setEnabled(true);
		jb2.setEnabled(true);
		jb3.setEnabled(true);
		jb4.setEnabled(true);
		jb5.setEnabled(true);
		jtf1.setEnabled(true);
		jtf2.setEnabled(true);
		try {
			String sql = 
			"update hbmember set  name='"+name+"', age="+age+", addr='"+addr+"'  where id='"+id+"' and pwd='"+pwd+"'";
			stmt = conn.createStatement();
			int res = stmt.executeUpdate(sql);
			if(res>0){
				getSelect();
			}else{
				JOptionPane.showMessageDialog(getParent(), "갱신실패");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally{
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}










