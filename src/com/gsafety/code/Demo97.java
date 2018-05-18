package com.gsafety.code;

import java.sql.*;

public class Demo97 {
	static Connection con;
	static PreparedStatement sql;
	static ResultSet res;
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql"
							+ "://localhost:3306/yb-test", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) {
		Demo97 c = new Demo97();
		con = c.getConnection();
		try {
			sql = con.prepareStatement("delete from where birthday < ?");
			sql.setString(1, "2000-09-01");
			sql.executeUpdate();
			System.out.println("数据删除完毕");
		} catch (SQLException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}

	}
}