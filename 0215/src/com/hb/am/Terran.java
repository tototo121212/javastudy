package com.hb.am;

public class Terran extends Unit {

	boolean fly;

	// 생성자
	public Terran() {}

	public Terran(String name, boolean fly) {
		setName(name);
		this.fly = fly ;
		setEnergy(150);
	}

	// 부모가 가진 추상메소드를 구체화 한 메소드
	@Override
	public void decEnergy() {
		setEnergy(getEnergy() - 3);
	}
}
