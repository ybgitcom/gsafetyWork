package com.gsafety.code;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo90  {
	public static void main(String args[]) {
		InetAddress ip = null;

		try {
			ip = InetAddress.getByName("localhost");// �޸�Ϊָ������������
			System.out.println("��������" + ip.getHostName());
			System.out.println("����IP��ַ��" + ip.getHostAddress());
			System.out.println("����IP��ַ��"
					+ InetAddress.getLocalHost().getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}
}
