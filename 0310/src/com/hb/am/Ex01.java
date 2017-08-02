package com.hb.am;

import java.net.InetAddress;

// InetAddress : IP주소를 표현하는 클래스
// 생성자는 존재하지만 new 연산자로 생성하지 않음
// 5개 static 메소드를 가지고 생성한다.
// localhost => 현재 내가 사용하고 있는 컴퓨터를 말함
public class Ex01 {
	public static void main(String[] args) {
		try {
			InetAddress addr1 = InetAddress.getLocalHost();
			System.out.println("호스트이름 : "+addr1.getHostName());
			System.out.println("호스트IP : "+addr1.getHostAddress());
			
			InetAddress addr2 = InetAddress.getByName("www.naver.com");
			System.out.println("호스트이름 : "+addr2.getHostName());
			System.out.println("호스트IP : "+addr2.getHostAddress());
			
			InetAddress[] addr3 = InetAddress.getAllByName("www.daum.net");
			for(InetAddress k : addr3){
			System.out.println("다음이름 : "+ k.getHostName());
			System.out.println("다음IP : "+ k.getHostAddress());
			System.out.println("::::::::::::::::::::::::::::::::::");
			
			}
			byte[] b = {125,(byte) 209,(byte) 222,(byte) 141};
			InetAddress addr4 = InetAddress.getByAddress(b);
			System.out.println("네이버이름 : "+ addr4.getHostName());
			System.out.println("네이버IP : "+ addr4.getHostAddress());
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}

