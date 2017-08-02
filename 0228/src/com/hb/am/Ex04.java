package com.hb.am;

import java.util.InputMismatchException;
import java.util.Scanner;

// finally{ 반드시 실행해야할 문장들}
public class Ex04 {
	public static void main(String[] args) {
		int var = 50 ;
		Scanner scan = new Scanner(System.in);
		try{
			System.out.print("입력 : "); 
			int data = scan.nextInt();
			System.out.println("정답 : " + (var/data) );
		}catch (ArithmeticException e) {
			System.out.println("0으로는 나눌수가 없습니다.");
			return;
		}catch (InputMismatchException e) {
			System.out.println("문자를 입력하지 마세요");
			return;
		}finally{
			System.out.println("수고하셨습니다.");
		}
	}
}
