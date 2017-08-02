package com.hb.cm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 스트림 : 데이터를 목적지까지 입출력하는 방법 
// 바이트 스트림 : 1byte씩 입력, 출력하는 방법
// 대상 :  바이트로 이루어진 파일, 영상, 소리, 그림,,등 모든 파일 입출력 가능

// 입력 스트림 : InputStream => 
//              FileInputStream : 파일을 읽는 스트림
public class Ex04 {
	public static void main(String[] args) {
		FileInputStream fis= null;
		// File file = new File("c:/util/test01.txt");
		
		// 모든글자를 읽기위해 배열처리
		// 배열크기만큼 읽을 수 있다.
		byte[] b = new byte[17];
		try {
			fis = new FileInputStream("c:/util/test01.txt");
			
			fis.read(b);
			// System.out.println(b); 위치값만 나온다.
			// 배열이라서 for 사용
			// 하나씩 출력하기 때문에 한글, 특수문자 깨진다.
			/*
			for(byte k : b){
				System.out.println((char)k);
			}
			*/
			 String msg = new String(b).trim();
			 System.out.println(msg);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				 fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}









