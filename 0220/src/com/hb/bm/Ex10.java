package com.hb.bm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Ex10 extends JFrame implements ActionListener, DocumentListener, KeyListener {
	JPanel jp;
	JTextField jtf;
	JButton jb;
	JTextArea jta;
	JScrollPane jsp;

	public Ex10() {
		setTitle("텍스트 이벤트");
		jp = new JPanel();
		jtf = new JTextField(15);
		jb = new JButton("입력");
		jta = new JTextArea();
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);
		jb.setEnabled(false);

		jp.add(new JLabel("제 목 : "));
		jp.add(jtf);
		jp.add(jb);

		add(jp, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension ds = tk.getScreenSize();

		setBounds(ds.width / 2 - 150, ds.height / 2 - 150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);

		jb.addActionListener(this);
		jtf.getDocument().addDocumentListener(this);
		jtf.addKeyListener(this);
	}

	public static void main(String[] args) {
		new Ex10();
	}

	// 눌렸을때
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == e.VK_ENTER) {
			// 텍스트필드의 내용 저장
			// String msg = jtf.getText();
			// jtf.setText("");
			// 텍스트Area에 추가
			// jta.append(msg + "\n");
			// 커서 텍스트 필드에 넣기
			// jtf.requestFocus();
			
			play();
		}
	}

	// 눌렸다가 띄어 졌을때
	@Override
	public void keyReleased(KeyEvent e) {
	}

	// 키보드를 통해 문자가 입력될때
	@Override
	public void keyTyped(KeyEvent e) {
	}

	// 텍스트필드이 내용 변경될때
	@Override
	public void changedUpdate(DocumentEvent e) {
	}

	// 내용이 삽입 될때
	@Override
	public void insertUpdate(DocumentEvent e) {
		jb.setEnabled(true);
	}

	// 삭제 될때
	@Override
	public void removeUpdate(DocumentEvent e) {
		if (e.getOffset() == 0)
			jb.setEnabled(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 텍스트필드의 내용 저장
		// String msg = jtf.getText();
		// jtf.setText("");
		// 텍스트Area에 추가
		// jta.append(msg + "\n");
		// 커서 텍스트 필드에 넣기
		// jtf.requestFocus();
		
		play();
	}

	public void play() {
		// 텍스트필드의 내용 저장
		String msg = jtf.getText();
		jtf.setText("");
		// 텍스트Area에 추가
		jta.append(msg + "\n");
		// 커서 텍스트 필드에 넣기
		jtf.requestFocus();
	}
}
