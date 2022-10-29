package car_game;

import java.util.Random;

public class Car {

	private final CarNumber carName;
	private int position;
	private final Random random = new Random();

	public Car(String name) {
		this.carName = new CarNumber(name);
		this.position = 0;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getPosition() {
		return position;
	}

	public void setName(String name) {
		carName.setCarName(name);
	}

	public String getName() {
		return carName.getCarName();
	}

	@Override
	public String toString() {
		String str = "-".repeat(position);
		return carName.getCarName() + " : " + str;
	}

	public void go() {
		int randomValue = random.nextInt(9);
		go(randomValue);
	}

	public void go(int randomValue) {
		if (randomValue > 4) {
			position++;
		}
	}
}
