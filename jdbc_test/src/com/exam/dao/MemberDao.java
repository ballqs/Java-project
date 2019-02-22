package com.exam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exam.vo.Member;

// DAO(Date Access Object)
// 실행할 SQL문을 수행하는 메소드를 정의함.
public class MemberDao {
	public MemberDao() { // 기본 생성자
		createTable();// member 테이블 생성하는 것
	}
	private Connection getConnection() throws Exception{
		// H2DB 드라이버
		String diverName = "org.h2.Driver";
		// H2 접속정보
		String url = "jdbc:h2:tcp://localhost/~/test";
		String user = "sa";
		String password = "";
		
		Class.forName(diverName);
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		return con;
	} // getConnection()
	
	
	void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		// JDBC 자원닫기 (사용의 역순으로 닫음)
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void createTable(){
		// JDBC(Java DataBase Connectivity) 참조변수 준비
		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 준비된 문장(SQL문장을 가지는?)
		String sql = "";
		try {
			con = this.getConnection();
			
			sql = "CREATE TABLE IF NOT EXISTS  member ( "+
					"	id   INTEGER    PRIMARY KEY," + 
					"   name   VARCHAR(30)," + 
					"   reg_date  TIMESTAMP" + 
					")";
			pstmt = con.prepareStatement(sql);
			// create문 실행
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			this.close(con, pstmt, null);
		}
	} // createTable()
	
	public int insert(Member member){ // insert문
		int count = 0; // 변경된 행의 개수
		//JDBC(Java DataBase Connectivity) 참조변수 준비
		Connection con = null;// 연결
		PreparedStatement pstmt = null;// 준비된 문장
		String sql = "";// SQL문
		
		try {
			con = getConnection();
			sql = "INSERT INTO member (id, name, reg_date)"
					+ "VALUES(?,?,CURRENT_TIMESTAMP)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, member.getId()); 
			// ? 1번 자리에 int형으로 설정 - 테이블 정수형 컬럼과 호환
			pstmt.setString(2, member.getName()); 
			// ? 2번 자리에 String형으로 설정 - 테이블 varchar형 컬럼과 호환
			
			// sql문 실행
			count = pstmt.executeUpdate(); // insert문 DB서버로 전송해서 실행함
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(con, pstmt, null);
		}
		return count;
	} // insert()
	public int deleteAll(){ // insert문
		int count = 0; // 변경된 행의 개수
		//JDBC(Java DataBase Connectivity) 참조변수 준비
		Connection con = null;// 연결
		PreparedStatement pstmt = null;// 준비된 문장
		String sql = "";// SQL문
		
		try {
			con = getConnection();
			sql = "delete from member";
			
			pstmt = con.prepareStatement(sql);
			
			// sql문 실행
			count = pstmt.executeUpdate(); // delete문 DB서버로 전송해서 실행함
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, null);
		}
		return count;
	} // delete()
	
	public List<Member> getMembers(){
		List<Member> list = new ArrayList<Member>();
		// JDBC(Java DataBase Connectivity)
		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 준비된 문장(SQL문장을 가지는?)
		ResultSet rs = null; // 결과셋트(Select문일 경우에만 사용)
		String sql = "";
		try {
			con = getConnection();
			sql = "select * from member order by id";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Member member = new Member();
				member.setId(rs.getInt("id"));
				member.setName(rs.getString("name"));
				member.setRegDate(rs.getTimestamp("reg_date"));
				
				list.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		
		return list;
	}
	
	public int updateById(Member member){
		int count = 0; // 변경된 행의 개수
		//JDBC(Java DataBase Connectivity) 참조변수 준비
		Connection con = null;// 연결
		PreparedStatement pstmt = null;// 준비된 문장
		String sql = "";// SQL문
		
		try {
			con = getConnection();
			sql = "update member set name = ? where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getName());
			// ? 2번 자리에 String형으로 설정 - 테이블 varchar형 컬럼과 호환
			pstmt.setInt(2, member.getId());
			// ? 1번 자리에 int형으로 설정 - 테이블 정수형 컬럼과 호환
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, null);
		}
		return count;
	}
	public Member getMemberById(int id){
		Member member = null;
		// JDBC(Java DataBase Connectivity)
		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 준비된 문장(SQL문장을 가지는?)
		ResultSet rs = null; // 결과셋트(Select문일 경우에만 사용)
		String sql = "";
		try {
			con = getConnection();
			sql = "select * from member where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				member = new Member();
				member.setId(rs.getInt("id"));
				member.setName(rs.getString("name"));
				member.setRegDate(rs.getTimestamp("reg_date"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		
		return member;
	}
} // MemberDao class
