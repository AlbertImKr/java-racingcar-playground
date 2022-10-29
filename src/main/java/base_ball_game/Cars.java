package base_ball_game;

import java.util.ArrayList;
import java.util.List;

public class Cars {
	private final List<Car> carList = new ArrayList<>();
	public Cars(String InputString) {
		String[] carNames = InputString.split(",");
		for (String carName : carNames) {
			Car car = new Car(carName);
			carList.add(car);
		}
	}

	public boolean containCar(Car car) {
		return carList.contains(car);
	}

	public void move() {
		for (Car car : carList) {
			car.move();
		}
	}
}
