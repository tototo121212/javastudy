package com.hb.am;

// �߻� Ŭ����
public abstract class Unit {
	private String name ;
	private int energy ;
	
	// �߻�޼ҵ� 
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
