package com.hb.bm;

import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Ex06_notepad extends JFrame implements ActionListener{
	JTextArea jta;
	JScrollPane jsp;
	JMenuItem jmi1, jmi2, jmi3, jmi4, jmi5, jmi6, jmi7, jmi8, jmi9;
	JMenu jm1, jm2, jm3, jm4;
	JMenuBar jmb ;
	public Ex06_notepad() {
		setTitle("간단 메모장 ver 0.1");
		jta = new JTextArea();
		jsp = new JScrollPane(jta, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jmi1 = new JMenuItem("새파일");
		jmi2 = new JMenuItem("열  기...");
		jmi3 = new JMenuItem("저  장...");
		jmi4 = new JMenuItem("종  료...");
		jmi5 = new JMenuItem("돋움, 기울기,30");
		jmi6 = new JMenuItem("궁서, 굵게, 40");
		jmi7 = new JMenuItem("굴림, 기본, 50");
		jmi8 = new JMenuItem("도움말");
		jmi9 = new JMenuItem("메모장정보");
		
		jm1 = new JMenu("파  일");
		jm2 = new JMenu("서  식");
		jm3 = new JMenu("도움말");
		jm4 = new JMenu("글자서식");
		
		jmb = new JMenuBar();
		
		// 하위메뉴를 메뉴에
		jm1.add(jmi1);
		jm1.add(jmi2);
		jm1.add(jmi3);
		jm1.addSeparator();
		jm1.add(jmi4);
		
		jm4.add(jmi5);
		jm4.add(jmi6);
		jm4.add(jmi7);
		
		jm2.add(jm4);
		
		jm3.add(jmi8);
		jm3.addSeparator();
		jm3.add(jmi9);
		
		//메뉴를 메뉴바에 넣기 
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		
		// 메뉴바를 프레임 메뉴바에 붙이기
		setJMenuBar(jmb);
		
		add(jsp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-300, ds.height/2-300, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		jmi1.addActionListener(this);
		jmi2.addActionListener(this);
		jmi3.addActionListener(this);
		jmi4.addActionListener(this);
		jmi5.addActionListener(this);
		jmi6.addActionListener(this);
		jmi7.addActionListener(this);
		jmi8.addActionListener(this);
		jmi9.addActionListener(this);
	}
	public static void main(String[] args) {
		new Ex06_notepad();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem jmi = (JMenuItem)e.getSource();
		if(jmi == jmi1){ // 새파일
			 int size =  jta.getText().length();
			 if(size==0){
				 jta.setText("");
			 }else{
				 int res =JOptionPane.showConfirmDialog(getParent(), "저장할까요?");
				 if(res==0){
					 FileDialog fd = new FileDialog(this, "저장하기", FileDialog.SAVE);
					 fd.setVisible(true);
					 // 저장기능(I/O) 후 새글
					String path = fd.getDirectory()+fd.getFile();
					String msg = jta.getText().replace("\n", "\r\n");
					byte[] b = msg.getBytes();
					FileOutputStream fos = null;
					try {
							fos = new FileOutputStream(path);
							fos.write(b);
							fos.flush();
							jta.setText("");
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
							
				 }else if(res==1){
					 jta.setText(""); 
				 }
			 }
		}else if(jmi == jmi2){ // 열기
			 FileDialog fd = new FileDialog(this, "불러오기", FileDialog.LOAD);
			 fd.setVisible(true);
			 
			 // 파일 다이얼로그에서 선택한 파일을 읽어오기
			 // System.out.println(fd.getDirectory()+", "+fd.getFile());
			 String path = fd.getDirectory()+fd.getFile();
			 FileInputStream fis = null;
			 File file = new File(path);
			 int size = (int)(file.length()); 
			 byte[] b = new byte[size];
			 try {
				fis = new FileInputStream(file);
				fis.read(b);
				jta.setText("");
				jta.append(new String(b).trim());
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}else if(jmi == jmi3){ // 저장
			 FileDialog fd = new FileDialog(this, "저장하기", FileDialog.SAVE);
			 fd.setVisible(true);
			 // 저장기능(I/O) 
			 String path = fd.getDirectory()+fd.getFile();
				String msg = jta.getText().replace("\n", "\r\n");
				byte[] b = msg.getBytes();
				FileOutputStream fos = null;
				try {
						fos = new FileOutputStream(path);
						fos.write(b);
						fos.flush();
						jta.setText("");
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
		}else if(jmi == jmi4){ // 종료
			System.exit(0);
		}else if(jmi == jmi5){ // 돋움,기울기, 30
			// 글꼴 (Font)
			Font font = new Font("돋움", Font.ITALIC, 30);
			jta.setFont(font);
		}else if(jmi == jmi6){ // 궁서,굵게, 40
			Font font = new Font("궁서", Font.BOLD, 40);
			jta.setFont(font);
		}else if(jmi == jmi7){ // 굴림,기본, 50
			Font font = new Font("굴림", Font.PLAIN, 50);
			jta.setFont(font);
		}else if(jmi == jmi8){ // 도움말
			JOptionPane.showMessageDialog(getParent(), "도움말");
		}else if(jmi == jmi9){ // 메모장정보
			JOptionPane.showMessageDialog(getParent(), "간단 메모장 ver0.1");
		}
		
	}
}











