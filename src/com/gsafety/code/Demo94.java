package com.gsafety.code;

import java.sql.*;

public class Demo94 {
	static Connection con; // ����Connection����
	static PreparedStatement sql; // ����PreparedStatement����
	static ResultSet res; // ����ResultSet����

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
		Demo94 c = new Demo94(); // �����������
		con = c.getConnection(); // �����������ݿⷽ��
		try {
			sql = con.prepareStatement("select * from yb-test"); // ��ѯ���ݿ�
			res = sql.executeQuery(); // ִ��SQL���
			System.out.println("ִ�����ӡ��޸ġ�ɾ��ǰ����:");
			while (res.next()) {
				String id = res.getString(1);
				String name = res.getString("name");
				String sex = res.getString("sex");
				String birthday = res.getString("birthday"); // ������ѯ�����
				System.out.print("��ţ�" + id);
				System.out.print(" ������" + name);
				System.out.print(" �Ա�:" + sex);
				System.out.println(" ���գ�" + birthday);
			}
			sql = con.prepareStatement("insert into yb-test values(?,?,?)");
			sql.setString(1, "��һ"); // Ԥ�����������
			sql.setString(2, "Ů");
			sql.setString(3, "2012-12-1");
			sql.executeUpdate();
			sql = con.prepareStatement("update yb-testset birthday "
					+ "= ? where id = (select min(id) from yb-test)");
			sql.setString(1, "2012-12-02"); // ��������
			sql.executeUpdate();
			Statement stmt = con.createStatement();
			stmt.executeUpdate("delete from yb-test where id = "
					+ "(select min(id)from yb-test)");
			// ��ѯ�޸����ݺ��yb-test��������
			sql = con.prepareStatement("select * from yb-test");
			res = sql.executeQuery(); // ִ��SQL���
			System.out.println("ִ�����ӡ��޸ġ�ɾ���������:");
			while (res.next()) {
				String id = res.getString(1);
				String name = res.getString("name");
				String sex = res.getString("sex");
				String birthday = res.getString("birthday");
				System.out.print("��ţ�" + id);
				System.out.print(" ������" + name);
				System.out.print(" �Ա�:" + sex);
				System.out.println(" ���գ�" + birthday);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
