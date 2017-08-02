package com.hb.am;

import java.util.Scanner;

// 예외전가 (throws 예약어사용)
// 예외가 발생하면 예외를 처리하는 것이 아니라, 예외 객체를 자신을
// 호출한 곳으로 보내다. 나중에라도 예외처리(try~catch)를 하는 것이 좋다.
public class Ex03 {
	public void setData(String n) throws NumberFormatException{
		if(n.length()>=1){
			String str = n.substring(0, 1);
			prnData(str);
		}
	}
	public void prnData(String s) throws NumberFormatException{
			int dan = Integer.parseInt(s);
			System.out.println(dan+"단");
			for(int i=0; i<10; i++){
				System.out.println(dan + "*" + i + "=" + (dan*i));
			}
	}
	public static void main(String[] args) throws NumberFormatException{
		try {
			Ex03 test = new Ex03();
			Scanner scan = new Scanner(System.in);
			System.out.print("숫자 : ");
			String msg = scan.next();
			test.setData(msg);
		} catch (Exception e) {
			System.out.println("첫글자는 숫자로 입력하세요");
		}
		
	}
}
