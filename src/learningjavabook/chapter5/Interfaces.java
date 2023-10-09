package learningjavabook.chapter5;

public class Interfaces {
	Automobile automobile = new Automobile();
	Lawnmower lawnmower = new Lawnmower();
}

interface Drivable {
	boolean startEngine();
	void stopEngine();
	float accelerate(float acc);
	boolean turn(String dir);
}

class Automobile implements Drivable {
	boolean engineRunning;
	@Override
	public boolean startEngine() {

		engineRunning = true;
		return engineRunning;
	}

	@Override
	public void stopEngine() {
		engineRunning = false;
	}

	@Override
	public float accelerate(float acc) {
		return 0;
	}

	@Override
	public boolean turn(String dir) {
		return false;
	}
}

class Lawnmower implements Drivable {
	@Override
	public boolean startEngine() {
		return false;
	}

	@Override
	public void stopEngine() {

	}

	@Override
	public float accelerate(float acc) {
		return 0;
	}

	@Override
	public boolean turn(String dir) {
		return false;
	}
}
