package CaptainWolfie.UIBlocks.Utils.Size;

import javax.swing.JFrame;

import CaptainWolfie.UIBlocks.Utils.UIScreen;

public class UIDimension {
	
	private int width = 0, height = 0, extraW = 0, extraH = 0;
	private float w = 0, h = 0;
	
	protected JFrame frame;
	
	public UIDimension(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public UIDimension(float width, float height) {
		this.w = width;
		this.h = height;
	}
	
	public void extraWidth(int extra) {
		this.extraW = extra;
	}
	
	public void extraHeight(int extra) {
		this.extraH = extra;
	}
	
	public int getWidth() {
		if (width == 0) {
			return (int) (UIScreen.getScreen().getWidth() * w) + extraW;
		} else
			return width + extraW;
	}
	
	public int getHeight() {
		if (height == 0) {
			return (int) (UIScreen.getScreen().getHeight() * h) + extraH;
		} else
			return height + extraH;
	}
}
