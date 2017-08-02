package com.hb.bm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex10 extends JFrame {
	JPanel jp;
	JLabel jLabel;
	JTextField jtf;
	JButton jb1, jb2;
	JTextArea jta;
	JScrollPane jsp;
	Map<String, String> map = new HashMap<>();

	public Ex10() {
		setTitle("수도 알아보기");
		jp = new JPanel();
		jLabel = new JLabel("나라입력 : ");
		jtf = new JTextField(15);
		jb1 = new JButton("확인");
		// jb1.setEnabled(false);
		jb2 = new JButton("취소");
		jta = new JTextArea(5, 20);
		jta.setLineWrap(true);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jp.add(jLabel);
		jp.add(jtf);
		jp.add(jb1);
		jp.add(jb2);

		add(jp, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();

		setBounds(ds.width / 2 - 250, ds.height / 2 - 150, 500, 320);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				prn();
			}
		});
		jtf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==e.VK_ENTER){
					prn();
				}
			}
		});
		
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jtf.setText("");
				jta.setText("");
				jtf.requestFocus();
			}
		});
	}
	public void prn(){
		map.put("대한민국", "서울");
		map.put("한국", "서울");
		map.put("캐나다", "어타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");
		map.put("호주", "캔버라");
		
		Set<String> keys = map.keySet();
	   if(jtf.getText().length()==0){
		   jta.append("데이터를 입력하세요\n");
	   }else{
		   String str = jtf.getText();
		   if(keys.contains(str)){
			   String res = map.get(str);
			   jta.append(str+"의 수도는 "+res+"입니다.");
		   }else{
			  jta.append("데이터에 없는 나라입니다.\n");
		   }
	   }
	   jtf.setText("");
	}
	public static void main(String[] args) {
		new Ex10();
	}
}
