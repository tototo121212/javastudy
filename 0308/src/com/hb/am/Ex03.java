package com.hb.am;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ex03 extends JFrame{
	JPanel pNorth, pCenter,pSouth, jp1, jp2, jp3, jp4, jp5;
	JButton jb1, jb2, jb3;
	JTextField tid, tphone;
	JPasswordField tpassword1, tpassword2;
	
	String path;
	File file;
	FileInputStream fis;
	FileOutputStream fos;
	ObjectInputStream ois;
	ObjectOutputStream  oos;
	
	boolean id_chk = true;
	boolean id_success = false;
	public Ex03() {
		pNorth = new JPanel();
		pCenter = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pSouth = new JPanel();
		jp1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		// button생성
		jb1 = new JButton("회원가입");
		jb2 = new JButton("취소");
		jb3 = new JButton("중복확인");

		// textfield생성
		tid = new JTextField(15);
		tpassword1 = new JPasswordField(15);
		tpassword2 = new JPasswordField(15);
		tphone = new JTextField(15);
		
		pNorth.add(new JLabel("회원가입"));
		
		jp1.add(new JLabel("아이디            "));
		jp1.add(tid);
		jp1.add(jb3);

		jp2.add(new JLabel("비밀번호        "));
		jp2.add(tpassword1);

		jp3.add(new JLabel("비밀번호확인"));
		jp3.add(tpassword2);

		jp4.add(new JLabel("전화번호        "));
		jp4.add(tphone);

		pCenter.add(jp1);
		pCenter.add(jp2);
		pCenter.add(jp3);
		pCenter.add(jp4);

		pSouth.add(jb1);
		pSouth.add(jb2);
		
		add(pNorth,BorderLayout.NORTH);
		add(pCenter,BorderLayout.CENTER);
		add(pSouth,BorderLayout.SOUTH);
		
		setBounds(300, 300, 400, 260);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// 1. VO 클래스를 이용해서 ArrayList처리
		ArrayList<Ex03_VO> list = new ArrayList<>();
		
		// 직렬화
		 try {
			file = new File("c:/util/testmember.txt");
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				oos.close();
			} catch (Exception e2) {
			}
		}
		
		// 취소
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tid.setText("");
				tpassword1.setText("");
				tpassword2.setText("");
				tphone.setText("");
				tid.requestFocus();
			}
		});
		
		// 중복확인
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 사용자 아이디 가져오기
				String u_id = tid.getText().trim();
				if(u_id.length()>0){
					try {
						fis = new FileInputStream(file);
						ois = new ObjectInputStream(fis);
						ArrayList<Ex03_VO> list = 
								(ArrayList<Ex03_VO>)ois.readObject();
					 
					    // 자료가 있으면
					   for(Ex03_VO k : list){
						   // 같은 아이디가 존재하면 
						   if(k.getId().equals(u_id)){
							   JOptionPane.showMessageDialog(getParent(), "사용중인 아이디");
							   tid.setText("");
							   tid.requestFocus();
							   id_chk = false;
							   break;
						   }
					   }
					   
					   if(id_chk){
						   JOptionPane.showMessageDialog(getParent(), "사용가능아이디");
						   id_success = true ;  
					   }
					   
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}else{
					JOptionPane.showMessageDialog(getParent(), "아이디 입력하세요");
					tid.requestFocus();
				}
				
			}
		});
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 아이디 검색했는지 체크
				if(id_success){
					// 비번 검사
					String p1 = new String(tpassword1.getPassword()).trim();
					String p2 = new String(tpassword2.getPassword()).trim();
					if(p1.equals(p2)){
						Ex03_VO vo = new Ex03_VO();
						vo.setId(tid.getText().trim());
						vo.setPwd(p1);
						vo.setPhone(tphone.getText().trim());
						
						// 파일로 만들기 전에  기존 내용을 가져와서 추가 한다.
						try {
							fis = new FileInputStream(file);
							ois = new ObjectInputStream(fis);
							
							ArrayList<Ex03_VO> list = 
									(ArrayList<Ex03_VO>)ois.readObject();
							list.add(vo);
							
							// 직렬화
							fos = new FileOutputStream(file);
							oos = new ObjectOutputStream(fos);
							oos.writeObject(list);
							oos.flush();
							
							tid.setText("");
							tpassword1.setText("");
							tpassword2.setText("");
							tphone.setText("");
							
							id_success =false;
							JOptionPane.showMessageDialog(getParent(), "저장완료");
							
						} catch (Exception e2) {
							System.out.println(e2);
						}
						
						
					}else{
						JOptionPane.showMessageDialog(getParent(), "비번이 다르네요");
						tpassword1.setText("");
						tpassword2.setText("");
						tpassword1.requestFocus();
					}
				}else{
					id_chk = true;
					JOptionPane.showMessageDialog(getParent(), "아이디체크하세요");
					tid.requestFocus();
				}
			}
		});
		
	}
	public static void main(String[] args) {
		new Ex03();
	}
}











