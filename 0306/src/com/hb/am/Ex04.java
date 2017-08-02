package com.hb.am;

// wait(), notify()은 동기화 중일때만 가능  
// 동기화 중일때 강제로 멈추게 하는 것 : wait(),
// wait()된 스레드를 notify()를 하지 않으면 더 이상 실행하지 않음
public class Ex04 implements Runnable{
	int x;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			++x ;
			System.out.println(Thread.currentThread().getName()+":"+x);
			if(x==50 || x==100 || x==150){
				try {
					// 현재 스레드는 대기상태로 빠진다.(wait())
					wait();  
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else{
				// 대기상태에 빠진 스레드를 준비상태로 만든다.
				notify();
			}
		}
	}
}
