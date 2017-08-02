package com.hb.am;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex02_Input {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("c:/util/objectdata2.ser");
			ois = new ObjectInputStream(fis);
			   
			ArrayList<Ex02_VO> list = (ArrayList<Ex02_VO>) ois.readObject();
			
			System.out.println("이름\t나이\t주소\t성별");
			for(Ex02_VO k : list){
				System.out.print(k.getName()+"\t");
				System.out.print(k.getAge()+"\t");
				System.out.print(k.getAddr()+"\t");
				if(k.isGender()){
					System.out.println("남성");
				}else{
					System.out.println("여성");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				ois.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
	}
}
