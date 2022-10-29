package car_game;

public class Car {

	private String name;

	public void setName(String name) {
		if (name.length() > 5) {
			throw new IllegalArgumentException("자동차 이름은 5자를 초과할 없다.");
		}
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
