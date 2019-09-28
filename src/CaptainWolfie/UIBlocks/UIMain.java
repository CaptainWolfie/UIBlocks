package CaptainWolfie.UIBlocks;

import javax.swing.JFrame;

import CaptainWolfie.UIBlocks.Utils.UIScreen;

public class UIMain {

	@SuppressWarnings("unused")
	private static JFrame frame = null;
	
	public static void init(JFrame screen) {
		frame = screen;
		UIScreen.init(screen);
	}
}
