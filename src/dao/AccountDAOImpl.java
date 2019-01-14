package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.tomcat.util.collections.SynchronizedStack;

import domain.AccountBean;

public class AccountDAOImpl implements AccountDAO{
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	@Override
	public void insertAccount(int money) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"oracle",
					"password");
			stmt = conn.createStatement();
			String sql = "";
			int result = stmt.executeUpdate(sql);
			if(result == 1) {
				System.out.println("계좌개설 성공!");
			}else {
				System.out.println("계좌개설 실패!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<AccountBean> selectAllAccounts() {
		ArrayList<AccountBean> list = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"oracle",
					"password");
			stmt = conn.createStatement();
			String sql = "";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		AccountBean account = new AccountBean();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"oracle",
					"password");
			stmt = conn.createStatement();
			String sql = "";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return account;
	}

	@Override
	public int accountCount() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"oracle",
					"password");
			stmt = conn.createStatement();
			String sql = "";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {}
		} catch (Exception e) {
			e.printStackTrace();
		}
		int count = 0;
		return count;
	}

	@Override
	public void depositMoney(String accountNum, int money) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"oracle",
					"password");
			stmt = conn.createStatement();
			String sql = "";
			int result = stmt.executeUpdate(sql);
			if(result == 1) {
				System.out.println("입금성공");
			}else {
				System.out.println("입금실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void withdrawMoney(String accountNum, int money) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"oracle",
					"password");
			stmt = conn.createStatement();
			String sql = "";
			int result = stmt.executeUpdate(sql);
			if(result == 1 ) {
				System.out.println("출금성공");
			}else {
				System.out.println("출금실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void removeAccount(String accountNum) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"oracle",
					"password");
			stmt = conn.createStatement();
			String sql = "";
			int result = stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
