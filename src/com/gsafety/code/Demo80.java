package com.gsafety.code;

import javax.swing.*;
import java.io.FileInputStream;

public class Demo80 {
	public static void main(String[] temp) {
		byte b[] = new byte[2];
		try{
			FileInputStream fis = new FileInputStream("word.txt");
			ProgressMonitorInputStream in =
					new ProgressMonitorInputStream(null,"��ȡ�ļ�",fis);
			while(in.read(b)!=-1){
				String s = new String(b);
				System.out.print(s);
				Thread.sleep(100);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}


