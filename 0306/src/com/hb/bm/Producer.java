package com.hb.bm;

public class Producer implements Runnable{
	private Car car ;
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
   public Producer() {}
   public Producer(Car car) {
	   this.car = car;
   }
   
@Override
public void run() {
	String carName=null;
	for(int i=0;i<50; i++){
		carName = car.getCar();
		car.push(carName);
		try {
			Thread.sleep((int)(Math.random()*1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
 
  
}
