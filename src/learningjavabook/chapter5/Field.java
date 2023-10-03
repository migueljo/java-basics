package learningjavabook.chapter5;

public class Field {
	Apple a1 = new Apple();
	Apple a2 = new Apple();

	public void setupApples() {
		a1.diameter = 3.0f;
		a1.mass = 5.0f;
		a1.x = 67;
		a1.y = 197;
		a2.diameter = 8.0f;
		a2.mass = 10.0f;
		a2.x = 70;
		a2.y = 200;
	}
	public void detectCollisions() {
		if (a1.isTouching(a2)) System.out.println("Collision detected: apples are touching!");
		else System.out.println("Apples are not touching");
	}
}
