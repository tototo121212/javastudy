package com.hb.am;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex05_Update {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0 ;
		ResultSet rs = null;
		try {
			// JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			// DB접속
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			// sql 생성
			String sql = "update hbmember set name='홍서방' where idx = 1";
			// 구문생성
			stmt = conn.createStatement();
			// 전송 및 결과 받기
			result = stmt.executeUpdate(sql);
			if(result>0){
				System.out.println("갱신성공");
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
				System.out.println("갱신실패");
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
