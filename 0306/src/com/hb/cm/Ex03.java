package com.hb.cm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 스트림 : 데이터를 목적지까지 입출력하는 방법 
// 바이트 스트림 : 1byte씩 입력, 출력하는 방법
// 대상 :  바이트로 이루어진 파일, 영상, 소리, 그림,,등 모든 파일 입출력 가능

// 입력 스트림 : InputStream => 
//              FileInputStream : 파일을 읽어드리는 스트림
public class Ex03 {
	public static void main(String[] args) {
		FileInputStream fis= null;
		// File file = new File("c:/util/test01.txt");
		
		// read()를 사용하면 아스키코드값(0-255)를 받기위한 변수
		int k = 0;
		try {
			fis = new FileInputStream("c:/util/test01.txt");
			// fis = new FileInputStream(file);
			
			// read()는 1byte만(한글자) 읽어서 k에 저장됨
			// k = fis.read();
			
			// 아스키코드값(숫자) => 문자로 변경
			// System.out.println(k);
			// System.out.println((char)(k));
			
			// 전체내용 읽어오기
			/*
			while(true){
				k = fis.read();
				// 더이상 읽을수가 없으면 -1이 나온다.
				if(k == -1) break;
				System.out.println((char)k);
			}
			*/
			// -1이 아닐때 실행, -1나오면 실행하지 마라
			while((k=fis.read())!= -1){
				System.out.println((char)k);
			}
			
			
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









