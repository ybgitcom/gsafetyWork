package com.gsafety.code;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo91 {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(8001);
			while (!ss.isClosed()) {
				Socket s = ss.accept();
				InputStream ips = s.getInputStream();
				OutputStream ops = s.getOutputStream();
				String str = "��ӭ�������\n2����дTCP����������"
						+ "ʵ�ִ���һ����8001�˿��ϵȴ���ServerSocket"
						+ "���󣬵����յ�һ���ͻ��������������"
						+ "�������ͻ������������ӵ�Socket�����л���������"
						+ "����ͨ���������ͻ���������Ϣ��";
				ops.write(str.getBytes());
				byte[] buf = new byte[1024];
				int len = 0;
				if (ips.available() > 0)
					len = ips.read(buf);
				System.out.println(new String(buf, 0, len));
				ips.close();
				ops.close();
				s.close();
			}
			ss.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
