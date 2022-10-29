package car_game;

public class Car {

	private String name;
	private int position;

	public void setPosition(int position) {
		this.position = position;
	}

	public int getPosition() {
		return position;
	}

	public void setName(String name) {
		if (name.length() > 5) {
			throw new IllegalArgumentException("자동차 이름은 5자를 초과할 없다.");
		}
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		String str = "-".repeat(position);
		return name + " : " + str;
	}

	public void go(int n) {
		if (n > 4) {
			position++;
		}
	}
}
