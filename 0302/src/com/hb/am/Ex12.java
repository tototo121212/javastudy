package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex12 extends JFrame {
	JPanel jp;
	CanvasTest ct = new CanvasTest();
	JButton jb1, jb2, jb3, jb4, jb5, jb6;
	String[] items = { "5", "10", "15", "20", "25", "30" };
	JComboBox<String> jcom;
	int x = -5;
	int y = -5;
	int wh = 5;
	Toolkit toolkit = getToolkit();
    Color color;
	public Ex12() {
		setTitle("미니그림판");
		jp = new JPanel();

		jb1 = new JButton(" ");
		jb1.setBackground(Color.RED);
		jb2 = new JButton(" ");
		jb2.setBackground(Color.GREEN);
		jb3 = new JButton(" ");
		jb3.setBackground(Color.BLUE);
		jb4 = new JButton(" ");
		jb4.setBackground(Color.CYAN);
		jb5 = new JButton(" ");
		jb5.setBackground(Color.MAGENTA);
		jb6 = new JButton(" ");
		jb6.setBackground(Color.YELLOW);

		jcom = new JComboBox<>(items);
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		jp.add(jcom);

		add(jp, BorderLayout.NORTH);
		add(ct, BorderLayout.CENTER);

		Dimension ds = toolkit.getScreenSize();
		setBounds(ds.width / 2 - 300, ds.height / 2 - 300, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.RED;
			}
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.GREEN;
			}
		});
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.BLUE;
			}
		});
		jb4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.CYAN;
			}
		});
		jb5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.MAGENTA;
			}
		});
		jb6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.YELLOW;
			}
		});
	   jcom.addItemListener(new ItemListener() {
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==e.SELECTED){
				switch ((String)e.getItem()) {
					case "5" :  wh = 5 ;break;
					case "10" : wh = 10 ;break;
					case "15" : wh = 15 ;break;
					case "20" : wh = 20 ;break;
					case "25" : wh = 25 ;break;
					case "30" : wh = 30 ;break;
				}
			}
		}
	});
		ct.addMouseMotionListener(new MouseAdapter() {
			@Override
				public void mouseDragged(MouseEvent e) {
					x = e.getX();
					y = e.getY();
					ct.repaint();
					
				}	
		});
	}

	private class CanvasTest extends Canvas {
		@Override
		public void paint(Graphics g) {
			g.setColor(color);
			g.fillOval(x, y, wh, wh);
		}
		// 반드시 해줘야 repaint가 제대로 실행됨
		@Override
		public void update(Graphics g) {
			paint(g);
		}
	}

	public static void main(String[] args) {
		new Ex12();
	}
}
