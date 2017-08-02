package com.hb.bm;

// ¼ÒºñÀÚ
public class Customer implements Runnable{
	private Car car;
	public Customer() {}
	public Customer(Car car) {
		this.car = car;
	}
	@Override
	public void run() {
		try {
			for(int i=0; i<50; i++){
				car.pop();
				Thread.sleep((int)(Math.random()*500));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
