package com.hb.am;

//익명 내부 클래스 : 이름없는 클래스, 다시 호출 못함
//                  한번 쓰고 버려질때 유용한 클래스
//                  대부분 인터페이스나 추상메소드에서 활용

interface TestInner{
	int data = 100 ;
	public void prnData();
}

public class Ex05 implements TestInner{
	@Override
	public void prnData() {
		System.out.println("인터페이스 사용법1");
		System.out.println(TestInner.data);
		
	}
}

// 익명 내부 클래스로 사용하는 방법
class Ex05_1{
	// 메소드안에 인터페이스 상속받은 클래스 생성
	public void prn(){
		new TestInner() {
			@Override
			public void prnData() {
				System.out.println("인터페이스 사용법2");
				System.out.println(TestInner.data);
			}
		};
	}
	// 인터페이스를 인자로 가지고 있는 메소드
	public void prn2(TestInner ti){
		
	}
}






