package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbcTestinsert {

	public static void main(String[] args) {
		// JDBC(Java DataBase Connectivity)
		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 준비된 문장(SQL문장을 가지는?)
		ResultSet rs = null; // 결과셋트(Select문일 경우에만 사용)
		
		// H2DB 드라이버
		String diverName = "org.h2.Driver";
		// H2 접속정보
		String url = "jdbc:h2:tcp://localhost/~/test";
		String user = "sa";
		String password = "";
		
		String sql = "";
		
		// 사용자 입력 변수로 받았다고 가정함.
		int id = 1;
		String name = "김민기";
		
		
		try {
			// 강제로 특정 클래스를 메모리에 올리기
			Class.forName(diverName);//Static메소드라서 바로 사용
			// 메모리에 올라간 드라이버를 이용해서
			// 특정DB에 접속하기
			// 연결에 성공하면 Connection 객체를 리턴 -> 연결 성공!
			con = DriverManager.getConnection(url, user, password);//DB접속할때 사용하는 명령어
			sql = "INSERT INTO member (id, name, reg_date)"
				+ "VALUES(?,?,CURRENT_TIMESTAMP)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id); // ? 1번 자리에 int형으로 설정 - 테이블 정수형 컬럼과 호환
			pstmt.setString(2, name); // ? 2번 자리에 String형으로 설정 - 테이블 varchar형 컬럼과 호환
			
			// sql문 실행
			int count = pstmt.executeUpdate(); // insert문 DB서버로 전송해서 실행함
			
			// 2번 실행되버리니까 오류가 뜨는 것!
//			int count = pstmt.executeUpdate();
			System.out.println(count+"행이 추가 됨!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // main()

}
