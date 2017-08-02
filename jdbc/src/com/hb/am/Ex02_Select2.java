package com.hb.am;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02_Select2 {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			// 1. JDBC ����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			// 2. DB ����
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="hr";
			String password="1111";
			conn = DriverManager.getConnection(url, user, password);
			// 3. SQL�� ���� �� ��������, DB�� �����ؼ� ��� �ޱ�
			// String sql = "select * from hbmember where idx = 5" ;
		    // String sql = "select * from hbmember where name = 'ȫ�浿'" ;
			String sql="select * from hbmember where id='hong' and pwd='1111'" ;
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				System.out.print(rs.getInt("idx")+"\t");
				System.out.print(rs.getString("id")+"\t");
				System.out.print(rs.getString("pwd")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getInt("age")+"\t");
				System.out.println(rs.getString("addr"));
			}
 			if(0==rs.getRow()){
 				System.out.println("�α��� ����");
 				System.out.println("���̵� �н����尡 Ʋ�Ƚ��ϴ�.");
 			}
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
