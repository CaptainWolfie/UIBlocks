package CaptainWolfie.UIBlocks.Effects;

public class UIEffects {

	private int value;
	
	public static UIEffects LEFT_TO_RIGHT = new UIEffects(0);
	public static UIEffects RIGHT_TO_LEFT = new UIEffects(1);
	public static UIEffects TOP_TO_BOTTOM = new UIEffects(2);
	public static UIEffects BOTTOM_TO_TOP = new UIEffects(3);
	
	private UIEffects(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
