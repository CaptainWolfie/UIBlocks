package CaptainWolfie.UIBlocks.Colors;

public class UIColor {

	private int r, g, b, a = 255;
	
	public static UIColor VERY_DARK_GRAY = new UIColor(51,51,51);
	public static UIColor DARK_GRAY = new UIColor(102,102,102);
	public static UIColor GRAY = new UIColor(153,153,153);
	public static UIColor LIGHT_GRAY = new UIColor(204,204,204);

	public static UIColor WHITE = new UIColor(255,255,255);
	public static UIColor BLACK = new UIColor(0,0,0);

	public static UIColor BROWN = new UIColor(102,51,0);
	public static UIColor LIGHT_BROWN = new UIColor(153,102,0);
	public static UIColor DARK_BROWN = new UIColor(51,0,0);

	public static UIColor PURPLE = new UIColor(102,0,153);

	public static UIColor GOLD = new UIColor(255,204,51);
	public static UIColor ORANGE = new UIColor(255,102,0);
	public static UIColor LIGHT_ORANGE = new UIColor(255,153,0);

	public static UIColor YELLOW = new UIColor(255,255,0);
	public static UIColor LIGHT_YELLOW = new UIColor(255,255,153);
	public static UIColor DARK_YELLOW = new UIColor(255,204,0);
	public static UIColor VERY_LIGHT_YELLOW = new UIColor(255,255,204);

	public static UIColor VERY_LIGHT_GREEN = new UIColor(102,255,102);
	public static UIColor LIGHT_GREEN = new UIColor(0,255,51);
	public static UIColor GREEN = new UIColor(0,204,0);
	public static UIColor DARK_GREEN = new UIColor(0,153,0);
	public static UIColor VERY_DARK_GREEN = new UIColor(0,102,0);

	public static UIColor VERY_LIGHT_BLUE = new UIColor(51,204,255);
	public static UIColor LIGHT_BLUE = new UIColor(51,153,255);
	public static UIColor BLUE = new UIColor(0,0,255);
	public static UIColor DARK_BLUE = new UIColor(0,0,204);
	public static UIColor VERY_DARK_BLUE = new UIColor(0,0,153);
	
	public static UIColor VERY_LIGHT_RED = new UIColor(255,102,102);
	public static UIColor LIGHT_RED = new UIColor(255,51,51);
	public static UIColor RED = new UIColor(255,0,0);
	public static UIColor DARK_RED = new UIColor(204,0,0);
	public static UIColor VERY_DARK_RED = new UIColor(153,0,0);
	
	public UIColor(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	public UIColor(int r, int g, int b, int a) {
		this.r = r;
		this.g = g;
		this.b = b;
		this.a = a;
	}
	
	public int getRed() {
		return r;
	}
	
	public int getGreen() {
		return g;
	}
	
	public int getBlue() {
		return b;
	}
	
	public int getAlpha() {
		return a;
	}
	
	public void setRed(int red) {
		r = red;
	}
	
	public void setGreen(int green) {
		g = green;
	}
	
	public void setBlue(int blue) {
		b = blue;
	}
	
	public void setAlpha(int alpha) {
		a = alpha;
	}
}
