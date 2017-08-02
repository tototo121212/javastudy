package com.hb.am;

import java.util.StringTokenizer;

public class Ex03 {
	public static void main(String[] args) {
	// 	StringTokenizer : 문자열을 나눈다.(String.split() )
	//  차이점 : 마음대로 나눌 수 없다. 필요없는 것은 삭제
	//           반환형이 String[] 아니라서 for문을 사용 못해
		// 공백은 일반적으로 구분자 없이 사용가능
		StringTokenizer st = new StringTokenizer("this is a test");
		// countTokens() => 나누어지는 갯수
		 String[] arr = new String[st.countTokens()] ;
		 int i = 0 ;
		while (st.hasMoreTokens()) {
		    arr[i]= st.nextToken();
		    i++;
		}
		for (String k : arr) {
			System.out.println(k);
		}
        
		StringTokenizer st2 = new StringTokenizer("2013/02/13","/");
		while (st2.hasMoreTokens()) {
		    System.out.println(st2.nextToken());
		}
		
		
	}
}
