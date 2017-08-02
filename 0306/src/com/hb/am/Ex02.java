package com.hb.am;

	// 임계영역 :  멀티스레드에서 공통으로 사용되는 영역
    // 현재 실행 중인 스레드가 순식간에 다른 스레드에게 제어권 빼앗긴다.
    // 이런한 경우 실시간 처리에서는 문제가 발생할 수 도 있다.
    // 이를 해결한 방법이 동기화처리이다.
    // 동기화 처리란 synchronized 예약어를 사용하여 현재 실행 중인 스레드가 
    // 특정한 영역이 끝날때까지 다른 스레드는 무조건 대기 해야 된다.
public class Ex02 implements Runnable{
   int x;
   
   // 임계영역
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+" : " + x);
			++x;
		}
	}
	public static void main(String[] args) {
		Ex02 test = new Ex02();
		
		new Thread(test,"dog").start();
		new Thread(test,"cat").start();
		new Thread(test,"tiger1").start();
		new Thread(test,"tiger2").start();
		new Thread(test,"tiger3").start();
		new Thread(test,"tiger4").start();
	}
}









