package com.hb.cm;

import java.io.File;

// File 클래스 : 특정위치에 존재하는 파일이나 디렉토리를 처리하는 클래스
public class Ex01 {
	public static void main(String[] args) {
		String pathName="c:/util";
		File file = new File(pathName);
		
		// list()를 이용하여, 해당 위치의 모든 정보를 배열에 넣기
		String[] list =  file.list();
		for(String k : list){
		   //System.out.println(k);
		   File file2 = new File(pathName, k);
		   if(file2.isDirectory()){
			   System.out.println("디렉토리 : " + k);
		   }else{
			   System.out.println("파일 : " + k+", "+k.length()/1024+"KB");
		   }
		}
	}
	
}









