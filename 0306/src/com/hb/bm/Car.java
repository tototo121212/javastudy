package com.hb.bm;

import java.util.ArrayList;
import java.util.List;

// 차에 대한 생산, 소비
// 차는 리스트에 저장되었다가 소비된다.
public class Car {
	private List<String> carList = null;
	public Car() {
		carList = new ArrayList<>();
	}
	
	// 차 생산
	public String getCar(){
		String carName = null;
		switch ((int)(Math.random()*3)) {
			case 0:	carName ="카니발";	break;
			case 1:	carName ="카렌스";	break;
			case 2:	carName ="그랜져";	break;
		}
		return carName;
	}
	
	// 생산된 차 리스트에 저장
	public synchronized void push(String car){
		carList.add(car);
		System.out.println("차가 만들어졌습니다 : " + car);
		if(carList.size()==5){
			notify();
		}
	}
	
	// 소비
   public synchronized void pop(){
	   String carName = null;
	   if(carList.size()==0){
		   System.out.println("차가 없습니다. 대기하세요");
		   try {
			   wait();
		   } catch (InterruptedException e) {
			   e.printStackTrace();
		   }
	   }else{
		   carName = carList.remove(carList.size()-1);
		   System.out.println("구입한 차 : " + carName);
	   }
   }
}






