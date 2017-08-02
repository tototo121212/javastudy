package com.hb.am;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Ex03 {
	public static void main(String[] args) {
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			URL myurl = new URL("http://openapi.seoul.go.kr:8088/sample/json/SeoulLibraryTime/1/5/");
			System.out.println(myurl.getProtocol());
			System.out.println(myurl.getPort());
			System.out.println(myurl.getHost());
			System.out.println(myurl.getFile());
			
			URLConnection conn = myurl.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
			String msg = null;
			while((msg = br.readLine()) !=null){
				System.out.print(msg);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
