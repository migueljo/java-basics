package oop;

public class Patient extends User {
	private String birthday;
	private Double weight;
	private Double height;
	private String blood;

	Patient(String name, String email) {
		super(name, email);
	}

	public void testingEnum() {
		Day day = Day.SUNDAY;
		switch (day) {
			case MONDAY -> System.out.println("Mondays are good");
			case FRIDAY -> System.out.println("Fridays are nice");
			case SATURDAY, SUNDAY -> System.out.println("Weekends are the best");
			default -> System.out.println("Midweek are so-so");
		}
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getWeight() {
		return this.weight + " KG";
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getHeight() {
		return height + " MT";
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	@Override
	public String toString() {
		return super.toString() + ", Age: " + this.birthday + ", Weight: " + this.getWeight() + ", Height: "
						+ this.getHeight() + ", Blood: " + this.blood;
	}
}
