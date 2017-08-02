package com.hb.am;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Ex01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		int b ;
		try {
			// 스트림 체인방식
			fis = new FileInputStream("c:/util/test01.txt");
			bis = new BufferedInputStream(fis);
			while((b=bis.read()) != -1){
				System.out.print((char)b);
			}
		} catch (Exception e) {
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
	}
}
