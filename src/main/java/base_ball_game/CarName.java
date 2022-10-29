package base_ball_game;

public class CarName {
	private final String carName;

	public CarName(String carName) {
		if (carName.length() > 5) {
			throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없다");
		}
		this.carName = carName;
	}
}
