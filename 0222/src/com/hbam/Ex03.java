package com.hbam;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex03 extends JFrame implements ActionListener, ItemListener {
	JPanel jp1, jp2;
	JTextField jtf1, jtf2;
	String[] items = { "�����ϼ���", "+", "-", "*", "/" };
	JComboBox jcb;
	JButton jb1, jb2, jb3;
	JTextArea jta;
	JScrollPane jsp;
	String op = "";

	public Ex03() {
		super("���� 3");
		jp1 = new JPanel();
		jtf1 = new JTextField(5);
		jtf2 = new JTextField(5);

		jp1.add(new Label("��1 :"));
		jp1.add(jtf1);
		jp1.add(new Label("��2 :"));
		jp1.add(jtf2);
		jp1.add(new Label("������ :"));
		// �޺� �ڽ� => �׸� �迭�� ���� ����� ���δ�.

		jcb = new JComboBox(items);
		jp1.add(jcb);

		jta = new JTextArea();
		jta.setLineWrap(true);
		jta.setEditable(false); // ���� �Ұ���
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jp2 = new JPanel();
		jb1 = new JButton("���");
		jb2 = new JButton("����");
		jb3 = new JButton("���");

		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);

		add(jp1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp2, BorderLayout.SOUTH);

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 150, ds.height / 2 - 150, 500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);

		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);

		jcb.addItemListener(this);
	}

	public static void main(String[] args) {
		new Ex03();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == e.SELECTED) {
			op = (String) (e.getItem());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton) (e.getSource());
		if (jb == jb1) {
			if(jtf1.getText().length()==0 || jtf2.getText().length()==0){
				jta.append("����� �Է��ϼ��� \n");
			}else if(op.length()==0 || op == null){
				jta.append("�����ڸ� �����ϼ���\n");
			}else{
				int res = 0 ;
				int su1 = Integer.parseInt(jtf1.getText());
				int su2 = Integer.parseInt(jtf2.getText());
				switch (op) {
			  		case "+": res = su1 + su2 ; break;
			  		case "-": res = su1 - su2 ; break;
			  		case "*": res = su1 * su2 ; break;
			  		case "/": res = su1 / su2 ; break;
			    }
			  jta.append(su1 + op + su2 + "=" + res + "\n");
			}
		} else if (jb == jb2) {
			System.exit(0);
		} else if (jb == jb3) {
			jtf1.setText("");
			jtf2.setText("");
			jta.setText("");
			op = "";
			jtf1.requestFocus();
			jcb.setSelectedIndex(0);
		}
	}
}
