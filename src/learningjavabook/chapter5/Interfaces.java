package learningjavabook.chapter5;

public class Interfaces {

}

interface Drivable {
	boolean startEnging();
	void stopEngine();
	float accelerate(float acc);
	boolean turn(String dir);
}

class Automobile implements Drivable {
	@Override
	public boolean startEnging() {
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
