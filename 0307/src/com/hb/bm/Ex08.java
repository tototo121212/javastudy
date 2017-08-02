package com.hb.bm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

// InputStreamReder : 바이트스트림을 문자스트림으로 변경
//                    InputStream => Reder
// 일반적인 장치들은 바이트입력스트림을 사용하는데
// 최종 사람이 사용 하는 것에 대한 젠더 역할을 한다
// 기계 => BufferedReader(InputStreamReader) => 사람
public class Ex08 {
	public static void main(String[] args) {
		System.out.print("원하는 문자 : ");
        InputStreamReader isr = null;
        BufferedReader br = null;
        
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        PrintStream ps = null;
        PrintWriter pw = null;
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			
			String msg = br.readLine();
			
		
			ps = new PrintStream(System.out);	
			ps.println("받은 정보(pringStream) : "+ msg);
			ps.flush();
			
		    osw = new OutputStreamWriter(System.out);
		    bw = new BufferedWriter(osw);
		    pw = new PrintWriter(bw);
		    pw.println("받은 정보(printWriter) : "+ msg);
			pw.flush();
			
			
		} catch (Exception e) {
		} finally {
			try {
				
			} catch (Exception e2) {
			}
		}
	}
}















