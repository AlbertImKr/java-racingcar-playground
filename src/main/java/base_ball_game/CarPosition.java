package base_ball_game;

import java.util.Objects;

public class CarPosition implements Comparable<CarPosition> {

	private final int carPosition;

	public CarPosition(int carPosition) {
		this.carPosition = carPosition;
	}

	public CarPosition move() {
		return new CarPosition(carPosition + 1);
	}

	@Override
	public int compareTo(CarPosition o) {
		return carPosition - o.carPosition;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof CarPosition))
			return false;
		CarPosition that = (CarPosition)o;
		return carPosition == that.carPosition;
	}

	@Override
	public int hashCode() {
		return Objects.hash(carPosition);
	}

	@Override
	public String toString() {
		return "-".repeat(carPosition);
	}
}
