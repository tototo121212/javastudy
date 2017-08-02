package com.hb.pm;

import java.util.Scanner;

public class Ex03Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ex03[] arr = new Ex03[5];
		
		String name="" ;
		int kor = 0 , eng =0 , math = 0 ;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("이름 : ");
			name = scan.next();
			System.out.print("국어 : ");
			kor = scan.nextInt();
			System.out.print("영어 : ");
			eng = scan.nextInt();
			System.out.print("수학 : ");
			math = scan.nextInt();
			
			arr[i] = new Ex03(name, kor, eng, math);
			
		}
		
		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
			    if(arr[i].getSum() < arr[j].getSum()){
			    	arr[i].setRank(arr[i].getRank()+1); 
			    }
			}
		}
		// 정렬
		// 임시저장 장소 : 같은자료형
		Ex03 im ;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1 ; j < arr.length; j++) {
				if(arr[i].getSum() < arr[j].getSum()){
					im = arr[i];
					arr[i] = arr[j];
					arr[j] = im ;
				}
			}
		}
		// 출력
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName()+"\t");
			System.out.print(arr[i].getSum()+"\t");
			System.out.print(arr[i].getAvg()+"\t");
			System.out.print(arr[i].getHak()+"\t");
			System.out.println(arr[i].getRank());
		}
		
		
	}
}
