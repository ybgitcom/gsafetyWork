package com.gsafety.code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo98 {
	private static int id;
	private static String username;

	public static void main(String[] args) {
		Connection con;
		String driver="com.mysql.jdbc.Driver";
		//�����ҵ����ݿ���qcl
		String url="jdbc:mysql://localhost:3306/taotao";
		String user="root";
		String password="root";
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			if (!con.isClosed()) {
				System.out.println("���ݿ����ӳɹ�");
			}
			Statement statement = con.createStatement();
			String sql = "select * from tb_user WHERE id=18;";//�ҵı���home
			ResultSet resultSet = statement.executeQuery(sql);
			String name;
			while (resultSet.next()) {
				name = resultSet.getString("username");
				System.out.println("username��" + username);
			}
			resultSet.close();
			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println("���ݿ�����û�а�װ");

		} catch (SQLException e) {
			System.out.println("���ݿ�����ʧ��");
		}
	}
}