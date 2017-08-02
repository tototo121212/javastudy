package com.hb.cm;

import java.io.FileOutputStream;

// 스트림 : 데이터를 목적지까지 입출력하는 방법 
// 바이트 스트림 : 1byte씩 입력, 출력하는 방법
// 대상 :  바이트로 이루어진 파일, 영상, 소리, 그림,,등 모든 파일 입출력 가능
// 출력 스트림  OutputStream=> 
//             FileOutputStream : 파일을 생성해서 내용을 출력하는 스트림
public class Ex07 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			// 없으면 만들어진다.
			// 있으면, 덮어쓰기된다.
			 fos = new FileOutputStream("c:/util/test02.txt");

			// 이어쓰기를 하고자 하면 true를 넣어주자
			// fos = new FileOutputStream("c:/util/test02.txt",true);
			// 아스키 코드 97는 a이다.
			// test02.txt에 a가 들어가 있는 것을 확인할 수 있다.
			// fos.write(97);
			// fos.flush();

			// 여러 글자 넣기
			/*
			int b = 'l';
			fos.write(b);
			fos.flush();
			b = 'o';
			fos.write(b);
			fos.flush();
			b = 'v';
			fos.write(b);
			fos.flush();
			b = 'e';
			fos.write(b);
			fos.flush();
			*/
			/*
			byte[] b = {'k','o','r','e','a',13,10,'b','o','y'};
			fos.write(b);
			fos.flush();
			*/
			String msg ="안녕하세요\r\n12345\r\nHello~~\r\n大韓民國";
			byte[] b = msg.getBytes();
			fos.write(b);
			fos.flush();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
