package com.hb.am;

public class TestMain {
	public static void main(String[] args) {
		DcaPhone dca = new DcaPhone();
		System.out.println(dca.name);
		System.out.println(dca.price);
		dca.dca();
		dca.call();
		dca.text();
		System.out.println("::::::::::::::::::");
		Mp3Phone mp = new Mp3Phone();
		System.out.println(mp.name);
		System.out.println(mp.price);
		mp.call();
		mp.text();
		mp.sound();
		System.out.println("::::::::::::::::::");
		GamePhone gp = new GamePhone();
		System.out.println(gp.name);
		System.out.println(gp.price);
		gp.call();
		gp.text();
		gp.sound();
		gp.play();
		
	}
}






