package com.hb.cm;

import java.io.File;

public class Ex02 {
	public static void main(String[] args) {
		String path = "c:\\util\\test01.txt";
		File file = new File(path);
		try {
			 boolean res = file.createNewFile();
			 if(res){
				 System.out.println("파일생성 성공");
			 }else{
				 // 파일명이 같으면 실패
				 System.out.println("기존에 파일명이 존재해서 파일생성 실패");
			 }
			 System.out.println("::::::::::::::::::::::::::");
			 System.out.println("절대경로 : " + file.getAbsolutePath()); 
			 System.out.println("상태경로 : " + file.getPath()); 
			 System.out.println("정규화경로 : "+ file.getCanonicalPath()); 
			 System.out.println("파일이름 : " + file.getName()); 
			 System.out.println("상위디렉토리 : "+ file.getParent()); 
			 
			 res = file.delete();
			 if(res){
				 System.out.println("삭제성공");
			 }else{
				 System.out.println("삭제실패");
			 }
			  File file2 = new File("c:/util/exam");
			  file2.mkdirs();
			  file2.delete();
		} catch (Exception e) {
			 System.out.println("경로가 틀려서 파일생성 실패");
		}
	}
}











