package com.hb.dm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

public class HbMemberTest extends JFrame{
	JPanel jp1 , jp2, jp3, jp4, jp5, pg1, pg2 ;
	JTextField jtf1, jtf2, jtf3, jtf4, jtf5; 
	JButton jb1, jb2, jb3, jb4,jb5, jb6 ;
	JTextArea jta;
	JScrollPane jsp;
	Connection conn;
	PreparedStatement ptmt;
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
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				connet();
				jta.setText("");
				getSelectAll();
			}
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				connet();
				try {
					jta.setText("");
					String sql ="insert into hbmember values(hbmember_seq.nextval,?,?,?,?,?)";
					 ptmt = conn.prepareStatement(sql);
					 
					 //  동적바인딩변수(?)처리하기
					 ptmt.setString(1, jtf1.getText());
					 ptmt.setString(2, jtf2.getText());
					 ptmt.setString(3, jtf3.getText());
					 ptmt.setInt(4, Integer.parseInt(jtf4.getText()));
					 ptmt.setString(5, jtf5.getText());
					 
					 // DB에 보내서 결과 받기
					 int res = ptmt.executeUpdate();
					
					 if(res>0){
						 jtf1.setText("");
						 jtf2.setText("");
						 jtf3.setText("");
						 jtf4.setText("");
						 jtf5.setText("");
						 getSelectAll();
					 }else{
						 JOptionPane.showMessageDialog(getParent(), "삽입실패");
					 }
				} catch (Exception e2) {
					 JOptionPane.showMessageDialog(getParent(), "삽입실패");
					 getSelectAll();
				} finally {
					try {
						rs.close();
						ptmt.close();
						conn.close();
					} catch (Exception e3) {
					}
				}
			}
		});
		
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				connet();
				try {
					String sql = "delete from hbmember where id=? and pwd=?";
					ptmt = conn.prepareStatement(sql);
					ptmt.setString(1, jtf1.getText());
					ptmt.setString(2, jtf2.getText());
					int res =  ptmt.executeUpdate();
					if(res>0){
						jta.setText("");
						jtf1.setText("");
						jtf2.setText("");
						getSelectAll();
					}else{
						JOptionPane.showMessageDialog(getParent(), "삭제실패");
					}
				} catch (Exception e2) {
					// TODO: handle exception
				} finally{
					try {
						rs.close();
						ptmt.close();
						conn.close();
					} catch (Exception e3) {
						// TODO: handle exception
					}
				}
			}
		});
		jb4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				connet();
				try {
					String sql ="select * from hbmember where id = ? order by idx";
					ptmt = conn.prepareStatement(sql);
					ptmt.setString(1, jtf1.getText());
					rs = ptmt.executeQuery();
					jta.setText("");
					jtf1.setText("");
					jta.append("번호\t아이디\t비번\t이름\t나이\t주소\n");
					while(rs.next()){
						jta.append(rs.getInt(1)+"\t");
						jta.append(rs.getString(2)+"\t");
						jta.append(rs.getString(3)+"\t");
						jta.append(rs.getString(4)+"\t");
						jta.append(rs.getInt(5)+"\t");
						jta.append(rs.getString(6)+"\n");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(getParent(), "검색실패");
				} finally {
					try {
						rs.close();
						ptmt.close();
						conn.close();
					} catch (Exception e3) {
						// TODO: handle exception
					}
				}
			}
		});
		jb5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				connet();
				jta.setText("");
				try {
					String sql = "select * from hbmember where id=?";
					ptmt = conn.prepareStatement(sql);
					ptmt.setString(1, jtf1.getText());
					rs = ptmt.executeQuery();
					while(rs.next()){
						jtf1.setText(rs.getString(2));
						jtf2.setText(rs.getString(3));
						jtf3.setText(rs.getString(4));
						jtf4.setText(String.valueOf(rs.getInt(5)));
						jtf5.setText(rs.getString(6));
					}
					jb1.setEnabled(false);
					jb2.setEnabled(false);
					jb3.setEnabled(false);
					jb4.setEnabled(false);
					jb5.setEnabled(false);
					jtf1.setEditable(false);
					jtf2.setEditable(false);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(getParent(), "갱신실패");
				} finally {
					try {
						rs.close();
						ptmt.close();
						conn.close();
					} catch (Exception e3) {
						// TODO: handle exception
					}
				}
			}
		});
		jb6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				connet();
				jb1.setEnabled(true);
				jb2.setEnabled(true);
				jb3.setEnabled(true);
				jb4.setEnabled(true);
				jb5.setEnabled(true);
				jtf1.setEditable(true);
				jtf2.setEditable(true);
				try {
					String sql ="update hbmember "
 					+ " set name=?, age=?, addr=? where id=? and pwd=?";
					ptmt = conn.prepareStatement(sql);
				
					 ptmt.setString(1, jtf3.getText());
					 ptmt.setInt(2, Integer.parseInt(jtf4.getText()));
					 ptmt.setString(3, jtf5.getText());	
					 ptmt.setString(4, jtf1.getText());
					 ptmt.setString(5, jtf2.getText());
					 
					int res = ptmt.executeUpdate();
					if(res>0){
						getSelectAll();
					}else{
						JOptionPane.showMessageDialog(getParent(),"고치기실패");
					}
				} catch (Exception e2) {
					// TODO: handle exception
				} finally {
					try {
						
					} catch (Exception e3) {
						// TODO: handle exception
					}
				}
			}
		});
	}
	
	// DB접속하는 메소드
	public void connet(){
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "1111";
			conn =  DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
		}
	}
	public void getSelectAll(){
		try {
			String sql = "select * from hbmember order by idx";
			ptmt = conn.prepareStatement(sql);
			rs = ptmt.executeQuery();
			jta.append("번호\t아이디\t비번\t이름\t나이\t주소\n");
			while(rs.next()){
				jta.append(rs.getInt(1)+"\t");
				jta.append(rs.getString(2)+"\t");
				jta.append(rs.getString(3)+"\t");
				jta.append(rs.getString(4)+"\t");
				jta.append(rs.getInt(5)+"\t");
				jta.append(rs.getString(6)+"\n");
			}
		} catch (Exception e2) {
		}finally{
			try {
				rs.close();
				ptmt.close();
				conn.close();
			} catch (Exception e3) {
				// TODO: handle exception
			}
		}
	}
	public static void main(String[] args) {
		new HbMemberTest();
	}
   
}










