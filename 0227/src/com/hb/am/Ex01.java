package com.hb.am;

// 열거형 : 상수(static final)만 가지고 있음, 각각의 상수를 하나의 객체 판단
// 형식) [접근제한자] enum 이름{상수, 상수, 상수,......}
public class Ex01 {
	static final int JAVA = 100 ;
	public enum Lesson{JAVA,JSP,SPRING,ANDROID,DB,HTML_CSS,JAVASCRIPT};
	public static void main(String[] args) {
		Lesson msg = Lesson.JAVA;
		System.out.println(msg);
		System.out.println(JAVA);
		System.out.println(":::::::::::::::::::::::::");
		// enum를 배열로
		Lesson[] arr = Lesson.values();
		
		// 배열은 for문
		for(Lesson k : arr){
			System.out.println(k);
		}
	}
}
