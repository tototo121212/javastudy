package com.hb.am;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03_Insert {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0 ;
		ResultSet rs = null;
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			// 2. DB접속
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			// 3. sql생성, 구문생성, db에 보내서 결과 받기
			String sql = "insert into hbmember values(hbmember_seq.nextval,"
					+ "'lim','1111','임꺽정',14,'충청도')";
			stmt = conn.createStatement();
			// insert, update, delete => executeUpdate(sql) 사용
			result = stmt.executeUpdate(sql);
			if(result>0){
				System.out.println("삽입성공");
				sql = "select * from hbmember order by idx";
				rs = stmt.executeQuery(sql);
				System.out.println("idx\tid\tpwd\tname\tage\taddr");
				while(rs.next()){
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\t");
					System.out.print(rs.getInt(5)+"\t");
					System.out.println(rs.getString(6));
				}
			}else{
				System.out.println("삽입실패");
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
