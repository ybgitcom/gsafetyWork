package com.gsafety.code;

import java.sql.*;

public class Demo97 {
	static Connection con;
	static PreparedStatement sql;
	static ResultSet res;
	public Connection getConnection() {
		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:jtds:sqlserver://localhost:1433/"
							+ "db_jdbc", "sa", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) {
		Demo97 c = new Demo97();
		con = c.getConnection();
		try {
			sql = con.prepareStatement("delete from tb_stu where birthday < ?");
			sql.setString(1, "2000-09-01");
			sql.executeUpdate();
			System.out.println("����ɾ�����");
		} catch (SQLException e) {        
			// TODO �Զ����� catch ��
			e.printStackTrace();
		}

	}
}