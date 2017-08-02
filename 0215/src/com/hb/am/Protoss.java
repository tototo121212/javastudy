package com.hb.am;

public class Protoss extends Unit{
	boolean fly ;
	
	// 생성자
	public Protoss() {}
	public Protoss(String name, boolean fly) {
		setName(name);
		this.fly = fly ;
		setEnergy(100);
	}
	
	// 부모가 가진 추상메소드를 구체화 한 메소드
	@Override
	public void decEnergy() {
		setEnergy(getEnergy()-1);	
	}
}
