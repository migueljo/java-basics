package learningjavabook.appletoss;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * The playing field for our game. This class will be undergoing quite a few
 * changes as we learn about more of Java's features in coming chapters.
 * For now, we can demonstrate how to work with member variables like a1 and a2
 * as well as how to create new methods like setupApples() and detectCollisions().
 */
public class Field extends JComponent {
	public static final float GRAVITY = 9.8f;  // feet per second per second
	public static final int STEP = 40;   // duration of an animation frame in milliseconds
	public static final int APPLE_SIZE_IN_PIXELS = 30;
	public static final int TREE_WIDTH_IN_PIXELS = 60;
	public static final int TREE_HEIGHT_IN_PIXELS = 2 * TREE_WIDTH_IN_PIXELS;
	public static final int PHYSICIST_SIZE_IN_PIXELS = 75;
	public static final int MAX_TREES = 12;

	Color fieldColor = Color.GRAY;

	Apple a1 = new Apple();
	Apple a2 = new Apple();
	Tree tree = new Tree();
	ArrayList<Tree> trees = new ArrayList<>();
	Physicist physicist;

	public void addTree() {
		Tree tree = new Tree();
		tree.setPosition(generateRandomX(), generateRandomY());
		trees.add(tree);
		// TODO: Make sure the trees don't touch the player
		// TODO: Make sure the whole trees are rendered inside the canvas
		// TODO: Render only one apple
		// TODO: Render the apple on top of the player
	}

	public void setupApples() {
		// For now, just play with our apple attributes directly
		a1.diameter = 3.0f;
		a1.mass = 5.0f;
		a1.x = 20;
		a1.y = 40;
		a2.diameter = 8.0f;
		a2.mass = 10.0f;
		a2.x = 70;
		a2.y = 200;
	}

	public void setupTree() {
		// Unlike apples, we'll use the setPosition() method from our
		// GamePiece interface to setup our lonely tree
		tree.setPosition(500,200);
	}

	public void setPlayer(Physicist p) {
		physicist = p;
	}

	protected void paintComponent(Graphics g) {
		g.setColor(fieldColor);
		g.fillRect(0,0, getWidth(), getHeight());
		for (Tree tree : trees) {
			tree.draw(g);
		}
		physicist.draw(g);
		a1.draw(g);
		a2.draw(g);
	}

	public void detectCollisions() {
		if (a1.isTouching(a2)) {
			System.out.println("Collision detected!");
		} else {
			System.out.println("Apples are not touching.");
		}
	}

	private int getRandomNumber(int min, int max) {
		return min + (int)(Math.random() * (max - min));
	}

	private int generateRandomX() {
		// at least half the width of the tree plus a few pixels
		int leftMargin = Field.TREE_WIDTH_IN_PIXELS / 2 + 5;
		int rightMargin = Contants.FIELD_WIDTH - leftMargin;
		return  getRandomNumber(leftMargin, rightMargin);
	}

	private int generateRandomY() {
		// at least half the width of the tree plus a few pixels
		int topMargin = Field.TREE_WIDTH_IN_PIXELS / 2 + 5;
		int bottomMargin = Contants.FIELD_HEIGHT - topMargin;
		return  getRandomNumber(topMargin, bottomMargin);
	}
}
