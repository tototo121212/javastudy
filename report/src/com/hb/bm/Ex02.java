package com.hb.bm;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Ex02 {
	public static void main(String[] args) {
		File file = new File("c:/util/test01.txt");
		int size = (int)(file.length());

	FileInputStream fis = null;
	BufferedInputStream bis = null;
	byte[] b = new byte[size];
	try {
		// 스트림 체인 방식
		fis = new FileInputStream(file);
		bis = new BufferedInputStream(fis);
		
		bis.read(b);
		
		String msg = new String(b).trim();
		System.out.println(msg);

	} catch (Exception e) {
		// TODO: handle exception
	}finally {
		try {
			bis.close();
			fis.close();
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}

	
	}
}
