package com.gsafety.code;

import java.sql.*;

public class Demo95 {
	static Connection con;
	static PreparedStatement sql;
	static ResultSet res;

	public Connection getConnection() {
		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:jtds:sqlserver://localhost:1433/db_jdbc", "sa",
					"");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void main(String[] args) {
		Demo95 c = new Demo95();
		con = c.getConnection();
		try {
			sql = con.prepareStatement("insert into tb_stu values(?,?,?)");
			sql.setString(1, "��ĳ");
			sql.setString(2, "Ů");
			sql.setString(3, "1999-10-20");
			sql.executeUpdate();
			System.out.println("���ݲ���ɹ���");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}