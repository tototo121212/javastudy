package com.hb.bm;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Ex03 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("c:/util/exam02.txt");
			bos = new BufferedOutputStream(fos);
			
			String msg = "hi!!!\r\n12345\r\n가나도아범\r\nHello~~";
			bos.write(msg.getBytes());
			bos.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fos.close();
				bos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
