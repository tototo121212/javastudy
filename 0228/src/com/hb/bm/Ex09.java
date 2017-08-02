package com.hb.bm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("한국", "서울");
		map.put("캐나다", "어타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");
		map.put("호주", "캔버라");
		
		Set<String> keys = map.keySet();
		
		chk:
		while(true){
			System.out.print("나라 입력 >> ");
			String str = scan.next();
			if(keys.contains(str)){
				String res = map.get(str);
				System.out.println(str+"의 수도는 "+res+" 입니다.");
			}else{
				System.out.println("데이터에 없는 나라 입니다.");
			}
			
			while(true){
				System.out.print("계속할까요?(y/n)");
				String msg = scan.next();
				if(msg.equalsIgnoreCase("y")){
					continue chk ; // break;
				}else if(msg.equalsIgnoreCase("n")){
					break chk;
				}else{
					continue;
				}
			}
		}
		System.out.println("수고");
	}
}








