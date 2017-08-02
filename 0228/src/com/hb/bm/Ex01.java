package com.hb.bm;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

// 컬렉션 : 객체들을 모아서 관리까지 하는 인터페이스들
// 제네닉 : 컬렉션이 어떤 객체들로 이루어졌는지 표시하는 객체 타입
//   형태 : <객체자료형>
//    API : <T> => 객체 타입,  <E> => 컬렉션안에 존재하는 객체 하나를 뜻함 
//          Map 형식 : <k,v> =>  key, value를 뜻함 , key와value는 1:1 대응
//                    키를 호출하면 value가 나온다. 

// 최상위 클래스는  ; Collection<E> => Set<E>, List<E>, Queue<E>, Map<K,V>

// 주요메소드
// add(E e)  : boolean => 해당객체를 추가한다. 성공하면 true
// addAll(Collection<? extends E> c) => 특정 컬렉션에 있는 모든 요소를 다른 컬렉션에 추가
// clear() : 모든 요소 삭제
// contains(Object o) : 해당 객체가 컬렉션에 존재하면 true
// isEmpty() : 해당 컬렉션이 비어있으면 true
// remove(Object o) : 해당 객체만 삭제
// size() : 해당 컬렉션안에 존재하는 객체의 수
// toArray() : 해당 컬렉션을 배열로 만들기
// iterator() : 해당 컬렉션안에 존재하는 객체를 차례대로 접근하기 위한 
//              Iterator객체 반환
public class Ex01 {
	public static void main(String[] args) {
		// Set 인터페이스를 구현한 클래스 : HashSet, TreeSet
		// 특징 ; 중복안됨, 특정기준으로 정렬안됨
		//        TreeSet은 오름차순 정렬이다.
		
		Set<String> test1 = new HashSet<>();
		Set<Integer> test2 = new TreeSet<>();
		
		// 객체 생성
		String name = "희동이" ;
		// 생성된 객체 추가
		test1.add(name);
		test1.add("둘리");
		test1.add("마이콜");
		
		Integer k1 = new Integer(100);
		test2.add(k1);
		
		test2.add(new Integer(200));
		// 자동으로 객체로 만들어져 들어간다.(오토박싱 => 기본자료형을 객체로만듬)
		test2.add(300);
		
		//test2.add(true); // 제넥릭 타입이 Integer라서 오류
		//test2.add('A'); // 제넥릭 타입이 Integer라서 오류
		//test2.add(3.14); // 제넥릭 타입이 Integer라서 오류
		//test2.add("10");// 제넥릭 타입이 Integer라서 오류
		
		// 전체 내용보기 
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test1.size());
		System.out.println(test2.size());
		
		// 하나씩 추출
		// 1. 배열 취급해서 for문 사용
		for(String k : test1 ){
			System.out.println(k);
		}
		
		// 2. iterator() 사용
		Iterator<Integer> it = test2.iterator();
		while(it.hasNext()){
			int k = it.next(); // 언박싱 : 객체를 다시 자료형으로 
			System.out.println(k+10);
		}
	}
}




















