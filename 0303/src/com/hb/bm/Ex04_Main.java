package com.hb.bm;

public class Ex04_Main {
	public static void main(String[] args) {
		Ex01 test1 = new Ex01();
		// Ex02 test2 = new Ex02();
		Ex03 test3 = new Ex03();
		
	// Thread를 상속받은 클래스는 바로 start()를 실행할 수 있다.
	// test1.start();
		
	// interface를 상속받은 test1을 타켓으로 만듬
	// start()를 실행하면 타켓인 test1의 run()가 실행됨	
	   Thread t1 = new Thread(test1);
	   t1.start();
	   
	   //익명스레드
	   new Thread(new Ex02()).start();
	   new Thread(new Ex03()).start();
	   
	   
	   //익명 내부클래스  :  안드로이드
	   new Thread(new Runnable() {
		@Override
		public void run() {
			while(true){
				System.out.println("★★★★★★★★★");
			}
		}
	   }).start();
	}
}






