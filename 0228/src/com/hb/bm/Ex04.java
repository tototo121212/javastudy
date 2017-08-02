package com.hb.bm;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex04 {
	public static void main(String[] args) {
		Random ran = new Random();
		 int[] su = new int[6];
		Set<Integer> set = new TreeSet<>();
		Set<Integer> set2 = new TreeSet<>();
		for (int i = 0; i < 6; i++) {
			 su[i] = ran.nextInt(45)+1 ;
			 if(!set.add(su[i])){
				 i--;
			   }
		}
		System.out.println(set);
		System.out.println();
		for (int i = 0; i < 6; i++) {
			if(!set2.add((int)(Math.random()*45)+1)) 
				i--;
		}
		System.out.println(set2);
	}
}










