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
	Tree tree = new Tree();
	ArrayList<Tree> trees = new ArrayList<>();
	ArrayList<Apple> apples = new ArrayList<>();
	Physicist physicist;

	public void addTree() {
		Tree tree = new Tree();
		tree.setPosition(generateRandomX(), generateRandomY());
		while (physicist.isTouching(tree)) {
			tree.setPosition(generateRandomX(), generateRandomY());
			System.err.println("Repositioning an intersecting tree");
		}
		trees.add(tree);
		// TODO: Render only one apple
		// TODO: Render the apple on top of the player
	}

	public void addApple() {

	}

	public void setupApples() {
		Apple apple = new Apple();
		// For now, just play with our apple attributes directly
		apple.diameter = 3.0f;
		apple.mass = 5.0f;
		apple.x = 20;
		apple.y = 40;
		apples.add(apple);
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
		physicist.draw(g);
		for (Tree tree : trees) {
			tree.draw(g);
		}
		for (Apple apple: apples) {
			apple.draw(g);
		}
	}

	private int getRandomNumber(int min, int max) {
		return min + (int)(Math.random() * (max - min));
	}

	private int generateRandomX() {
		// at least half the width of the tree plus a few pixels
		int leftMargin = Field.TREE_WIDTH_IN_PIXELS / 2 + 5;
		int rightMargin = Constants.FIELD_WIDTH - leftMargin;
		return  getRandomNumber(leftMargin, rightMargin);
	}

	private int generateRandomY() {
		// at least half the height of the tree plus a few pixels
		int topMargin = Field.TREE_HEIGHT_IN_PIXELS / 2 + 5;
		int bottomMargin = Constants.FIELD_HEIGHT - (topMargin - 5);
		return  getRandomNumber(topMargin, bottomMargin);
	}


}
