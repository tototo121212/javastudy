package com.hb.am;

// 추상 클래스
public abstract class Unit {
	private String name ;
	private int energy ;
	
	// 추상메소드 
	public abstract void decEnergy();
	
	// get/set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	
}
