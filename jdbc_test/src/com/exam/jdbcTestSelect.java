package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbcTestSelect {

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
		
		
		try {
			Class.forName(diverName);
			con = DriverManager.getConnection(url, user, password);
			sql = "select * from member order by id";
			pstmt = con.prepareStatement(sql);
			// sql문 실행. SELECT문일 경우는
			// resultset 타입의 테이블 형식으로 결과를 가져옴.
			rs = pstmt.executeQuery(); // 질의문답(질문했을때 그에 맞는 결과값 가져올때 사용하는 방식 -> Query)
										// select문을 전송해서 실행 -> rs로 가져옴.
			while(rs.next()) {//커서를 다음행으로 옮긴후 행이 존재하면 true, 행이 없으면 false를 리턴~
				System.out.print(rs.getInt("id"));//커서가 가리키는 행(기준행) id열 값을 int로 가져옴.
				System.out.print("\t"+rs.getString("name"));//커서가 가리키는 행(기준행) name열 값을 String로 가져옴
				System.out.println("\t"+rs.getTimestamp("reg_date"));//커서가 가리키는 행(기준행) reg_date열 값을 Timestamp로 가져옴
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // main()

}
