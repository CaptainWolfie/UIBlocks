package CaptainWolfie.UIBlocks.Utils.Align;

import CaptainWolfie.UIBlocks.Utils.UIScreen;

public class UILocation {
	
	private int pixels = 0;
	private float percent = 0;
	
	public UILocation(int pixels) {
		this.pixels = pixels;
	}
	
	public UILocation(float percent) {
		this.percent = percent;
	}
	
	public int getPixels() {
		if (pixels == 0) {
			return (int) (UIScreen.getScreen().getWidth() * percent);
		} else
			return pixels;
	}
}
