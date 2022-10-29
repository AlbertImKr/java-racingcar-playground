package base_ball_game;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Cars {
	private List<Car> carList = new ArrayList<>();

	public Cars(String InputString) {
		String[] carNames = InputString.split(",");
		for (String carName : carNames) {
			Car car = new Car(carName);
			carList.add(car);
		}
	}

	public Cars(List<Car> carList) {
		this.carList = carList;
	}

	public boolean containCar(Car car) {
		return carList.contains(car);
	}

	public void moveRandom() {
		for (Car car : carList) {
			car.move(RandomNumber.creatNumber());
		}
	}

	public Cars getWinner(Car maxCar) {
		return new Cars(carList.stream()
			.filter(car -> car.isSamePosition(maxCar))
			.collect(Collectors.toList()));
	}

	public Car getMaxCar() {
		return carList.stream()
			.max(Car::compareTo)
			.orElse(null);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Cars))
			return false;
		Cars cars = (Cars)o;
		return Objects.equals(carList, cars.carList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(carList);
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Car car : carList) {
			result.append(car.toString());
		}
		return result.toString();
	}

	public String getWinnerName() {
		StringBuilder answer = new StringBuilder();
		for (Car car : carList) {
			answer.append(car.getWinnerName()).append(",");
		}
		return answer.deleteCharAt(answer.length() - 1).toString();
	}
}
