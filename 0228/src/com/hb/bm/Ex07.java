package com.hb.bm;

import java.util.Iterator;
import java.util.LinkedList;

// 큐(Queue) : FIFO(First In First Out) : 선입선출
//           먼저들어온자료가 먼저나감
// Queue 인터페이스를 구현한 클래스 => LinkedList;
public class Ex07 {
	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<>();
		// add, addFirst, addLast, offer
		link.add("한국");
		link.add("중국");
		link.offer("태국");
		link.addFirst("영국");
		link.add(2,"미국");
		System.out.println(link);
		
		System.out.println("크기 : "  + link.size());
		
		if(link.contains("한국")){
		     System.out.println(link.indexOf("한국"));	
		     String msg = link.get(link.indexOf("한국"));
		     System.out.println(msg);
		}
		System.out.println(link.getFirst());
		System.out.println(link.getLast());
		System.out.println("::::::::::::::::::");
		// 출력
		for(String k : link){
			System.out.println(k);
		}
		System.out.println("::::::::::::::::::");
		Iterator<String> it = link.iterator();
		while(it.hasNext()){
			String m = it.next();
			System.out.println(m);
		}
		System.out.println("::::::::::::::::::");
	}
}












