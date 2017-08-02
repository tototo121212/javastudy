package com.hb.am;

public class Ex03 implements Runnable{
	private int depositeMondy = 20000;
	public int getDepositeMondy() {
		return depositeMondy;
	}
	public void setDepositeMondy(int depositeMondy) {
		this.depositeMondy = depositeMondy;
	}
	@Override
	public synchronized void run() {
		for (int i = 0; i < 10; i++) {
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(getDepositeMondy()<=0) break;
			widthDarw(100);
		}
	}
	public void widthDarw(int su){
		if(getDepositeMondy()>0){
			depositeMondy = depositeMondy - su ;
			System.out.print(Thread.currentThread().getName()+", ");
			System.out.println("ÀÜ¾×:" + getDepositeMondy());
		}else{
			System.out.print(Thread.currentThread().getName()+", ");
			System.out.println("ÀÜ¾×ÀÌ ¾ø³×¿ä");
		}
	}
}











