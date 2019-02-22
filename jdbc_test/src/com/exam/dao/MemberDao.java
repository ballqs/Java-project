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
// ������ SQL���� �����ϴ� �޼ҵ带 ������.
public class MemberDao {
	public MemberDao() { // �⺻ ������
		createTable();// member ���̺� �����ϴ� ��
	}
	private Connection getConnection() throws Exception{
		// H2DB ����̹�
		String diverName = "org.h2.Driver";
		// H2 ��������
		String url = "jdbc:h2:tcp://localhost/~/test";
		String user = "sa";
		String password = "";
		
		Class.forName(diverName);
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		return con;
	} // getConnection()
	
	
	void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		// JDBC �ڿ��ݱ� (����� �������� ����)
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
		// JDBC(Java DataBase Connectivity) �������� �غ�
		Connection con = null; // ����
		PreparedStatement pstmt = null; // �غ�� ����(SQL������ ������?)
		String sql = "";
		try {
			con = this.getConnection();
			
			sql = "CREATE TABLE IF NOT EXISTS  member ( "+
					"	id   INTEGER    PRIMARY KEY," + 
					"   name   VARCHAR(30)," + 
					"   reg_date  TIMESTAMP" + 
					")";
			pstmt = con.prepareStatement(sql);
			// create�� ����
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			this.close(con, pstmt, null);
		}
	} // createTable()
	
	public int insert(Member member){ // insert��
		int count = 0; // ����� ���� ����
		//JDBC(Java DataBase Connectivity) �������� �غ�
		Connection con = null;// ����
		PreparedStatement pstmt = null;// �غ�� ����
		String sql = "";// SQL��
		
		try {
			con = getConnection();
			sql = "INSERT INTO member (id, name, reg_date)"
					+ "VALUES(?,?,CURRENT_TIMESTAMP)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, member.getId()); 
			// ? 1�� �ڸ��� int������ ���� - ���̺� ������ �÷��� ȣȯ
			pstmt.setString(2, member.getName()); 
			// ? 2�� �ڸ��� String������ ���� - ���̺� varchar�� �÷��� ȣȯ
			
			// sql�� ����
			count = pstmt.executeUpdate(); // insert�� DB������ �����ؼ� ������
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(con, pstmt, null);
		}
		return count;
	} // insert()
	public int deleteAll(){ // insert��
		int count = 0; // ����� ���� ����
		//JDBC(Java DataBase Connectivity) �������� �غ�
		Connection con = null;// ����
		PreparedStatement pstmt = null;// �غ�� ����
		String sql = "";// SQL��
		
		try {
			con = getConnection();
			sql = "delete from member";
			
			pstmt = con.prepareStatement(sql);
			
			// sql�� ����
			count = pstmt.executeUpdate(); // delete�� DB������ �����ؼ� ������
			
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
		Connection con = null; // ����
		PreparedStatement pstmt = null; // �غ�� ����(SQL������ ������?)
		ResultSet rs = null; // �����Ʈ(Select���� ��쿡�� ���)
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
		int count = 0; // ����� ���� ����
		//JDBC(Java DataBase Connectivity) �������� �غ�
		Connection con = null;// ����
		PreparedStatement pstmt = null;// �غ�� ����
		String sql = "";// SQL��
		
		try {
			con = getConnection();
			sql = "update member set name = ? where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getName());
			// ? 2�� �ڸ��� String������ ���� - ���̺� varchar�� �÷��� ȣȯ
			pstmt.setInt(2, member.getId());
			// ? 1�� �ڸ��� int������ ���� - ���̺� ������ �÷��� ȣȯ
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
		Connection con = null; // ����
		PreparedStatement pstmt = null; // �غ�� ����(SQL������ ������?)
		ResultSet rs = null; // �����Ʈ(Select���� ��쿡�� ���)
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
