package com.hb.bm;

import java.io.FileReader;

// FileInputStrea => 1byte, read()=>아스키코드(int), read(byte[] b)
// FileReader => 2byte, read()=>유니코드(int), read(char[] c)
public class Ex01 {
	public static void main(String[] args) {
		FileReader fr = null;
		int k = 0;
		try {
			fr = new FileReader("c:/util/test01.txt");
			 // k = fr.read();
			 // System.out.println(k);
			 // System.out.println((char)k);
			while((k=fr.read()) != -1){
				System.out.println((char)k);
			}
		} catch (Exception e) {
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
			}
		}
	}
}
