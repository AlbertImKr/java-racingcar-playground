package base_ball_game;

import java.util.Objects;

public class Car {
	private CarPosition carPosition;
	private CarName carName;

	public Car(String carName) {
		this(0,carName);
	}

	public Car(int carPosition, String carName) {
		this.carPosition = new CarPosition(carPosition);
		this.carName = new CarName(carName);
	}

	public boolean canMove(int RandomNum) {
		return RandomNum > 4;
	}

	public void move() {
		carPosition = carPosition.move();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Car))
			return false;
		Car car = (Car)o;
		return Objects.equals(carPosition, car.carPosition) && Objects.equals(carName, car.carName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(carPosition, carName);
	}
}
