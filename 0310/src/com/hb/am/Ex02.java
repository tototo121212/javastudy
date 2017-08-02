package com.hb.am;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class Ex02 {
	public static void main(String[] args) {
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			URL myurl= new URL("http://www.naver.com");
			System.out.println(myurl.getProtocol());
			System.out.println(myurl.getPort());
			System.out.println(myurl.getHost());
			System.out.println(myurl.getFile());
			/*
			isr = new InputStreamReader(myurl.openStream());
			br = new BufferedReader(isr);
			
			String msg = null;
			while((br.readLine()) !=null){
				System.out.println(msg);
			}*/
			URLConnection conn = myurl.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String msg = null;
			while((msg = br.readLine()) !=null){
				System.out.println(msg);
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
