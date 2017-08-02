package com.hb.cm;

public class Ex09 extends Thread{
	Ex08 ball;
	int x ;
	int y = -50;
	public Ex09() {}
	// 공을 받는 생성자
	public Ex09(Ex08 ball) {
		this.ball = ball;
	}	

	@Override
	public void run() {
		while(y < ball.canvas.getHeight()){
			y = y+5 ;
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ball.canvas.repaint();
		}
	}
}








