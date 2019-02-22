package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbcTestinsert {

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
		int id = 1;
		String name = "��α�";
		
		
		try {
			// ������ Ư�� Ŭ������ �޸𸮿� �ø���
			Class.forName(diverName);//Static�޼ҵ�� �ٷ� ���
			// �޸𸮿� �ö� ����̹��� �̿��ؼ�
			// Ư��DB�� �����ϱ�
			// ���ῡ �����ϸ� Connection ��ü�� ���� -> ���� ����!
			con = DriverManager.getConnection(url, user, password);//DB�����Ҷ� ����ϴ� ��ɾ�
			sql = "INSERT INTO member (id, name, reg_date)"
				+ "VALUES(?,?,CURRENT_TIMESTAMP)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id); // ? 1�� �ڸ��� int������ ���� - ���̺� ������ �÷��� ȣȯ
			pstmt.setString(2, name); // ? 2�� �ڸ��� String������ ���� - ���̺� varchar�� �÷��� ȣȯ
			
			// sql�� ����
			int count = pstmt.executeUpdate(); // insert�� DB������ �����ؼ� ������
			
			// 2�� ����ǹ����ϱ� ������ �ߴ� ��!
//			int count = pstmt.executeUpdate();
			System.out.println(count+"���� �߰� ��!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // main()

}
