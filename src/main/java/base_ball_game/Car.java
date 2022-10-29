package base_ball_game;

import java.util.Objects;

public class Car implements Comparable<Car> {
	private CarPosition carPosition;
	private final CarName carName;

	public Car(String carName) {
		this(0, carName);
	}

	public Car(int carPosition, String carName) {
		this.carPosition = new CarPosition(carPosition);
		this.carName = new CarName(carName);
	}

	public boolean canMove(int randomNum) {
		return randomNum > 4;
	}

	public void move() {
		carPosition = carPosition.move();
	}

	public void move(int randomNum) {
		if (canMove(randomNum)) {
			move();
		}
	}

	public String getWinnerName() {
		return carName.toString();
	}

	public boolean isSamePosition(Car car) {
		return car.isSamePosition(carPosition);
	}

	private boolean isSamePosition(CarPosition otherCarPosition) {
		return carPosition.equals(otherCarPosition);
	}

	@Override
	public int compareTo(Car o) {
		return carPosition.compareTo(o.carPosition);
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

	@Override
	public String toString() {
		return carName.toString() + " : " + carPosition.toString() + "\n";
	}
}
