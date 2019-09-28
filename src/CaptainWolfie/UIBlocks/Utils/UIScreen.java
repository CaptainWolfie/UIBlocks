package CaptainWolfie.UIBlocks.Utils;

import javax.swing.JFrame;

public class UIScreen {

	private static JFrame screen;
	
	public static void init(JFrame frame) {
		screen = frame;
	}
	
	public static JFrame getScreen() {
		return screen;
	}
	
}
