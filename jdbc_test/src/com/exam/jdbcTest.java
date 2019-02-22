package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbcTest {

	public static void main(String[] args) {
		// JDBC(Java DataBase Connectivity)
		Connection con = null; // ����
		PreparedStatement pstmt = null; // �غ�� ����(SQL������ ������?)
		ResultSet rs = null; // �����Ʈ(Select���� ��쿡�� ���)
		
		
		// ����Ŭ ����̹�
//		String driverName = "oracle.jdbc.OracleDriver";
		// ����Ŭ ��������
//		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // DB��ǰ���� ������ ���� �ٸ�!
//		String user = "scott"; //
//		String password = "bitc5600";
		
		// H2DB ����̹�
		String diverName = "org.h2.Driver";
		// H2 ��������
		String url = "jdbc:h2:tcp://localhost/~/test";
		String user = "sa";
		String password = "";
		
		String sql = "";
		
		try {
			// ������ Ư�� Ŭ������ �޸𸮿� �ø���
			Class.forName(diverName);//Static�޼ҵ�� �ٷ� ���
			// �޸𸮿� �ö� ����̹��� �̿��ؼ�
			// Ư��DB�� �����ϱ�
			// ���ῡ �����ϸ� Connection ��ü�� ���� -> ���� ����!
			con = DriverManager.getConnection(url, user, password);//DB�����Ҷ� ����ϴ� ��ɾ�
			
			sql = "CREATE TABLE IF NOT EXISTS  member ( "+
					"	id   INTEGER    PRIMARY KEY," + 
					"   name   VARCHAR(30)," + 
					"   reg_date  TIMESTAMP" + 
					")";
			pstmt = con.prepareStatement(sql);
			// sql ����pstmt.executeUpdate()
			// DB���¿� ������ ���ϴ� sql�� ����
			// ��) create, insert , update, delete
			pstmt.executeUpdate(); // SQL���� DB������ ���۵Ǽ� �����!
			
		} catch (Exception e) { // ��� ����ó���� ����Ŭ������ Exception���� �� �ذ�
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���� ����!!");
		
	} // main()

}
