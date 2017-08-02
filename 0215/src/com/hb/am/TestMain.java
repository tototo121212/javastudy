package com.hb.am;

public class TestMain {
	public static void main(String[] args) {
		Zerg z = new Zerg("울트라리스크", false);
		Protoss p = new Protoss("케리어", true);
		Terran t = new Terran("고스트", false);
		
		z.decEnergy();
		z.decEnergy();
		z.decEnergy();
		System.out.println("저그에너지 : " + z.getEnergy());
		System.out.println("이름 : " + z.getName());
		if(z.fly){
			System.out.println("하늘을 난다.");
		}else{
			System.out.println("열심히 뛰어다닌다.");
		}
		
	}
}
