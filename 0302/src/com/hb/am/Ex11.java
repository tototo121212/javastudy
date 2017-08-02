package com.hb.am;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Ex11 extends JFrame {
	int x = 0;
	int y = 0;
	int wh = 30;
	CanvasTest ct = new CanvasTest();
    Toolkit toolkit = getToolkit();
    
    boolean bRight = true; // �¿�
    boolean bDown = true; // ����
    int ball_speed = 10; // 0.01 Ÿ�̸Ӱ���
    int ball_gan = 2 ; // �̵�����
	public Ex11() {
		setTitle("������");

		add(ct);
		Dimension ds = toolkit.getScreenSize();
		setBounds(ds.width / 2 - 150, ds.height / 2 - 250, 300, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		Timer timer = new Timer(ball_speed, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// x += ball_gan;
				// y += ball_gan;
				// ct.repaint();
				// ��輱 ������ ������ ���δ�.
				
				// �¿�
				if(bRight){
					x += ball_gan;
				}else{
					x -= ball_gan;
				}
				//���ʺ�
				if(x<0) bRight=true;
				//������ ��
				if(x+30 > 300)  bRight=false;
				
				// ����
				if(bDown){
					y += ball_gan;
				}else{
					y -= ball_gan;
				}
				//���ʺ�
				if(y<0) bDown=true;
				//������ ��
				if(y+30 > 500)  bDown=false;
				ct.repaint();
			}
			
		});
		timer.start();
	}

	private class CanvasTest extends JPanel {
		@Override
		public void paint(Graphics g) {
			g.clearRect(0, 0, getWidth(), getHeight());
			g.setColor(Color.magenta);
			g.fillOval(x, y, wh, wh);
		}
	}

	public static void main(String[] args) {
		new Ex11();
	}
}