package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbcTest {

	public static void main(String[] args) {
		// JDBC(Java DataBase Connectivity)
		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 준비된 문장(SQL문장을 가지는?)
		ResultSet rs = null; // 결과셋트(Select문일 경우에만 사용)
		
		
		// 오라클 드라이버
//		String driverName = "oracle.jdbc.OracleDriver";
		// 오라클 접속정보
//		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // DB제품마다 형식이 조금 다름!
//		String user = "scott"; //
//		String password = "bitc5600";
		
		// H2DB 드라이버
		String diverName = "org.h2.Driver";
		// H2 접속정보
		String url = "jdbc:h2:tcp://localhost/~/test";
		String user = "sa";
		String password = "";
		
		String sql = "";
		
		try {
			// 강제로 특정 클래스를 메모리에 올리기
			Class.forName(diverName);//Static메소드라서 바로 사용
			// 메모리에 올라간 드라이버를 이용해서
			// 특정DB에 접속하기
			// 연결에 성공하면 Connection 객체를 리턴 -> 연결 성공!
			con = DriverManager.getConnection(url, user, password);//DB접속할때 사용하는 명령어
			
			sql = "CREATE TABLE IF NOT EXISTS  member ( "+
					"	id   INTEGER    PRIMARY KEY," + 
					"   name   VARCHAR(30)," + 
					"   reg_date  TIMESTAMP" + 
					")";
			pstmt = con.prepareStatement(sql);
			// sql 실행pstmt.executeUpdate()
			// DB상태에 변경을 가하는 sql문 실행
			// 예) create, insert , update, delete
			pstmt.executeUpdate(); // SQL문이 DB서버로 전송되서 실행됨!
			
		} catch (Exception e) { // 모든 예외처리를 상위클래스인 Exception으로 다 해결
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("접속 성공!!");
		
	} // main()

}
