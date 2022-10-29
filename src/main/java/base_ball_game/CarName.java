package base_ball_game;

import java.util.Objects;

public class CarName {
	private final String carName;

	public CarName(String carName) {
		if (carName.length() > 5) {
			throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없다");
		}
		this.carName = carName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof CarName))
			return false;
		CarName carName1 = (CarName)o;
		return Objects.equals(carName, carName1.carName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(carName);
	}

	@Override
	public String toString() {
		return carName;
	}
}
