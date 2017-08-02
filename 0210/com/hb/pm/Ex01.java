package com.hb.pm;

import java.util.Scanner;
import com.hb.am.Ex05;

public class Ex01 {
	public static void main(String[] args) {
		// class의 접근제한자가 디폴트이므로 다른 패키지에서는 객체를 생성할 수 없다.
		// Ex02 test = new Ex02();
		
		// Ex05클래스의 접근제한자가 public이므로 import사용해서 
		// 접근할 수 있다.
		Ex05 test2 = new Ex05();
		Scanner scan = new Scanner(System.in);
	}
}
