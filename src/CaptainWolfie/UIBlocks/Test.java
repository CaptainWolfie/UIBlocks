package CaptainWolfie.UIBlocks;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import CaptainWolfie.UIBlocks.Blocks.UISquare;
import CaptainWolfie.UIBlocks.Colors.UIColor;
import CaptainWolfie.UIBlocks.Effects.UIEffects;
import CaptainWolfie.UIBlocks.Utils.Align.UILocation;
import CaptainWolfie.UIBlocks.Utils.Size.UIDimension;

public class Test implements KeyListener {

	private static JFrame frame = null;
	private static Canvas canvas = null;
	private boolean done = false;
	
	@SuppressWarnings("static-access")
	public Test() {
		createFrame("hi");
		UIMain main = new UIMain();
		main.init(frame);
		UISquare square = UISquare.createSquare(UIColor.DARK_GRAY, 10);
		square.setX(new UILocation(.5f));
		square.setY(new UILocation(10));
		square.setSize(new UIDimension(100, 100));
		square.setEffect(UIEffects.RIGHT_TO_LEFT, 100, 1);
		while (true) {
			if (done)
				square.setVisible(false);
			else
				square.setVisible(true);
			update();
			render();
		}
	}
	
	
	/*public static void main(String[] args) {
		new Test();
	}*/
	
	private BufferStrategy bs = null;
	private Graphics g;
	
	private void render() {
		bs = canvas.getBufferStrategy(); // creates buffer strategy
		if (bs == null) {
			canvas.createBufferStrategy(2); // create buffers
			render();
			return;
		}
		g = bs.getDrawGraphics(); // create graphics
		g.clearRect(0, 0, 800, 600); // clear screen
		// start drawing
		UISquare.renderSquares(g);
		// stop drawing
		bs.show(); // show
		g.dispose(); // destroy
	}
	
	private void update() {
		UISquare.updateSquares();
	}
	
	private void createFrame(String TITLE) {
		frame = new JFrame(TITLE);
		frame.setSize(new Dimension(800,600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.addKeyListener(this);
		frame.setVisible(true);
		
		createCanvas();
		frame.pack();
	}
	
	private void createCanvas() {
		canvas = new Canvas();
		Dimension size = new Dimension(800, 600);
		canvas.setPreferredSize(size);
		canvas.setMinimumSize(size);
		canvas.setMaximumSize(size);
		canvas.addKeyListener(this);
		frame.add(canvas);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		done = !done;
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}

}
