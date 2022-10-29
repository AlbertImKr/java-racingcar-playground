package car_game;

public class Car {
	public Car(String name) {
		if (name.length() > 5) {
			throw new IllegalArgumentException("자동차 이름은 5자를 초과할 없다.");
		}
	}
}
