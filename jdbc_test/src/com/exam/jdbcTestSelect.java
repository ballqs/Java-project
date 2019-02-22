package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbcTestSelect {

	public static void main(String[] args) {
		// JDBC(Java DataBase Connectivity)
		Connection con = null; // ����
		PreparedStatement pstmt = null; // �غ�� ����(SQL������ ������?)
		ResultSet rs = null; // �����Ʈ(Select���� ��쿡�� ���)
		
		// H2DB ����̹�
		String diverName = "org.h2.Driver";
		// H2 ��������
		String url = "jdbc:h2:tcp://localhost/~/test";
		String user = "sa";
		String password = "";
		
		String sql = "";
		
		// ����� �Է� ������ �޾Ҵٰ� ������.
		
		
		try {
			Class.forName(diverName);
			con = DriverManager.getConnection(url, user, password);
			sql = "select * from member order by id";
			pstmt = con.prepareStatement(sql);
			// sql�� ����. SELECT���� ����
			// resultset Ÿ���� ���̺� �������� ����� ������.
			rs = pstmt.executeQuery(); // ���ǹ���(���������� �׿� �´� ����� �����ö� ����ϴ� ��� -> Query)
										// select���� �����ؼ� ���� -> rs�� ������.
			while(rs.next()) {//Ŀ���� ���������� �ű��� ���� �����ϸ� true, ���� ������ false�� ����~
				System.out.print(rs.getInt("id"));//Ŀ���� ����Ű�� ��(������) id�� ���� int�� ������.
				System.out.print("\t"+rs.getString("name"));//Ŀ���� ����Ű�� ��(������) name�� ���� String�� ������
				System.out.println("\t"+rs.getTimestamp("reg_date"));//Ŀ���� ����Ű�� ��(������) reg_date�� ���� Timestamp�� ������
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // main()

}
