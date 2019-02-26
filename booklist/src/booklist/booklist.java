package booklist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class booklist {
	Connection con;
	PreparedStatement stmt;
	ResultSet rs;
	public booklist(){
		
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "madang";
		String pwd = "madang";
		
		try {
			Class.forName(driver);
			System.out.println("드라이버 로드 성공");
			System.out.println("데이터베이스 연결 준비");
			con = DriverManager.getConnection(url,userid,pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private void sqlRun() {
		String sql = "select * from book";
		try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			System.out.println("BOOK NO \t BOOK NAME \t\t PUBLISHER \t PRICE");
			while(rs.next()) {
				System.out.println("\t"+rs.getInt(1)+"\t"+rs.getString(2)
				+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String args[]) {
		booklist so = new booklist();
		so.sqlRun();
	}
}
