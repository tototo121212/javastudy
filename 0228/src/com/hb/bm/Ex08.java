package com.hb.bm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Map<k,v> : key 와 value는 1:1 매칭
// key를 호출하면 value가 나온다.
// key와 value  => not null,
// key는 중복허용 안함, 
// 추가시 add 사용 못함, 반드시 put만 사용
// 값 호출 get(index) => index는 키를 말함
// 보통 key를 Set에 관리 => keySet()
public class Ex08 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		// 추가
		map.put(0, "한국");
		map.put(1, "영국");
		map.put(2, "중국");
		map.put(3, "미국");
		map.put(4, "태국");
		map.put(3, "공화국"); // key가 중복 이전내용 삭제
		map.put(5, "태국"); // value 중복은 상관 없다.
		// 하나씩 호출해 보기
		System.out.println(map.get(0));
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		System.out.println(map.get(4));
		System.out.println(":::::::::::::::");
		// 맵은 for문 사용 못함
		// for(Integer k : map){	}
		// 키값이 숫자라는 것을 이용해서 for문 사용가능
		for(int i=0 ; i < map.size(); i++){
			System.out.println(map.get(i));
		}
		System.out.println(":::::::::::::::");
		Map<String, String> map2 = new HashMap<>();
		map2.put("이름", "홍길동");
		map2.put("나이", "14");
		map2.put("주소", "서울");
		map2.put("성별", "남자");
		System.out.println(map2.get("이름"));
		System.out.println(map2.get("나이"));
		System.out.println(map2.get("주소"));
		System.out.println(map2.get("성별"));
		
		// map2의 key를 Set에서 관리 => keySet()
		 for( String k: map2.keySet()){
			 System.out.println(map2.get(k));
		 }
		 System.out.println(":::::::::::::::::::");
		 Iterator<String> it = map2.keySet().iterator();
		 while(it.hasNext()){
			String msg =  it.next();
			System.out.println(map2.get(msg));
		 }
	}
}












