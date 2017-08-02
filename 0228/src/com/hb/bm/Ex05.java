package com.hb.bm;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

// List 인터페이스 :  배열과 흡사한 구조, 길이 자유롭고, 미리 지정하지 
//                   않아도 된다.
// 관련클래스 : Vector, ArrayList, Stack;
// Stack : LIFO(Last In First Out) : 마지막에 들어온 자료가 먼저 나감
// add, push => 추가 
// pop => 맨 위에 존재하는 객체를 반환하고 삭제까지 
// peek => 맨 위에 존재하는 객체 반환, 삭제는 하지 않는다.
// search => 검색(오른쪽부터 찾기(1부터)
// indexOf => 위치 반환(왼쪽부터 찾기(0부터)

public class Ex05 {
	public static void main(String[] args) {
		Stack<String> list = new Stack<>();
		list.add("손흥민");
		list.add("기성룡");
		list.add("이청룡");
		list.add(2, "차두리");
		list.push("박지성");
		System.out.println(list);
		
		if(list.contains("박지성")){
			// 찾기
			int res = list.indexOf("박지성");
			System.out.println(res+"번째 존재함"); // 배열방식
			res = list.search("박지성");
			System.out.println(res+"번째 존재함"); // 스택방식
		}else{
			System.out.println("존재하지 않음");
		}
		
		// 출력
		for(String k : list){
			System.out.println(k);
		}
		System.out.println(":::::::::::::::::::");
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String m = it.next();
			System.out.println(m);
		}
		System.out.println(":::::::::::::::::::");
		while(! list.isEmpty()){
			  String msg =   list.pop();
			  System.out.println(msg);
		}
		System.out.println(":::::::::::::::::::");
		System.out.println(list);
		
	}
}


















