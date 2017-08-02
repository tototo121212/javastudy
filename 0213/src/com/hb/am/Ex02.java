package com.hb.am;

public class Ex02 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("길이 : " + sb.length());
		System.out.println("용량 ; " + sb.capacity());
		
		// 내용 추가하기(append())
		sb.append(true);
		System.out.println("길이 : " + sb.length());
		System.out.println("용량 ; " + sb.capacity());
		
		sb.append("Korea");
		System.out.println("길이 : " + sb.length());
		System.out.println("용량 ; " + sb.capacity());
		sb.append(1234567);
		System.out.println("길이 : " + sb.length());
		System.out.println("용량 ; " + sb.capacity());
		sb.append('a');
		System.out.println("길이 : " + sb.length());
		System.out.println("용량 ; " + sb.capacity());
		System.out.println(sb);
		
		// 내용 삽입하기 (insert(삽입할 자리의 위치, 삽입할 내용))
		sb.insert(4, "★");
		System.out.println(sb);
		
	}
}
