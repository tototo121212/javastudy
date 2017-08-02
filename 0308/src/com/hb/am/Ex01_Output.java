package com.hb.am;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// 객체직렬화 : 객체가 가지고 있는 내용을 파일로 저장하는데
//             직렬로 만들어서 저장됨(알아 볼수 없다.)
public class Ex01_Output {
	public static void main(String[] args) {
		//  vo기준으로 객체 생성
		Ex01_VO t1 = new Ex01_VO("홍길동", 12, "서울", true);
		Ex01_VO t2 = new Ex01_VO("둘리", 1012, "북극", true);
		Ex01_VO t3 = new Ex01_VO("또치", 112, "서울", true);
		Ex01_VO t4 = new Ex01_VO("마이콜", 32, "서울", true);
		Ex01_VO t5 = new Ex01_VO("공실이", 1012, "서울", false);
		Ex01_VO t6 = new Ex01_VO("홍길동", 12, "서울", true);
		Ex01_VO t7 = new Ex01_VO("둘리", 1012, "북극", true);
		Ex01_VO t8 = new Ex01_VO("또치", 112, "서울", true);
		Ex01_VO t9 = new Ex01_VO("마이콜", 32, "서울", true);
		Ex01_VO t10 = new Ex01_VO("공실이", 1012, "서울", false);
		Ex01_VO t11 = new Ex01_VO("홍길동", 12, "서울", true);
		Ex01_VO t12 = new Ex01_VO("둘리", 1012, "북극", true);
		Ex01_VO t13 = new Ex01_VO("또치", 112, "서울", true);
		Ex01_VO t14 = new Ex01_VO("마이콜", 32, "서울", true);
		Ex01_VO t15 = new Ex01_VO("공실이", 1012, "서울", false);
		
		// 만들어진 객체를 모으자(컬렉션)
		ArrayList<Ex01_VO> list = new ArrayList<>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);
		list.add(t8);
		list.add(t9);
		list.add(t10);
		list.add(t11);
		list.add(t12);
		list.add(t13);
		list.add(t14);
		list.add(t15);
		
		// 모은 객체들를 직렬화 하자 => 파일로 만드는 것
		// 객체 직렬화는 (ObjectOutputStream.writeObject())
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try{
			fos = new FileOutputStream("c:/util/objectdata.txt");
			oos = new ObjectOutputStream(fos);
			
			// 객체 직렬화
			oos.writeObject(list);
			oos.flush();
		}catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}


		
		
		
		
		
		
		
		