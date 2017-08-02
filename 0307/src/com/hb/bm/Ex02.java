package com.hb.bm;

import java.io.FileWriter;

// FileOutputStream : 1byte, write(아스키코드), write(byte[] b)
// FileWriter : 2byte, write(String s)
public class Ex02 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("c:/util/fw.txt");
			String str="안녕하세요\r\n시험준비는 잘 되고 있나요?";
			fw.write(str);
			fw.flush();
		} catch (Exception e) {
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
			}
		}
	}
}
