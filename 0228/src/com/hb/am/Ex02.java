package com.hb.am;

import java.util.InputMismatchException;
import java.util.Scanner;

// 다중 catch : try{}에서 한가지 Exception이 발생하는 것이 아니라
//              여러가지 Exception일 발생가능할 경우 각각의 
//              Exception을 처리하고자 할때 사용
//	try{
//			예외 발생 가능한 문장;     
//		}catch(예외객체 e){
//			예외 발생시 처리문장;
//		}catch(예외객체 e){
//			예외 발생시 처리문장;
//		}catch(예외객체 e){
//			예외 발생시 처리문장;
//		}
// 주의사항 : 최상위 클래스인 Exception 을 사용할 경우
//            반드시 가장 아래 쪽에 catch문에 사용
public class Ex02 {
	public static void main(String[] args) {
		try{
			int var = 50 ;
			Scanner scan = new Scanner(System.in);
			
			System.out.print("정수입력 : ");
			int data = scan.nextInt();
			
			System.out.println("정답 : " + (var/data));
		
		}catch(Exception e){
			System.out.println("오류발생 : "+e);
		}
	}
}







