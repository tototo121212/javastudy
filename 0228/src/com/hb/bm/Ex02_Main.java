package com.hb.bm;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex02_Main {
	public static void main(String[] args) {
		Ex02 t1 = new Ex02("희동이", 17, "서울");
		Ex02 t2 = new Ex02("둘리", 1017, "남극");
		Ex02 t3 = new Ex02("마이콜", 27, "옆집");
		Ex02 t4 = new Ex02("또치", 317, "아프리카");
		Ex02 t5 = new Ex02("도우너", 17, "우주");
		
		// 배열로 모은 것 : 크기조정 불가, 추가 삭제 못함
		Ex02[] arr = new Ex02[5];
		arr[0] = t1;
		arr[1] = t2;
		arr[2] = t3;
		arr[3] = t4;
		arr[4] = t5;
		
		for(Ex02 k : arr){
			System.out.print(k.getName()+"\t");
			System.out.println(k.getAge());
		}
		System.out.println("수 : " + arr.length);
		System.out.println(":::::::::::::::::::::::::");
		
		// 컬렉션은 추가, 삭제가 자유롭다.
		Set<Ex02> test = new HashSet<>();
		test.add(t1);
		test.add(t2);
		test.add(t3);
		test.add(t4);
		test.add(t5);
		test.add(new Ex02("공실이", 1016, "북극"));
		for (Ex02 k : test) {
			System.out.print(k.getName()+"\t");
			System.out.print(k.getAge()+"\n");
		}
		System.out.println("수 : " + test.size());
		
		Iterator<Ex02> it = test.iterator();
		while(it.hasNext()){
			Ex02 member = it.next();
			System.out.print(member.getName()+"\t");
			System.out.print(member.getAge()+"\n");
		}
		
		
	}
}










