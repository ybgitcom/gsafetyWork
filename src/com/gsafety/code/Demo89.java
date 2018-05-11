package com.gsafety.code;

import javax.swing.*;
import java.awt.*;

public class demo89 extends jframe {
	private static final long serialversionuid = 1l;
	final jprogressbar progressbar = new jprogressbar();

	public demo89() {

		getcontentpane().add(progressbar, borderlayout.north);
		progressbar.setstringpainted(true);

		thread threada = new thread(new runnable() {
			int count = 0;

			public void run() {
				while (true) {
					progressbar.setvalue(++count);
					try {
						thread.sleep(100);
					} catch (exception e) {
						e.printstacktrace();
					}
				}
			}
		});
		threada.start();
	}

	public static void main(string[] args) {
		init(new demo89(), 100, 100);

	}

	public static void init(jframe frame, int width, int height) {
		frame.setdefaultcloseoperation(jframe.exit_on_close);
		frame.setsize(width, height);
		frame.setvisible(true);
	}
}
yb

