package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ConnTest {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {//DB에서 일어날 모든일
			Class.forName("oracle.jdbc.OracleDriver");
			//메소드안에들어가는 모든이름을 가져온다
			
			//conn => java+SQL 연결해주는것
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			//stmt => java에서 SQL으로 식을 보내주는것
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM member");
			String name = null;
			while(rs.next()) {
				name = rs.getString("name");
			}
			System.out.println("회원의 이름:"+name);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
