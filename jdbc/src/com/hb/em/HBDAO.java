package com.hb.em;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//  DB 접속해서 각종 SQL처리하는 클래스
//  SQL 마다 메소드를 별도로 만든다.  
public class HBDAO {
	Connection conn;
	Statement stmt;
	ResultSet rs;
	HBVO[] hvo = new HBVO[10];

	public HBDAO() {
		// DB 접속
		try {
			// 1. JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			// 2. DB 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public HBVO[] getSelect() {
		try {
			String sql = "select * from hbmember order by idx";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			int cnt = 0;
			while (rs.next()) {
				HBVO vo = new HBVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setId(rs.getString(2));
				vo.setPwd(rs.getString(3));
				vo.setName(rs.getString(4));
				vo.setAge(rs.getInt(5));
				vo.setAddr(rs.getString(6));
				hvo[cnt] = vo;
				cnt++;
			}
		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return hvo;
	}

	// select문 결과 하나일때나 여러개 일때 모두 배열에 담는다.
	public HBVO[] getSelectOne(String id) {
		try {
			String sql = "select * from hbmember where id = '" + id + "'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			int cnt = 0;
			while (rs.next()) {
				HBVO vo = new HBVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setId(rs.getString(2));
				vo.setPwd(rs.getString(3));
				vo.setName(rs.getString(4));
				vo.setAge(rs.getInt(5));
				vo.setAddr(rs.getString(6));
				hvo[cnt] = vo;
				cnt++;
			}
		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return hvo;
	}

	// 삽입 메소드
	public int getInsert(String id, String pwd, String name, int age, String addr) {
		int res = 0;
		try {
			String sql = "insert into hbmember values(hbmember_seq.nextval,'" + id + "', '" + pwd + "', '" + name
					+ "', " + age + ", '" + addr + "')";
			stmt = conn.createStatement();
			res = stmt.executeUpdate(sql);

		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return res;
	}

	// 삭제 메소드
	public int getDelete(String id, String pwd) {
		int res = 0;
		try {
			String sql = "delete from hbmember where id = '" + id + "' and pwd = '" + pwd + "'";
			stmt = conn.createStatement();
			res = stmt.executeUpdate(sql);
		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return res;
	}

	// 갱신하기위한 검색 메소드
	public HBVO getUpdate1(String id) {
		HBVO vo = null;
		try {
			String sql = "select * from hbmember where id = '" + id + "'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			vo = new HBVO();
			while (rs.next()) {
				vo.setPwd(rs.getString(3));
				vo.setName(rs.getString(4));
				vo.setAge(rs.getInt(5));
				vo.setAddr(rs.getString(6));
			}

		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return vo;
	}

	// 실제로 갱신 메소드
	public int getUpdate2(String id, String pwd,String name, int age, String addr) {
		int res = 0;
		try {
			String sql = "update hbmember set name='"+name+"', age="+age+", addr='"
		    +addr+"' where id='"+id+"' and pwd='"+pwd+"'";
			stmt = conn.createStatement();
			res = stmt.executeUpdate(sql);
		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return res;
	}
}
