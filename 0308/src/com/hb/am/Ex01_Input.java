package com.hb.am;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

// 역직렬화
public class Ex01_Input {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("c:/util/objectdata.txt");
			ois = new ObjectInputStream(fis);
			
			// 역직렬를 하면 Object로 나옴
			// Object로 나온 객체를 
			// 직렬화 할때 사용한 list를 그대로 형변환
			ArrayList<Ex01_VO> list = (ArrayList<Ex01_VO>)ois.readObject();
			
			System.out.println("이름\t나이\t주소\t성별");
			for(Ex01_VO k : list){
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
			// TODO: handle exception
		} finally {
			try {
				ois.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
