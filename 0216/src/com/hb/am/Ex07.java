package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex07 extends JFrame{
	public Ex07() {
	     setTitle("JTextComponet");
	     JPanel jp = new JPanel();
	     
	     JLabel jl1 = new JLabel("ID : ");
	     JTextField jtf = new JTextField();
	     jtf.setColumns(20);
	     jtf.setText("���̵� �Է�");
	     
	     JLabel jl2 = new JLabel("PW : ");
	     JPasswordField jpf = new JPasswordField("����Է�", 20);
	     
	     JLabel jl3 = new JLabel("�� �� �� ��");
	     
	       // JTextArea = > �ٹٲޱ�ɰ� ��ũ�� ��� ������ ¦
	     JTextArea jta = new JTextArea(5, 20);
	     
	     // �ڵ� �� �ٲ� ���
	     jta.setLineWrap(true);
	     
	     // ��ũ�� ���� �����ϱ�
	     JScrollPane jsp = new JScrollPane(jta,   // ��ũ�Ѹ� ��ġ�� ������Ʈ
	    		  ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, // ���� ��ũ��
	    		 ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER); // ���� ��ũ��
	    
	     jp.add(jl1);
	     jp.add(jtf);
	     jp.add(jl2);
	     jp.add(jpf);
	     jp.add(jl3);
	     jp.add(jsp);
	     
	     add(jp);
	     
	    Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(ds.width/-2-150, ds.height/2-150, 300, 300);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //setResizable(false);
	    setVisible(true);
	}
	public static void main(String[] args) {
		new Ex07();
	}
}
