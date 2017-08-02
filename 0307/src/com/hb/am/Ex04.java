package com.hb.am;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// DataInputStream과 DataOutputStream
// 기본자료형의 데이터를 주고 받을때 사용
// 반드시 입력순서와 출력순서를 같아야 한다.
public class Ex04 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fos = new FileOutputStream("c:/util/data01.txt");
			dos = new DataOutputStream(fos);
			
			// 출력 =>  writeXXX, XXX=>기본자료형
			dos.writeInt(100);
			dos.writeDouble(3.14);
			dos.writeChar('A');
			dos.writeBoolean(true);
			dos.flush();
			
			fis = new FileInputStream("c:/util/data01.txt");
			dis = new DataInputStream(fis);
		
			// 입력 => readXXX
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readBoolean());
			
			
		} catch (Exception e) {
		} finally {
			try {
				dis.close();
				fis.close();
				dos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
	}
}
