package com.hb.bm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

// List 인터페이스 구현 : ArrayList, Vector  => 배열구조, 배열처럼 처리
// ArrayList => 동기화지원을 안함, 1:N 실시간 처리 불가능
// Vector => 동기화 지원, 1:N 실시간 처리 가능 
public class Ex06 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Vector<String> vector = new Vector<>();
		list.add("태권브이");
		list.add("깡통로봇");
		list.add("훈이");
		list.add("영희");
		list.add(1,"김박사");
		System.out.println(list);
	
		vector.add("둘리"); 
		vector.add("고길동"); 
		vector.add("도우너"); 
		vector.add("또치");
		vector.add(2,"꼴뚜기왕자");
		vector.add("둘리"); 
		vector.add("고길동"); 
		vector.add("도우너"); 
		vector.add("또치");
		vector.add("둘리"); 
		vector.add("또치");
		System.out.println(vector);
		
		// 크기
		System.out.println("list 크기 : "+list.size());
		System.out.println("vector 크기 : "+vector.size());
		
		// 용량
		// System.out.println(list.capacity());
		System.out.println("vector 용량 : "+vector.capacity());
		
		// 존재유무
		if(list.contains("훈이")){
			System.out.println(list.indexOf("훈이")+"번째 존재");
		}
		
		// get(객체) => 해당 객체 얻기
		  String msg = list.get(list.indexOf("훈이"));
		  System.out.println(msg);
		  
		// 출력
		for(String k:list){
			System.out.println(k);
		}
		System.out.println("::::::::::::::");
		Iterator<String> it = vector.iterator();
		while(it.hasNext()){
			 String str = it.next();
			 System.out.println(str);
		}
		System.out.println("::::::::::::::");
		for(int i=0; i<list.size(); i++){
			  String m = list.get(i);
			  System.out.println(m);
		}
	}
}














