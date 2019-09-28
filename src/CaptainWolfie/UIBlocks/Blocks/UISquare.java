package CaptainWolfie.UIBlocks.Blocks;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import CaptainWolfie.UIBlocks.Colors.UIColor;
import CaptainWolfie.UIBlocks.Effects.UIEffects;
import CaptainWolfie.UIBlocks.Utils.UIUpdate;
import CaptainWolfie.UIBlocks.Utils.Align.UILocation;
import CaptainWolfie.UIBlocks.Utils.Size.UIDimension;

public class UISquare {

	private static List<UISquare> squares = new ArrayList<UISquare>();

	private UIColor color;
	private int roundness = 0, id;
	private UILocation x = new UILocation(0),y = new UILocation(0);
	private UIDimension size = new UIDimension(0,0);
	private UIEffects effect = null;
	private int effectPixels = 0, rightAlpha = 255, removeAlpha = 0;
	private int effectTime = 0, speed = 0;
	private boolean visible = true;
	private UIUpdate updateMethod = null;
	
	public static UISquare createSquare(UIColor color) {
		UISquare square = new UISquare(color, squares.size());
		squares.add(square);
		return square;
	}
	
	public static UISquare createSquare(UIColor color, int roundness) {
		UISquare square = new UISquare(color, roundness, squares.size());
		squares.add(square);
		return square;
	}
	
	private UISquare(UIColor color, int id) {
		this.color = color;
		this.id = id;
	}
	
	public void setUpdateFunction(UIUpdate update) {
		updateMethod = update;
	}
	
	private UISquare(UIColor color, int roundness, int id) {
		this.color = color;
		this.roundness = roundness;
		this.id = id;
	}
	
	
	public int getId() {
		return id;
	}
	
	public static void updateSquares() {
		for (UISquare square : squares) {
			square.update();
		}
	}
	
	private void update() {
		if (effectTime > 0) {
			if (effect.getValue() == 0) {
				if (!visible)
					x = new UILocation(x.getPixels()+speed);
				else
					x = new UILocation(x.getPixels()-speed);
			}
			if (effect.getValue() == 1) {
				if (!visible)
					x = new UILocation(x.getPixels()-speed);
				else
					x = new UILocation(x.getPixels()+speed);
			}
			if (effect.getValue() == 2) {
				if (!visible)
					y = new UILocation(y.getPixels()+speed);
				else
					y = new UILocation(y.getPixels()-speed);
			}
			if (effect.getValue() == 3) {
				if (!visible)
					y = new UILocation(y.getPixels()-speed);
				else
					y = new UILocation(y.getPixels()+speed);
			}
			if (!visible)
				color.setAlpha(color.getAlpha() - rightAlpha / removeAlpha);
			else
				color.setAlpha(color.getAlpha() + rightAlpha / removeAlpha);
			effectTime-=speed;
		}
		if (effectTime < 0)
			effectTime = 0;
		
		if (updateMethod != null) {
			updateMethod.run();
		}
		
		if (color.getAlpha() > 255)
			color.setAlpha(255);
		if (color.getAlpha() < 0)
			color.setAlpha(0);
	}
	
	public void setEffect(UIEffects effect, int effectPixels, int speed) {
		if (effectPixels < speed)
			return;
		this.effect = effect;
		this.effectPixels = effectPixels;
		this.speed = speed;
		removeAlpha = effectPixels / speed;
	}
	
	public void setVisible(boolean visible) {
		if (this.visible == !visible && effectTime ==0) {
			this.visible = visible;
			effectTime = effectPixels;
		}
	}
	
	public void setColor(UIColor color) {
		if (!visible) {
			System.out.println("Square " + id + " tried to change color while not visible.");
			return;
		}
		this.color = color;
		rightAlpha = color.getAlpha();
		removeAlpha = effectPixels / speed;
	}
	
	public boolean isVisible() {
		return visible;
	}
	
	public static void deleteSquare(UISquare square) {
		squares.remove(square);
	}
	
	public static void renderSquares(Graphics g) {
		for (UISquare square : squares) {
			square.render(g);
		}
	}
	
	public void setX(UILocation location) {
		this.x = location;
	}
	
	public void setY(UILocation location) {
		this.y = location;
	}
	
	
	public void setSize(UIDimension size) {
		this.size = size;
	}

	private void render(Graphics g) {
		if (effectTime == 0 && visible == false)
			return;
		Color lastColor = g.getColor();
		g.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()));
		g.fillRoundRect(x.getPixels(), y.getPixels(), size.getWidth(), size.getHeight(), roundness, roundness);
		g.setColor(lastColor);
	}
	
}
